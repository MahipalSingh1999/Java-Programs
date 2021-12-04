package DsaUdacity;
class Queue{
    Node head,tail;
    Queue(){
        head = tail = null;
    }


    //enqueue
    void enqueue(int data){
        Node element = new Node(data);
        if(head == null) {
            head = element;
            tail = element;
        }

        else{
            tail.next = element;
            tail = tail.next;

        }


    }


    //dequeue

    int dequeue(){
        int ans = -1;
        if(head == null)ans = -1;
        if(head == tail){
            ans = head.data;
            head = null;
            tail = null;

        }
        else{
            ans = head.data;
            head = head.next;

        }
        return ans;
    }
    //traverse
    void traverse(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();

    }
}

public class QueueProblem {
    public static void main(String args[]){
        Queue q = new Queue();
        for(int i=1;i<=10;i++){
            q.enqueue(i);
        }
        q.traverse();
        for(int i=1;i<=5;i++){
            System.out.println(q.dequeue());
        }
        q.traverse();


    }



}
