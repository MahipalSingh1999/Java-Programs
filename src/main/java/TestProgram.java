import java.util.*;
public class TestProgram {
    public static void main(String args[]){
        //System.out.println("hello");
        ArrayDeque<Integer> deq = new ArrayDeque<>();

        for(int i=1;i<=10;i++){
            deq.add(i);
        }
        for(int x:deq)System.out.print(x+" ");
        System.out.println();
        deq.offer(15);
        for(int x:deq)System.out.print(x+" ");
        System.out.println();
        deq.offerFirst(17);
        for(int x:deq)System.out.print(x+" ");
        System.out.println();
        deq.remove();
        for(int x:deq)System.out.print(x+" ");
        System.out.println();
        deq.removeLast();
        for(int x:deq)System.out.print(x+" ");
        System.out.println();

    }

}
