
public class Sort {

    private int[] theArray = new int[50];
    private int arraySize = 10;

    public void generateRadomArray(){

        for(int i = 0; i< arraySize; i++){

            theArray[i] = (int)(Math.random()*10) +10;

        }
    }

   public void printArray(){
       System.out.println("-------------");
       for(int i = 0; i< arraySize; i++){
           System.out.print("| " + i + " | ");
           System.out.println(theArray[i] +  " |");

           System.out.println("----------");
       }
   }

   public void bubbleSort(){
       for(int i = arraySize-1; i>0; i--){
           for(int j = 0; j<i; j++){
               if(theArray[j] > theArray[j+1] ){
                   swapValue(j, j+1);
                   printHorizonArray();
               }
           }
       }
   }

    private void printHorizonArray() {
       for(int n = 0; n < arraySize; n++) System.out.print("-");
        System.out.println();
        for(int n = 0; n < arraySize; n++){
            System.out.print("| " + n + " ");
        }
        System.out.println(" |");
        for(int n = 0; n < 51; n++) { System.out.print("-");}
        System.out.println();
        for (int n = 0; n < arraySize; n++){
            System.out.print("| " + theArray[n]+ " " );
        }
        System.out.println(" |");

        for (int n = 0; n < 51; n++){
            System.out.print("-");
        }
        System.out.println();
    }

    private void swapValue(int indexOne, int indexTwo) {
      int tmp = theArray[indexOne];
      theArray[indexOne] = theArray[indexTwo];
      theArray[indexTwo] = tmp;
    }


    public static void main(String[] args){
       Sort newSort = new Sort();
       newSort.generateRadomArray();
      // newSort.printArray();
        newSort.bubbleSort();
    }


}
