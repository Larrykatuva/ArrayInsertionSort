
public class InsertionSortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertionArray arr = new InsertionArray(5);
		 arr.insertValue(30);
		 arr.insertValue(111);
		 arr.insertValue(21);
		 arr.insertValue(12);
		 arr.insertValue(201);
		 
		 arr.displayValues();
		 arr.insertionSort();
		 System.out.println("After sorting");
		 arr.displayValues();

	}

}
