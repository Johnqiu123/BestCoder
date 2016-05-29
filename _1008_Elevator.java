package leetcode;

/**
 * 题目：楼梯算时间问题
 * 从0楼开始算，上升一层6s，下降一层4s，停留一层5s，统计总耗时
 */
import java.util.Scanner;

public class _1008_Elevator {

	public static void main(String[] args) {
		  Scanner cin = new Scanner(System.in);
		  
		  int n, m;
		  while(cin.hasNext()){
			  n = cin.nextInt();
			  if (n == 0) break;
			  int start = 0;
			  int time = 0;
			  while (n > 0){
				   m = cin.nextInt();
//				   System.out.println(time);
				   if (m > start){
					   time += (m-start) * 6;
				   }else{
					   time += (start-m) * 4;
				   }
				   start = m;
				   time += 5;
				   n--;
			  }
			  System.out.println(time);
		  }
	}
}
