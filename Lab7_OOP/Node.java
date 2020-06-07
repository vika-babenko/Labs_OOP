package Lab7_OOP;

import Lab6_OOP.Flower;


//клас вузла двозвязного списку
public class Node {
    /**
     * змінні
     */
    private Flower flower;
    private Node next;
    private Node previous;

   //constructor для прийому цих значень
    public Node(Flower flower, Node next, Node previous) {
        this.flower = flower;
        this.next = next;
        this.previous = previous;
    }
// setter for next:)
    public void setNext(Node next) {
        this.next = next;
    }

    public Flower getFlower() {
        return flower;
    }

    public Node getNext() {
        return next;
    }
    public Node getPrevious() {
        return previous;
    }


}
