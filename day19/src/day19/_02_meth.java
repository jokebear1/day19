package day19;

class student
{
	int setscore(int score)
	{
		score=100;
		return score;
	}
}
public class _02_meth {
	public static void main(String[] args) {
		student hgd=new student();
		
		int score=87;
		System.out.println("ȣ��������: "+score);
		
		System.out.println("���1: "+hgd.setscore(score));
		
		score=hgd.setscore(score);
		System.out.println("���2: "+score);
	}

}
