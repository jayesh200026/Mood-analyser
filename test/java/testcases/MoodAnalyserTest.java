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
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("SAD", mood);
	}

	/**
	 * This test case will check for sad mood.
	 */
	@Test
	public void testHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any mood");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}

}
