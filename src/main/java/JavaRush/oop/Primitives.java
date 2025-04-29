package JavaRush.oop;

public class Primitives {
    public static void main(String[] args)
    {
        Student olga = new Student();
        olga.name = "Olga";
        olga.age = 21;

        Student vera = new Student();
        vera.name = "Veronika";
        vera.age = 15;

        System.out.println("Olga is " + olga.age);
        System.out.println("Vera is " + vera.age);
        System.out.println("Olga is " + olga.name);
        System.out.println("Vera is " + vera.name);

        ageSwap(olga, vera);
        nameSwap(olga,vera);

        System.out.println("Olga is " + olga.age);
        System.out.println("Vera is " + vera.age);
        System.out.println("Olga is " + olga.name);
        System.out.println("Vera is " + vera.name);
    }

    private static void ageSwap(Student a,
                                Student b)
    {
        int c = a.age;
        a.age = b.age;
        b.age = c;
    }
    private static void nameSwap(Student a, Student b){
        String c = a.name;
        a.name = b.name;
        b.name = c;


    }

    static class Student
    {
        String name;
        int age;
    }
}

