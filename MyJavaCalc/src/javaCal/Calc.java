package javaCal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JTextField;
import java.awt.ComponentOrientation;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Font;

public class Calc {

	private JFrame frame;
	private JTextField display;
 String aim;
 double fn, sn;
 double result;
 String temp;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calc() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(192, 192, 192));
		frame.setBackground(new Color(128, 128, 128));
		frame.setResizable(false);
		frame.setBounds(100, 100, 411, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(new Color(175, 238, 238));
		panel.setBounds(31, 21, 349, 425);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		display = new JTextField();
		display.setFont(new Font("Tahoma", Font.BOLD, 16));
		display.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		display.setBounds(0, 0, 349, 104);
		panel.add(display);
		display.setColumns(10);
		
		JButton seven = new JButton("7");
		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(display.getText()!= null){
					display.setText(display.getText().toString() + "7");
				}
					
					else
					{
						display.setText("7");
						}
				}
			}
		);
		seven.setBackground(new Color(255, 215, 0));
		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		seven.setBounds(0, 178, 91, 23);
		panel.add(seven);
		
		JButton eight = new JButton("8");
		eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(display.getText()!= null){
					display.setText(display.getText().toString() + "8");
				}
					
					else
					{
						display.setText("8");
						}
				}
			}
		);
		eight.setBackground(new Color(255, 215, 0));
		eight.setBounds(98, 178, 91, 23);
		panel.add(eight);
		
		JButton nine = new JButton("9");
		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(display.getText()!= null){
					display.setText(display.getText().toString() + "9");
				}
					
					else
					{
						display.setText("9");
						}
				}
			}
		);
		nine.setBackground(new Color(255, 215, 0));
		nine.setBounds(199, 178, 91, 23);
		panel.add(nine);
		
		JButton four = new JButton("4");
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(display.getText()!= null){
					display.setText(display.getText().toString() + "4");
				}
					
					else
					{
						display.setText("4");
						}
				}
			}
		);
		four.setBackground(new Color(255, 215, 0));
		four.setBounds(0, 226, 91, 23);
		panel.add(four);
		
		JButton five = new JButton("5");
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(display.getText()!= null){
					display.setText(display.getText().toString() + "5");
				}
					
					else
					{
						display.setText("5");
						}
				}
			}
		);
		five.setBackground(new Color(255, 215, 0));
		five.setBounds(98, 226, 91, 23);
		panel.add(five);
		
		JButton six = new JButton("6");
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(display.getText()!= null){
					display.setText(display.getText().toString() + "6");
				}
					
					else
					{
						display.setText("6");
						}
				}
			}
		);
		six.setBackground(new Color(255, 215, 0));
		six.setBounds(199, 226, 91, 23);
		panel.add(six);
		
		JButton one = new JButton("1");
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(display.getText()!= null){
					display.setText(display.getText().toString() + "1");
				}
					
					else
					{
						display.setText("1");
						}
				}
			}
		);
		one.setBackground(new Color(255, 215, 0));
		one.setBounds(0, 280, 91, 23);
		panel.add(one);
		
		JButton two = new JButton("2");
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(display.getText()!= null){
					display.setText(display.getText().toString() + "2");
				}
					
					else
					{
						display.setText("2");
						}
				}
			}
		);
		two.setBackground(new Color(255, 215, 0));
		two.setBounds(98, 280, 91, 23);
		panel.add(two);
		
		JButton three = new JButton("3");
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(display.getText()!= null){
					display.setText(display.getText().toString() + "3");
				}
					
					else
					{
						display.setText("3");
						}
				}
			}
		);
		three.setBackground(new Color(255, 215, 0));
		three.setBounds(199, 280, 91, 23);
		panel.add(three);
		
		JButton clr = new JButton("C");
		clr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(display.getText()!= null){
					display.setText(" ");
					sn=0;
					fn=0;
					result = 0;
					
				}
					
				
				}
			}
		);
		clr.setBackground(new Color(255, 215, 0));
		clr.setBounds(10, 123, 290, 33);
		panel.add(clr);
		
		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  
				fn = Double.parseDouble(display.getText());
			
				display.setText(" ");
				aim = "addition";
				
			}
		});
		plus.setBackground(new Color(0, 153, 102));
		plus.setBounds(0, 359, 134, 23);
		panel.add(plus);
		
		JButton divide = new JButton("/");
		divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				 
				fn = Double.parseDouble(display.getText());
				display.setText(" ");
				aim="division";
				
				
				
			}
		});
		divide.setBackground(new Color(0, 153, 102));
		divide.setBounds(0, 391, 134, 23);
		panel.add(divide);
		
		JButton minus = new JButton("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				fn = Double.parseDouble(display.getText());
				display.setText(" ");
				aim="substraction";
				
				
			}
		});
		minus.setBackground(new Color(0, 153, 102));
		minus.setBounds(151, 359, 128, 23);
		panel.add(minus);
		
		JButton multiply = new JButton("*");
		multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fn = Double.parseDouble(display.getText());
				display.setText(" ");
				aim="multiplication";
				
			}
		});
		multiply.setBackground(new Color(0, 153, 102));
		multiply.setBounds(151, 391, 128, 23);
		panel.add(multiply);
		
		JButton equals = new JButton("=");
		equals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				sn = Double.parseDouble(display.getText());
				if(aim.equals("addition"))
				{
					 result = fn + sn;
					 temp = Double.toString(result);
					display.setText(temp);
					}
			
				else if(aim.equals("substraction")) {
					sn = Double.parseDouble(display.getText());
					result = fn-sn;
					temp = Double.toString(result);
					display.setText(temp);
				}
				
else if(aim.equals("multiplication")) {
	sn = Double.parseDouble(display.getText());			
	result = fn*sn;	
	temp = Double.toString(result);
	display.setText(temp);
	}
else if (aim.equals("division")){
	sn = Double.parseDouble(display.getText());			
	result = fn/sn;	
	temp = Double.toString(result);
	display.setText(temp);
	}
			}
		}); 
		equals.setBackground(new Color(0, 153, 102));
		equals.setBounds(300, 178, 49, 235);
		panel.add(equals); 
		
		 JButton zero = new JButton("0");
		zero.setBackground(new Color(255, 215, 0));
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(display.getText()!=null){
					display.setText(display.getText().toString() + "0");
				}
					
					else 
					{
						display.setText("0");
					}
					
				}
				
			}
		);
		zero.setBounds(98, 325, 91, 23);
		panel.add(zero);
		
		JButton decimal = new JButton(".");
		decimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(display.getText()!=null){
					display.setText(display.getText().toString() + ".");
				}
					
					else 
					{
						display.setText(".");
					}
			}
		});
		decimal.setBackground(Color.ORANGE);
		decimal.setBounds(199, 325, 91, 23);
		panel.add(decimal);
	}
}