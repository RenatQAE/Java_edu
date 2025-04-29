package JavaRush;

import java.util.Scanner;

public class les4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        if (a>b && a>c && a> d){
            System.out.println("max: "+a);
        }
        else if (b > a && b>c && b>d){
            System.out.println("max: "+b);
        }
        else if (c > d && c>a && c>b){
            System.out.println("max: "+c);
        }
        else {
            System.out.println("max: "+d);
        }

        if (a<b && a<c && a< d){
            System.out.println("min: "+a);
        }
        else if (b < a && b<c && b<d){
            System.out.println("min: "+b);
        }
        else if (c < d && c<a && c<b){
            System.out.println("min: "+c);
        }
        else {
            System.out.println("min: "+d);
        }
    }
}
