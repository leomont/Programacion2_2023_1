import javax.swing.JOptionPane;

public class Calcular {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		double NotaTrimestre1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota trimestre 1"));
		double NotaTrimestre2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota trimestre 2"));
		double NotaFinal=NotaTrimestre1+NotaTrimestre2;
		if (NotaFinal>=7) {
			JOptionPane.showMessageDialog(null, "APRUEBA "+NotaFinal);
		}
		else if (NotaFinal>=5 && NotaFinal<7) {
			JOptionPane.showMessageDialog(null, "HABILITA "+NotaFinal);
		}
		else {
			JOptionPane.showMessageDialog(null, "REPRUEBA "+NotaFinal);
		}
		// TODO Auto-generated method stub

		
	}
}
