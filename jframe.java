



import java.awt.Color;
import java.awt.Dimension;

import java.awt.Font;
// import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.Border;



public class jframe   {
		JFrame frame=new JFrame("CALCULATOR");

		JPanel panel=new JPanel();
		JTextArea textarea=new JTextArea(2,10);
		 
		JButton button1=new JButton("1");
		JButton button2=new JButton("2");
		JButton button3=new JButton("3");
		JButton button4=new JButton("4");
		JButton button5=new JButton("5");
		JButton button6=new JButton("6");
		JButton button7=new JButton("7");
		JButton button8=new JButton("8");
		JButton button9=new JButton("9");
		JButton button0=new JButton("0");
		
		
		JButton buttonadd=new JButton("+");
		JButton buttonsub=new JButton("-");
		JButton buttonmul=new JButton("*");
		JButton buttondiv=new JButton("/");
		JButton buttonclear=new JButton("CLEAR");
		JButton buttondot=new JButton(".");
		JButton buttonequal=new JButton("=");
		
		double number1, number2, result;
		int addc=0, mulc=0, divc=0, subc=0;
		
		void calculator(){
			frame.setSize(340, 450);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
			frame.setResizable(false);
			frame.setLocationRelativeTo(null);
			// frame.pack();


			frame.setTitle("RAVI KISHORE (calculator)");
			// frame.setresizeable(false)
			
			frame.add(panel);
			panel.setBackground(Color.black);
// 			BorderFactory.createLineBorder(Color.RED,12);
			
// 			panel.add(textarea);
			
// 			textarea.setBackground(Color.PINK);
// 			Border tborder= BorderFactory.createLineBorder(Color.CYAN,5);
// 			textarea.setBorder(tborder);
// 			Font font=new Font("arial", Font.BOLD,33);
// 			textarea.setFont(font);
// 			textarea.setForeground(Color.WHITE);
			
// 			textarea.setPreferredSize(new Dimension(300,110));
// 			textarea.setLineWrap(true);
// 			//buttons insert
			
// 			button1.setPreferredSize(new Dimension(100,40));
// //			button1.setIcon(new ImageIcon("C:\\Users\\RAVI\\Desktop\\java\\div1.png"));
// 			button2.setPreferredSize(new Dimension(100,40));
// //			button2.setIcon(new ImageIcon("C:\\Users\\RAVI\\Desktop\\java\\n2.png"));
// 			button3.setPreferredSize(new Dimension(100,40));
// //			button3.setIcon(new ImageIcon("C:\\Users\\RAVI\\Desktop\\java\\n3.png"));
// 			button4.setPreferredSize(new Dimension(100,40));
// //			button4.setIcon(new ImageIcon("C:\\Users\\RAVI\\Desktop\\java\\n4.png"));
// 			button5.setPreferredSize(new Dimension(100,40));
// //			button5.setIcon(new ImageIcon("C:\\Users\\RAVI\\Desktop\\java\\n5.png"));
// 			button6.setPreferredSize(new Dimension(100,40));
// //			button6.setIcon(new ImageIcon("C:\\Users\\RAVI\\Desktop\\java\\n6.png"));
// 			button7.setPreferredSize(new Dimension(100,40));
// //			button7.setIcon(new ImageIcon("C:\\Users\\RAVI\\Desktop\\java\\n7.png"));
// 			button8.setPreferredSize(new Dimension(100,40));
// //			button8.setIcon(new ImageIcon("C:\\Users\\RAVI\\Desktop\\java\\n8.png"));
// 			button9.setPreferredSize(new Dimension(100,40));
// //			button9.setIcon(new ImageIcon("C:\\Users\\RAVI\\Desktop\\java\\n9.png"));
// 			button0.setPreferredSize(new Dimension(100,40));
// //			button0.setIcon(new ImageIcon("C:\\Users\\RAVI\\Desktop\\java\\n0.png"));
			
// 			buttonadd.setPreferredSize(new Dimension(100,40));
// 			buttonmul.setPreferredSize(new Dimension(100,40));
// 			buttonsub.setPreferredSize(new Dimension(100,40));
// 			buttondiv.setPreferredSize(new Dimension(100,40));
// 			buttonclear.setPreferredSize(new Dimension(100,40));
// 			buttondot.setPreferredSize(new Dimension(100,40));
// 			buttonequal.setPreferredSize(new Dimension(100,40));

			
// 			panel.add(button1);
// 			panel.add(button2);
// 			panel.add(button3);
// 			panel.add(button4);
// 			panel.add(button5);
// 			panel.add(button6);
// 			panel.add(button7);
// 			panel.add(button8);
// 			panel.add(button9);
// 			panel.add(button0);
			
// 			panel.add(buttonadd);
// 			panel.add(buttonmul);
// 			panel.add(buttonsub);
// 			panel.add(buttondiv);
// 			panel.add(buttondot);
// 			panel.add(buttonclear);
// 			panel.add(buttonequal);
			
// 			//action on button
			
// 			button1.addActionListener((ActionListener) this);
// 			button2.addActionListener((ActionListener) this);
// 			button3.addActionListener((ActionListener) this);
// 			button4.addActionListener((ActionListener) this);
// 			button5.addActionListener((ActionListener) this);
// 			button6.addActionListener((ActionListener) this);
// 			button7.addActionListener((ActionListener) this);
// 			button8.addActionListener((ActionListener) this);
// 			button9.addActionListener((ActionListener) this);
// 			button0.addActionListener((ActionListener) this);
// 			buttonadd.addActionListener((ActionListener) this);
// 			buttonmul.addActionListener((ActionListener) this);
// 			buttonsub.addActionListener((ActionListener) this);
// 			buttondiv.addActionListener((ActionListener) this);
// 			buttondot.addActionListener((ActionListener) this);
// 			buttonclear.addActionListener((ActionListener) this);
// 			buttonequal.addActionListener((ActionListener) this);
			
			
			
			
			
		}
		// public void actionPerformed(ActionEvent e) {
		// 	Object source=new e.getSource();
		// 	if(e.getSource()==buttonclear) {
		// 		number1=0.0;
		// 		number2=0.0;
				
		// 		textarea.setText(" ");
				
				
		// 	}
		// 	if(e.getSource()==button1) {
		// 		textarea.append("1");
		// 	}
		// 	if(e.getSource()==button2) {
		// 		textarea.append("2");
		// 	}
		// 	if(e.getSource()==button3) {
		// 		textarea.append("3");
		// 	}
		// 	if(e.getSource()==button4) {
		// 		textarea.append("4");
		// 	}
		// 	if(e.getSource()==button5) {
		// 		textarea.append("5");
		// 	}
		// 	if(e.getSource()==button6) {
		// 		textarea.append("6");
		// 	}
		// 	if(e.getSource()==button7) {
		// 		textarea.append("7");
		// 	}
		// 	if(e.getSource()==button8) {
		// 		textarea.append("8");
		// 	}
		// 	if(e.getSource()==button9) {
		// 		textarea.append("9");
		// 	}
		// 	if(e.getSource()==button0) {
		// 		textarea.append("0");
		// 	}
		// 	if(e.getSource()==buttondot) {
		// 		textarea.append(".");
				
		// 	}
		// 	if(e.getSource()==buttonadd) {
		// 		number1=number_reader();
		// 		textarea.setText(" +");
		// 		addc=1;
		// 		divc=0;
		// 		subc=0;
		// 		mulc=0;
		// 	}
			
		// 	if(e.getSource()==buttonsub) {
		// 		number1=number_reader();
		// 		textarea.setText(" -");
		// 		addc=0;
		// 		divc=0;
		// 		subc=1;
		// 		mulc=0;
		// 	}
		// 	if(e.getSource()==buttonmul) {
		// 		number1=number_reader();
		// 		textarea.setText(" *");
		// 		addc=0;
		// 		divc=0;
		// 		subc=0;
		// 		mulc=1;
		// 	}
		// 	if(e.getSource()==buttondiv) {
		// 		number1=number_reader();
		// 		textarea.setText(" /");
		// 		addc=0;
		// 		divc=1;
		// 		subc=0;
		// 		mulc=0;
		// 	}
		// 	if(e.getSource()==buttonequal) {
		// 		number2=number_reader();
		// 		if(addc>0) {
		// 			result=number1+number2;
		// 			textarea.setText(Double.toString(result));
					
		// 		}
		// 		if(subc>0) {
		// 			result=number1-number2;
		// 			textarea.setText(Double.toString(result));
					
		// 		}
		// 		if(mulc>0) {
		// 			result=number1*number2;
		// 			textarea.setText(Double.toString(result));
					
		// 		}
		// 		if(divc>=0) {
		// 			result=number1/number2;
		// 			textarea.setText(Double.toString(result));
					
		// 		}
					
				
		// 	}
			
			
		// }
		// public double number_reader() {
		// 	double num1;
		// 	String s;
		// 	s=textarea.getText();
		// 	num1=Double.valueOf(s);
		// 	return num1;
			
			
			
			
		// }
		public static void main(String[] args) {
			jframe g=new jframe() ;
			g.calculator();
		}
}
			
		
		
		
			
		

		
	


