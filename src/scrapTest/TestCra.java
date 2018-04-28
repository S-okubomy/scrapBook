package scrapTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class TestCra {
	public static void main(String[] args) throws IOException {
			
//			Scanner sc = new Scanner(System.in);
//			String word = sc.nextLine();
//			sc.close();
			
//			new TestCra().run(word);
			new TestCra().run();
		}
		
		public void run() throws IOException {
//			ProcessBuilder processBuilder = new ProcessBuilder("C:/Users/Administrator/Desktop/weatherPy.bat");
			ProcessBuilder processBuilder = new ProcessBuilder("python","C:/Users/Administrator/mailWeather.py");
			
			Process process = processBuilder.start();
			BufferedReader reader = 
					new BufferedReader(new InputStreamReader(process.getInputStream(), "UTF-8"));
			
			
//			BufferedWriter writer = 
//					new BufferedWriter(new OutputStreamWriter(process.getOutputStream()));
			
//			writer.write(word);
//			writer.newLine();
//			writer.flush();
			
			String strMoji;
			while ((strMoji = reader.readLine()) != null ) {
				System.out.println(strMoji);
			}
				
		}
}
