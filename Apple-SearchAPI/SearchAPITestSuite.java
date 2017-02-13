import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class SearchAPITestSuite {
	public static String[] URL = new String[9];
	SearchAPITest sAPI = new SearchAPITest();
	public String result = ""; 
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		 URL[0] = "https://itunes.apple.com/search?term=jack+jackson";
		 URL[1] = "https://itunes.apple.com/search?term=jack";
		 URL[2] = "https://itunes.apple.com/search?term=jack+jackson&limit=25";
		 URL[3] = "https://itunes.apple.com/search?term=jack+jackson&media=musicVideo";
		 URL[4] = "https://itunes.apple.com/search?term=jim+jones&country=US";
		 URL[5] = "https://itunes.apple.com/search?term=jim+jones&country=US&media=all";
		 URL[6] = "https://itunes.apple.com/search?term=jim+jones&country=ca";
		 URL[7] = "https://itunes.apple.com/search?term=jim+jones&country=US&media=musicVideo";
		 URL[8] = "https://itunes.apple.com/search?term=yelp&country=US&media=software";
	}
	
	@Test
	public void test1() {
		result = sAPI.expectedString(URL[0]);
		assertEquals(result, SearchAPITest.expectedResult);
	}

	@Test
	public void test2() {
		result = sAPI.expectedString(URL[1]);
		assertEquals(result, SearchAPITest.expectedResult);
	}
	
	@Test
	public void test3() {
		result = sAPI.expectedString(URL[2]);
		assertEquals(result, SearchAPITest.expectedResult);
	}
	
	@Test
	public void test4() {
		result = sAPI.expectedString(URL[3]);
		assertEquals(result, SearchAPITest.expectedResult);
	}
	
	@Test
	public void test5() {
		result = sAPI.expectedString(URL[4]);
		assertEquals(result, SearchAPITest.expectedResult);
	}
	
	@Test
	public void test6() {
		result = sAPI.expectedString(URL[5]);
		assertEquals(result, SearchAPITest.expectedResult);
	}
	
	@Test
	public void test7() {
		result = sAPI.expectedString(URL[6]);
		assertEquals(result, SearchAPITest.expectedResult);
	}
	
	@Test
	public void test8() {
		result = sAPI.expectedString(URL[7]);
		assertEquals(result, SearchAPITest.expectedResult);
	}
	
	@Test
	public void test9() {
		result = sAPI.expectedString(URL[8]);
		assertEquals(result, SearchAPITest.expectedResult);
	}
}
