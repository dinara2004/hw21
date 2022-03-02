package com.company;

import java.util.Locale;
import java.util.Scanner;

import static com.company.Days.DUISHOMBU;

public class Main {

    public static void main(String[] args) {
        Days days = null;
    System.out.println("Day: ");
    Scanner input = new Scanner(System.in);
    String nameOfDay = input.nextLine();
        try {
            days = Days.valueOf(String.valueOf(nameOfDay.toUpperCase(Locale.ROOT)));
        } catch (IllegalArgumentException e) {
            System.err.println("НЕКОРРЕКТНАЯ ДАТА!");
        }
       if (days != null){
        switch (days) {
            case DUISHOMBU:
                System.out.println("Биринчи куну теория болот");
                break;
            case SHEISHEMBI:
                System.out.println("Экинчи куну практика + софт скиллс болот");
                break;
            case SHARSHEMBI:
                System.out.println("Учунчу куну теория болот.");
                break;
            case BEISHEMBI:
                System.out.println("Тортунчу куну практика + английский болот.");
                break;
            case JUMA:
                System.out.println("Бешинчи куну ивент + теория болот.");
                break;
            case ISHEMBI:
                System.out.println("Алтынчы куну Чынгыз агайдын сешны болот.");
                break;
            case JEKSHEMBI:
                System.out.println("Жетинчи куну эс алуу.");
                break;
        }
           System.out.println(days);
        }
    }
}
