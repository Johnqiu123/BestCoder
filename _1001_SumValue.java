package leetcode;

import java.io.*;
import java.util.*;

/**
 * ������Sum(n) = 1+2+3+....+n
 *  ©���㣺
 *  1.��Ŀ��Ȼ˵������ٹ�32λ��������ʵ�ʣ�n*(n+1)���п��ܳ����ģ�����Ҫ����ǰ����2
 *  2.ÿһ����һ������ֵ����Ҫ��������
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