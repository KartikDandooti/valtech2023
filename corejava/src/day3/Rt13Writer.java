package day3;


import java.io.IOException;
import java.io.Writer;

public class Rt13Writer extends Writer {
	
	private Writer dest;
	public Rt13Writer(Writer dest) {
		this.dest=dest;
	}

	@Override
	public void write(char[] cbuf, int off, int len) throws IOException {
		// TODO Auto-generated method stub
		for (int i = 0; i < len; i++) {
			cbuf[off+i]=Rote13Helper.rotate(cbuf[off+i]);
		}
		dest.write(cbuf,off,len);
		
	}
 @Override
public void write(int c) throws IOException {
	// TODO Auto-generated method stub
	 dest.write(Rote13Helper.rotate((char)c));
}
	@Override
	public void flush() throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		
	}

}
