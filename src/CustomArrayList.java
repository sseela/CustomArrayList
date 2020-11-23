import java.util.Arrays;

public class CustomArrayList {
	
	private static int initialSize = 10;
	private Object[] arr = {};
	private int index = -1;
	
	
	public CustomArrayList() {
		arr = new Object[initialSize];
	}
	
	public void add(Object obj) {
		if(index == initialSize) {
			increaseSize();
		} else {
			arr[++index] = obj;
		}
		
	}
	
	public void increaseSize() {
		initialSize = arr.length*2;
		arr = Arrays.copyOf(arr, initialSize);
	}
	
	public int length() {
		return this.index+1;
	}
	
	public Object get(int index) {
		return arr[index];
	}
	
	public void remove(int removeIndex) {
		for(int i=removeIndex; i<index; i++) {
			arr[i] = arr[i+1];
		}
		this.index--;
	}
	
	public void printArray() {
		for(int i=0; i<=index; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		CustomArrayList list = new CustomArrayList();
		list.add(98);
		list.add(67);
		list.add(45);
		list.add(98);
		list.add(67);
		list.add(45);
		System.out.println(list.length());
		
		System.out.println(list.get(1));
		list.remove(0);
		System.out.println(list.length());
		list.printArray();
	}
}	
