public class ThrowAndThrows {
    public static void main(String args[]){
        for(int i=2;i>=-2;i--){
            try{
                calculate(i);
            }
            catch(ArithmeticException e){
                System.out.println("the exception is handled in main method for num "+ i +" : "+e);
            }
        }

    }
    public static void calculate(int i)throws ArithmeticException{
        if(i<0){
            throw new ArithmeticException("i<0");

        }
        else{
            System.out.println(i+" ");
        }

    }

}

