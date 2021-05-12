package sort;

public class selection {

    public static void selectionSort (int []arr){
        if(arr==null){
            return;
        }
        for (int i=0;i<arr.length-1;i++){
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                minIndex=arr[j]<arr[minIndex]? j: minIndex;

            }
            swap(arr,i,minIndex);


        }


    }

    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
}
