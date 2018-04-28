import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class ModulusGUI extends JFrame
{
	private JLabel jlabel1;
	private JLabel jlabel2;
	private JLabel jlabel3;
	private JTextField jtf1;
	private JTextField jtf2;
	private JTextField jtf3;
	private JButton jbtn;
	private JPanel jpn;

	public ModulusGUI()
	{
		jlabel1 = new JLabel("First Number ");
		jlabel2 = new JLabel("Second Number ");
		jlabel3 = new JLabel("Result ");
		jtf1 = new JTextField(10);
		jtf2 = new JTextField(10);
		jtf3 = new JTextField(10);
		jbtn = new JButton("Calculate");
		jpn = new JPanel();
		jpn.setLayout(new FlowLayout(FlowLayout.LEFT,5,5));
		jpn.add(jlabel1);
		jpn.add(jtf1);
		jpn.add(jlabel2);
		jpn.add(jtf2);
		jpn.add(jlabel3);
		jpn.add(jtf3);

		jbtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				 try{
					int i1 = Integer.parseInt(jtf1.getText());
					int i2 = Integer.parseInt(jtf2.getText());

					int ans = mod(i1,i2);

					jtf3.setText(ans+"");
				}
				catch(NumberFormatException ne)
				{
					JOptionPane.showMessageDialog(null,"Input Number only");
				}
				catch(ModulusZeroException ae)
				{
					JOptionPane.showMessageDialog(null,"Error Divide by zero");
				}
				
			}
		});


		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		c.add(jpn,BorderLayout.CENTER);
		c.add(jbtn,BorderLayout.EAST);
		

		this.setSize(750,100);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static int mod(int x,int y) throws ModulusZeroException
	{
		if(y==0)
		 	throw new ModulusZeroException();
		return x%y;
	}


}