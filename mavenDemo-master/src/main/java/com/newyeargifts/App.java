package com.newyeargifts;

import java.util.Random;
import java.util.Scanner;

import src.main.java.com.newyeargifts.BrittleToffee;
import src.main.java.com.newyeargifts.CandyBar;
import src.main.java.com.newyeargifts.DarkChocolate;
import src.main.java.com.newyeargifts.Lollipop;
import src.main.java.com.newyeargifts.Me;
import src.main.java.com.newyeargifts.MilkChocolate;
import src.main.java.com.newyeargifts.SoftToffee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Me m=new Me();
    	Random r=new Random();
    	int n,i;
    	System.out.println("Enter your choice\n1:Recieve a Gift\n2:Send a Gift\n3:Peek into Bag\n0:Return Home");
        Scanner s = new Scanner(System.in);
        do {
            n= s.nextInt();
            switch (n) {
            case 1:i=r.nextInt(6);
            i++;
            switch(i) {
            case 1:DarkChocolate d=new DarkChocolate();
			m.receiveFrom(d);
				break;
            case 2:SoftToffee t=new SoftToffee();
           	m.receiveFrom(t);
            	break;
            case 3:MilkChocolate mc=new MilkChocolate();
            m.receiveFrom(mc);
            break;
            case 4:BrittleToffee bt=new BrittleToffee();
            m.receiveFrom(bt);
            break;
            case 5:CandyBar cb=new CandyBar();
            m.receiveFrom(cb);
            break;
            case 6:Lollipop l=new Lollipop();
            m.receiveFrom(l);
            break;
            };
            break;
            
            
            case 2:i=r.nextInt(6);
            i++;
            switch(i) {
            case 1:DarkChocolate d=new DarkChocolate();
			m.giftTo(d);
				break;
            case 2:SoftToffee t=new SoftToffee();
           	m.giftTo(t);
            	break;
            case 3:MilkChocolate mc=new MilkChocolate();
            m.giftTo(mc);
            break;
            case 4:BrittleToffee bt=new BrittleToffee();
            m.giftTo(bt);
            break;
            case 5:CandyBar cb=new CandyBar();
            m.giftTo(cb);
            break;
            case 6:Lollipop l=new Lollipop();
            m.giftTo(l);
            break;
            };
            break;
            
            case 3:m.displayContents();
            break;
        
            } 
        } while (n!=0);
    }
}
