package day19;

import java.util.Scanner;

import day19.Ex12;

class Ex12
{
	String[][] game=new String[3][3];
	int turn=0;
	int win=0;
}
public class tic {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Ex12 e=new Ex12();
		
		for(int i=0; i<e.game.length; i++)
		{
			for(int j=0; j<e.game.length; j++)
			{
				e.game[i][j]="[ ]";
			}
		}
		System.out.println("====Æ½¾ØÅå °ÔÀÓ====");
		while(true)
		{
			for(int i=0; i<e.game.length; i++)
			{
				for(int j=0; j<e.game[i].length; j++)
				{
					System.out.print(e.game[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println();
			
			//p1ÀÌ 0, p2°¡ x·Î Ç¥½Ã
			if(e.turn%2==0)
			{
				System.out.println("[p1] yÁÂÇ¥");
				int y=sc.nextInt();
				System.out.println("[p1] xÁÂÇ¥");
				int x=sc.nextInt();
				
				
				if(e.game[y][x].equals("[ ]"))
					{
						System.out.println("[o]");
						e.turn++;
					}
			}
			else if(e.turn%2==1)
			{
				System.out.println("[p2] yÁÂÇ¥");
				int y=sc.nextInt();
				System.out.println("[p2] xÁÂÇ¥");
				int x=sc.nextInt();
				
				if(e.game[y][x].equals("[ ]"))
				{
					System.out.println("[x]");
					e.turn++;
				}
			}
			
			if(e.win==1)
			{
				System.out.println("[p1] ½Â¸®");
				break;
			}
			else if(e.win==2)
			{
				System.out.println("[p2] ½Â¸®");
				break;
			}
				
			
			for(int i=0; i<e.game.length; i++)
			{
				if(e.game[i][0].equals("[o]") && e.game[i][1].equals("[o]") && e.game[i][2].equals("[o]"))
				{
					e.win=1;
				}
				if(e.game[i][0].equals("[x]") &&  e.game[i][1].equals("[x]") && e.game[i][2].equals("[x]"))
				{
					e.win=2;
				}
			}
			
			for(int i=0; i<e.game.length; i++)
			{
				if(e.game[0][i].equals("[o]") && e.game[1][i].equals("[o]") && e.game[2][i].equals("[o]"))
				{
					e.win=1;
				}
				if(e.game[0][i].equals("[x]") &&  e.game[1][i].equals("[x]") && e.game[2][i].equals("[x]"))
				{
					e.win=2;
				}
			}
			
			for(int i=0; i<e.game.length; i++)
			{
				if(e.game[0][0].equals("[o]") && e.game[1][1].equals("[o]") && e.game[2][2].equals("[o]"))
				{
					e.win=1;
				}
				if(e.game[0][0].equals("[x]") &&  e.game[1][1].equals("[x]") && e.game[2][2].equals("[x]"))
				{
					e.win=2;
				}
			}
			
			for(int i=0; i<e.game.length; i++)
			{
				if(e.game[0][2].equals("[o]") && e.game[1][1].equals("[o]") && e.game[2][0].equals("[o]"))
				{
					e.win=1;
				}
				if(e.game[0][2].equals("[x]") &&  e.game[1][1].equals("[x]") && e.game[2][0].equals("[x]"))
				{
					e.win=2;
				}
			}
			
	
			
			
			
		
			
			
			
			
			
			
			
			
			
			
		}
	}

}

