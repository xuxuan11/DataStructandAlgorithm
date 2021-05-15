package sort;public class BubbleSort {
    public static void main(String[] args) {
        int[] arrs = {3,4,5,123,45,13,435,765,12,1,2,3,345,56,78,9,3};
        int[] bubblesort = bubbleSort(arrs);
        for (int arr : bubblesort) {
            System.out.println(arr);
        }


    }


    public static int[] bubbleSort(int []arr){
        if(arr==null ||arr.length<2){
            return arr;
        }
        for(int e=arr.length-1;e>0;e--){
            for(int i=0;i<e;i++){
                if(arr[i]>arr[i+1]){
                    swap(arr,i,i+1);

                }
            }
        }
        return arr;
    }



    public static void swap(int []arr,int i,int j){
        arr[i]=arr[i]^arr[j];
        arr[j]=arr[i]^arr[j];
        arr[i]=arr[i]^arr[j];
    }

}
