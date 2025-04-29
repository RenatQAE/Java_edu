package JavaRush;

import java.util.Scanner;

public class les3 {
    public static void main(String[] args) {

//        int sum = 0;
//        for (int i = 1; i <= 10d ; i++) {
//            sum += i;
//            System.out.println("сумма чисел: "+i+" равна: "+sum);
//        }

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int year = scanner.nextInt();
        String text = name+" захватит мир через "+year+" лет. Му-ха-ха!";

        for (int i = 1; i <= 10 ; i++) {
            System.out.println(text);

        }
    }
}
