public class Main {
    public static void main(String[] args){
        Student student1 = new Student(2, "jagan", 40);
        student1.object();

        Fresher fresher1 = new Fresher();
        fresher1.belongTo();
        fresher1.describe();
        System.out.println(fresher1.id+"calling");

    }
}
