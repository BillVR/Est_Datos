import java.util.*;
import java.io.File;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Enter a directory or a file: ");
		Scanner input = new Scanner(System.in);
		String directory = input.nextLine();
		
		System.out.println(getSize(new File(directory)) + " bytes");

	}
	
	// Método original
	public static long getSize(File file) {
		long size = 0;
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for(int i = 0; files != null && i < files.length; i++) {
				size += getSize(files[i]);
			}
		} else {
			size += file.length();
		}
		return size;
	}
	
	// Mismo método sin utilizar for ni while
	public static long getSize2(File file, int pos) {
		long size = 0;
		if (file.isDirectory()) {
			File[] files = file.listFiles();
            if (files != null && pos < files.length) {
				size += getSize2(files[pos], pos + 1);
			}
		} else {
			size += file.length();
		}
		return size;
	}

}
