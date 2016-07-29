import java.util.*;

public class MyStack<T> {
    //    List<T> myList = new LinkedList<>();
    MyLinkedList<T> myList = new MyLinkedList<>();

    void push(T toPush) {
        myList.add(toPush);
    }

    T pop() {
        if (myList.isEmpty()) throw new EmptyStackException();
        int sz = myList.size();
        T stackTop = myList.get(sz - 1);
        myList.remove(sz - 1);
        return stackTop;
    }

    T peek() {
        if (myList.isEmpty()) throw new EmptyStackException();
        int sz = myList.size();
        System.out.println("peek sz= " + sz);
        return myList.get(sz - 1);

    }

    void empty() {
        myList.empty();
    }

//    boolean search(T searchMe){
//        Iterator myIterator = myList.iterator();
//        while (myIterator.hasNext()){
//            if (searchMe == myIterator.next()) return true;
//        }
//        return false;
//    }

    public void pr() {
        System.out.println(myList.toString());
    }


}