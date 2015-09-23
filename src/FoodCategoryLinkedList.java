import java.util.EmptyStackException;


public class FoodCategoryLinkedList<T> {

	private FoodCategoryNode<T> head;
	private FoodCategoryNode<T> tail;
	
	public FoodCategoryLinkedList() {
		head = null;
	}
	public void enqueue(T data) {
		FoodCategoryNode <T>FoodCategoryNode = new FoodCategoryNode<T>(data);
		if(head==null) {
			this.head = FoodCategoryNode;
		} else {
			this.tail.setPtr(FoodCategoryNode);
		}
		tail = FoodCategoryNode;		
	}
	public T dequeue() throws EmptyStackException {
		T element = null;
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		element = (T) this.head.getData();
		this.head = this.head.getPtr();
		return element;
	}
	private boolean isEmpty() {
		return this.head == null;
	}
	public String toString() {
		String list = "";
		FoodCategoryNode<T> current = this.head;
		while(current!=null) {
			list += current.getData() + ",";
			current = current.getPtr();
		}
		return list;
	}
}
