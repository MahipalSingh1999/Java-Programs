public class JavaException {
    public static void main(String args[]){
        int arr[]={2,5,0,10};
        int num = 100;

        for(int i=0;i<=arr.length;i++){
            try{
                System.out.println(num/arr[i]);
            }
            catch(ArithmeticException ae){
                System.out.println(ae);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
            finally{
                System.out.println("this block runs every time");
            }

        }


    }
}
