package testcases;

import org.junit.Test;
import org.junit.Assert;

import moodAnalyser.MoodAnalyser;
import moodAnalyser.MoodAnalyserException;

public class MoodAnalyserTest {

	/**
	 * This test case will check for sad mood.
	 */
	@Test
	public void testSad() {
		try {
			MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
			String mood = moodAnalyser.analyseMood();
			Assert.assertEquals("SAD", mood);
		} catch (MoodAnalyserException e) {
			System.out.println(e);
		}
	}

	/**
	 * This test case will check for sad mood.
	 */
	@Test
	public void testHappy() {
		try {
			MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any mood");
			String mood = moodAnalyser.analyseMood();
			Assert.assertEquals("HAPPY", mood);
		} catch (MoodAnalyserException e) {
			System.out.println(e);
		}

	}

	/**
	 * Test for Null value expects exception
	 */
	@Test
	public void testForNullValue_getsException() {
		try {
			MoodAnalyser moodAnalyser = new MoodAnalyser();
			moodAnalyser.analyseMood();
		} catch (MoodAnalyserException e) {
			System.out.println(e);
		}
	}

	/**
	 * Test for Empty mood expects exception
	 */
	@Test
	public void testForEmptyMood_getsException() {
		try {
			MoodAnalyser moodAnalyser = new MoodAnalyser("");
			moodAnalyser.analyseMood();
		} catch (MoodAnalyserException e) {
			System.out.println(e);
		}

	}

}
