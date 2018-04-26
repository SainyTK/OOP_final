import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class ModulusGUI extends JFrame
{
	private JLabel jlabel1;
	private JLabel jlabel2;
	private JTextField jtf1;
	private JTextField jtf2;
	private JLabel jlabelresult;
	private JTextField jtfresult;
	private JButton jbtn;

	public ModulusGUI()
	{
		jlabel1 = new JLabel("First Number : ");
		jtf1 = new JTextField(15);
		jlabel2 = new JLabel("Second Number : ");
		jtf2 = new JTextField(15);

		jlabelresult = new JLabel("Result");
		jtfresult = new JTextField(10);
		jbtn = new JButton("Calculate");

		jbtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent a)
			{
				try
				{
					int num1 = Integer.parseInt(jtf1.getText());
					int num2 = Integer.parseInt(jtf2.getText());

					jtfresult.setText(num1%num2+"");
				}
				catch(ArithmeticException e)
				{
					JOptionPane.showMessageDialog(null,"Error : Divide by zero");
				}
			}
		});

		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT,5,5));

		c.add(jlabel1);
		c.add(jtf1);
		c.add(jlabel2);
		c.add(jtf2);
		c.add(jlabelresult);
		c.add(jtfresult);
		c.add(jbtn);

		this.setSize(900,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
	}


}