import javax.swing.JOptionPane;
public class Movie {

	public static void main(String[] args)
	{
		String movie = JOptionPane.showInputDialog("Enter the Movie name");
		String ticketsSold = JOptionPane.showInputDialog("Number of adult Tickets Sold:");
		int adultST = Integer.parseInt(ticketsSold);
		// ST sold ticket
		String ticketsSold2 = JOptionPane.showInputDialog("Number of child Tickets Sold:");
		int childST = Integer.parseInt(ticketsSold2);
		String PriceAdultTicket = JOptionPane.showInputDialog("Enter the price per adult ticket:");
		Double priceA = Double.parseDouble(PriceAdultTicket);
		String PriceChildTicket = JOptionPane.showInputDialog("Enter the price per child ticket:");
		double priceC = Double.parseDouble(PriceChildTicket);
		String donation = JOptionPane.showInputDialog("Enter the percentage of donation to charity:");
		double donate = Double.parseDouble(donation);
		int grossTSale = adultST + childST;
		double grossAmount = (adultST*priceA)+(childST*priceC);
		double amountDonated = (grossAmount * donate)/100;
		double netSale = grossAmount-amountDonated;
		String OutPut = "Movie name : "+movie+"\nNumber of tickets Sold : "+grossTSale+
				"\nGross Amount : $"+grossAmount+"\nPercentage of donation : "+donate+
				"% \nAmount Donated : $"+amountDonated+"\nNet Sale : $"+netSale;
		JOptionPane.showMessageDialog(null,OutPut,"Movie Data",JOptionPane.INFORMATION_MESSAGE);
		
	}

}
