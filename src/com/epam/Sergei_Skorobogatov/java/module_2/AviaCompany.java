package com.epam.Sergei_Skorobogatov.java.module_2;



import com.epam.Sergei_Skorobogatov.java.module_2.Aircrafts.Boeing737;
import com.epam.Sergei_Skorobogatov.java.module_2.Helicopters.Bell205;
import com.epam.Sergei_Skorobogatov.java.module_2.Quadrocopters.Xplorer1;



import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;


public class AviaCompany {
    public static void main(String[] args) {




        Boeing737 boeing737 = new Boeing737(1987, 10000, 150, 2600, "Boeing-737");
        Bell205 bell205 = new Bell205(2000, -2000, 8, 700, "Bell-205");
        Xplorer1 xplorer1 = new Xplorer1(2015, 20, -2, -10, "Xplorer-1");

        Fleet[] fleet = new Fleet[3];
        fleet[0] = boeing737;
        fleet[1] = bell205;
        fleet[2] = xplorer1;

        Aviapark fleet1 = new Aviapark(fleet);

        Scanner scanner = new Scanner(System.in);

        File file = new File("test"); // создание файла для Checked exception
        try {
            Scanner scan = new Scanner(file); // попытка прочитать данные из файла
        } catch (FileNotFoundException e) { // ловим Exception
            e.printStackTrace();

        } finally {
            System.out.println("Файл не был найден!");
            System.out.println();
            System.out.println();
        }



        while (true) {
            try {
                System.out.println("1 - общая информация летательных аппаратов;");
                System.out.println("2 - общая вместимость пассажиров;");
                System.out.println("3 - общая грузоподъемность;");
                System.out.println("4 - сортировка летательных аппаратов по дальности полета;");
                System.out.println("5 - поиск летательного аппарата по заданным параметрам максимальной дальности полета;");
                System.out.println("6 - для выхода из программы.");
                System.out.println("Пожалуйста, выберите номер...");
                int number = scanner.nextInt();
                if (number < 7 && number > 0) {
                    switch (number) {
                        case 1:
                            boeing737.showInfo();
                            bell205.showInfo();
                            xplorer1.showInfo();
                            break;
                        case 2:
                            fleet1.sumOfSeats();
                            break;
                        case 3:
                            fleet1.sumOfCapacity();
                            break;
                        case 4:
                            fleet1.sortDistance();
                            break;
                        case 5:
                            fleet1.searchByDistance();
                            break;
                        case 6:
                            return;
                    }
                    System.out.println();
                    System.out.println();
                } else {
                    System.out.println("Вы ввели неправильный номер, попробуйте снова");
                    System.out.println();
                }
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели не число, перезапустите программу");
                break;
            }
        }
    }
}

