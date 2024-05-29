package fileip;

import java.io.File;

public class third {

	public static void main(String[] args) {
		try
		{
			String path1 = "C:\\\\Users\\\\EduCADD\\\\Downloads\\\\Sindhu\\\\java";
			File file = new File(path1);
			File file2 = new File(path1);
			System.out.println(file.canRead());
			System.out.println(file.canWrite());
			System.out.println(file.canExecute());
			
			
			System.out.println(file.compareTo(file2));
			
			System.out.println(file.getName());
			System.out.println(file.getPath());
			
			System.out.println(file.getParent());
			
			System.out.println(file.getAbsolutePath());
			System.out.println(file.getCanonicalPath());
			
			System.out.println(file.isFile());
			System.out.println(file.isDirectory());
			
			
			String path2 = "C:\\\\Users\\\\EduCADD\\\\Downloads\\\\Sindhu\\\\java\\hide.txt";
			File file3 = new File(path2);
			System.out.println(file3.isHidden());
			
			System.out.println(file.mkdirs());
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
