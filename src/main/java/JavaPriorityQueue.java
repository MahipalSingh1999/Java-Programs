import java.util.*;
public class JavaPriorityQueue {
    public static void main(String args[]){
         class comparator implements Comparator<Integer>{
            public int compare(Integer a,Integer b){
                return b-a;
            }

        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(new comparator());
        int  arr[]= {5,7,3,4,9,2};
        for(int x:arr)pq.add(x);
        Iterator it = pq.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        System.out.println(pq.poll());
        System.out.println(pq.peek());
        //System.out.println(pq.poll());
    }
}
