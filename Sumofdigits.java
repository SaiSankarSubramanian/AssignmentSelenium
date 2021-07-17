package week1.day1;

public class Sumofdigits {

	public static void main(String[] args) {
		int num = 123;
		int x;
		int sum = 0;
		
		while (num > 0) {
			x = num % 10;
			System.out.println("Remainder is:" +x);
			sum = sum + x;
			num = num / 10;
			System.out.println("The Quotient is:" +num);
		}
	System.out.println("The sum of digits is:" +sum);	
		

	}

}
