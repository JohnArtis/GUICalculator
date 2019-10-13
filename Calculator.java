import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/* Key event to set the return key to calculate what the user wants and sets it as the ans key */

@SuppressWarnings("serial")
public class Calculator extends JFrame implements ActionListener
{
	//Declare the objects.
	private JPanel Title;
	private JPanel Result;
	private JPanel ButtonLayout; 
	private JLabel myTitle;
	private Font myTitleFont;
	private JButton FClear;
	private JButton calculatorButton_0;
	private JButton calculatorButton_1;
	private JButton calculatorButton_2;
	private JButton calculatorButton_3;
	private JButton calculatorButton_4;
	private JButton calculatorButton_5;
	private JButton calculatorButton_6;
	private JButton calculatorButton_7;
	private JButton calculatorButton_8;
	private JButton calculatorButton_9;
	private JButton calculatorButton_PlusMinus;
	private JButton calculatorButton_Multiplication;
	private JButton calculatorButton_Division;
	private JButton calculatorButton_Subtraction;
	private JButton calculatorButton_Addition;
	private JButton calculatorButton_Decimal;
	private JButton calculatorButton_Percent;
	private JButton calculatorButton_Equate;
	private JButton calculatorButton_Ans;
	private JTextField result;
	public double answer;
	public static double ans;
	public static String input = "";
	static double a=0,b=0,resul=0;
	static int operator=0;
	public static void main(String[] args)
	{
		
		new Calculator();
		
		
		
	}

	public Calculator()
	{
		setSize(500, 650);
		setTitle("CSCI-141");
		this.setResizable(false);
		
		myTitle         = new JLabel("Calculator");
		myTitleFont     = new Font(Font.MONOSPACED,Font.PLAIN,40); 
		JLayeredPane layeredPane = new JLayeredPane();
		this.getContentPane().add(layeredPane, BorderLayout.CENTER);
		
		//Create TextFields, buttons, and panels.
		Title                = new JPanel();
		Title.setLayout(new GridLayout(1, 1));
		Title.setBounds(0, 0, 500, 64);
		layeredPane.add(Title);
		Result               = new JPanel();
		Result.setLayout(new GridLayout(1,1));
		Result.setBounds(0, 64, 500, 100);
		layeredPane.add(Result);
		ButtonLayout         = new JPanel();
		ButtonLayout.setLayout(new GridLayout(5, 4));
		ButtonLayout.setBounds(0, 164, 500, 450);
		layeredPane.add(ButtonLayout);
		
		// Orientation of the buttons
		result = new JTextField(20);
		FClear = new JButton("C");
		calculatorButton_0 = new JButton("0");
		calculatorButton_1 = new JButton("1");
		calculatorButton_2 = new JButton("2");
		calculatorButton_3 = new JButton("3");
		calculatorButton_4 = new JButton("4");
		calculatorButton_5 = new JButton("5");
		calculatorButton_6 = new JButton("6");
		calculatorButton_7 = new JButton("7");
		calculatorButton_8 = new JButton("8");
		calculatorButton_9 = new JButton("9");
		calculatorButton_PlusMinus = new JButton("+/-");
		calculatorButton_Multiplication = new JButton("x");
		calculatorButton_Division = new JButton("/");
		calculatorButton_Subtraction = new JButton("-");
		calculatorButton_Addition = new JButton("+");
		calculatorButton_Decimal = new JButton(".");
		calculatorButton_Percent = new JButton("%");
		calculatorButton_Equate = new JButton("=");
		calculatorButton_Ans = new JButton("ANS");
		
		//set color
		FClear.setBackground(Color.ORANGE);
		calculatorButton_PlusMinus.setBackground(Color.ORANGE);
		calculatorButton_Percent.setBackground(Color.ORANGE);
		calculatorButton_Multiplication.setBackground(Color.ORANGE);
		calculatorButton_Division.setBackground(Color.ORANGE);
		calculatorButton_Addition.setBackground(Color.ORANGE);
		calculatorButton_Subtraction.setBackground(Color.ORANGE);
		calculatorButton_Ans.setBackground(Color.ORANGE);
		//Add action listener
		FClear.addActionListener(this);
		calculatorButton_0.addActionListener(this);
		calculatorButton_1.addActionListener(this);
		calculatorButton_2.addActionListener(this);
		calculatorButton_3.addActionListener(this);
		calculatorButton_4.addActionListener(this);
		calculatorButton_5.addActionListener(this);
		calculatorButton_6.addActionListener(this);
		calculatorButton_7.addActionListener(this);
		calculatorButton_8.addActionListener(this);
		calculatorButton_9.addActionListener(this);
		calculatorButton_PlusMinus.addActionListener(this);
		calculatorButton_Multiplication.addActionListener(this);
		calculatorButton_Division.addActionListener(this);
		calculatorButton_Subtraction.addActionListener(this);
		calculatorButton_Addition.addActionListener(this);
		calculatorButton_Decimal.addActionListener(this);
		calculatorButton_Percent.addActionListener(this);
		calculatorButton_Equate.addActionListener(this);
		calculatorButton_Ans.addActionListener(this);
		
		
		//Create Layout for Buttons
		Title.add(myTitle);
		Result.add(result); 
		ButtonLayout.add(FClear);
		ButtonLayout.add(calculatorButton_PlusMinus);
		ButtonLayout.add(calculatorButton_Percent);
		ButtonLayout.add(calculatorButton_Multiplication);
		ButtonLayout.add(calculatorButton_7);
		ButtonLayout.add(calculatorButton_8);
		ButtonLayout.add(calculatorButton_9);
		ButtonLayout.add(calculatorButton_Division);
		ButtonLayout.add(calculatorButton_4);
		ButtonLayout.add(calculatorButton_5);
		ButtonLayout.add(calculatorButton_6);
		ButtonLayout.add(calculatorButton_Addition);
		ButtonLayout.add(calculatorButton_1);
		ButtonLayout.add(calculatorButton_2);
		ButtonLayout.add(calculatorButton_3);
		ButtonLayout.add(calculatorButton_Subtraction);
		ButtonLayout.add(calculatorButton_Decimal);
		ButtonLayout.add(calculatorButton_0);
		ButtonLayout.add(calculatorButton_Equate); 
		ButtonLayout.add(calculatorButton_Ans);
		
		
	
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e)
	
	{
			if(e.getSource()== calculatorButton_1)
				result.setText(result.getText().concat("1"));
			
			if(e.getSource()== calculatorButton_2)
				result.setText(result.getText().concat("2"));
			
			if(e.getSource()== calculatorButton_3)
				result.setText(result.getText().concat("3"));
			
			if(e.getSource()== calculatorButton_4)
				result.setText(result.getText().concat("4"));
			
			if(e.getSource()== calculatorButton_5)
				result.setText(result.getText().concat("5"));
			
			if(e.getSource()== calculatorButton_6)
				result.setText(result.getText().concat("6"));
			
			if(e.getSource()== calculatorButton_7)
				result.setText(result.getText().concat("7"));
			
			if(e.getSource()== calculatorButton_8)
				result.setText(result.getText().concat("8"));
			
			if(e.getSource()== calculatorButton_9)
				result.setText(result.getText().concat("9"));
			
			if(e.getSource()== calculatorButton_0)
				result.setText(result.getText().concat("0"));
			if(e.getSource() == calculatorButton_Ans) 
				result.setText("" + result.getText().concat("" + ans));
			
			if(e.getSource()== calculatorButton_Decimal)
				result.setText(result.getText().concat("."));
			
			if(e.getSource()== calculatorButton_Addition)
			{
				a=Double.parseDouble(result.getText());
				operator=1;
				result.setText("");
			} 
			
			if(e.getSource()== calculatorButton_Subtraction)
			{
				a=Double.parseDouble(result.getText());
				operator=2;
				result.setText("");
			}
			
			if(e.getSource()== calculatorButton_Multiplication)
			{
				a=Double.parseDouble(result.getText());
				operator=3;
				result.setText("");
			}
			
			if(e.getSource()==calculatorButton_Division)
			{
				a=Double.parseDouble(result.getText());
				operator=4;
				result.setText("");
			}
			
			if(e.getSource()==calculatorButton_Equate)
			{
				b=Double.parseDouble(result.getText());
			
				switch(operator)
				{
					case 1: resul=a+b;
						break;
			
					case 2: resul=a-b;
						break;
			
					case 3: resul=a*b;
						break;
			
					case 4: resul=a/b;
						break;
			
					default: resul=0;
				}
				
				result.setText(""+resul);
				ans = resul;
			}
			
			if(e.getSource()==FClear) {
				result.setText("");
			

			}
	}
}
