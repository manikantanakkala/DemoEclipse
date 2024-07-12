package Alladi;

import java.util.Scanner;

public class PyramidB 
{	
	public static void main(String[] args)
	{
		
		PyramidA aobj=new PyramidA();
		Scanner sc=new Scanner(System.in);
		
		System.out.println(" enter the pyramid  length ");
		aobj.setPrLen(sc.nextInt());	
		
		//sc.next();
		System.out.println(" enter the pyramid brick ");
		String s= sc.next(); 	
	    aobj.setPrBrc(s.charAt(0));
		
	    
	    System.out.println(" enter the space from left ");
		aobj.setSpl(sc.nextInt());	
		
		
		System.out.println(" enter the space from top ");
		aobj.setSpr(sc.nextInt());	
		
		aobj.drawPyramid();
		
		
//		int p=0,n=x1;
//		for(int i=1;i<=x1;i++)
//		{
//			for(int j=0;j<i;j++,p=0)
//			{
//				System.out.print(" ");
//			}
//			while(p!=(2*n)-1)
//			{
//				System.out.print(x2);
//				p++;
//			}
//			System.out.println("\n");
//			n--;
//	}
//			
		}	    
		
	}

