package day19;

class student
{
	void setScore(int score) 
	{
		score=100;
	}
}
public class _00_meth {
	public static void main(String[] args) {
		student hgd=new student();
		
		int score=87;
		System.out.println("�޼��� ȣ�� ���� ����= "+score);
		
		hgd.setScore(score);
		System.out.println("�޼��� ȣ�� ���� ����= "+score);
	}

}
