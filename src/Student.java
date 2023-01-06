public class Student {
    int id;
    String name;

    Student(){
        this.id=0;
        this.name="";
    }

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

    void describe(){
        System.out.println("i am student");
    }
}

class Fresher extends Student {
    void belongTo(){
        System.out.println(" he is fresher");
    }
}