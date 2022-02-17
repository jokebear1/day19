package day19;

class fruit
{
	int setprice(int price)
		{
			price=1000;
			return price;
		}
	}

public class Ex02 {
	public static void main(String[] args) {
		fruit oran=new fruit();
		
		int price=700;
		price=oran.setprice(price);
		System.out.println(price);
	}

}
