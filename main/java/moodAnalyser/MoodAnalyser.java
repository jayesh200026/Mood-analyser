package moodAnalyser;

/**
 * @author jayeshkumar 
 * Program that gives the mood of person.
 */
public class MoodAnalyser {
	String message;

	public enum errors {
		EMPTY_MOOD_ERROR,NULL_MOOD_ERROR
	}

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
	public String analyseMood() throws MoodAnalyserException {

		if (message == null) {

			throw new MoodAnalyserException(errors.NULL_MOOD_ERROR.toString());
		}
		if (message.length() == 0) {
			throw new MoodAnalyserException(errors.EMPTY_MOOD_ERROR.toString());
		}

		if (message.contains("sad")) {
			return "SAD";
		}
		else {
		return "HAPPY";
		}
	}

}
