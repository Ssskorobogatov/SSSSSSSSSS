package com.epam.Sergei_Skorobogatov.java.module_2;

import java.io.Serializable;

public abstract class Fleet implements Comparable, Serializable {

    public transient int year;
    public transient int capacity;
    public transient int seats;
    public transient int distance;
    public String mark;


    public Fleet(int year, int capacity, int seats, int distance, String mark) {
        this.year = year;
        this.capacity = capacity;
        this.seats = seats;
        this.distance = distance;
        this.mark = mark;
    }

    public int compareTo(Object obj) {
        Fleet tmp = (Fleet) obj;
        if (distance < tmp.distance) {
            return 1;
        } else if (distance > tmp.distance) {
            return -1;
        }
        return 0;
    }

}
