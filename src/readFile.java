import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class readFile {

    public static void main(String[] args) {
    	try {
			Scanner scanner = new Scanner(new FileReader("main.txt.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	File file = new File("main.txt.txt");
    	if(!file.exists())
    	{
    		System.out.println("Required File does not exist:");
    	}
    }
}
