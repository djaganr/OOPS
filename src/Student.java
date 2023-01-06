public class Student {

    /*
    * id, string stores in heap and class instances which are stored in stack will point to them
    * static variable or class variable will store in class area which is neither heap nor stack
    * and this static variable just store there once and all instances point to it, unlike non static variables which
    * are created every time when instance is created*/

    int id;
    private String name;
    static String college = "College";

    Student(){
        this.id = 0;
        this.name = "";
    }

    Student(int id, String name){
        // this refers to class instance
        this.id = id;
        this.name = name;
    }

    Student(Student s){
        this.id = s.id;
        this.name = s.getName();
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    void display(){
        System.out.println(id + " "+ name+ " "+ college);
    }
}
