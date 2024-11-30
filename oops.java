//create class Pen
class Pen {
    String color;
    String type;  //ballpoint, gel

    //method - to write
    public void write(){
        System.out.println("Writing something");

    }
    //method - to print color
    public void printColor(){
        System.out.println(this.color);
    }

}

public class oops {
    public static void main(String[] args) {
        //Create object (pen1)
        Pen pen1 = new Pen();

        pen1.color = "red";
        pen1.type = "gel";

        //call the method
        pen1.write();

        //create another object (pen2)
        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";

        pen1.printColor();
        pen2.printColor();

    }
    
}
