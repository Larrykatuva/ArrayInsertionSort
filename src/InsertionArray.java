
public class InsertionArray {
	private int[] arr;
	private int nItems;
	
	/**
	 * Class constructor
	 * @param size
	 */
	public InsertionArray(int size) {
		this.arr = new int[size];
		this.nItems = 0;
	}
	
	/**
	 * Inserting values into the array
	 * @param value
	 */
	public void insertValue(int value) {
		this.arr[this.nItems] = value;
		this.nItems ++;
	}
	
	
	/**
	 * Displaying all the values int the array
	 */
	public void displayValues() {
		for(int value: this.arr) {
			System.out.println(value);
		}
	}
	
	
	/**
	 * Sorting the array using insertion sort algorithm
	 */
	public void insertionSort() {
		int innerValue, outerValue;
		for(outerValue = 1; outerValue < this.nItems; outerValue ++) {
			int temp = this.arr[outerValue];
			innerValue = outerValue;
			while(innerValue > 0 && this.arr[innerValue -1 ] >= temp) {
				this.arr[innerValue] = this.arr[innerValue - 1];
				-- innerValue;
			}
			this.arr[innerValue] = temp;
		}
	}
}
