package narasimha.dsa.sortalgorithms;

public class InsertionSortShiftDemo
{
    public static void main(String ... args){

        int[] intArray = new int[]{12, 55, -34, -22, 0, 45, 10};

        //1. Insertion sort greater elements to back/end of the array >> Ascending Order

        for(int firstUnsortedIndex = 1 ; firstUnsortedIndex <= intArray.length-1 ; firstUnsortedIndex++){

            int newElement = intArray[firstUnsortedIndex];

            int i ; //Insertion position

            for(i = firstUnsortedIndex ; i > 0 && intArray[i-1] > newElement ; i--){
                intArray[i] = intArray[i-1];
            }

            intArray[i] = newElement;
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
