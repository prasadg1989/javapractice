
public class JavaPrograms {

	public static void main(String[] args) {
		reverseNumber(123456789);

	}
	
	public static void reverseNumber(int number) {
		int revNum=0, newNum=0;
		
		while(number%10>0) {
			revNum=revNum*10+number%10;
			number=number/10;
		}
		System.out.println(revNum);
	}

}
