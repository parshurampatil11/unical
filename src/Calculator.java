import java.awt.*;
/** Document Comment*/
import java.awt.event.*;
public class Calculator implements ActionListener{
	Frame f;
	TextField textField;
	Button del, cube,squ, mod, dot, back, zero, nine, eight, seven, six, five, four, three, two, one, equal, plus, minus,div, mul;
	String str,tmp1,tmp2,symbol;
	int x,y,z;
	double a, b, c;
	Calculator(){
		f = new Frame("Calculator");
		f.setBackground(Color.DARK_GRAY);
		textField = new TextField();
		textField.setBounds(30, 100, 320, 40);
		textField.setBackground(Color.LIGHT_GRAY);
		Label label = new Label("Basic Calculator");
		label.setBounds(30, 60, 320, 40);
		label.setForeground(Color.MAGENTA);
		Font boldFont = new Font("Basic", Font.BOLD+Font.ITALIC, 20);        
	    label.setFont(boldFont);
		
		nine = new Button("9");
		nine.setBounds(190, 200, 80, 30);
		nine.setForeground(Color.WHITE);
		nine.setBackground(Color.BLACK);
		eight = new Button("8");
		eight.setBounds(110, 200, 80, 30);
		eight.setForeground(Color.WHITE);
		eight.setBackground(Color.BLACK);
		seven = new Button("7");
		seven.setBounds(30, 200, 80, 30);
		seven.setForeground(Color.WHITE);
		seven.setBackground(Color.BLACK);
		div = new Button("/");
		div.setBounds(270, 200, 80, 30);
		div.setForeground(Color.CYAN);
		div.setBackground(Color.BLACK);
		
		six = new Button("6");
		six.setBounds(190,230,80,30);
		six.setForeground(Color.WHITE);
		six.setBackground(Color.BLACK);
		five = new Button("5");
		five.setBounds(110,230,80,30);
		five.setForeground(Color.WHITE);
		five.setBackground(Color.BLACK);
		four = new Button("4");
		four.setBounds(30, 230, 80, 30);
		four.setForeground(Color.WHITE);
		four.setBackground(Color.BLACK);
		mul = new Button("*");
		mul.setBounds(270, 230, 80, 30);
		mul.setForeground(Color.CYAN);
		mul.setBackground(Color.BLACK);
		
		three = new Button("3");
		three.setBounds(190, 260, 80, 30);
		three.setForeground(Color.WHITE);
		three.setBackground(Color.BLACK);
		two = new Button("2");
		two.setBounds(110, 260, 80, 30);
		two.setForeground(Color.WHITE);
		two.setBackground(Color.BLACK);
		one = new Button("1");
		one.setBounds(30, 260, 80, 30);
		one.setForeground(Color.WHITE);
		one.setBackground(Color.BLACK);
		minus = new Button("-");
		minus.setBounds(270, 260, 80, 30);
		minus.setForeground(Color.CYAN);
		minus.setBackground(Color.BLACK);
		
		zero = new Button("0");
		zero.setBounds(30, 290, 160, 50);
		zero.setForeground(Color.WHITE);
		zero.setBackground(Color.BLACK);
		equal = new Button("=");
		equal.setBounds(190,290,80,50);
		equal.setForeground(Color.CYAN);
		equal.setBackground(Color.BLACK);
		plus = new Button("+");
		plus.setBounds(270, 290, 80, 50);
		plus.setForeground(Color.CYAN);
		plus.setBackground(Color.BLACK);
		
		back = new Button("Back");
		back.setBounds(30, 170, 80, 30);
		back.setForeground(Color.RED);
		back.setBackground(Color.BLACK);
		dot = new Button(".");
		dot.setBounds(150, 170, 40, 30);
		dot.setForeground(Color.CYAN);
		dot.setBackground(Color.BLACK);
		del = new Button("<-");
		del.setBounds(110, 170, 40, 30);
		del.setForeground(Color.CYAN);
		del.setBackground(Color.BLACK);
		mod = new Button("%");
		mod.setBounds(190,170,80,30);
		mod.setForeground(Color.CYAN);
		mod.setBackground(Color.BLACK);
		squ = new Button("S");
		squ.setBounds(270,170,40,30);
		squ.setForeground(Color.CYAN);
		squ.setBackground(Color.BLACK);
		cube = new Button("C");
		cube.setBounds(310, 170, 40, 30);
		cube.setForeground(Color.CYAN);
		cube.setBackground(Color.BLACK);
		
		zero.addActionListener(this);
		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
		five.addActionListener(this);
		six.addActionListener(this);
		seven.addActionListener(this);
		eight.addActionListener(this);
		nine.addActionListener(this);
		plus.addActionListener(this);
		minus.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		equal.addActionListener(this);
		back.addActionListener(this);
		dot.addActionListener(this);
		mod.addActionListener(this);
		squ.addActionListener(this);
		cube.addActionListener(this);
		del.addActionListener(this);
		
		f.add(nine);
		f.add(eight);
		f.add(seven);
		f.add(six);
		f.add(five);
		f.add(four);
		f.add(three);
		f.add(two);
		f.add(one);
		f.add(zero);
		f.add(equal);
		f.add(plus);
		f.add(minus);
		f.add(mul);
		f.add(div);
		f.add(textField);
		f.add(back);
		f.add(dot);
		f.add(mod);
		f.add(squ);
		f.add(cube);
		f.add(label);
		f.add(del);
		
		f.setSize(382,380);
		f.setLayout(null);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
		
		
	}
	public void actionPerformed(ActionEvent e) {
		String s1 = e.getActionCommand();
				
		if(s1.equals("1") || s1.equals("2") || s1.equals("3")) {
			str = textField.getText();
			textField.setText(str+s1);
		}
		else if(s1.equals("4") || s1.equals("5") || s1.equals("6")) {
			str = textField.getText();
			textField.setText(str+s1);
		}
		else if(s1.equals("7") || s1.equals("8") || s1.equals("9") || s1.equals("0")) {
			str = textField.getText();
			textField.setText(str+s1);
		}
		else if(s1.equals("+")) {
			tmp1 = textField.getText();
			textField.setText("");
			symbol = s1;
		}
		else if(s1.equals("-")) {
			tmp1 = textField.getText();
			textField.setText("");
			symbol = s1;
		}
		else if(s1.equals("*")) {
			tmp1 = textField.getText();
			textField.setText("");
			symbol = s1;
		}
		else if(s1.equals("/")) {
			tmp1 = textField.getText();
			textField.setText("");
			symbol = s1;
		}
		else if(s1.equals("Back")) {
			textField.setText("");
		}
		else if(s1.equals("<-")) {
			tmp1 = textField.getText();
			try {
			x = tmp1.length()-1;
			textField.setText(""+tmp1.substring(0, x));
			}
			catch(Exception ex) {
				textField.setText("");
			}
		}
		else if(s1.equals(".")) {
			str = textField.getText();
			textField.setText(str+s1);
		}
		else if(s1.equals("%")) {
			tmp1 = textField.getText();
			a = Double.parseDouble(tmp1);
			b = a/100;
			textField.setText(""+b);
		}
		else if(s1.equals("S")) {
			tmp1 = textField.getText();
			x = Integer.parseInt(tmp1);
			z = x * x;
			textField.setText(""+z);
		}
		else if(s1.equals("C")){
			tmp1 = textField.getText();
			x = Integer.parseInt(tmp1);
			z = x * x * x;
			textField.setText(""+z);
		}
		
		if(s1.equals("=")) {
			if(tmp1.contains(".")) {
				if(symbol.equals("+")) {
					tmp2 = textField.getText();
					a = Double.parseDouble(tmp1);
					b = Double.parseDouble(tmp2);
					c = a + b;
					textField.setText(""+c);
				}
				else if(symbol.equals("-")) {
					tmp2 = textField.getText();
					a = Double.parseDouble(tmp1);
					b = Double.parseDouble(tmp2);
					c = a - b;
					textField.setText(""+c);
				}
				else if(symbol.equals("*")) {
					tmp2 = textField.getText();
					a = Double.parseDouble(tmp1);
					b = Double.parseDouble(tmp2);
					c = a * b;
					textField.setText(""+c);
				}
				else if(symbol.equals("/")) {
					tmp2 = textField.getText();
					a = Double.parseDouble(tmp1);
					b = Double.parseDouble(tmp2);
					try {
						c = a / b;
						textField.setText(""+c);
					}
					catch(Exception ex) {
						textField.setText(""+"Can't Divide By Zero");
					}
				}
			}
			else if(!tmp1.contains(".")) {
				
				if(symbol.equals("+")) {
					tmp2 = textField.getText();
					x = Integer.parseInt(tmp1);
					y = Integer.parseInt(tmp2);
					z = x+y;
					textField.setText(""+z);
				}
				else if(symbol.equals("-")) {
					tmp2 = textField.getText();
					x = Integer.parseInt(tmp1);
					y = Integer.parseInt(tmp2);
					z = x - y;
					textField.setText(""+z);
				}
				else if(symbol.equals("*")) {
					tmp2= textField.getText();
					x = Integer.parseInt(tmp1);
					y = Integer.parseInt(tmp2);
					z = x * y;
					textField.setText(""+z);
				}
				else if(symbol.equals("/")) {
					tmp2 = textField.getText();
					x = Integer.parseInt(tmp1);
					y = Integer.parseInt(tmp2);
					try {
						z = x / y;
						textField.setText(""+z);
					}
					catch(Exception ex) {
						textField.setText(""+"Can't Divide by zero");
					}
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		new Calculator();
	}

}
