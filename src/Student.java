public class Student {
    int id;
    String name;

    Student(int id, String name){
        // refers to the current class instance
        this.id = id;
        this.name = name;
    }

    Student(int id, String name, int age){
        this(id, name); // calls the class constructor, reusing constructor
        System.out.println(id + " " + name + " "+ age);
    }

    void object(){
        System.out.println(this);
    }
}
