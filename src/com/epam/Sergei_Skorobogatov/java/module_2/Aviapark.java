package com.epam.Sergei_Skorobogatov.java.module_2;


import UncheckedExceptions.FirstException;
import UncheckedExceptions.MyException;
import UncheckedExceptions.SecondException;

import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Scanner;


public class Aviapark implements Serializable {
    Fleet[] fleet;

    public Aviapark(Fleet[] fleet) {
        this.fleet = fleet;
    }

    public void sumOfCapacity() {
        int sum = 0;
        for (int i = 0; i < fleet.length; i++) {
            try {
                if (fleet[i].capacity < 0) throw new MyException("Грузоподъемность не может быть отрицательной!");
            } catch (MyException e) {                                                                                   // созданный мной класс MyException для отрицательных значений capacity
                e.printStackTrace();
            }
            sum += fleet[i].capacity;
        }
        System.out.println("Общая грузоподъемность составляет: " + sum + " кг.");
    }

    public void sumOfSeats() throws FirstException, SecondException {           // multicatch
        int sum = 0;
        for (int i = 0; i < fleet.length; i++) {
            sum += fleet[i].seats;
            System.out.println("Общее количество мест составляет: " + sum + " чел.");
        }
        if (sum < 0) {throw new FirstException();}
        if (sum == 0) {throw new SecondException();}
    }


    public void sortDistance() {
        Arrays.sort(fleet);
        for (int i = 0; i < fleet.length; i++) {
            try {
                if (fleet[i].distance < 0 ) throw new IOException("Дальность полета не может быть отрицательной!!");
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(fleet[i].mark + " с максимальной дальностью полета " + fleet[i].distance);
        }
    }


    public void searchByDistance() {
        int num1 = getInt();
        int num2 = getInt();
        boolean Cap = false;

        for (int i = 0; i < fleet.length; i++) {
            try {
                if (num1 < 0 | num2 < 0){ throw new IOException("Значение не может быть отрицательным!"); // catch для отрицательных значений
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                System.out.println("Пожалуйста, используйте только положительные значения");
                System.out.println();
            }
            if (num1 <= fleet[i].distance && num2 >= fleet[i].distance) {
                System.out.println(fleet[i].mark + " с дальностью полета " + fleet[i].distance + " км");
                Cap = true;
            }
        }
        if (Cap == false) {
            System.out.println("Нет подходящих вариантов");
        }
    }


    public int getInt() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите дистанцию полета:");
        int num;
        if (scan.hasNextInt()) {
            num = scan.nextInt();
        } else {
            System.out.println("Ошибка при вводе числа. Повторите попытку");
            scan.next();
            num = getInt();
        }
        return num;
    }
}

