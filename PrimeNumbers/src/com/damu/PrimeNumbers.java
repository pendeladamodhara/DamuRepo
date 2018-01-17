package com.damu;

import java.util.Scanner;

public class PrimeNumbers {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter number to get prime n  umbers========");
	int num=Integer.parseInt(s.next());
	int count;
	for(int i=1; i<=num;i++)
	{
            
		count=0;
		for(int j=2;j<=2;j++)
		{
			if(i%j==0)
			{
				count++;
			}
		}
		if(i==100)
		{
			break;
		}
		if(count==0)
		{
			System.out.println(i);
		}
	}
}
}
