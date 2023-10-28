package narasimha.dsa.sortalgorithms;

public class InsertionSortSwapDemo
{
    public static void main(String ... args){

        int[] intArray = new int[]{12, 55, -34, -22, 0, 45, 10};

        //1. Insertion sort greater elements to back/end of the array >> Ascending Order

        for(int unsortedIndex = 1 ; unsortedIndex <= intArray.length-1 ; unsortedIndex++){
           int newElementIndex = unsortedIndex;
            for(int sortedIndex = unsortedIndex - 1 ; sortedIndex >= 0 ; sortedIndex--){
                if( intArray[sortedIndex] <= intArray[newElementIndex]){
                    break;
                }
                else{
                    swap(intArray, sortedIndex,newElementIndex);
                    newElementIndex--;
                }
            }

        }


        System.out.println("1. Insertion sort greater elements to back/end of the array: ");
        for(int i=0; i<intArray.length;i++){
            System.out.println(intArray[i]);
        }

    }

    public static void swap(int intArray[], int i, int j){

        if(intArray[i] == intArray[j]){
            return;
        }

        int temp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = temp;

    }
}
