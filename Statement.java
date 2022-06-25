import java.util.Enumeration;

public abstract class Statement {
    public abstract String get_title(Customer aCustomer);
    public abstract String show_figures(Rental aRental, String result);
    public abstract String add_footer(Customer aCustomer, String result);

    public String value(Customer aCustomer){
		Enumeration rentals = aCustomer.getRentals();
		String result = get_title(aCustomer);
		while (rentals.hasMoreElements()) {
		   Rental each = (Rental) rentals.nextElement();
		   //show figures for this rental
           result = show_figures(each, result);
		}
		//add footer lines
        result = add_footer(aCustomer, result);
		return result;
   }
}
