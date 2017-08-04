package starter;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import info.debatty.java.stringsimilarity.JaroWinkler;

public class Starter {

	private final static String  path = "C:\\Users\\USER\\Downloads\\新增資料夾";
	
	public static void main(String[] args) {
		JaroWinkler jw = new JaroWinkler();
		File rootFile = new File(path);
		
		File[] categoryFloders;
		
		System.out.println("initial floders");
		// show folder of initial word category 
		categoryFloders = rootFile.listFiles();
		for (File file : categoryFloders) {
			System.out.println(file.getName());
		}
		
		System.out.println("author floders in initial floder");
		
		// show author folder in each initial folder
		for (File file : categoryFloders) {
			// file is each initial folder
			System.out.println(file.getName());
			File[] authorFolder = file.listFiles();
			for (File file2 : authorFolder) {
				System.out.println(file2.getName());
			}
		}
		
        // substitution of s and t
        System.out.println(jw.similarity("My string", "My tsring"));
        // substitution of s and n
        System.out.println(jw.similarity("My string", "My string"));

	}
}
