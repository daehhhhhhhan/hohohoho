
public class Node <E extends Comparable<E>>{
	private E item;
	private Node next;
	public Node(E newItem, Node<E> p) {//»ý¼ºÀÚ
		item = newItem;
		next = p;
	}
	//get°ú set¸Þ¼Òµåµé
	public E getItem() {return item;}
	public Node getNext() {return next;}
	public void setItem(E newItem) {item= newItem;}
	public void setNext(Node n) {next = n;}

}