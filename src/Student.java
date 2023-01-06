public class Student {
    int id;
    String name;

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    Student(int id, String name, int age){
        this(id, name); // calls the default constructor above one
        System.out.println(id + " " + name + " "+ age);
    }
}
