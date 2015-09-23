
public class FoodCategoryNode<T> {
	private T data;
	private FoodCategoryNode<T> ptr;

	public FoodCategoryNode(T data) {
		this.data = data;
		this.ptr = null;
	}

	public FoodCategoryNode(T data, FoodCategoryNode<T> ptr) {
		this.data = data;
		this.ptr = ptr;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public FoodCategoryNode<T> getPtr() {
		return ptr;
	}

	public void setPtr(FoodCategoryNode<T> ptr) {
		this.ptr = ptr;
	}
}
