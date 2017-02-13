import static org.junit.Assert.*;

import org.junit.Test;

public class StringTest {
	StringProblem sp = new StringProblem();
	
	@Test
	public void shouldRemoveCharOccurrencesFromString1() throws Exception {
		String inputString = "ABCABC";
		String expectedResult = "BCBC";
		String actaulResult = sp.replaceOneCharAtaTime(inputString, 'A');
		assertEquals(actaulResult, expectedResult);
 	}
	
	// Negative Test
	@Test
	public void shouldRemoveCharOccurrencesFromString2() throws Exception {
		String inputString = "ABCABC";
		String expectedResult = "BCBCA";
		String actaulResult = sp.replaceOneCharAtaTime(inputString, 'A');
		assertEquals(actaulResult, expectedResult);
 	}
	
	@Test
	public void shouldReplaceMatchingChar1() throws Exception {
		String inputString = "ABCABC";
		String expectedResult = "ACAC";
		String actaulResult = sp.replaceMatchingChar(inputString, "B");
		assertEquals(actaulResult, expectedResult);
 	}
	
	// Negative Test
	@Test
	public void shouldReplaceMatchingChar2() throws Exception {
		String inputString = "ABCABC";
		String expectedResult = "ACACB";
		String actaulResult = sp.replaceMatchingChar(inputString, "B");
		assertEquals(actaulResult, expectedResult);
 	}
	
}
