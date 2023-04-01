package CodoId;

public class RevString {

	public static void main(String[] args) {

        //Java Program to Reverse a String -
		
		String str = "Nithesh";
		String rev = "";
		int len = str.length();
		
		System.out.println("Original String : " + str);

		for(int i=len-1; i>=0; i--) {
			rev = rev + str.charAt(i);
		}

		System.out.println("Reversed String : " + rev);
	}

}
