package CodoId;

public class SortArray {

	public static void main(String[] args) {

        //Java program to sort an array
		
		int[] num = new int[] {56,86,92,33,57,66,34,10};
		int temp = 0;

		System.out.println("Before Sorting :" );
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("After Sorting :" );
		
		for(int i=0; i<num.length; i++) {
			for(int j=i+1; j<num.length; j++) {
				
				if(num[i]>num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
			System.out.print(num[i] + " ");
		}

	}
}