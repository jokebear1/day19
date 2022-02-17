package day19;

import java.util.Random;
import java.util.Scanner;

class Ex13
{
	final int s=9;
	int[] front=new int[s];
	int[] back=new int[s];
}
public class to {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random ran=new Random();
		Ex13 e=new Ex13();
		
		
		for(int i=0; i<e.s; i++)
		{
			e.front[i]=(1+i);
			e.back[i]=(10+i);
		}
		
		for(int i=0; i<1000; i++)
		{
			int num=ran.nextInt(e.s);
			int temp=e.front[0];
			e.front[0]=e.front[num];
			e.front[num]=temp;
		}
		
		int data=1;
		while(true)
		{
			for(int i=0; i<e.s; i++)
			{
				if(e.front[i]==0)
				{
					System.out.print("\t");
				}
				else
				{
					System.out.print(e.front[i] + "\t");
				}
				if(i%3==2) 
				{
					System.out.println("\n");
				}
			}
			System.out.println();
			
			
			if(data==19)
			{
				System.out.println("종료");
				break;
			}
			
			System.out.println("인덱스 입력 : ");
			int idx=sc.nextInt();
			if(e.front[idx] ==data)
			{
				if(1<=data && data<=e.s)
				{
					e.front[idx]=e.back[idx];
				}
				else if(e.s < data && data<=10)
				{
					e.front[idx]=0;
				}
				data++;
			}
		
		}
		
		
	}

}
