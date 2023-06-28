package StackWithArray;
class Stack {
    private int[] arr;
    private int top;
    private final int size;
    public Stack(){
        top = -1;
        size = 100;
        arr = new int[size];
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public void push(int element){
        if(top>=size){
            System.out.print("Stack is Full");
        }
        else{
            top++;
            arr[top]=element;
        }
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        else{
            top--;
        }
    }
    public int getTop(){
        return arr[top];
    }
    public void print(){
        System.out.print("[ ");
        for(int i=top;i>=0;i--){
            System.out.print(arr[i]+" ");
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
        s.push(4); // 4 3 2 1
        s.pop(); // 3 2 1
        s.print(); // 3 2 1
        System.out.println("Top : " + s.getTop()); // 3
    }
}