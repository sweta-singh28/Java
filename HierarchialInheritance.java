class Shape {
    public void area(){
        System.out.println("displays area");
    }
}

class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

class Circle extends Shape{
    public void area(int r){
        System.out.println(3.14*r);
    }
}




public class HierarchialInheritance {
    public static void main(){

    }
    
}
