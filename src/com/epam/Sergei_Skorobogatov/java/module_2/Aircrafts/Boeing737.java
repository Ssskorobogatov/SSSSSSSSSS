package com.epam.Sergei_Skorobogatov.java.module_2.Aircrafts;

import com.epam.Sergei_Skorobogatov.java.module_2.Fleet;
import com.epam.Sergei_Skorobogatov.java.module_2.Info;

import java.io.Serializable;

public class Boeing737 extends Fleet implements Info, Serializable {

    public Boeing737(int year, int capacity, int seats, int distance, String mark) {
        super(year, capacity, seats, distance, mark);
    }


    @Override
    public void showInfo() {
        System.out.println("Характеристики самолета " + this.mark + ": " + "Год производства " + this.year + "; " + "грузоподъемность " + this.capacity + " кг; " + "количество пассажирских мест " + this.seats + " чел; " + "дальность полета " + this.distance + " км.");
    }
}



