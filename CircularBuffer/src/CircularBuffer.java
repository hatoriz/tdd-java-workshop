
public class CircularBuffer {
	private char[] buffer = new char[5];
	private int writePointer;
	private int readPointer;
	
	public void add(char data) {
		this.buffer[writePointer++] = data;
	}
	
	public char remove( ) {
		return this.buffer[readPointer++];
	}
	
	public void setSize(int size) {
		this.buffer = new char[size];
	}

	public int getSize() {
		return this.buffer.length;
	}

	public boolean isEmpty() {
		return readPointer == writePointer;
	}
}
