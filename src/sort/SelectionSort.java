package sort;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arrs = {3, 4, 5, 123, 45, 13, 435, 765, 12, 1, 2, 3, 345, 56, 78, 9, 3};
        selectsort(arrs);
    }


    public static void selectsort(int[] arrs){
        if (arrs ==null || arrs.length<2){
            return;
        }
        for (int i = 0; i < arrs.length - 1; i++) {
            int minIndex =i;
            for (int j= i+1;j<arrs.length;j++){
                minIndex = arrs[j]<arrs[minIndex] ? j : minIndex;
            }
            swap(arrs, i, minIndex);
        }
        for (int arr : arrs) {
            System.out.println(arr);
        }

    }


        public static void swap ( int arr[], int i, int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }



}