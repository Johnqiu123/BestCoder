package leetcode;

import java.io.*;
import java.util.*;

/**
 * 该题求Sum(n) = 1+2+3+....+n
 *  漏洞点：
 *  1.题目虽然说结果不操过32位整数，但实际，n*(n+1)是有可能超过的，所有要先提前除以2
 *  2.每一行是一个输入值，不要连看两行
 * @author Johnqiu
 *
 */
public class _1001_SumValue
{
    public static void main(String args[])
    {
        Scanner cin = new Scanner(System.in);
        int n, result;
        while(cin.hasNext())
        {
	        n= cin.nextInt();
	        result = (n % 2>0)? (n+1)/2*n : n/2*(n+1);
	        System.out.println(result);
	        System.out.println("");
        }
    }
}