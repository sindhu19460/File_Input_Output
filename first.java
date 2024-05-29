package fileip;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class first {
	
	public static void main(String args[])
	{
		try
		{
			String path1 = "C:\\Users\\EduCADD\\Downloads\\Sindhu\\java\\input.txt";
			String path2 = "C:\\Users\\EduCADD\\Downloads\\Sindhu\\java\\output.txt";
			
			String x;
//			FileInputStream fis = new FileInputStream(path1);
//			FileOutputStream fos = new FileOutputStream(path2);
			FileReader fr = new FileReader(path1);
			FileWriter fw = new FileWriter(path2);
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);
			
			while((x = br.readLine()) != null)
			{
				bw.write(x);
			}
			
			bw.flush();
			}
			
			catch (Exception e) {
				e.printStackTrace();
			
			}
		
		}
}


