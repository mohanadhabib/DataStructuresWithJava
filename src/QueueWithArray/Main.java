package QueueWithArray;
class Queue {
    private int head,tail,count,size;
    private int[]arr;
    public Queue(){
        size = 5;
        head = 0;
        tail = size-1;
        count = 0;
        arr = new int[size];
    }
    public boolean isEmpty(){
        return count==0;
    }
    public boolean isFull(){
        return count==size;
    }
    public void enqueue(int element){
        if(isFull()){
            System.out.println("Queue is full");
        }
        else {
            tail = (tail+1)%size;
            arr[tail]=element;
            count++;
        }
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }
        else{
            head = (head+1)%size;
            count--;
        }
    }
    public int getHead(){
        if(isEmpty()){
            return -1;
        }
        else{
            return arr[head];
        }
    }
    public int getTail(){
        if(isEmpty()){
            return -1;
        }
        else{
            return arr[tail];
        }
    }
    public int getSize(){
        return count;
    }
    public void print(){
        if(isEmpty()){
            System.out.println("[ ]");
        }else{
            System.out.print("[ ");
            for(int i = head ; i !=  tail; i = (i+1)%size){
                System.out.print(arr[i]+" ");
            }
            System.out.println(arr[tail]+" ]");
        }
    }
}
public class Main {
    public static void main(String [] args){
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30); // 10 20 30
        q.dequeue(); // 20 30
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60); // 20 30 40 50 60
        q.dequeue(); // 30 40 50 60
        q.print();   // 30 40 50 60
        System.out.println("Actual size : " +q.getSize()); // 4
        System.out.println("Head : " +q.getHead()); // 30
        System.out.println("Tail : " +q.getTail()); // 60
    }
}
