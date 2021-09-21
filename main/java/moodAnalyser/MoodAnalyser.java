package moodAnalyser;

/**
 * @author jayeshkumar 
 * Program that gives the mood of person.
 */
public class MoodAnalyser {
	String message;

	public MoodAnalyser() {
		this.message = null;
	}

	public MoodAnalyser(String message) {
		this.message = message;
	}

	/**
	 * 
	 * @return string sad if message contains "sad" word in it else return happy.
	 */
	public String analyseMood() {

		try {
			if (message == null) {
				return "HAPPY";
			}
		} catch (NullPointerException e) {
			System.out.println(e);
		}

		if (message.contains("sad")) {
			return "SAD";
		}
		return "HAPPY";
	}

}
