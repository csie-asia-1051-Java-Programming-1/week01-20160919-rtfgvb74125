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
float a = scn.nextFloat();
float b = scn.nextFloat();
float c = scn.nextFloat();
float d = scn.nextFloat();
float e = scn.nextFloat();
float f = scn.nextFloat();


float A = Math.min(a, b);
float B = Math.min(A, c);
float C = Math.min(B, d);
float D = Math.min(C, e);
float E = Math.min(D, f);


System.out.println(Math.round(E));
	}

}
