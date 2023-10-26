package day3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class IOTest {
	public static void main(String[] args) throws IOException {
//		writeTOfile();
//		readFromFile();
		rotateAndRead();
		
	}

	private static void readFromFile() throws IOException {
		// TODO Auto-generated method stub
		FileInputStream is=new FileInputStream(new File("hello.txt"));
		byte[] buffer=new byte[1024];
		int byteRead=is.read(buffer);
		System.out.println(byteRead);
		System.out.println(new String(buffer,0,byteRead));
		
		
	}
	public void rotateAndRead() throws IOException {
		Reader in =new Rot13Reader(new FileReader(new File("hello.txt")));
		char [] buffer=new char[1024];
		int byteRead=in.read(buffer);
		in.close();
		System.out.println(new String (buffer,0,byteRead));
		
	}

	private static void writeTOfile() throws IOException {
		// TODO Auto-generated method stub
		String message="Hello world!";
		FileOutputStream fos=new FileOutputStream(new File("hello.txt"));
		fos.write(message.getBytes());
		fos.flush();
		fos.close();
	}

}
