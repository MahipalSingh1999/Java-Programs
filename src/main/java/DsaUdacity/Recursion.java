package DsaUdacity;


public class Recursion {
    static int fib(int num){

        if(num == 1)return 0;
        if(num == 2)return 1;

        int temp = fib(num-1)+fib(num-2);
        return temp;

    }
    public static void main(String args[]){
        for(int i=1;i<=10;i++){
            System.out.print(fib(i)+" ");
        }

    }

}
