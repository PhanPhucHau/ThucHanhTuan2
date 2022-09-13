package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.event.*;
import java.awt.*;

public class Gui_Sender extends JFrame implements ActionListener{
	private JButton btnOK;
	private JTextArea textArea;
	
	public Gui_Sender() {
		// TODO Auto-generated constructor stub
		
		JPanel jp = new JPanel();
		JPanel jp2 = new JPanel();
		JButton btnOK = new JButton("Ok");
		JTextArea textArea = new JTextArea(12,20);
		jp.add(btnOK);
		jp.add(textArea);
		add(textArea , BorderLayout.CENTER);
		add(jp , BorderLayout.SOUTH);
		
		setTitle("Gui_Sender");
		setSize(600,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Gui_Sender();
	}
	
	

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	

}
