package week1.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int a = 153;
		int rem;
		int sum = 0;
		int quo =a ;
		while (quo>0) {
			rem = quo % 10;
			quo = quo / 10;
			sum = sum + rem*rem*rem;
		}
		if (a == sum) {
			System.out.println("Armstrong Number");
			} 
		else {
			System.out.println("Not an Armstrong Number");

		}		
			}

	}

