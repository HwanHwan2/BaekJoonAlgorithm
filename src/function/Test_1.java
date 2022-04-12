package function;

import java.util.Scanner;
/*
 Java: long sum(int[] a);
 a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
 리턴값: a에 포함되어 있는 정수 n개의 합
 */
public class Test_1 {
	
	static long sum(int[] a) {
    	long ans = 0;
    	for(int b = 0; b < a.length; b++) {
    		ans += a[b];
    	}   
        return ans;
    }
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] m = new int[n];
		for(int i = 0; i < n; i++) {
			m[i] = scan.nextInt();
		}
		System.out.println(sum(m));
	}

}
