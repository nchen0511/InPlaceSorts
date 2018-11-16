//Nick Chen
public class Runner {

    public static void main(String[] args) {
        double[] arrayDouble = InPlaceSorts.newDoubleArray(25000);
        String[] arrayString = InPlaceSorts.newStringArray(25000,3);
        int[] arrayInt = InPlaceSorts.newIntArray(25000);
        long time;

        //Selection Sort Time
        time = System.currentTimeMillis();
        InPlaceSorts.selectionSort(arrayDouble);
        time = System.currentTimeMillis() - time;
        System.out.println("Selection Sort Took: " + time*.001 + " seconds");

        //Insertion Sort Time
        time = System.currentTimeMillis();
        InPlaceSorts.insertionSort(arrayInt);
        time = System.currentTimeMillis() - time;
        System.out.println("Insertion Sort Took: " + time*.001 + " seconds");

        //Bubble Sort Time
        time = System.currentTimeMillis();
        InPlaceSorts.bubbleSort(arrayString);
        time = System.currentTimeMillis() - time;
        System.out.println("Bubble Sort Took: " + time*.001 + " seconds");
    }
}