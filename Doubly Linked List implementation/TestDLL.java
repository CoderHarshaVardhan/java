package sphn.test;
import java.util.*;
import sphn.ds.DoublyLinkedList;

public class TestDLL {
    public static void main(String[] args){
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertAtBegining(10);
        dll.insertAtBegining(10);
        dll.traverseForward();
        dll.insertAtEnd(100);
        dll.insertAtEnd(200);
        dll.insertAtPOsition(1000, 3);
        dll.traverseForward();
        dll.deleteAtEnd();
        dll.traverseForward();
        dll.delete(3);
        dll.traverseForward();
        dll.traverseBackward();
    }
}
