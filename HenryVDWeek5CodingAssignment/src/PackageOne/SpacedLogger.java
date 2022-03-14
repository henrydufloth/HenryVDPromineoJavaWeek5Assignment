package PackageOne;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		String logStr = "";
		for (int i = 0; i < log.length(); i++) {
			if(i < log.length() - 1) {
				logStr += log.charAt(i) + " ";
			} else logStr += log.charAt(i);
		}
		System.out.println(logStr);
	}

	@Override
	public void error(String err) {
		String logStr = "";
		for (int i = 0; i < err.length(); i++) {
			if(i < err.length() - 1) {
				logStr += err.charAt(i) + " ";
			} else logStr += err.charAt(i);
		}
		System.out.println("ERROR: " + logStr);
	}

}
