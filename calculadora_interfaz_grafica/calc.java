package calculadora_interfaz_grafica;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.EventQueue;
import javax.swing.SwingConstants;

public class calc {

	private JFrame frame;
	private JTextField resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calc window = new calc();
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
	public calc() {
		initialize();
	}
	
	float numero1;
	float numero2;
	float total;
	String operacion;
	
	JPanel panel = new JPanel();

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				resultado.setText(resultado.getText()+"7");
			}
		});
		button7.setBounds(33, 86, 89, 23);
		frame.getContentPane().add(button7);
		
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				resultado.setText(resultado.getText()+"8");
			}
		});
		button8.setBounds(132, 86, 89, 23);
		frame.getContentPane().add(button8);
		
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				resultado.setText(resultado.getText()+"9");
			}
		});
		button9.setBounds(234, 86, 89, 23);
		frame.getContentPane().add(button9);
		
		JButton button_resta = new JButton("-");
		button_resta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String cadena;
				cadena = resultado.getText();
				if(cadena.length()<=0)
				{	
				}else
				{
					operacion="-";
					numero1 = Float.parseFloat(resultado.getText());
					resultado.setText("");
				}
			}
		});
		button_resta.setBounds(335, 86, 89, 23);
		frame.getContentPane().add(button_resta);
		
		JButton button_suma = new JButton("+");
		button_suma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String cadena;
				cadena = resultado.getText();
				
				if(cadena.length()<=0)
				{
				}else
				{
					operacion="+";
					numero1 = Float.parseFloat(resultado.getText());
					resultado.setText("");
				}
			}
		});
		button_suma.setBounds(335, 120, 89, 23);
		frame.getContentPane().add(button_suma);
		
		JButton button_multiplicacion = new JButton("*");
		button_multiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String cadena;
				cadena = resultado.getText();
				if(cadena.length()<=0)
				{	
				}else
				{
					operacion="*";
					numero1 = Float.parseFloat(resultado.getText());
					resultado.setText("");
				}
			}
		});
		button_multiplicacion.setBounds(335, 162, 89, 23);
		frame.getContentPane().add(button_multiplicacion);
		
		JButton button_division = new JButton("/");
		button_division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String cadena;
				cadena = resultado.getText();
				if(cadena.length()<=0)
				{
				}else
				{
					operacion="/";
					numero1 = Float.parseFloat(resultado.getText());
					resultado.setText("");
				}
			}
		});
		button_division.setBounds(335, 202, 89, 23);
		frame.getContentPane().add(button_division);
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				resultado.setText(resultado.getText()+"6");
			}
		});
		button6.setBounds(234, 120, 89, 23);
		frame.getContentPane().add(button6);
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				resultado.setText(resultado.getText()+"5");
			}
		});
		button5.setBounds(135, 120, 89, 23);
		frame.getContentPane().add(button5);
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				resultado.setText(resultado.getText()+"3");
			}
		});
		button3.setBounds(234, 162, 89, 23);
		frame.getContentPane().add(button3);
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				resultado.setText(resultado.getText()+"2");
			}
		});
		button2.setBounds(135, 162, 89, 23);
		frame.getContentPane().add(button2);
		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				resultado.setText(resultado.getText()+"4");
			}
		});
		button4.setBounds(33, 120, 89, 23);
		frame.getContentPane().add(button4);
		
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				resultado.setText(resultado.getText()+"1");
			}
		});
		button1.setBounds(33, 162, 89, 23);
		frame.getContentPane().add(button1);
		
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				resultado.setText(resultado.getText()+"0");
			}
		});
		button0.setBounds(33, 202, 89, 23);
		frame.getContentPane().add(button0);
		
		JButton button_igual = new JButton("=");
		button_igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String cadena;
				cadena = resultado.getText();
				
				if(cadena.length()<=0)
				{
					
					
				}else
				{
					String cadena2;
					cadena2 = resultado.getText();
					if(cadena2.length()<=0)
					{
						
					}else {
						numero2 = Float.parseFloat(resultado.getText());
						resultado.setText("");
						switch(operacion)
						{
						case "+":
							total = numero1 + numero2;
							resultado.setText(String.valueOf(total));
							break;
						case "-":
							total = numero1 - numero2;
							resultado.setText(String.valueOf(total));
							break;
						case "*":
							total = numero1 * numero2;
							resultado.setText(String.valueOf(total));
						case "/":
							if(numero1 == 0)
							{
								resultado.setText("Error");
							}else {
								total = numero1 / numero2;
								resultado.setText(String.valueOf(total));
							}
							break;
						}
					}
					
				}
				
			}
		});
		button_igual.setBounds(135, 202, 89, 23);
		frame.getContentPane().add(button_igual);
		
		JLabel label = new JLabel("");
		label.setBounds(31, 11, 46, 14);
		frame.getContentPane().add(label);
		
		JButton c = new JButton("c");
		c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				resultado.setText("");
			}
		});
		c.setBounds(234, 202, 89, 23);
		frame.getContentPane().add(c);
		
		resultado = new JTextField();
		resultado.setHorizontalAlignment(SwingConstants.RIGHT);
		resultado.setEditable(false);
		resultado.setColumns(10);
		resultado.setBounds(33, 11, 290, 49);
		frame.getContentPane().add(resultado);
	}
}
