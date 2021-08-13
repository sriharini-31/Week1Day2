package Week1Day2Assignment;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="madam";
		
		StringBuilder sb=new StringBuilder(str);
		String rev="";
		String rev1 = sb.toString();
		if(str.equals(rev1)) {
			System.out.println("This Word Is Palindrome");
		} else {
			System.out.println("This Word Is Not Palindrome");
		}

	}

}
