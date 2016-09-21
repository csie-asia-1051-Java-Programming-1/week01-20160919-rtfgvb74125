package hw;
/*
 * Topic: 請寫一個程式讓使用者輸入 n 並產生 6 個介於 1~n 之間的亂數 (輸出的亂數可重覆)
 * Date: 2016/09/19
 * Author: 105021056 王家恩
 */
import java.util.Random;

import java.util.Scanner;

public class hw02_105021056 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Random rnd  = new Random();
   Scanner scn = new Scanner(System.in);
   int v1 = scn.nextInt();
   int a = rnd.nextInt(v1)+1;
   int a1 = rnd.nextInt(v1)+1;
   int a2 = rnd.nextInt(v1)+1;
   int a3 = rnd.nextInt(v1)+1;
   int a4 = rnd.nextInt(v1)+1;
   int a5 = rnd.nextInt(v1)+1;
   System.out.println(a);
   System.out.println(a1);
   System.out.println(a2);
   System.out.println(a3);
   System.out.println(a4);
   System.out.println(a5);

	}

}
