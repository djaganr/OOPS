public class Student {
    int age;
    Address address;

    Student(int age, Address address){
        this.age = age;
        this.address = address;
    }

    void describe(){
        System.out.println(this.age + " "+ this.address.road+ " " + this.address.street);
    }
}
