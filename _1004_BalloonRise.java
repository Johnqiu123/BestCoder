package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * ��Ŀ������һ���ַ�������ʾ��ɫ��ͳ�Ƴ�������ɫ��Ȼ�󷵻�
 * ���������ʹ��map�ķ���
 * @author Johnqiu
 *
 */
public class _1004_BalloonRise {

	public static void main(String[] args) {
		 Scanner cin = new Scanner(System.in);
		 Map<String, Integer> balloon = new HashMap<String, Integer>();
		 int num = 0;
		 
		 while(cin.hasNext()){
			  num = cin.nextInt();  // get the balloons' number
			  if (num == 0){
				  break;
			  }
			  for (int i = 0 ; i < num ; i++){
				  String color = cin.next();   // get the color
				  if ( balloon.get(color) != null){
					  int value = balloon.get(color) +1;
					  balloon.put(color, value);
				  }else{
					  balloon.put(color, 1);
				  }				  
			  }
			  int max = 0;
			  String mcolor = null;
			  for (String key : balloon.keySet()){
				  if (balloon.get(key) > max){
					  max = balloon.get(key);
					  mcolor = key;
				  }
			  }
			  System.out.println(mcolor);
			  balloon.clear();
		 }
	}
}
