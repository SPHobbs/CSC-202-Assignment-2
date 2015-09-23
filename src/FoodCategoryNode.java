
public class FoodCategoryNode {
	private T data;
	private Node<T> ptr;

	public Node(T data) {
		this.data = data;
		this.ptr = null;
	}

	public Node(T data, Node<T> ptr) {
		this.data = data;
		this.ptr = ptr;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getPtr() {
		return ptr;
	}

	public void setPtr(Node<T> ptr) {
		this.ptr = ptr;
	}
}
