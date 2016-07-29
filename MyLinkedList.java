/**
 * Created by slandrei on 25-Jul-16.
 */
public class MyLinkedList<T> {
    Node head;
    Node last;
    int elementsNo;

    //    public void add(T data) {
//        if (head == null) {
//            head = new Node(data);
//        } else {
//            Node currentElement = head;
//            while (currentElement.getNext() != null) {
//                currentElement = currentElement.getNext();
//            }
//            currentElement.setNext(new Node(data));
//        }
//        elementsNo++;
//    }
    public void add(T data) {
        if (head == null) {
            head = new Node(data);
            last = head;
            elementsNo++;
        } else {
            last.setNext(new Node(data));
            last = last.getNext();
            elementsNo++;
        }
    }

    //    public Boolean isEmpty() {
//        if (elementsNo == 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }
    public Boolean isEmpty() {
        if (head != null) {
            return false;
        } else {
            return true;
        }
    }

    public int size() {
        return elementsNo;
    }

    public T get(int index) {
        if (!isEmpty()) {
            Node currentElement = head;
            Node previousElement = null;
            int i;
            for (i = 0; i <= index; i++) {
                while (currentElement != null) {
                    previousElement = currentElement;
                    currentElement = currentElement.getNext();
                }

            }
            if (i > 0) {
                return (T) previousElement.getData();
            } else {
                return (T) head.getData();
            }
        }
        return null;
    }

    public Boolean remove(int index) {
        if (isEmpty()) return true;
        Node currentElement = head;
        Node previousElement = null;
        for (int i = 0; i <= index && currentElement != null; i++) {

            previousElement = currentElement;
            currentElement = currentElement.getNext();
        }
        if (currentElement != null) {
            previousElement.setNext(currentElement.getNext());
        } else {
            previousElement.setNext(null);
        }


        elementsNo--;
        return true;
    }

    public void empty() {
        head = null;
        elementsNo = 0;
    }

    public String toString() {
        String output = "";
        Node currentElement = head;

        while (currentElement != null) {
            output += currentElement.getData() + " ";
            currentElement = currentElement.getNext();
        }
        return output;
    }

}