package Char_counter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String s = "Звезды с неба падают бисером,\n" +
                "Я сижу на окне под звездами\n" +
                "Жду удачу, удача близится,\n" +
                "Нависает удача гроздьями\n" +
                "Жизнь на Марсе, смерть на Юпитере\n" +
                "На луне есть лунные кратеры,\n" +
                "А Гагарина зря обидели\n" +
                "Принесли похоронку матери\n" +
                "\n" +
                "За звезду полжизни\n" +
                "За луну свободу\n" +
                "Я целую небо\n" +
                "А оно льет воду\n" +
                "За звезду полжизни\n" +
                "За луну свободу\n" +
                "Я целую небо\n" +
                "А оно льет воду\n" +
                "\n" +
                "Кто летал, тем бояться нечего\n" +
                "Кто летал, тот с заданием справился\n" +
                "В темном небе кометы светятся\n" +
                "Космонавтам такое нравиться\n" +
                "Я сижу на окне под звездами\n" +
                "Жду удачу, считаю сдачу\n" +
                "Для того небеса и созданы\n" +
                "Оттого я теперь и плачу\n" +
                "\n" +
                "За звезду полжизни\n" +
                "За луну свободу\n" +
                "Я целую небо\n" +
                "А оно льет воду\n" +
                "За звезду полжизни\n" +
                "За луну свободу\n" +
                "Я целую небо\n" +
                "А оно льет воду\n" +
                "\n" +
                "За звезду полжизни,\n" +
                "За звезду полжизни\n" +
                "\n" +
                "За звезду полжизни\n" +
                "За луну свободу\n" +
                "Я целую небо\n" +
                "А оно льет воду\n" +
                "За звезду полжизни\n" +
                "За луну свободу\n" +
                "Я целую небо\n" +
                "А оно льет воду\n" +
                "\n" +
                "За звезду полжизни...";

        char[] alphabet = new char[]{'а', 'б', 'в', 'г', 'д', 'е', 'ж', 'з', 'и', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'э', 'ю', 'я'};
        int[] alpcount = new int[alphabet.length];

        for (int i = 0; i < alphabet.length; i++) {
            char x = alphabet[i];
            for (int j = 0; j < s.length(); j++) {
                if (x == s.charAt(j)) {
                        alpcount[i]++;
                }
            }
            System.out.print(x + "...");
            System.out.println(alpcount[i]);
        }

        System.out.println(Arrays.toString(alpcount));
    }
}
