
public class JavaStringPrograms {

	public static void main(String[] args) {
		
		reverseString("PRASAD GUTHULA");
	}
	
	public static void reverseString(String str) {
		char[] strChar=str.toCharArray();
		String revString="";
		for(int i=strChar.length-1; i>=0; i--) {
			revString=revString+strChar[i];
		}
		System.out.println(revString);
	}

}
