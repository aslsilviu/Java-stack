public class EntryPoint {

    public static void main(String args[]) {
        MyStack<String> myStack = new MyStack<>();

        myStack.push("1");
        System.out.println("peek " + myStack.peek());

        System.out.println("emptying stack now...");
        myStack.empty();
        System.out.print("stack contents: ");
        myStack.pr();

        myStack.push("2");
        System.out.println("peek " + myStack.peek());
        myStack.push("3");
        System.out.print("stack contents: ");
        myStack.pr();

//        System.out.println(myStack.search("2"));

        System.out.println("pop " + myStack.pop());
        System.out.println("pop " + myStack.pop());
        System.out.println("peek " + myStack.peek());
        System.out.println("pop " + myStack.pop());

        myStack.push("4");
        System.out.println("peek " + myStack.peek());
        System.out.println("pop " + myStack.pop());
//        System.out.println("peek " + myStack.peek());

        System.out.print("stack contents: ");
        myStack.pr();

    }

}