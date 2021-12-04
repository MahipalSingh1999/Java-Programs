package DsaUdacity;

public class BinarySearchProgram {
    static int binarySearch(int arr[],int num){
        int ans = -1;
        int low=0;
        int high=arr.length-1;
        while(low <= high){
            int mid =(low+high)/2;
            if(num == arr[mid]){
                return mid;
            }
            else if(num > arr[mid]){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int arr[]= {1,3,5,6,8,9,10,22,41,42,43,55,79,100};
        int element = 41;
        System.out.println("index of "+ element + " is : "+binarySearch(arr,element));
    }

}
