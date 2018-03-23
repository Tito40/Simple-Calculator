import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Front extends JFrame 
{

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) 
	{
		new Front();
	}
	
	Front()
	{
		
		setLayout(new GridLayout(0,1));
		JTextField txt = new JTextField();
		add(txt);
		setVisible(true);
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new buttons(txt));
	}

}

class buttons extends JPanel
{
	
	private static final long serialVersionUID = 1L;
	Button mem, sqrt, plus, zero, one, two, three, four, five, six, seven, eight, nine, equals, minus;
	Variable var = new Variable(); 
	Function func = new Function();
	
	buttons(JTextField t)
	{
		setLayout(new GridLayout(5,4));
		
		zero = new Button("0");
		one = new Button("1");
		two = new Button("2");
		three = new Button("3");
		four = new Button("4");
		five = new Button("5");
		six = new Button("6");
		seven = new Button("7");
		eight = new Button("8");
		nine = new Button("9");
		equals = new Button("=");
		plus = new Button("+");
		minus = new Button("-");
		sqrt = new Button("sqrt");
		mem = new Button("mem");
		

						
		add(zero);
		add(one);
		add(two);
		add(three);
		add(four);
		add(five);
		add(six);
		add(seven);
		add(eight);
		add(nine);
		add(equals);
		add(plus);
		add(minus);
		add(sqrt);
		add(mem);
		
		zero.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				if (var.getSecond() != null) {var.setToNull(); t.setText("");}
				String scn = t.getText();
				t.setText(scn+"0");
				
			}
			
		});
		
		one.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				if (var.getSecond() != null) {var.setToNull(); t.setText("");}
				String scn = t.getText();
				t.setText(scn+"1");				
			}
			
		});
		
		two.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				if (var.getSecond() != null) {var.setToNull(); t.setText("");}
				String scn = t.getText();
				t.setText(scn+"2");
			}
			
		});
		
		three.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				if (var.getSecond() != null) {var.setToNull(); t.setText("");}
				String scn = t.getText();
				t.setText(scn+"3");
			}
		});
		
		four.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				if (var.getSecond() != null) {var.setToNull(); t.setText("");}
				String scn = t.getText();
				t.setText(scn+"4");
			}
			
		});
		
		five.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				if (var.getSecond() != null) {var.setToNull(); t.setText("");}
				String scn = t.getText();
				t.setText(scn+"5");
			}
			
		});
		
		six.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				if (var.getSecond() != null) {var.setToNull(); t.setText("");}
				String scn = t.getText();
				t.setText(scn+"6");
			}
			
		});
		
		seven.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				if (var.getSecond() != null) {var.setToNull(); t.setText("");}
				String scn = t.getText();
				t.setText(scn+"7");
			}
			
		});
		
		eight.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				if (var.getSecond() != null) {var.setToNull(); t.setText("");}
				String scn = t.getText();
				t.setText(scn+"8");
			}
			
		});
		
		nine.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				if (var.getSecond() != null) {var.setToNull(); t.setText("");}
				String scn = t.getText();
				t.setText(scn+"9");
			}
			
		});
		
		equals.addActionListener(new ActionListener()
		{
			int value = 0;

			@Override
			public void actionPerformed(ActionEvent e)
			{
				
				String opr = func.getFunction();
				if (opr.equals("+")) 
				{
					value = Integer.parseInt(var.getFirst()) + Integer.parseInt(t.getText());
					t.setText(value+"");
				}
			}
			
		});
		
		plus.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				var.setFirst(t.getText());
				var.setSecond(" ");
				func.setFunction("+");
			}
			
		});
		
		minus.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				var.setFirst(t.getText());
				
			}
			
		});
		
		sqrt.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				
				
			}
			
		});
	}
}




class Variable
{
	private String First = null;
	private String Second = null;
	
	public void setFirst(String g) 
	{
		this.First = g;
	}
	
	public void setSecond(String g) 
	{
		this.Second = g;
	}
	
	public String getFirst() 
	{
		return this.First;
	}
	
	public String getSecond() 
	{
		return this.Second;
	}
	
	public void setToNull() 
	{
		this.Second = null;
	}
	
	
}





class Function
{
	String Function = null;
	
	public void setFunction(String t) 
	{
		this.Function = t;
	}
	
	
	public String getFunction() 
	{
		return this.Function;
	}
	
}

