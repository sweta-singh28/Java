interface Animal {
    int eyes = 2;   //static property
    void walk();

}
//multiple inheritance through interface
interface Herbivore{

}

class Horse implements  Animal{
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}



class InterfaceAbstraction {
    public static void main(String[] args){
        Horse horse = new Horse();

    }
    
}
