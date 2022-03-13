package com.company;

public class Main {
 public static void  t(CanFlight x){x.fight();}
    public static  void u(CanSwim x){x.swim();}
    public static  void v(CanFly x){x.fly();}
    public static  void w(ActionCharacter x){x.flight();}

    public static void main(String[] args) {
	// write your code here
        Hero h=new Hero();
        t(h);
        u(h);
        v(h);
        w(h);


    }
}
