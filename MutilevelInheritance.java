class Shape{
    //method
    public void area(){
        System.out.println("Displays area");
    }
}

//single level
class Triangle extends  Shape{
    public void area(int l, int h){
        System.out.println(1/2 * l* h);
    }

}

//Multilevel Inheritance
class EquilateralTriangle extends Triangle{
    public void area(int l, int h){
        System.out.println(1/2*l*h);

    }
}


public class MutilevelInheritance {
    public static void main(String[] args){

    }
    
}
