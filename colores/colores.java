package colores;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import javax.swing.SwingConstants;

import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.*;
import java.awt.*;
import javax.swing.AbstractAction;
import javax.swing.Action;


public class colores {

	private JFrame frame;

	
	JMenuBar barraMenu = new JMenuBar();
	String opcion;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					colores window = new colores();
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
	public colores() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar MenuBar = new JMenuBar();
		frame.setJMenuBar(MenuBar);
		
		JMenu mnColor = new JMenu("Color");
		MenuBar.add(mnColor);
		
		JMenuItem mntmAzul = new JMenuItem("Azul");
		mntmAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frame.getContentPane().setBackground(Color.BLUE);
			}
		});
		mntmAzul.setBackground(Color.BLUE);
		mnColor.add(mntmAzul);

		JMenuItem mntmVerde = new JMenuItem("Verde");
		mntmVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frame.getContentPane().setBackground(Color.GREEN);
			}
		});
		mntmVerde.setBackground(Color.GREEN);
		mnColor.add(mntmVerde);
		
		JMenuItem mntmRojo = new JMenuItem("Rojo");
		mntmRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frame.getContentPane().setBackground(Color.RED);
			}
		});
		mntmRojo.setBackground(Color.RED);
		mnColor.add(mntmRojo);
		

		JMenuItem mntmRESET = new JMenuItem("RESET");
		mntmRESET.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frame.getContentPane().setBackground(Color.white);
			}
		});
		mntmRESET.setBackground(Color.WHITE);
		mnColor.add(mntmRESET);
		
		
		
		
	}
}
