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
		
		JButton btnNewButton = new JButton("Salir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
									.addComponent(label)
									.addComponent(labelButton))
								.addComponent(btnNewButton))
							.addGap(64))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(colorButton)
							.addGap(31)))
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
							.addGap(12)
							.addComponent(colorButton, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton)))
					.addGap(35))
		);
		frame.getContentPane().setLayout(groupLayout);

		frame.setSize(420, 300);
		frame.setVisible(true);
	}

	class LabelButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			label.setText("Hola Programacion 2");
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

		Color randomColor = new Color(Color.BLUE.getBlue(), Color.BLUE.getBlue(), Color.BLUE.getBlue());
		g.setColor(Color.BLUE);
		g.fillOval(70, 70, 100, 100);
	}

}
