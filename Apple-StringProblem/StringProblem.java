
public class StringProblem {
	public String replaceOneCharAtaTime(String orginalString, char chr){
		String retString = "";
		
		char[] strToArray = orginalString.toCharArray();
		
		for(int i = 0; i < strToArray.length; i++){
			if(strToArray[i] != chr)
				retString += strToArray[i];
		}
		
		return retString;
	}
	
	public String replaceMatchingChar(String orginalString, String str){
		String retVal = "";
		
		retVal = orginalString.replaceAll(str, "");
		
		return retVal;
	}
	
	public static void main(String args[]){
		StringProblem sp = new StringProblem();
		String orginalString = "Apple is one of the Big market cap company in the world";
		
		String oneCharString = sp.replaceOneCharAtaTime(orginalString, 'a');
		
		String replaceAllCharString = sp.replaceMatchingChar(orginalString, "o");
		
		System.out.println("Replaced one char at a time = " + oneCharString);
		
		System.out.println("Replaced All char in String method = " + replaceAllCharString);
	}
}
