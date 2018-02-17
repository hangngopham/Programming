import java.util.*;
import java.io.*;

public class burger {
	public static void main(String[] args) {
		try {
			System.out.println("Enter input file name: ");
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine(); 
			

			File file = new File(input);
			BufferedReader br = new BufferedReader(new FileReader(file));
			PrintWriter pw = new PrintWriter(new File("output.txt"));	

			String line = "";
			while((line=br.readLine())!=null) {
				pw.write(line);
				pw.write("\n");
			}
			pw.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
