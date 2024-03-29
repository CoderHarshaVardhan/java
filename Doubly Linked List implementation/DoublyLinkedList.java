package sphn.ds;

public class DoublyLinkedList {
    private Node head;
    private Node tail;

    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
    }

    public void traverseForward(){
        Node current = head;
        while(current!=null){
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void traverseBackward(){
        Node current = tail;
        while(current!=null){
            System.out.println(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    public void insertAtBegining(int data){
        Node temp = new Node(data);
        if(head==null){
            head = temp;
            tail = temp;
        }else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
    }

    public void insertAtPOsition(int data, int position){
        Node temp = new Node(data);
        if(position==1){
            insertAtBegining(data);
        }else{
            Node current = head;
            int currPosition = 1;
            while(current!=null && currPosition<position){
                current = current.next;
                currPosition++;
            }
            if(current==null){
                insertAtEnd(data);
            }else{
                temp.next = current;
                temp.prev = current.prev;
                current.prev.next = temp;
                current.prev = temp;
            }
        }
    }

    public void insertAtEnd(int data){
        Node temp = new Node(data);
        if(tail==null){
            head= temp;
            tail = temp;
        }else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
    }

    public void deleteAtBegining(){
        if(head==null){
            return;
        }
        if(head==tail){
            head = null;
            tail = null;
            return;
        }

        Node temp = head;
        head = head.next;
        head.prev= null;
        temp.next = null;

    }

    public void delete(int pos){
        if(head==null){
            return;
        }
        if(pos==1){
            deleteAtBegining();
            return;
        }

        Node current = head;
        int count = 1;
        while(current!=null && count!=pos){
            current = current.next;
            count++;
        }

        if(current==null){
            System.out.println("Position wrong...");
            return;
        }

        current.prev.next = current.next;
        current.next.prev = current.prev;
        current.prev = null;
        current.next = null;
    }

    public void deleteAtEnd(){
        if(tail==null){
            return;
        }

        if(head==tail){
            head = null;
            tail = null;
            return;
        }

        Node temp = tail;
        tail = tail.prev;
        tail.next = null;
        temp.prev = null;
    }
}
