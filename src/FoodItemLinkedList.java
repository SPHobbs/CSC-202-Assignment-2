
public class FoodItemLinkedList<T> {
	
	private FoodItemNode<T> head;
	private FoodItemNode<T> tail;
	
	public FoodItemLinkedList() {
		head = null;
	}	
	public void enqueue(T data) {
		FoodItemNode <T>FoodItemNode = new FoodItemNode<T>(data);
		if(head==null) {
			this.head = FoodItemNode;
		} else {
			this.tail.setPtr(FoodItemNode);
		}
		tail = FoodItemNode;		
	}
	public T dequeue() throws EmptyListException {
		T element = null;
		if(isEmpty()) {
			throw new EmptyListException("Cannot dequeue from an empty list!");
		}
		element = (T) this.head.getData();
		this.head = this.head.getPtr();
		return element;
	}
	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return this.head == null;
	}
	public String toString() {
		String list = "";
		FoodItemNode<T> current = this.head;
		while(current!=null) {
			list += current.getData() + ",";
			current = current.getPtr();
		}
		return list;
	}
}
