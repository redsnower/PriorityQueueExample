package com.connect;

public class IpadRepairqueue {

	public static void main(String[] args) {
		PeopleQueue q = new PeopleQueue(4); 
		  
        // print Queue elements 
        q.queueDisplay(); 
  
        // inserting elements in the queue 
        q.peQEnQueue(20); 
        q.peQEnQueue(30); 
        q.peQEnQueue(40); 
        q.peQEnQueue(50); 
  
        // print Queue elements 
        q.queueDisplay(); 
  
        // insert element in the queue 
        q.peQEnQueue(60); 
  
        // print Queue elements 
        q.queueDisplay(); 
  
        q.peQDeQueue(); 
        q.peQDeQueue(); 
        System.out.printf("\n\nafter two node deletion\n\n"); 
  
        // print Queue elements 
        q.queueDisplay(); 
  
       
	}

}
class PeopleQueue{
	
	static int front, rear,cap;
	static int satqueue[];
	
	public PeopleQueue(int capacity) {
		// TODO Auto-generated constructor stub
		
		front = rear =0;
		this.cap = capacity;
		satqueue = new int[cap];
	}
	
	static void peQEnQueue(int arrivaltime) {
		if(rear==cap) {
			System.out.println("Saturday Queue is full");
			return;
		}
		else {
		satqueue[rear]=arrivaltime;
		rear++;
		}
		return;
		
	}
	//delete no printing
	static void peQDeQueue() {
		if(front==rear) {
			System.out.println("Saturday Queue is Empty");
			return;
			
		}
		else {
		for(int i=0;i<rear-1;i++) {
			satqueue[i] = satqueue[i+1];
		}
		if(rear<cap) {
			satqueue[rear]=0;
			
		}
		rear--;
		}
		return;
		
	}
	
	static void queueDisplay() {
		if(front==rear) {
			System.out.println("Saturday Queue is Empty");
			return;
			
		}
		for(int i=front;i<rear;i++) {
			System.out.printf("%d -- ",satqueue[i]);
		}
		return;
	}
	
}