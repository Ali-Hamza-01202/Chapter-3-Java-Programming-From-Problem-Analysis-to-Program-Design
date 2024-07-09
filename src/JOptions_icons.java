import javax.swing.JOptionPane;


public class JOptions_icons {

	public static void main(String[] args) 
	{
	
		String str = JOptionPane.showInputDialog("Enter your name:");
		// here the following icons for message box
		JOptionPane.showMessageDialog(null, str,"With Information Icon",JOptionPane.INFORMATION_MESSAGE);// icon i
		JOptionPane.showMessageDialog(null, str,"With no icon",JOptionPane.PLAIN_MESSAGE);// no icon
		JOptionPane.showMessageDialog(null, str,"With Error Icon",JOptionPane.ERROR_MESSAGE);// error icon
		JOptionPane.showMessageDialog(null, str,"With Question Icon",JOptionPane.QUESTION_MESSAGE);// question mark icon
		JOptionPane.showMessageDialog(null, str,"With Warning icon",JOptionPane.WARNING_MESSAGE);// warning icon
		// To print an integer
		String str2 = JOptionPane.showInputDialog("Enter a number:");
		int num = Integer.parseInt(str2);
		// for double,  double num = Double.parseDouble(str2);
		JOptionPane.showMessageDialog(null, "Number entered is "+num,"Number entered",JOptionPane.INFORMATION_MESSAGE);
	}

}
