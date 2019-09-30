package edu.brainacademy.dima93;

import java.util.Scanner;

public class StringTest {

    public static void main(String[] args) {
        String s1 = "Апельсин,Яблоко,Гранат,Груша";
        String s2 = new String("ss");
        char[] data = {'c', 'v', 'f'};
        String s3 = new String(data);
        String s4 = new String(s1.getBytes());
        StringBuilder sb = new StringBuilder(s3);
        String s5 = new String(sb);

        String[] strings = s1.split(",");

        int maxLength = 0;
        String longString = "";

        for (String s : strings) {
            if (maxLength < s.length()) {
                maxLength = s.length();
                longString = s;
            }

        }
        System.out.println(longString.toLowerCase());
        String substr = longString.substring(0,2);
        System.out.println(substr);


        String ya=" Я_новая_строка   ";
        System.out.println(ya.trim().replace("_"," "));

        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();
        System.out.println("Вы ввели "+ scan);
        if(scan.startsWith("Запуск")) System.out.println("Запускаем процесс");
        if (scan.endsWith("завершен")) System.out.println("процесс завершен");
        if (scan.toLowerCase().contains("ошибка")) System.out.println("ghjbpjikf ошибка");

        sb.append(s1)
                .append(s2)
                .append(s4)
                .append("\n!!!!!!!!!!!!!!sdf")
                .append(s5)
                .append(scan);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);




    }
}
