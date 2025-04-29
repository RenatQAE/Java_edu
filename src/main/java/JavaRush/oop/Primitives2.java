package JavaRush.oop;

public class Primitives2 {
    public static void main(String[] args) {
        String someText = " I Love to eat something";
        print4times(someText);

    }
    public static void print4times(String a){
        for (int i = 1; i < 4; i++) {
        System.out.println(a);
        }
    }
}
