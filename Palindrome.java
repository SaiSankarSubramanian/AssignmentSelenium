package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		String sv = "Madam";
		String srv = "";
		
		for(int i = sv.length()-1; i >= 0; i--) {
			char c = sv.charAt(i);
			srv = srv + c;
			System.out.println(srv);
			
			if(srv.equalsIgnoreCase(sv)) {
				System.out.println("Palindrome");
			}
			
		}

	}

}
