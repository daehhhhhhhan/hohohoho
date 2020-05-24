package queue5;

import java.util.NoSuchElementException;

public class Listqueue <E> {
	
	private Node<E> front, rear;
	private int size;
	
	public Listqueue() {
		front = rear = null;
		size = 0;
	}
	
	public int size() { return size; }
	public boolean isEmpty() { return size() == 0; }
	
	public void add(E newItem) {
		Node newNode = new Node(newItem, null);
		if(isEmpty()) front = newNode;
		else rear.setNext(newNode);
		rear = newNode;
		size++;
	}
	
	public E remove() {
		if(isEmpty())throw new NoSuchElementException();
		E frontItem = front.getItem();
		front = front.getNext();
		if(isEmpty()) rear = null;
		size--;
		return frontItem;			
	}
	
	public void print() {
		if(isEmpty()) System.out.print("큐가 empty임");
		else
			for(Node p = front; p != null; p = p.getNext())
				System.out.print(p.getItem() + "\t ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		Listqueue<String> q = new Listqueue<String>();
		
		q.add("apple");		q.add("orange");
		q.add("cherry");	q.add("pear");
		q.print();
		
		q.remove(); q.print();
		q.remove(); q.print();
		
		q.add("grape");		q.print();
	}

}