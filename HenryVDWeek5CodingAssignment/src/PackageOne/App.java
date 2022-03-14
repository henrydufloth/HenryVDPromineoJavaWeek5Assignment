package PackageOne;

import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Logger aLogger = new AsteriskLogger();
		Logger sLogger = new SpacedLogger();
		
		// Enter String Value version:
		
		System.out.println("What word would you like to use for AsteriskLogger log?");
		String log1 = scanner.nextLine();
		aLogger.log(log1);
		System.out.println("What word would you like to use for AsteriskLogger error?");
		String err1 = scanner.nextLine();
		aLogger.error(err1);
		System.out.println("What word would you like to use for SpacedLogger log?");
		String log2 = scanner.nextLine();
		sLogger.log(log2);
		System.out.println("What word would you like to use for SpacedLogger error?");
		String err2 = scanner.nextLine();
		sLogger.error(err2);	
		
		// Static "Hello" Version:
		
		aLogger.log("Hello");
		aLogger.error("Hello");
		sLogger.log("Hello");
		sLogger.error("Hello");	
	}

}
