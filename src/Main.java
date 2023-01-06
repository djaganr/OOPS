public class Main {
    public static void main(String[] args){
        Address address1 = new Address("stree1", "road1");
        Student student1 = new Student(25, address1);
        student1.describe();

    }
}
