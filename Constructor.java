class Student{
    String name;
    int age;

    //method
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    
    //Non parameterized Constructor
    Student(){
        System.out.println("constructor called");
    }

    //parameterized constructor
   // Student(String name, int age){
    //    this.name = name;
    //    this.age = age;
   // }

    //copy constructor
    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }
    
    //empty constructor
    //Student(){

   // }


}



class Constructor {
    public static void main(String[] args) {
        //create object
        Student s1 = new Student();
        s1.name = "sweta";
        s1.age = 20;

        Student s2 = new Student(s1);
        s2.printInfo();

        
    }
    

    
}
