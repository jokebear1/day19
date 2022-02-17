package day19;
class student
{
	int score;
	void setscore()
	{
		score=87;
		System.out.println("this= "+this);
	}
}

public class Ex4 {
	public static void main(String[] args) {
		student hgd=new student();
		hgd.score=100;
		System.out.println("hgd.score: "+hgd.score);
		
		System.out.println("hgd: "+hgd);
	}

}
