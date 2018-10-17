package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Date date=new Date(21,11,1991);

        Date tarix=new Date(12,1992);
        tarix.setDay(30);

        date.print();
        tarix.print();

    }
}
