package hw;
/*
 * Topic:  請寫一個程式讓使用者輸入 6 個數(可以有小數)的值，每一個值都取四捨五入後輸出這 6 個數中的最小值
 * Date: 2016/09/19
 * Author: 105021056 王家恩
 */
import java.util.Scanner;
public class hw03_105021056 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
int a = scn.nextInt();
int b = scn.nextInt();


System.out.println(Math.min(a,b));
	}

}
