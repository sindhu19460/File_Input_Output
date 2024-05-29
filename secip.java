package fileip;

import java.io.FileReader;
import java.io.FileWriter;

public class secip {

	public static void main(String[] args) {
		try
		{
			
			String path1 = "C:\\Users\\EduCADD\\Downloads\\Sindhu\\java\\input.txt";
			String path2 = "C:\\Users\\EduCADD\\Downloads\\Sindhu\\java\\output.txt";
			
			int x;
			
			FileReader fr = new FileReader(path1);
			FileWriter fw = new FileWriter(path2);
			
			while((x = fr.read()) != -1)
			{
				fw.write(x);
			}
			
			fw.flush();
			}
			
			catch (Exception e) {
				e.printStackTrace();
			
			}
		
		}
	}

