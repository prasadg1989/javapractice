import java.util.HashMap;
import java.util.Map;

public class JavaStringPrograms {

	public static void main(String[] args) {
		
		reverseString("PRASAD GUTHULA");
		characterCount("PRASADGUTHULA");
	}
	
	public static void reverseString(String str) {
		char[] strChar=str.toCharArray();
		String revString="";
		for(int i=strChar.length-1; i>=0; i--) {
			revString=revString+strChar[i];
		}
		System.out.println(revString);
	}
	
	public static void characterCount(String str) {
		char[] charArr=str.toCharArray();
		Map<Character, Integer> charCount=new HashMap<Character, Integer>();
		for(int i=0; i<charArr.length;i++) {
			if(charCount.containsKey(charArr[i])) {
				charCount.put(charArr[i], charCount.get(charArr[i])+1);
			}else {
				charCount.put(charArr[i], 1);
			}
		}
		System.out.println(charCount);
	}

}
