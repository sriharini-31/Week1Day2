package Week1Day2Assignment;

public class ReveseEvenWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester"; 
		String[] words=test.split(" ");
		for(int i=0;i<words.length;i++) {
			if(i%2==1) {
		int	lenOfOddIndexWords=words[i].length();
		for(int j=lenOfOddIndexWords-1;j>=0;j--) {
			System.out.print(words[i].charAt(j));
		}
		System.out.print(" ");
		}
			else {
				System.out.print(words[i]+" ");
			}
	}
	}

}
