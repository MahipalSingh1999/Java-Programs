class Demo implements Runnable{

    public void run(){
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }

}
public class JavaThreads {
    public static void main(String args[]){
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        Thread t1  = new Thread(d1,"first");
        Thread t2 = new Thread(d2,"second");

        t1.start();
        t2.start();

    }





}
