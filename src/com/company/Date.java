package com.company;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date(int month, int year) {
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void print() {
        if(day>0 && day<=30 && month>0 && month<=12 && year>0 && year<=2018){
        System.out.print("tarix "+getDay());
        System.out.print("/"+getMonth());
        System.out.print("/"+getYear());
        System.out.println();}
        else
            System.out.println("yanlis format");
    }
}
