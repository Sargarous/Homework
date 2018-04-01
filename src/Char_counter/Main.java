package Char_counter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text: ");
        String s = scanner.nextLine().toLowerCase();

        Map<Character, Integer> cnt = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if (!cnt.containsKey(c)){
                cnt.put(c, 1);
            } else {
                int oldCnt = cnt.get(c);
                cnt.put(c, oldCnt + 1);
            }
        }
        System.out.println("\n" + cnt);
//        char[] alphabet = new char[]{'а', 'б', 'в', 'г', 'д', 'е', 'ж', 'з', 'и', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'э', 'ю', 'я'};
//        int[] alpcount = new int[alphabet.length];
//
//        for (int i = 0; i < alphabet.length; i++) {
//            char x = alphabet[i];
//            for (int j = 0; j < s.length(); j++) {
//                if (x == s.charAt(j)) {
//                    alpcount[i]++;
//                }
//            }
//            System.out.print(x + "...");
//            System.out.println(alpcount[i]);
//        }

        }
    }
