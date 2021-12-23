public class LinkedList<T> {


    class Node<T> {

        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }


    private Node<T> head = null;
    private int size = 0;

    public void addToFront(T data) {
        
        Node<T> newNode = new Node<T>(data);

        if (size == 0) {
            head = newNode;
            size++;
        } else {
            newNode.next = head;
            head = newNode;
            size++;
        }

    }

    public void addToBack(T data) {

        Node<T> newNode = new Node<T>(data);


        if (size == 0) {
            head = newNode;
            size++;
        } else {
            Node<T> curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
            size++;
        }


    }

    
    public int getSize() {
        return size;
    }
    
   public String toString()
    {
 
        String S = "{ ";
 
        Node<T> X = head;
 
        if (X == null)
            return S + " }";
 
        while (X.next != null) {
            S += String.valueOf(X.data) + " -> ";
            X = X.next;
        }
 
        S += String.valueOf(X.data);
        return S + " }";
    } 


}