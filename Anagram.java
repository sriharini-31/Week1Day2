package Week1Day2Assignment;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt1 = "Start";
		String txt2 = "Stop";
		int comp=0;

		if(txt1.length()==txt2.length()) {
			char[] arrtxt1=txt1.toCharArray();
			char[] arrtxt2=txt2.toCharArray();
			Arrays.sort(arrtxt2);
			Arrays.sort(arrtxt1);
			for(int i=0;i<arrtxt2.length-1;i++) {
				if(arrtxt1[i]!=arrtxt2[i]) {
					comp++;
				
				}
				
			}
			if(comp>0) {
				System.out.println("Given Strings Is Not An Anagram");
			}
			else {
				System.out.println("Given Strings Is an Anagram");
			}
				
		}
		else {
			System.out.println("given strings are not an anagram");
		}
		

	}

}
