class Student{
    String name;
    int age;

    //method
    public void printInformation(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

}


class StudentClass {
    public static void main(String[] args) {
        //create object
        Student s1 = new Student();

        s1.name = "sweta";
        s1.age = 20;
        //calling printInformation
        s1.printInformation();

        //create another object
        Student s2 = new Student();
        s2.name = "ronit";
        s2.age = 1;
        //calling printInformation
        s2.printInformation();

    }
    
    
}


