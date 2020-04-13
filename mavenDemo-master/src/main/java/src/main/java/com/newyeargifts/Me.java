package src.main.java.com.newyeargifts;

import java.util.Random;

public class Me {
	Random rand;
	int i;
String[] names= {"Alice","Bob","Christine","Daniel","Edward"};
public Me(){
	this.rand=new Random();
	this.i=this.rand.nextInt(5);
}


//Maintaining a bag of sweets


	public static class Bag{
		static float net_weight;
		}

	//Giving sweets to someone
	
	public void giftTo(DarkChocolate d) {
		System.out.println("Gifted a dark chocolate to "+this.names[this.i]);
		Bag.net_weight=(float)(Bag.net_weight-d.net_weight);
	}

	public void giftTo(SoftToffee t) {
		this.i=this.rand.nextInt(5);
		System.out.println("Gifted a Soft toffee chocolate to "+this.names[this.i]);
		Bag.net_weight=(float)Bag.net_weight-t.net_weight;
	}
	
	public void giftTo(MilkChocolate d) {
		this.i=this.rand.nextInt(5);
		System.out.println("Gifted a Milk chocolate to "+this.names[this.i]);
		Bag.net_weight=(float)Bag.net_weight-d.net_weight;
	}
	
	public void giftTo(BrittleToffee t) {
		this.i=this.rand.nextInt(5);
		System.out.println("Gifted a Brittle Toffee to "+this.names[this.i]);
		Bag.net_weight=(float)Bag.net_weight-t.net_weight;
	}
	
	public void giftTo(CandyBar cb) {
		this.i=this.rand.nextInt(5);
		System.out.println("Gifted a Candy Bar to "+this.names[this.i]);
		Bag.net_weight=(float)Bag.net_weight-cb.net_weight;
	}
	
	public void giftTo(Lollipop l) {
		this.i=this.rand.nextInt(5);
		System.out.println("Gifted a Lollipop to "+this.names[this.i]);
		Bag.net_weight=(float)Bag.net_weight-l.net_weight;
	}
	
	
	
	//Receiving Gifts
	
	
	public void receiveFrom(DarkChocolate d) {
		System.out.println("Received a dark chocolate from "+this.names[this.i]);
		Bag.net_weight=(float)(Bag.net_weight+d.net_weight);
	}
	
	
	public void receiveFrom(SoftToffee t) {
		this.i=this.rand.nextInt(5);
		System.out.println("Received a Soft toffee chocolate from "+this.names[this.i]);
		Bag.net_weight=(float)Bag.net_weight+t.net_weight;
	}
	
	public void receiveFrom(MilkChocolate d) {
		this.i=this.rand.nextInt(5);
		System.out.println("Received a Milk chocolate from "+this.names[this.i]);
		Bag.net_weight=(float)Bag.net_weight+d.net_weight;
	}
	
	public void receiveFrom(BrittleToffee t) {
		this.i=this.rand.nextInt(5);
		System.out.println("Received a Brittle Toffee from "+this.names[this.i]);
		Bag.net_weight=(float)Bag.net_weight+t.net_weight;
	}
	
	public void receiveFrom(CandyBar cb) {
		this.i=this.rand.nextInt(5);
		System.out.println("Receiveded a Candy Bar from "+this.names[this.i]);
		Bag.net_weight=(float)Bag.net_weight+cb.net_weight;
	}
	
	public void receiveFrom(Lollipop l) {
		this.i=this.rand.nextInt(5);
		System.out.println("Received a Lollipop from "+this.names[this.i]);
		Bag.net_weight=(float)Bag.net_weight+l.net_weight;
	}
	
	//Displaying total weight
	
	public void displayContents() {
		System.out.println("The total weight of the bag currently is "+Bag.net_weight);
	}
}
