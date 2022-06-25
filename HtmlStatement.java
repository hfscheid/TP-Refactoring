public class HtmlStatement extends Statement {
    public String get_title(Customer aCustomer){
		  String result = "<H1>Rentals for <EM>" + aCustomer.getName() +
		  "</EM></H1><P>\n";
          return result;
    }

    public String show_figures(Rental aRental, String result){
        result += aRental.getMovie().getTitle()+ ": " +
        String.valueOf(aRental.getCharge()) + "<BR>\n";
        return result;
    }

    public String add_footer(Customer aCustomer, String result){
		  result += "<P>You owe <EM>" +
		  String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
		  result += "On this rental you earned <EM>" + 
		  String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
		  "</EM> frequent renter points<P>";
		  return result;
    }
}
