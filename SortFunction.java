
import java.util.Arrays;

class SortFunction {
    public static void main(String[] args){

        int phy = 98;
        int chem = 97;
        int maths = 99;

        int[] marks = new int[3];
        marks[0] = 98;
        marks[1] = 97;
        marks[2] = 99;
        //System.out.println(marks.length);
    
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);

    }
}
