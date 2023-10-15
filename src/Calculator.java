import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import java.awt.Color;
import javax.swing.UIManager;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setTitle("Scientific Calculator");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 413, 632);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SCIENTIFIC CALCULATOR");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(10, 10, 382, 35);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setForeground(new Color(255, 255, 255));
		textField.setBackground(new Color(0, 0, 0));
		textField.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField.setBounds(10, 44, 382, 69);
		contentPane.add(textField);
		textField.setColumns(10);
		
		final JButton btnRoot = new JButton("\u221A");
		btnRoot.setBackground(Color.GRAY);
		btnRoot.setEnabled(false);
		btnRoot.setBorder(BorderFactory.createEtchedBorder());
		btnRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				double a = Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
				}catch(NumberFormatException ne) {
					textField.setText("Invalid operation, Please enter a number first.");
				}
			}
		});
		btnRoot.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnRoot.setBounds(10, 144, 68, 60);
		contentPane.add(btnRoot);
		
		final JButton btn1X = new JButton("1/X");
		btn1X.setBackground(Color.GRAY);
		btn1X.setEnabled(false);
		btn1X.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				double a = 1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
				}catch(NumberFormatException ne) {
					textField.setText("Invalid operation, Please enter a number first.");
				}
			}
		});
		btn1X.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn1X.setBounds(10, 208, 68, 60);
		contentPane.add(btn1X);
		
		final JButton btnXY = new JButton("X^Y");
		btnXY.setBackground(Color.GRAY);
		btnXY.setEnabled(false);
		btnXY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "X^Y";
				}catch(NumberFormatException ne) {
					textField.setText("Invalid operation, Please enter a number first.");
				}
			}
		});
		btnXY.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnXY.setBounds(10, 271, 68, 60);
		contentPane.add(btnXY);
		
		final JButton btnX3 = new JButton("X^3");
		btnX3.setBackground(Color.GRAY);
		btnX3.setEnabled(false);
		btnX3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				double a = Double.parseDouble(textField.getText());
				a = a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
				}catch(NumberFormatException ne) {
					textField.setText("Invalid operation, Please enter a number first.");
				}
			}
		});
		btnX3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnX3.setBounds(10, 335, 68, 60);
		contentPane.add(btnX3);
		
		final JButton btnX2 = new JButton("X^2");
		btnX2.setBackground(Color.GRAY);
		btnX2.setEnabled(false);
		btnX2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				double a = Double.parseDouble(textField.getText());
				a = a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
				}catch(NumberFormatException ne) {
					textField.setText("Invalid operation, Please enter a number first.");
				}
			}
		});
		btnX2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnX2.setBounds(10, 400, 68, 60);
		contentPane.add(btnX2);
		
		final JButton btnN = new JButton("n!");
		btnN.setBackground(Color.GRAY);
		btnN.setEnabled(false);
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				double a = Double.parseDouble(textField.getText());
				double fact = 1;
				while(a!=0)
				{
					fact = fact * a;
					a--;
				}
				textField.setText("");
				textField.setText(textField.getText()+fact);
				}catch(NumberFormatException ne) {
					textField.setText("Invalid operation, Please enter a number first.");
				}
			}
		});
		btnN.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnN.setBounds(10, 464, 68, 60);
		contentPane.add(btnN);
		
		final JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.setBackground(Color.GRAY);
		btnPlusMinus.setEnabled(false);
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				double a = Double.parseDouble(String.valueOf(textField.getText()));
				a = a*(-1);
				textField.setText(String.valueOf(a));
				}catch(NumberFormatException ne) {
					textField.setText("Invalid operation, Please enter a number first.");
				}
			}
		});
		btnPlusMinus.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnPlusMinus.setBounds(10, 528, 68, 60);
		contentPane.add(btnPlusMinus);
		
		final JButton btnEx = new JButton("e^x");
		btnEx.setBackground(Color.GRAY);
		btnEx.setEnabled(false);
		btnEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				double a = Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
				}catch(NumberFormatException ne) {
					textField.setText("Invalid operation, Please enter a number first.");
				}
			}
		});
		btnEx.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnEx.setBounds(89, 144, 68, 60);
		contentPane.add(btnEx);
		
		final JButton btnLog = new JButton("Log");
		btnLog.setBackground(Color.GRAY);
		btnLog.setEnabled(false);
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				double a = Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
				}catch(NumberFormatException ne) {
					textField.setText("Invalid operation, Please enter a number first.");
				}
			}
		});
		btnLog.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnLog.setBounds(89, 208, 68, 60);
		contentPane.add(btnLog);
		
		final JButton btnPercent = new JButton("%");
		btnPercent.setBackground(Color.GRAY);
		btnPercent.setEnabled(false);
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					first = Double.parseDouble(textField.getText());
					textField.setText("");
					operation = "%";
					}catch(NumberFormatException ne)
					{
						textField.setText("Invalid operation, Please enter a number first.");
					}
			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnPercent.setBounds(89, 271, 68, 60);
		contentPane.add(btnPercent);
		
		final JButton btn7 = new JButton("7");
		btn7.setBackground(Color.LIGHT_GRAY);
		btn7.setEnabled(false);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn7.setBounds(89, 335, 68, 60);
		contentPane.add(btn7);
		
		final JButton btn4 = new JButton("4");
		btn4.setBackground(Color.LIGHT_GRAY);
		btn4.setEnabled(false);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn4.setBounds(89, 400, 68, 60);
		contentPane.add(btn4);
		
		final JButton btn1 = new JButton("1");
		btn1.setBackground(Color.LIGHT_GRAY);
		btn1.setEnabled(false);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn1.setBounds(89, 464, 68, 60);
		contentPane.add(btn1);
		
		final JButton btnSin = new JButton("sin");
		btnSin.setBackground(Color.GRAY);
		btnSin.setEnabled(false);
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				double a = Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
				}catch(NumberFormatException ne) {
					textField.setText("Invalid operation, Please enter a number first.");
				}
			}
		});
		btnSin.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnSin.setBounds(167, 144, 68, 60);
		contentPane.add(btnSin);
		
		final JButton btnSinh = new JButton("sinh");
		btnSinh.setBackground(Color.GRAY);
		btnSinh.setEnabled(false);
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				double a = Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
				}catch(NumberFormatException ne) {
					textField.setText("Invalid operation, Please enter a number first.");
				}
			}
		});
		btnSinh.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnSinh.setBounds(167, 208, 68, 60);
		contentPane.add(btnSinh);
		
		final JButton btnClear = new JButton("C");
		btnClear.setBackground(Color.GRAY);
		btnClear.setEnabled(false);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnClear.setBounds(167, 271, 68, 60);
		contentPane.add(btnClear);
		
		final JButton btn8 = new JButton("8");
		btn8.setBackground(Color.LIGHT_GRAY);
		btn8.setEnabled(false);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn8.setBounds(167, 335, 68, 60);
		contentPane.add(btn8);
		
		final JButton btn5 = new JButton("5");
		btn5.setBackground(Color.LIGHT_GRAY);
		btn5.setEnabled(false);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn5.setBounds(167, 400, 68, 60);
		contentPane.add(btn5);
		
		final JButton btn2 = new JButton("2");
		btn2.setBackground(Color.LIGHT_GRAY);
		btn2.setEnabled(false);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn2.setBounds(167, 464, 68, 60);
		contentPane.add(btn2);
		
		final JButton btn0 = new JButton("0");
		btn0.setBackground(Color.LIGHT_GRAY);
		btn0.setEnabled(false);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn0.setBounds(88, 528, 147, 60);
		contentPane.add(btn0);
		
		final JButton btnCos = new JButton("cos");
		btnCos.setBackground(Color.GRAY);
		btnCos.setEnabled(false);
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				double a = Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
				}catch(NumberFormatException ne) {
					textField.setText("Invalid operation, Please enter a number first.");
				}
			}
		});
		btnCos.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnCos.setBounds(246, 144, 68, 60);
		contentPane.add(btnCos);
		
		final JButton btnCosh = new JButton("cosh");
		btnCosh.setBackground(Color.GRAY);
		btnCosh.setEnabled(false);
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				double a = Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
				}catch(NumberFormatException ne) {
					textField.setText("Invalid operation, Please enter a number first.");
				}
			}
		});
		btnCosh.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnCosh.setBounds(246, 208, 68, 60);
		contentPane.add(btnCosh);
		
		final JButton btnBack = new JButton("\uF0E7");
		btnBack.setBackground(Color.GRAY);
		btnBack.setEnabled(false);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if(textField.getText().length() > 0) {
					StringBuilder sb = new StringBuilder(textField.getText());
					sb.deleteCharAt(textField.getText().length()-1);
					backSpace = sb.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBack.setFont(new Font("Wingdings", Font.PLAIN, 21));
		btnBack.setBounds(246, 271, 68, 60);
		contentPane.add(btnBack);
		
		final JButton btn9 = new JButton("9");
		btn9.setBackground(Color.LIGHT_GRAY);
		btn9.setEnabled(false);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn9.setBounds(246, 335, 68, 60);
		contentPane.add(btn9);
		
		final JButton btn6 = new JButton("6");
		btn6.setBackground(Color.LIGHT_GRAY);
		btn6.setEnabled(false);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn6.setBounds(246, 400, 68, 60);
		contentPane.add(btn6);
		
		final JButton btn3 = new JButton("3");
		btn3.setBackground(Color.LIGHT_GRAY);
		btn3.setEnabled(false);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn3.setBounds(246, 464, 68, 60);
		contentPane.add(btn3);
		
		final JButton btnDot = new JButton(".");
		btnDot.setBackground(Color.LIGHT_GRAY);
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setEnabled(false);
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnDot.setBounds(246, 528, 68, 60);
		contentPane.add(btnDot);
		
		final JButton btnTan = new JButton("tan");
		btnTan.setBackground(Color.GRAY);
		btnTan.setEnabled(false);
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				double a = Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
				}catch(NumberFormatException ne) {
					textField.setText("Invalid operation, Please enter a number first.");
				}
			}
		});
		btnTan.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnTan.setBounds(324, 144, 68, 60);
		contentPane.add(btnTan);
		
		final JButton btnTanh = new JButton("tanh");
		btnTanh.setBackground(Color.GRAY);
		btnTanh.setEnabled(false);
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				double a = Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
				}catch(NumberFormatException ne) {
					textField.setText("Invalid operation, Please enter a number first.");
				}
			}
		});
		btnTanh.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnTanh.setBounds(324, 208, 68, 60);
		contentPane.add(btnTanh);
		
		final JButton btnAdd = new JButton("+");
		btnAdd.setBackground(Color.GRAY);
		btnAdd.setEnabled(false);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
				}catch(NumberFormatException ne)
				{
					textField.setText("Invalid operation, Please enter a number first.");
				}
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnAdd.setBounds(324, 271, 68, 60);
		contentPane.add(btnAdd);
		
		final JButton btnSub = new JButton("-");
		btnSub.setBackground(Color.GRAY);
		btnSub.setEnabled(false);
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					first = Double.parseDouble(textField.getText());
					textField.setText("");
					operation = "-";
					}catch(NumberFormatException ne)
					{
						textField.setText("Invalid operation, Please enter a number first.");
					}
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnSub.setBounds(324, 335, 68, 60);
		contentPane.add(btnSub);
		
		final JButton btnMul = new JButton("*");
		btnMul.setBackground(Color.GRAY);
		btnMul.setEnabled(false);
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					first = Double.parseDouble(textField.getText());
					textField.setText("");
					operation = "*";
					}catch(NumberFormatException ne)
					{
						textField.setText("Invalid operation, Please enter a number first.");
					}
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnMul.setBounds(324, 400, 68, 60);
		contentPane.add(btnMul);
		
		final JButton btnDivide = new JButton("/");
		btnDivide.setBackground(Color.GRAY);
		btnDivide.setEnabled(false);
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					first = Double.parseDouble(textField.getText());
					textField.setText("");
					operation = "/";
					}catch(NumberFormatException ne)
					{
						textField.setText("Invalid operation, Please enter a number first.");
					}
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnDivide.setBounds(324, 464, 68, 60);
		contentPane.add(btnDivide);
		
		final JButton btnEqual = new JButton("=");
		btnEqual.setBackground(new Color(0, 64, 128));
		btnEqual.setEnabled(false);
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				second = Double.parseDouble(textField.getText());
				if(operation == "+") {
					result = first + second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "-") {
					result = first - second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "*") {
					result = first * second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "/") {
					result = first / second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "%") {
					result = first % second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "X^Y"){
					double resultt = 1;
					for(int i=0; i<second; i++)
					{
						resultt = first*resultt;
					}
					answer = String.format("%.2f", resultt);
					textField.setText(answer);
				}
				}catch(NumberFormatException ne) {
					textField.setText("Invalid operation, Please enter a number first.");
				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnEqual.setBounds(324, 528, 68, 60);
		contentPane.add(btnEqual);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("ON");
		rdbtnNewRadioButton.setBackground(new Color(0, 0, 0));
		rdbtnNewRadioButton.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnEqual.setForeground(new Color(255, 255, 255));
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				btn0.setEnabled(true);
				btnDot.setEnabled(true);
				btnAdd.setEnabled(true);
				btnSub.setEnabled(true);
				btnMul.setEnabled(true);
				btnDivide.setEnabled(true);
				btnEqual.setEnabled(true);
				btnPlusMinus.setEnabled(true);
				btnN.setEnabled(true);
				btnX2.setEnabled(true);
				btnX3.setEnabled(true);
				btnXY.setEnabled(true);
				btn1X.setEnabled(true);
				btnRoot.setEnabled(true);
				btnEx.setEnabled(true);
				btnSin.setEnabled(true);
				btnCos.setEnabled(true);
				btnTan.setEnabled(true);
				btnLog.setEnabled(true);
				btnSinh.setEnabled(true);
				btnCosh.setEnabled(true);
				btnTanh.setEnabled(true);
				btnBack.setEnabled(true);
				btnClear.setEnabled(true);
				btnPercent.setEnabled(true);
				textField.setEnabled(true);
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		rdbtnNewRadioButton.setBounds(10, 117, 68, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnOff = new JRadioButton("OFF");
		rdbtnOff.setForeground(new Color(255, 255, 255));
		rdbtnOff.setBackground(new Color(0, 0, 0));
		rdbtnOff.setSelected(true);
		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				btn0.setEnabled(false);
				btnDot.setEnabled(false);
				btnAdd.setEnabled(false);
				btnSub.setEnabled(false);
				btnMul.setEnabled(false);
				btnDivide.setEnabled(false);
				btnEqual.setEnabled(false);
				btnPlusMinus.setEnabled(false);
				btnN.setEnabled(false);
				btnX2.setEnabled(false);
				btnX3.setEnabled(false);
				btnXY.setEnabled(false);
				btn1X.setEnabled(false);
				btnRoot.setEnabled(false);
				btnEx.setEnabled(false);
				btnSin.setEnabled(false);
				btnCos.setEnabled(false);
				btnTan.setEnabled(false);
				btnLog.setEnabled(false);
				btnSinh.setEnabled(false);
				btnCosh.setEnabled(false);
				btnTanh.setEnabled(false);
				btnBack.setEnabled(false);
				btnClear.setEnabled(false);
				btnPercent.setEnabled(false);
				textField.setText("");
				textField.setEnabled(false);
			}
		});
		buttonGroup.add(rdbtnOff);
		rdbtnOff.setFont(new Font("Tahoma", Font.BOLD, 18));
		rdbtnOff.setBounds(89, 117, 68, 21);
		contentPane.add(rdbtnOff);
	}
}
