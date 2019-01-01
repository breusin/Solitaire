package solitaire.ui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FoundationMain {

	public static void main(String[] args) throws IOException {
		
		JFrame jframe = new JFrame();
		jframe.setSize(1024,768);
		
		
		
		JPanel contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setLayout(new FlowLayout());
		
		for (int i=0; i < 7; i++) {
			Foundation f = new Foundation();
			contentPane.add(f);
		}
		
		jframe.setContentPane(contentPane);
		jframe.setVisible(true);
	}
}
