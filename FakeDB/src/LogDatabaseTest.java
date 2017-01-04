import static org.junit.Assert.*;

import java.io.File;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.dbunit.IDatabaseTester;
import org.dbunit.JdbcDatabaseTester;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.operation.DatabaseOperation;
import org.h2.jdbcx.JdbcDataSource;
import org.h2.tools.RunScript;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.impl.Log4jLoggerFactory;

public class LogDatabaseTest {

    private static final String JDBC_DRIVER = org.h2.Driver.class.getName();
    private static final String JDBC_URL = "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1";
    private static final String USER = "sa";
    private static final String PASSWORD = "";
    private static final String UTF8 = "UTF8";

    @BeforeClass
    public static void createSchema() throws Exception {
        RunScript.execute(JDBC_URL, USER, PASSWORD, 
                          "database/schema_log.sql", 
                          UTF8, false);
    }
    
    @Before
    public void importDataSet() throws Exception {
        IDataSet dataSet = readDataSet();
        cleanlyInsert(dataSet);
    }

    private IDataSet readDataSet() throws Exception {
        return new FlatXmlDataSetBuilder()
        .build(new File("database/data_log.xml"));
    }

    private void cleanlyInsert(IDataSet dataSet) throws Exception {
        IDatabaseTester databaseTester = new JdbcDatabaseTester(JDBC_DRIVER,
                JDBC_URL, USER, PASSWORD);
        databaseTester.setSetUpOperation(DatabaseOperation.CLEAN_INSERT);
        databaseTester.setDataSet(dataSet);
        databaseTester.onSetup();
    }
    
    private DataSource getDataSource() {
        JdbcDataSource dataSource = new JdbcDataSource();
        dataSource.setURL(JDBC_URL);
        dataSource.setUser(USER);
        dataSource.setPassword(PASSWORD);
        return dataSource;
    }
    
    @Test
    public void getAllLog() throws SQLException {
        LogDatabase logDatabase = new LogDatabase();
        logDatabase.setConnection(getDataSource().getConnection());
        List<Log> allLog = logDatabase.getAll();
        assertEquals(2, allLog.size());
    }
    
    @Test
    public void insertOneLog() throws SQLException {
        LogDatabase logDatabase = new LogDatabase();
        logDatabase.setConnection(getDataSource().getConnection());
        
        int before = logDatabase.getAll().size();
        Log newLog = new Log(404, "Page not found");
        logDatabase.insert(newLog);
        
        assertEquals(before+1, logDatabase.getAll().size());
    }
    
    @Test
	public void log_should_have_2() throws Exception {
    	LogDatabase logDatabase = new LogDatabase();
    	logDatabase.setConnection(getDataSource().getConnection());
    	int size = logDatabase.count();
    	assertEquals(2,  size);
	}
    
    @Test
    public void insert_1_record() throws SQLException {
        LogDatabase logDatabase = new LogDatabase();
        logDatabase.setConnection(getDataSource().getConnection());
        
        int before = logDatabase.count();
        logDatabase.insert(new Log(999, "Test Record"));
        int after = logDatabase.count();
        assertEquals(1, after - before);
    }
}
