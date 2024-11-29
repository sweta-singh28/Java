class Functions {

    public static void printJava(){
        System.out.println("Hello Java");

    }

    public static void printName(String name){
        System.out.println(name);
    }

    public static void printSum(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        //Methods
        //call printJava function
        printJava();
        //call the PrintName function
        printName("Sweta");
        //call the printSum function
        printSum(5, 4);

    }
    
}
