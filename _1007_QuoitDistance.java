package leetcode;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 题意：求任意两点之间距离最小的两点间的距离，该距离为套圈的直径，结果输出套圈的半径，即直径/2
 * 解决方法：
 * 1. 穷举法
 *      两两之间求最短距离
 * 2. 二分法
 * 
 * @author Johnqiu
 *
 */
public class _1007_QuoitDistance {
	
		public static void main(String[] args) {
			Scanner cin = new Scanner(System.in);
			
			while (cin.hasNext()){
				int  n = cin.nextInt();
				ArrayList list = new ArrayList();
				for (int i = 0; i < n ; i++){
					int[] point = new int[2];
					point[0] = cin.nextInt();
					point[1] = cin.nextInt();
					list.add(point);
				}
				Double  minDistance =  Double.MAX_VALUE;
				for (int i = 0; i  < n; i++){
					for (int j = i+1; j < n; j++){
						int[] pointi = (int[]) list.get(i);
						int[] pointj = (int[]) list.get(j);
					    double x = Math.pow(pointi[0]-pointj[0],2);
					    double y = Math.pow(pointi[1]-pointj[1], 2);
					    double distance = Math.sqrt(x + y);
					    if (distance < minDistance){
					    	minDistance = distance;
					    }
					}
				}
			    DecimalFormat    df   = new DecimalFormat("0.00"); 
			    String s= df.format(minDistance/2) ; 
			    System.out.println(s);
			}
		}
}
