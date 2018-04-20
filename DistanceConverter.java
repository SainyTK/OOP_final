import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;


public class DistanceConverter extends JFrame
{
	private JLabel jlbl;
	private JTextField jtf;
	private JButton jbtn;
	private JTextArea jta;

	private JPanel jpn;

	private String result;

	public DistanceConverter()
	{
		
		super("Converter");

		result = "";

		jlbl = new JLabel("Distance in miles : ");
		jtf = new JTextField(8);
		jbtn = new JButton("Convert!");
		jta = new JTextArea(20,20);

		jbtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String input = jtf.getText();
				try
				{
					double mileValue = Double.parseDouble(input);
					double kmValue = mileValue*1.609344;
					result = result + mileValue + " miles equals " + kmValue + " kilometers\n";
					jta.setText(result);
				}
				catch(NumberFormatException nfe)
				{
					JOptionPane.showMessageDialog(null,"Input only number!");
				}
			}
		});

		jpn = new JPanel();
		jpn.setLayout(new FlowLayout(FlowLayout.LEFT,2,5));
		jpn.add(jlbl);
		jpn.add(jtf);
		jpn.add(jbtn);


		Container c = getContentPane();

		c.setLayout(new BorderLayout());

		c.add(jpn,BorderLayout.NORTH);
		c.add(jta,BorderLayout.CENTER);


		this.setSize(350,280);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
	}


}