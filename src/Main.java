public class Main {
    public static void main(String[] args) {


        // constructor
        Student student1 = new Student();
        student1.id = 1;
        student1.setName("student1");
        System.out.println(student1.id + student1.getName());

        Student student2 = new Student(2, "student2");
        System.out.println(student2.id + student2.getName());

        Student student3 = new Student(student2);
        student3.id = 3;
        System.out.println(student3.id + student3.getName()+" ");

        student3.display();



        // static variable belongs to class
        // The static variable can be used to refer to the common property of all objects (which is not unique for each object)
        // static variable gets memory only once in the class area at the time o class loading
        Counter count1 = new Counter();
        Counter count2 = new Counter();

        // static method
       /* There are two main restrictions for the static method. They are:
        The static method can not use non static data member or call non-static method directly.
        this and super cannot be used in static context.*/
        Counter.shift();
        Counter count3 = new Counter();


    }
}


