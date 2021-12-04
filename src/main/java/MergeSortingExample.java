 class Sort{
    void partition(int[] arr, int low,int high){
        if(low < high){
            int mid = (low+high)/2;
            partition(arr,low,mid);
            partition(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
    void merge(int[] arr,int low,int mid,int high){
        int temp[] = new int[high-low+1];
        int i=low;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=high){
            if(arr[i] < arr[j]){
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
            }

        }
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=high){
            temp[k++] = arr[j++];
        }
        for(int tempIndex=0;tempIndex<temp.length;tempIndex++){
            arr[low++]=temp[tempIndex];
        }
    }


}

public class MergeSortingExample {
    public static void main(String args[]){
        Sort sort = new Sort();
        int arr[] ={4,3,7,6,8,8,9,4,0,-1,3,3,4,2,6,1,10};
        sort.partition(arr,0,arr.length-1);
        for(int x : arr)System.out.print(x+" ");
    }


}
