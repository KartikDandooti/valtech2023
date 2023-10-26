package day3;

import java.io.IOException;
import java.io.Reader;

public class Rot13Reader extends Reader {
	private Reader source;
	

	public Rot13Reader(Reader source) {
		this.source = source;
	}

	@Override
	public int read(char[] cbuf, int off, int len) throws IOException {
		// TODO Auto-generated method stub
		int byteread=source.read(cbuf,off,len);
		for (int i = 0; i < byteread; i++) {
			cbuf[off+i]=Rote13Helper.rotate(cbuf[off+i]);
			
		}
		
		return byteread;
	}

	@Override
	public void close() throws IOException {
		source.close();
		// TODO Auto-generated method stub
		
	}

}
