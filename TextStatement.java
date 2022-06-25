public class TextStatement extends Statement {
    public String get_title(Customer aCustomer){
		String result = "Rental Record for " + aCustomer.getName() +
		"\n";
        return result;
    }

    public String show_figures(Rental aRental, String result){
		   result += "\t" + aRental.getMovie().getTitle()+ "\t" +
		   String.valueOf(aRental.getCharge()) + "\n";
           return result;
    }

    public String add_footer(Customer aCustomer, String result){
		result += "Amount owed is " +
		String.valueOf(aCustomer.getTotalCharge()) + "\n";
		result += "You earned " +
		String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
		" frequent renter points";
		return result;
    }
}
