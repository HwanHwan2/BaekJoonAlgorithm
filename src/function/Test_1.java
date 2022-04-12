package function;

import java.util.Scanner;
/*
 Java: long sum(int[] a);
 a: ���� ���ؾ� �ϴ� ���� n���� ����Ǿ� �ִ� �迭 (0 �� a[i] �� 1,000,000, 1 �� n �� 3,000,000)
 ���ϰ�: a�� ���ԵǾ� �ִ� ���� n���� ��
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
