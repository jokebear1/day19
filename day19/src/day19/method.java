package day19;

class Ex05
{
	void test1(int[] arr)
	{
		int count=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%4==0)
			{
				count++;
			}
		}
	
	}
	void test2(int[] arr)
	{
		 
		
	}
	
}
public class method {
	public static void main(String[] args) {
		Ex05 e= new Ex05();
		
		int[] arr= {87,12,21,56,100};
		
		System.out.println("����1) 4�� ����� ���� : "+e.test1(arr));
		
		int[] temp=e.test2(arr);
		System.out.println("����2) 4�� ����� �迭 Ÿ������ ���� : ");
		e.print(temp);
		
	}

}
