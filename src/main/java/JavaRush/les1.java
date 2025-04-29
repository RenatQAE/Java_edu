package JavaRush;

public class les1 {
    public static void main(String[] args) {
        String s = "Когда я вырасту, то хочу быть паровым экскаватором!";
        printManyTimes(s,4);
        double v = sqr(2.2);
        System.out.println(v);
    }
    public static void printManyTimes(String s, int count){
        for (int i = 1; i < count; i++) {
            System.out.println(s+" по счету: "+i);

        }
     String name1 = "Ivan";
     String name2 = "Ruslan";
     String name3 = "Makar";
    }
    public static double sqr(double a){
        return a*a;
    }
}
