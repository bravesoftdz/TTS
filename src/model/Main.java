package model;

import java.util.Scanner;

import marytts.client.MaryClient.Voice;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {

		TextToSpeech tts = new TextToSpeech();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter text to speach:");
		
		String t = scanner.nextLine();

		tts.speak(t, 1.0f, false, false);

		scanner.close();

	}

}
