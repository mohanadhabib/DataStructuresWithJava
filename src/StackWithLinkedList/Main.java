package StackWithLinkedList;
class Node {
    public int value;
    public Node next;
}
class Stack{
    private Node top;
    public Stack(){
        top = null;
    }
    public boolean isEmpty(){
        return top == null;
    }
    public void push(int element){
        Node newNode = new Node();
        newNode.value = element;
        newNode.next = top;
        top = newNode;
    }
    public void pop(){
        if(isEmpty()){
            System.out.print("Stack is Empty");
        }
        else{
            top = top.next;
        }
    }
    public int getTop(){
        return top.value;
    }
    public void print(){
        Node temp = top;
        System.out.print("[ ");
        while (temp != null){
            System.out.print(temp.value+ " ");
            temp = temp.next;
        }
        System.out.println("]");
    }
}
public class Main {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.pop();
        s.pop();
        s.print();
        System.out.println("Top : "+s.getTop());
    }
}
