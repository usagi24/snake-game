package snake_game;

import javax.swing.JFrame;

public class gameframe extends JFrame{

	gameframe(){
		this.add(new gamepanel());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null); // to appear the window in the middle of the screen
	}
}
