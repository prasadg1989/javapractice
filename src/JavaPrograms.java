import java.util.HashMap;
import java.util.Map;

public class JavaPrograms {

	public static void main(String[] args) {
		reverseNumber(123456789);
		numbersCount(1232694891);
	}
	
	public static void reverseNumber(int number) {
		int revNum=0, newNum=0;
		
		while(number%10>0) {
			revNum=revNum*10+number%10;
			number=number/10;
		}
		System.out.println(revNum);
	}

	public static void numbersCount(long number) {
		char[] charArr=Long.toString(number).toCharArray();
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
