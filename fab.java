package com.xjtu.java;
import java.math.BigInteger;



public class Fibonacci {

	public static BigInteger of(int n) {		

		if(n<0) {
			 throw new Error("invalid");
		}

		if(n==1||n==2) {
			return BigInteger.valueOf(1);
		}

		BigInteger a=BigInteger.valueOf(1);
		BigInteger b=BigInteger.valueOf(1);
		BigInteger res=BigInteger.valueOf(0);

		for(int i=3;i<=n;i++) {

			res=a.add(b);
			a=b;
			b=res;

		}

		return res;
	}

	public static void main(String[]args) {

		for(int i=1;i<=200;i++) {
	
        	of(i);
			System.out.println("Fibonacci.of("+i+")=="+of(i));

		}

	}



}