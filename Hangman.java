import java.util.*;
import java.io.*;
import java.lang.*;

public class Hangman {
	public static void main(String[] args) {

		//gbildruta gui = new gbildruta();

		Scanner sc = new Scanner(System.in);
		char[] ordet = getWord();
		char[] display = new char[ordet.length*2];
		String guess;
		char[] displayCurrent = displayShite();
		int gissningar = 6;


		System.out.println("Input a letter or word: ");
		System.out.println(displayShite());
		public static char[] displayShite() {

			for(int j = 0; j < display.length; j++) {
				if(j%2 == 0 || j == 0) {
					display[j] = '_';
				} else {
					display[j] = ' ';
				}
			}
	}

		do {
			guess = sc.next();
			if(guess.length() > 0) {
				if(guess.length() > 1) {
					//Ett helt ord
					if(String.valueOf(ordet).equals(guess)) {
						//Du vann
					} else {
						//Ta bort en gissning
						gissningar--;
					}
				} else {
					//En bokstav
					//for(int i = 0; i < ordet.length; i++) {


					//}
				}
			}
		}while (gissningar != 0);
	}




	public static char[] getWord() {
		try {

			FileInputStream fileStream = new FileInputStream("Ordlista.txt");
			DataInputStream dataStream = new DataInputStream(fileStream);
			InputStreamReader reader = new InputStreamReader(dataStream);

			BufferedReader buffer = new BufferedReader(reader);

			String temp;
			int size = 0;
			while((temp = buffer.readLine()) != null) {
				size++;
			}
			Random random = new Random();
			int slumpNum = random.nextInt(size);

			int count = 0;

			fileStream = new FileInputStream("Ordlista.txt");
			dataStream = new DataInputStream(fileStream);
			reader = new InputStreamReader(dataStream);
			buffer = new BufferedReader(reader);

			while((temp = buffer.readLine()) != null) {
				if(count == slumpNum) {
					return temp.toCharArray();
				}
				count++;
			}

		} catch(IOException ioexc) {

		}
		return null;
	}

}
