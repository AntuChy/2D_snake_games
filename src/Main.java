import java.awt.Color;

import javax.swing.JFrame;


@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {
		JFrame f=new JFrame();
		Gameplay gameplay=new Gameplay();
		f.setTitle("Snake Game");
		f.setBounds(10,10,905,700);
		f.setResizable(false);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBackground(Color.black);
	
		f.add(gameplay);
		
	}

}

