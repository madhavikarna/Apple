import java.io.*;
import java.net.*;
 

public class SearchAPITest {
	public static String expectedResult = "";
	
	public String expectedString(String str){
		StringBuffer retVal = new StringBuffer();
		
		URL url = null;
		
		try {
			url = new URL(str);
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"))) {
            for (String line; (line = reader.readLine()) != null;) {
            	retVal.append(line);
            }
        } catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Expected result I am storing when executing the API call
		// We should have some expected results contents in files somewhere
		// so that we can read and compare this data against the result got it code
		
		expectedResult = retVal.toString();
		
		return retVal.toString();
	}
	
	
    public static void main(String args[]) throws IOException {
        String stringUrl = "https://itunes.apple.com/search?term=jack+jackson";
        
        SearchAPITest sAPI = new SearchAPITest();
        
        String result = sAPI.expectedString(stringUrl);
        System.out.println(result);
    }
}


