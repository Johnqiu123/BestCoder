package leetcode;

import java.util.Scanner;

/**
 * 问题： Memory Limit Exceeded
 * 采用递归的方法，当N》100时算不出结果
 * @author Johnqiu
 *
 */
public class _1005_NumSeq {
	
	public static int count = 0;
			
	public long f(int a, int b, long n){
		count++;
//		System.out.println(n);
	    if(n <= 0 || a <= 0 || b <=0){
	    	return 0;
	    }
		if (n==1 || n==2){
			return 1;
		}
		return (a * f(a, b, n-1) + b * f(a,b,n-2)) %  7;
	}
	/*---------------------------------------方案1---------------------------------------*/
//	public static void main(String[] args) {
//		Scanner cin = new Scanner(System.in);
//		int a,b;
//		long num;
//		NumSeq_1005 ns = new NumSeq_1005();
//		while (cin.hasNext()){
//			a = cin.nextInt();
//			b = cin.nextInt();
//			num = cin.nextInt();
//			
//			count = 0;
//			long result =ns. f(a,b,num);
//			System.out.println(count);
////			System.out.println(result);
//		}
//	}
	
	/*---------------------------------------方案2---------------------------------------*/
	public static void main(String[] args) {
		  Scanner cin = new Scanner(System.in);
		  long a, b, n;
		  long[] s = new long[50];
		  
		  while (cin.hasNext()){
			  a = cin.nextLong();
			  b = cin.nextLong();
			  n = cin.nextLong();
			  
			  if (n <= 0 || a <= 0 || b <=0){
				  break;
			  }
			  
			  n = n% 49;
			  s[1] = 1;
			  s[2] = 1;
			  for (int i = 3;  i < 49; i++){
				  s[i] = (a * s[i-1] + b * s[i-2]) % 7;
//				  System.out.println(s[i]);
			  }
			  s[0] = (a * s[48] + b * s[47]) %7;
			  System.out.println(s[(int) n]);
		  }
		  
	}
}
