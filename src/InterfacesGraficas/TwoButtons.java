package InterfacesGraficas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class TwoButtons {

	JFrame frame;
	JLabel label;

	public static void main(String[] args) {
		TwoButtons gui = new TwoButtons();
		gui.go();
	}

	public void go() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton labelButton = new JButton("Change Label");
		labelButton.addActionListener(new LabelButtonListener());

		JButton colorButton = new JButton("Change Circle");
		colorButton.addActionListener(new ColorButtonListener());

		label = new JLabel("MENSAJE OCULTO!!!!");
		MyDrawPanel drawPanel = new MyDrawPanel();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
							.addComponent(label)
							.addComponent(labelButton))
						.addComponent(colorButton))
					.addGap(61)
					.addComponent(drawPanel, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
					.addGap(76))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(drawPanel, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addGap(29)
							.addComponent(labelButton, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(colorButton, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)))
					.addGap(35))
		);
		frame.getContentPane().setLayout(groupLayout);

		frame.setSize(420, 300);
		frame.setVisible(true);
	}

	class LabelButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			label.setText("HOLA A TODOS!!!!");
		}
	} // close inner class

	class ColorButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			frame.repaint();
		}
	} // close inner class

}

class MyDrawPanel extends JPanel {

	public void paintComponent(Graphics g) {

		g.fillRect(0, 0, this.getWidth(), this.getHeight());

		// make random colors to fill with
		int x = (int) (Math.random() * 255);
		int y = (int) (Math.random() * 255);
		int z = (int) (Math.random() * 255);

		Color randomColor = new Color(x, y, z);
		g.setColor(randomColor);
		g.fillOval(70, 70, 100, 100);
	}

}
