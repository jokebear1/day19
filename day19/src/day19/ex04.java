package day19;

class toy
{
	String name;
	void setname(String n, toy t)
	{
		t.name=n;
		System.out.println(t.name);
	}
}
public class ex04 {
	public static void main(String[] args) {
		toy t=new toy();
		String n="°õÀÎÇü";
		t.setname(n, t);
	}

}
