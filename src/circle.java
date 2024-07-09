import javax.swing.JOptionPane;

public class circle {

	public static void main(String[] args)
	{
		String str = JOptionPane.showInputDialog("Enter the radius of circle:");
		double radius = Double.parseDouble(str);
		double area = Math.PI * (radius * radius);
		double circumference = 2 * (Math.PI * radius);
		String Output = "Radius is :"+radius+"\nArea is : "+area+" square units\ncircumference is : "+circumference+" units";
		String Output2 = String.format(" radius is : %.2f%n Area is : %.2f Square Units%n Circumference is : %.2f units",radius,area,circumference);
		JOptionPane.showMessageDialog(null,Output,"Circle",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null,Output2,"Absolute Circle",JOptionPane.INFORMATION_MESSAGE);
	}
}
