package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int rem;
		int num = 47;
		int m = num / 2;
		int count = 0;
		for (int i = 2; i < m; i++) {
			rem = num % i;
			if (rem == 0) {
				System.out.println("Not a prime no");
				break;
			}
				else {
					count++;
				     }
		}
				if (count>0) {
					System.out.println("prime");
				}
			}

		}


