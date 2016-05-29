package leetcode;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 题目：大数求和
 * 方法：直接使用Java.math.BigInteger
 * @author Johnqiu
 *
 */
public class _1002_SumValueBigInteger {
	
	public static void main(String[] args) {
		
		Scanner cin = new Scanner(System.in);
		ArrayList values = new ArrayList();
		while(cin.hasNext()){
			int casenum = cin.nextInt(); // 读取case数目
			int  i = 1, j=1;
			while(i <= casenum){
				BigInteger a=new BigInteger(cin.next());  
				BigInteger b=new BigInteger(cin.next());
				values.add(a);
				values.add(b);
				i++;
			}
			for(int k=0 ; k < values.size(); k++){
				BigInteger va=(BigInteger) values.get(k);  
				BigInteger vb=(BigInteger) values.get(++k);
				System.out.println("Case "+(j++)+":");
				System.out.println(va + " + "+ vb + " = " + va.add(vb));
				if(k !=  values.size()-1){
					System.out.println("");
				}	
			}
		}
	}

}
