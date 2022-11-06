import java.util.*;
import currency.*;
import distance.*;
import time.*;
class mainclass{
	public static void main(String args[]){
		currency c =new currency();
		distance d =new distance();
		time t =new time();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number what you want to convert");
		System.out.println("1--currency");
		System.out.println("2--distence");
		System.out.println("3--time");
		int a = s.nextInt();
		switch(a){
		case 1:
		System.out.println("5 Dollar to Inr is "+c.d2i(5));
		System.out.println("5 Inr to Dollar is "+c.i2d(5));
		System.out.println("10 Euro to Inr is "+c.e2i(10));
		System.out.println("10 Inr to Euro is "+c.i2e(10));
		System.out.println("100 Yen to Inr is "+c.y2i(100));
		System.out.println("100 Inr to Yen is "+c.i2y(100));
		break;
		case 2:
		System.out.println("1000 Meter to Kilometer is "+d.m2km(1000));
		System.out.println("1 Kilmeter to Meter is "+d.km2m(1));
		System.out.println("2 Miles to kilometer is "+d.mi2km(2));
		System.out.println("5 Kilmeter to Miles is "+d.km2mi(5));
		break;
		case 3:
		System.out.println("2 Hours to Minutes is "+t.h2m(2));
		System.out.println("180 Minutes to Hours is "+t.m2h(180));
		System.out.println("2 Hours to Seconds is "+t.h2s(2));
		System.out.println("7200 Seconds to Hours is "+t.s2h(7200));
		break;		
}
	}
} 
