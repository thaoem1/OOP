package te.SingleResponsibilityPrinciple;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class CopyFileByte {
    public static void main(String [] args) throws IOException {
      FileInputStream inputStream = null;
      FileOutputStream outputStream = null;
 
      try {
         inputStream = new FileInputStream("log2.txt");
         outputStream = new FileOutputStream("log3.txt");
          
         int c;
         while ((c = inputStream.read()) != -1) {
            outputStream.write(c);           
         }
      } finally {
         if (inputStream != null) {
            inputStream.close();
         }
         if (outputStream != null) {
            outputStream.close();
         }
      } 
  	System.out.print("Complete!");
//  	Teach teach = new Teach();
//  	System.out.print(teach);
    }

	public void Handle(String string) {
		// TODO Auto-generated method stub
		
	}

}

class Teach{
	private CopyFileByte logger = new CopyFileByte ();
	public void Add() throws IOException{
		try {
			// Database code
			System.out.println("Da log file thanh cong!");
		}catch(Exception e) {
			logger.Handle("message");
		}
	}
}
