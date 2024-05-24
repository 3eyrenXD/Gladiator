package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] monsters = {"wolf", "goblin", "ogr", "bear", "boar", "dark elf", "alien"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Виберіть гладіатора:");
        System.out.println("1. Spartacus");
        System.out.println("2. Crixus");
        System.out.println("3. Gannicus");

        int choice = scanner.nextInt();
        Gladiator gladiator = null;

        switch (choice) {
            case 1:
                gladiator = new Spartacus();
                break;
            case 2:
                gladiator = new Crixus();
                break;
            case 3:
                gladiator = new Gannicus();
                break;
            default:
                System.out.println("Шось не то клацнув");
                return;
        }

        System.out.println("Ти обрав гладіатора:");
        System.out.println(gladiator.getClass().getSimpleName());
        System.out.println("Його характеристики:");
        gladiator.printStats();
    }
}
