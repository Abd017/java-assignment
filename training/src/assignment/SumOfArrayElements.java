package assignment;

public class SumOfArrayElements {

	public static void main(String[] args) {
		int arr[] = {43,3,24,5,24,6,23,14,2,21};
		int sum=0;
		
		for(int i: arr){
			sum += i;
		}
		
		System.out.println(sum);
	}

}
