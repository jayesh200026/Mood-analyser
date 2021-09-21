package moodAnalyser;

/**
 * @author jayeshkumar 
 * Program that gives the mood of person.
 */
public class MoodAnalyser {
	String message;

	public MoodAnalyser() {

	}

	public MoodAnalyser(String message) {
		this.message = message;
	}

	/**
	 * 
	 * @return string sad if message contains "sad" word in it else return happy.
	 */
	public String analyseMood() {
		if (message.contains("sad")) {
			return "SAD";
		}
		return "HAPPY";
	}

}
