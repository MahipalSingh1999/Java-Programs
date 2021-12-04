package DsaUdacity;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class LinkedList{

    //insert
    Node insert(Node head,int data){
        Node newNode = new Node(data);
        if(head == null)return newNode;
        Node temp = head;
        while(temp.next != null)temp = temp.next;
        temp.next = newNode;
        return head;
    }

    //delete
    Node delete(Node head,int data){
        Node current = head;
        Node prev = head;
        while(current != null){
            if(current.data == data){
                if(current == head){
                    return current.next;
                }
                else{
                    prev.next = current.next;
                    current.next = null;
                    return head;
                }
            }
            else{
                prev = current;
                current = current.next;
            }
        }
        return head;
    }


    //get position
    int getPosition(Node head,int data){
        int count = 1;
        while(head != null){
            if(head.data == data){
                return count;
            }
            else{
                head = head.next;
                count++;
            }
        }
        return -1;
    }

    //traverse
    void traverse(Node head){
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }

    //push
      //same as insert
    //pop
    int pop(Node head){
        if(head == null)return -1;
        Node current = head;
        Node prev = head;

        while(current.next != null){
            prev = current;
            current = current.next;
        }
        int ans=-1;
        if(prev == current){
            ans =  head.data;
            head = null;
        }
        else{
            ans = current.data;
            prev.next = null;
        }
        return ans;
    }
    //insert_first
    Node insertFirst(Node head,int data){
        Node newHead = new Node(data);
        newHead.next = head;
        return newHead;
    }
    //delete_first

    Node deleteFirst(Node head){
        if(head == null)return head;
        Node temp = head;
        head = head.next;
        temp.next = null;


        return head;
    }






}
public class LinkedListProblem {
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        Node head = ll.insert(null,1);
         ll.insert(head,5);
        ll.insert(head,7);
        ll.traverse(head);
        ll.delete(head,5);
        ll.traverse(head);
        System.out.println(ll.getPosition(head,7));
        ll.insert(head,10);
        ll.insert(head,20);
        System.out.println(ll.pop(head));
        ll.traverse(head);
        head = ll.insertFirst(head,55);
        ll.traverse((head));
        head = ll.deleteFirst(head);
        ll.traverse(head);



    }




}
