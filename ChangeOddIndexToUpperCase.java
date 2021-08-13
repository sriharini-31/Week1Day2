package Week1Day2Assignment;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		
		char[] strArray = test.toCharArray();
		
		for (int i = 0; i < test.length(); i++) {
			
			if (i % 2 == 0) {
				strArray[i] = Character.toUpperCase(test.charAt(i));
			}
			
			else {
				
				strArray[i] = test.charAt(i);
			}
						
		}
		
            System.out.println(strArray);

	}

}
