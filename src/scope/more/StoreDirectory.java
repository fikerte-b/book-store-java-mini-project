package scope.more;

public class StoreDirectory {
	private Bookstore bookstore;
	private Market market;

	public StoreDirectory(String custId){
		bookstore = new Bookstore(custId);
		market = new Market();
	}

	public int getNumberOfBooks() {
		return bookstore.getNumBooks();
	}
	public int getNumberOfBookstoreEmployees() {
		//implement
		return bookstore.getNumEmployees();
	}
	public boolean addNewEmployee(String employeeId){
		//implement
		if (bookstore.addNewEmployee(employeeId)==true)
		return true;
		else
		throw new RuntimeException("Employee is full");
	}
	public boolean bookIsInStock(String bookId){
		//implement
		if(bookstore.bookIsInStock(bookId) == true)
		return true;
		else
			return false;
	}
	public boolean addNewBook(String bookId){
		//implement
		if(bookstore.addNewBook2(bookId) == true)
		return true;
		throw new RuntimeException("The book store is full");
	}
	public boolean marketCarriesFoodItem(String foodItem){
		//implement
		if(market.carriesFoodItem(foodItem))
		return true;
		else
			return false;
	}
	public boolean isIdValid(String id){
		if(Ids.isGoodId(id))
			return true;
		else
			return false;
	}
}
