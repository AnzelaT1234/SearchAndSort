public class BubbleSort {

    public static void sort(int[] array){
        int n = array.length;
        for (int j=0; j<array.length; j++) {
            for (int i = 1; i < n; i++) {
                if (array[i - 1] > array[i]) {
                    swap(array, i, i - 1);
                }
            }
            n--;
        }

    }

    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

}
