package DsaUdacity;

class QuickSort{
    void partition(int[] arr,int low,int high){
        if(low<high) {
            int pivot = sort(arr, low, high);
            partition(arr,low,pivot-1);
            partition(arr,pivot+1,high);
        }
    }
    int sort(int[] arr,int low,int high){
            int i=low;
            int j=high-1;
            int pivot = high;
            int flag = 0;
            while(i<j){
                if(flag == 0){
                    if(arr[i]>arr[pivot]){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        j--;
                        flag = 1;
                    }
                    else{
                        i++;
                    }

                }
                else{
                    if(arr[j]<=arr[pivot]){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        i++;
                        flag = 0;
                    }
                    else{
                        j++;
                    }

                }
            }
            if(arr[j]<arr[pivot]){
                j++;

            }
            int temp = arr[j];
            arr[j] = arr[pivot];
            arr[pivot] = temp;
            pivot = j;
            return pivot;
    }
}

public class QuickSortProgram {
    public static void main(String args[]) {
        QuickSort qs = new QuickSort();
        int arr[] = {3, 2, 4, 6, 2, 1, 5, -1, 44, 66, 22, 11, 0, 66};
        qs.partition(arr,0,arr.length-1);
        for(int x : arr)System.out.print(x+ " ");
    }
}
