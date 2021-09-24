package assignment;

import java.util.Arrays;

public class Fibonacci {

	public static void main(String[] args) {
		int n = 10;
		
		int fib[] = new int[n];
		fib[0] = fib[1] = 1;
		
		for(int i=2;i<n;i++){
			fib[i] = fib[i-1] + fib[i-2];
		}

		Arrays.stream(fib).forEach(i-> System.out.println(i));
		
		
	}
}



