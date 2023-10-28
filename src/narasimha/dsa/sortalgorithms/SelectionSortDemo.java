package narasimha.dsa.sortalgorithms;

public class SelectionSortDemo
{
    public static void main(String ... args){

        int[] intArray = new int[]{12, 55, -34, -22, 0, 45, 10};

        //1. Selection sort greater elements to back/end of the array >> Ascending Order

        for(int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex > 0 ; lastUnsortedIndex--){
            int largestIndex = 0;
            for (int i = 1; i <= lastUnsortedIndex ; i++){
                if(intArray[i] > intArray[largestIndex]){
                    largestIndex = i;
                }
            }
            swap(intArray, largestIndex, lastUnsortedIndex);
        }
        System.out.println("1. Selection sort greater elements to back/end of the array: ");
        for(int i=0; i<intArray.length;i++){
            System.out.println(intArray[i]);
        }


        //2. Selection sort greater elements to start/front of the array >> Descending Order

        for(int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex > 0 ; lastUnsortedIndex--){
            int smallestIndex = 0;
            for (int i = 1; i <= lastUnsortedIndex ; i++){
                if(intArray[i] < intArray[smallestIndex]){
                    smallestIndex = i;
                }
            }
            swap(intArray, smallestIndex, lastUnsortedIndex);
        }

        System.out.println("\n2. Selection sort greater elements to start/front of the array: ");
        for(int i=0; i<intArray.length;i++){
            System.out.println(intArray[i]);
        }


        //3. Selection sort lesser elements to start/front of the array >> Ascending Order

        for(int lastUnsortedIndex = 0; lastUnsortedIndex < intArray.length-1 ; lastUnsortedIndex++){
            int smallestIndex = intArray.length-1;

            for (int i = intArray.length-1; i >= lastUnsortedIndex ; i--){
                if(intArray[i] < intArray[smallestIndex]){
                    smallestIndex = i;
                }
            }
            swap(intArray, smallestIndex, lastUnsortedIndex);
        }

        System.out.println("\n3. Selection sort lesser elements to start/front of the array: ");
        for(int i=0; i<intArray.length;i++){
            System.out.println(intArray[i]);
        }

        //4. Selection sort lesser elements to back/end of the array >> Descending Order

        for(int lastUnsortedIndex = 0; lastUnsortedIndex < intArray.length-1 ; lastUnsortedIndex++){
            int largestIndex = intArray.length-1;

            for (int i = intArray.length-1; i >= lastUnsortedIndex ; i--){
                if(intArray[i] > intArray[largestIndex]){
                    largestIndex = i;
                }
            }
            swap(intArray, largestIndex, lastUnsortedIndex);
        }

        System.out.println("\n4. Selection sort lesser elements to back/end of the array: ");
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
