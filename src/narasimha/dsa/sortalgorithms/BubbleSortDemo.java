package narasimha.dsa.sortalgorithms;

public class BubbleSortDemo
{
    public static void main(String ... args){

        int[] intArray = new int[]{12, 55, -34, -22, 0, 45, 10};

        //1. Bubble sort greater elements to back/end of the array >> Ascending Order

        for(int unsortedPartitionIndex = intArray.length-1; unsortedPartitionIndex > 0; unsortedPartitionIndex--){
            for(int i=0; i < unsortedPartitionIndex; i++){
                if(intArray[i] > intArray[i+1]){
                    swap(intArray, i, i+1);
                }
            }
        }
        System.out.println("1. Bubble sort greater elements to back/end of the array: ");
        for(int i=0; i<intArray.length;i++){
            System.out.println(intArray[i]);
        }

        for (int j : intArray) {
            System.out.println(j);
        }


        //2. Bubble sort greater elements to start/front of the array >> Descending Order

        for(int unsortedPartitionIndex = intArray.length-1; unsortedPartitionIndex > 0; unsortedPartitionIndex--){
            for(int i=0; i < unsortedPartitionIndex; i++){
                if(intArray[i] < intArray[i+1]){
                    swap(intArray, i, i+1);
                }
            }
        }
        System.out.println("\n2. Bubble sort greater elements to start/front of the array: ");
        for(int i=0; i<intArray.length;i++){
            System.out.println(intArray[i]);
        }


        //3. Bubble sort lesser elements to start/front of the array >> Ascending Order

        for (int unsortedPartitionIndex = 0; unsortedPartitionIndex < intArray.length - 1; unsortedPartitionIndex++){
            for (int i = intArray.length - 1; i > unsortedPartitionIndex; i--) {
                if (intArray[i] < intArray[i - 1]) {
                    swap(intArray, i, i - 1);
                }
            }
        }
        System.out.println("\n3. Bubble sort lesser elements to start/front of the array: ");
        for(int i=0; i<intArray.length;i++){
            System.out.println(intArray[i]);
        }

        //3. Bubble sort lesser elements to back/end of the array >> Descending Order

        for (int unsortedPartitionIndex = 0; unsortedPartitionIndex < intArray.length - 1; unsortedPartitionIndex++){
            for (int i = intArray.length - 1; i > unsortedPartitionIndex; i--) {
                if (intArray[i] > intArray[i - 1]) {
                    swap(intArray, i, i - 1);
                }
            }
        }
        System.out.println("\n4. Bubble sort lesser elements to back/end of the array: ");
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
