package moodAnalyser;

/**
 * @author jayeshkumar
 *  Program that gives the mood of person.
 */
public class MoodAnalyser {

	/**
	 * 
	 * @return string sad if message contains "sad" word in it else return happy.
	 */
	public String analyseMood(String message) {
		if (message.contains("sad")) {
			return "SAD";
		}
		return "HAPPY";
	}

}
