//Polymorphism

class Student{
    String name;
    int age;


    //method
    //function overloading --- same functions with different arguments
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name, int age){
        System.out.println(name + " " + age);
    }



}




class FunctionOverloading {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "rohit";
        s1.age = 24;

        s1.printInfo(s1.name, s1.age);
    }
    
}
