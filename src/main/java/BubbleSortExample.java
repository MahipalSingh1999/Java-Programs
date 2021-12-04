public class BubbleSortExample {
    public static void main(String args[]){
        int arr[] = {4,3,7,6,8,8,9,4,0,-1,3,3,4,2,6,1,10};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<(arr.length-i-1);j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int x : arr)System.out.print(x+" ");
    }

}
