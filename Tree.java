import java.util.Random;

public class Tree {

    //build 4th row tree
    // 1st Row indent 7 spaces 0
    // 2nd Row indent 3 spaces 7
    // 3rd Row indent 1 spaces 3
    // 4th  Row indent 0 spaces 1

    //then we calculate the pattern in indent
    //Indent: -0.5^n * (-16 + 2^n)

    //Iterator that starts at 1, go till no more rows

    // First index per row 0, 1,3,7  0.5 *( -2+ 2^n)
    /*
    *   0
    *   1 2
    *   3 4 5 6
    *   7 8 9 10 11 12 13 17
    *
    *
    *   Number of Item per row 1, 2, 4, 8   2^(n-1)
    *   Math.pow(2, iterator -1)
    *
    *
    *   Max Index per row
    *   indexToPrint  + items per row
     */


    public static void main(String[] args){

        printTree(4);
    }


    public static  void printTree(int rows){

        int spaces = 0;
        int iterator = 1; // iterator is the n

        while(iterator <= rows){

            int indent = (int) Math.abs(((Math.pow(-2, -iterator))* (-16 + (Math.pow(2, iterator)))));
            int indexToPrint = (int)(0.5 *( -2+ (Math.pow(2, iterator)))) ;
            int numbersPerRow =  (int)(Math.pow(2, iterator-1));
            int n = 23;

            int maxIndexPerRow  = indexToPrint + numbersPerRow;

            for(int j = 0; j< indent; j++ ){
                System.out.print(" ");
            } // printing all the indent spaces then go to the looping

                for(int l = indexToPrint; l< maxIndexPerRow; l++ ){
                    System.out.print(n);

                    for(int k = 0; k< spaces; k++){
                        System.out.print(" ");

                    }

                }

                spaces = indent;
                iterator++;
                System.out.println();
        }


    }



}
