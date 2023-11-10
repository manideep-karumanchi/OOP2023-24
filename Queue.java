package ds;
public class Queue{
	int que[], front=0, rear=0;
	public Queue(){
		que = new int[10];
	}
	public Queue(int size){
		que = new int[size];
	}
	public void enqueue(int ele){
		que[rear++]=ele;
	}
	public int dequeue(){
		return que[front++];
	}
}