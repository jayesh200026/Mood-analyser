package testcases;

import org.junit.Test;
import org.junit.Assert;

import moodAnalyser.MoodAnalyser;

public class MoodAnalyserTest {

	/**
	 * This test case will check for sad mood.
	 */
	@Test
	public void testSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("I am in sad mood");
		Assert.assertEquals("SAD", mood);
	}

	/**
	 * This test case will check for sad mood.
	 */
	@Test
	public void testHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("I am in Any mood");
		Assert.assertEquals("HAPPY", mood);
	}

}
