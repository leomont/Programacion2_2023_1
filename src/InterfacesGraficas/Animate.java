package InterfacesGraficas;

import javax.swing.*;
import java.awt.*;

public class Animate {
	int x = 1;
	int y = 1;

	public static void main(String[] args) {
		Animate gui = new Animate();
		gui.go();
	}

	public void go() {

		JFileChooser jfile = new JFileChooser();

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyDrawP drawP = new MyDrawP();
		frame.getContentPane().add(drawP);
		frame.setSize(500, 270);
		frame.setVisible(true);
		for (int i = 0; i < 124; i++, x++, y++) {
			x++;
			drawP.repaint();
			try {
				Thread.sleep(50);
			} catch (Exception ex) {
			}
		}
	}

	class MyDrawP extends JPanel {
		public void paintComponent(Graphics g) {
			g.setColor(Color.red);
			g.fillRect(0, 0, 500, 250);
			g.setColor(Color.green);
			g.fillRect(x, y, 500 - x * 2, 250 - y * 2);
		}
	}
}