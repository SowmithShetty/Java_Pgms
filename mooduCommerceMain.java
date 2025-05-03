import com.mooduCommerce.Customer.Customer;
import com.mooduCommerce.Order.Order;

public class mooduCommerceMain{
	public static void main(String[] args){
		Customer customer=new Customer("Vijay","vijay001@gmail.com");
		Order order=new Order("Order123",500);
		System.out.println("--Customer Details--");
		customer.displayInfo();
		
		System.out.println("---Order Details----");
		order.displayOrder();
	}
}