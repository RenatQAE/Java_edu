package JavaRush.oop;

public class Primitives4 {
    public static void main(String[] args) {
     int first = 77;
     int second = 60;
     int third = 9;
        int max = max(first, second,third);
        int min = min(first, second,third);
        System.out.println("max value: "+max);
        System.out.println("min value: "+min);

    }
    public static int max(int a, int b,int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
    public static int min(int a, int b,int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }
}
