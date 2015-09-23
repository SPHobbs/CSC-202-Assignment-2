
public class FoodCategoryLinkedList {

	private Node<T> head;
	private Node<T> tail;
	
	public LL() {
		head = null;
	}
	
	
	//insert for queue (FIFO)
	public void enqueue(T data) {
		//1. create new node
		Node <T>node = new Node<T>(data);
		//2. move LL head
		if(head==null) {
			this.head = node;
		} else {
			this.tail.setPtr(node);
		}
		//3. move tail to new tail
		tail = node;		
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


	//insert for stack (LIFO)
//	public void push(T data) {
//		//1. create new node
//		Node node = new Node(data);
//		//1.1 set the pointer to head 
//		if (head!=null) {
//			node.setPtr(head);
//		}
//		//2. move LL head
//		this.head = node;
//	}
	
	public String toString() {
		String list = "";
		Node<T> current = this.head;
		while(current!=null) {
			list += current.getData() + ",";
			current = current.getPtr();
		}
		return list;
	}
}
