package ru.fourseasons.four_seasons;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите месяц! ");

        int month = scanner.nextInt();
        String seasons;

        if(month == 12 || month == 1 || month == 2)
            seasons ="Зима";
        else if(month == 3 || month == 4 || month == 5)
            seasons ="осень";
        else if(month == 6 || month == 7 || month == 8)
            seasons = "лето";
        else if(month == 9 || month == 10 || month == 11)
            seasons = "осень";
        else
            seasons = "вымышленным месяцем";

        System.out.println("Сейчс "+month+" месяц,"+ " сезон "+seasons);
    }
}
