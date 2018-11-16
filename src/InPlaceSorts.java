//Nick Chen
public class InPlaceSorts {
    /**
     * Creates an int array with length length filled with int from 0~10000
     * @param length
     * @return
     */
    public static int[] newIntArray(int length){
        int[] array = new int[length];
        for(int i=0;i<array.length;i++){
            array[i] = (int)(Math.random()*10001);
        }
        return array;
    }

    /**
     * Creates a double array with length length filled with double from 0~10000
     * @param length
     * @return
     */
    public static double[] newDoubleArray(int length){
        double[] array = new double[length];
        for(int i=0;i<array.length;i++){
            array[i] = Math.random()*10001;
        }
        return array;
    }

    /**
     * Creates a string array with length length filled with words that is letters characters long
     * @param length
     * @return
     */
    public static String[] newStringArray(int length, int letters){
        String[] array = new String[length];
        for(int i=0;i<array.length;i++){
            array[i] = "";
            for(int j=0;j<letters;j++) {
                array[i] += Character.toString((char) ((Math.random() * 26) + 65));
            }
        }
        return array;
    }

    /**
     * Swaps the value in pos1 and pos2 of int array arr
     * @param arr
     * @param pos1
     * @param pos2
     */
    public static void intSwap(int[] arr, int pos1, int pos2){
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

    public static void doubleSwap(double[] arr, int pos1, int pos2){
        double temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

    public static void stringSwap(String[] arr, int pos1, int pos2){
        String temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

    /**
     * Selection Sort
     * @param arr
     */
    public static void selectionSort(double[] arr) {
        int index = 0;
        boolean swap = true;
        int temp;
        while(swap){
            swap = false;
            temp = index;
            for(int i=index+1;i<arr.length;i++){
                if(arr[temp]>arr[i]){
                    swap = true;
                    temp = i;
                }
            }
            if(swap) {
                doubleSwap(arr, temp, index);
            }
            index++;
        }
    }

    /**
     * Selection Sort (slower)
     * @param arr
     */
    public static void selectionSort2(double[] arr) {
        int temp;
        for(int i=0;i<arr.length;i++){
            temp = i;
            for(int j=i+1;j<arr.length;j++) {
                if (arr[temp] > arr[j]) {
                    temp = j;
                }
            }
            doubleSwap(arr, temp, i);
        }
    }

    /**
     * Bubble Sort
     * @param arr
     */
    public static void bubbleSort(String [] arr){
        int end = arr.length;
        int temp = 0;
        boolean swap = true;
        while(swap){
            swap = false;
            for(int i=0;i<end-1;i++){
                if(arr[i].compareTo(arr[i+1])>0){
                    swap = true;
                    stringSwap(arr,i,i+1);
                    temp = i+1;
                }
            }
            if(swap) {
                end = temp;
            }
        }
    }

}
