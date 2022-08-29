package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String line = scanner.nextLine();
        System.out.println("Ваш результат: " + new Reversing().reversingByRule(line));
    }
}