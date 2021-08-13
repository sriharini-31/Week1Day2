package Week1Day2Assignment;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Harini";

		char[] strArray=str.toCharArray();
		for (int i = 0; i < strArray.length; i++) {
			int count=1;
			for(int j=i+1;j<strArray.length;j++) {
				if(strArray[i]==strArray[j]) {
					count++;
				strArray[j]='0';
				}
				
			}
			if(strArray[i]!='0') {
				System.out.println(strArray[i]+":"+count);
			}
			
		}

	}

}
