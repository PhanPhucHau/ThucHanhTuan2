package gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Gui_Receiver extends JFrame implements ActionListener {	
	private JPanel jp;
	private JTextArea textArea;
	private JButton btnOk;

	private static final long serialVersionUID = 1L;
	
	public Gui_Receiver() {
		
		jp = new JPanel();
		JTextArea textArea = new JTextArea(12,20);
		JButton btnOk = new JButton("Ok");
		jp.add(btnOk);
		add(textArea, BorderLayout.CENTER);
		add(jp, BorderLayout.SOUTH);
		btnOk.addActionListener(this);
		
		this.setTitle("Gui_Receiver");
		this.setSize(600, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
	    
	    
	}
	
	

	public void actionPerformed(ActionEvent e) {

		Object obj = e.getSource();
		if(obj.equals(btnOk)) {
			try {
				String mess = textArea.getText().toString();
				TopicPublisher.main(mess);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		new Gui_Receiver().setVisible(true);
	}
	
}
