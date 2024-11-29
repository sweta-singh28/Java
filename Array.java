class Array {
    public static void main(String[] args) {
        //array
        int phy = 98;
        int chem = 97;
        int maths = 99;

        int[] marks = new int[4];
        marks[0] = 98;
        marks[1] = 97;
        marks[2] = 99;

        //length
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        //if the value is not an assigned variable-- then bydefault it will be 0
        System.out.println(marks[3]);


    }
    
}
