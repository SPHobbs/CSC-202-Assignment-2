
public class FoodItemNode<T> {
	private T data;
	private FoodItemNode<T> ptr;

	public FoodItemNode(T data) {
		this.data = data;
		this.ptr = null;
	}

	public FoodItemNode(T data, FoodItemNode<T> ptr) {
		this.data = data;
		this.ptr = ptr;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public FoodItemNode<T> getPtr() {
		return ptr;
	}

	public void setPtr(FoodItemNode<T> ptr) {
		this.ptr = ptr;
	}
}
