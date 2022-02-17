package day19;

class member
{
	String name;
	void setname(String n)
	{
		System.out.println("this = "+this);
	}
}
public class ex03 {
	public static void main(String[] args) {
		member hgd=new member();
		System.out.println("hgd= "+ hgd);
		
		hgd.setname("¿”∏Ì¡¯");
		System.out.println(hgd.name);
	}

}
