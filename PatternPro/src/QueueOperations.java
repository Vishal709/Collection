
public class QueueOperations {
	
	int size, capacity, front, rear;
	String [] array;
	public QueueOperations(int capacity) {
		this.capacity=capacity;
		this.size=0;
		this.front= 0;
		this.rear=capacity-1;
		this.array=new String [this.capacity];
	}
	
	public void enqueue(String data) {
		this.rear=(this.rear+1)%this.capacity;
		this.array[this.rear]=data;
		this.size=this.size+1;
	}
	public void printQue() {
		System.out.println("elements in que are: ");
		for(String str : this.array) {
			System.out.println(str);
		}
	}
	
	public String dequeue() {
		String item =this.array[this.front];
		this.front = (this.front+1)%this.capacity;
		this.size = this.size-1;
		return item;
	}
	public static void main(String[] args) {
		QueueOperations q= new QueueOperations(9);
		q.enqueue("sid");
		q.enqueue("chester");
		q.enqueue("alex");
		q.printQue();
		q.dequeue();
		q.printQue();
		System.out.println(q.array[q.front]);
	}
}
