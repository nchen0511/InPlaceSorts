//Nick Chen
public class Runner {

    public static void main(String[] args) {
        int[] array = InPlaceSorts.newArray(25000);
        int[] copy;
        long time;

        //Selection Sort Time
        copy = array;
        time = System.currentTimeMillis();
        InPlaceSorts.selectionSort(copy);
        time = System.currentTimeMillis() - time;
        System.out.println("Selection Sort Took: " + time*.001 + " seconds");

        //Bubble Sort Time
        copy = array;
        time = System.currentTimeMillis();
        InPlaceSorts.bubbleSort(copy);
        time = System.currentTimeMillis() - time;
        System.out.println("Bubble Sort Took: " + time*.001 + " seconds");


    }
}

