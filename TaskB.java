import java.util.Scanner;


public class TaskB {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Количество людей:");

        int quart = 4;

        int staffAmount = sc.nextInt();

        sc.nextLine();

        String[]names = new String[staffAmount];

        System.out.println("Фамилии: ");

        for (int i = 0; i < staffAmount; i++) {

            names[i] = sc.nextLine();

        }

        printQPayment(names, getPayd(staffAmount, names, quart), staffAmount);

    }


    private static int[][] getPayd(int n, String[]names, int quart){

        Scanner sc = new Scanner(System.in);

        int[][]payment = new int[n][quart];

        for (int i = 0; i < n; i++){

            String s = names[i];

            System.out.println("Введите зарплату для " + names[i]);

            String line = sc.nextLine();

            String[] pay = line.trim().split(" ");

            for (int j = 0; j < 4; j++) {

                payment[i][j] = Integer.parseInt(pay[j]);

            }

        }

        return payment;

    }


    private static void printQPayment(String[]names, int[][]payment, int staffAmount){

        int sum = 0;

        System.out.println("------------------------------------------------------------");

        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s \n", "Фамилия", "Квартал1", "Квартал2"

                , "Квартал3", "Квартал4", "Итого");

        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < payment.length; i++) {

            System.out.printf("%-8s:",names[i]);

            int sumByName = 0;

            for (int j = 0; j < payment[i].length; j++) {

                System.out.printf("%-10d", payment[i][j]);

                sumByName += payment[i][j];

            }

            sum += sumByName;

            System.out.printf("%-10d", sumByName);

            if (i < payment.length){

                System.out.println();

            }

        }

        System.out.println("------------------------------------------------------------");

        System.out.printf("%-10s%-10d","Итого",sum);

        System.out.println();

        System.out.printf("%-10s%-10.4f","Средняя",(double) sum/12);


    }

}

