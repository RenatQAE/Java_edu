package JavaRush.oop;

public class Cat {
    String owner;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Cat(String owner) {
        this.owner = owner;
        addNewCat();
        System.out.println(catsCount);
        System.out.println("Общее количество котов "+catsCount(catsCount));
    }

    public String getOwner() {
        return owner;
    }
    private static int catsCount = 0;
    public static void addNewCat(){
        catsCount ++;
    }
    public static int catsCount(int catsCount){
        return catsCount;

    }

}
