//Nick Chen
public class Runner {

    public static void main(String[] args) {
        double[] arrayS = InPlaceSorts.newDoubleArray(25000);
        int[] arrayB = InPlaceSorts.newStringArray(25000);
        int[] arrayI = InPlaceSorts.newIntArray(25000);
        long time;

        //Selection Sort Time
        time = System.currentTimeMillis();
        InPlaceSorts.selectionSort(arrayS);
        time = System.currentTimeMillis() - time;
        System.out.println("Selection Sort Took: " + time*.001 + " seconds");

        //Bubble Sort Time
        time = System.currentTimeMillis();
        InPlaceSorts.bubbleSort(arrayB);
        time = System.currentTimeMillis() - time;
        System.out.println("Bubble Sort Took: " + time*.001 + " seconds");


    }
}

