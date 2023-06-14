package com.programacion2.proyecto.fintech.ui;
import com.programacion2.proyecto.fintech.businesslogic.*;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import com.programacion2.proyecto.fintech.businesslogic.usuario;

import java.awt.Color;
import javax.swing.JDesktopPane;
import javax.swing.JCheckBox;

public class Cliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtname;
	private JTextField txtcedula;
	private JTextField txtemail;
	private JTextField txtDireccionCorrespondencia;
	private JTextField txtDireccionResidencia;
	
	
	Connection con = null;
	PreparedStatement pst = null;
	private JTextField txtApellidos;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cliente frame = new Cliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Cliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 588, 620);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel studentDetails = new JLabel("Detalles del Cliente");
		studentDetails.setForeground(Color.BLACK);
		studentDetails.setFont(new Font("Perpetua Titling MT", Font.BOLD, 22));
		
		JLabel lblclientName = new JLabel("Nombre");
		lblclientName.setForeground(Color.BLACK);
		lblclientName.setFont(new Font("Perpetua Titling MT", Font.BOLD, 14));
		
		JLabel entryNumber = new JLabel("Cedula");
		entryNumber.setForeground(Color.BLACK);
		entryNumber.setFont(new Font("Perpetua Titling MT", Font.BOLD, 14));
		
		JLabel emailAddress = new JLabel("Direccion email");
		emailAddress.setForeground(Color.BLACK);
		emailAddress.setFont(new Font("Perpetua Titling MT", Font.BOLD, 14));
		
		JLabel contactNumber = new JLabel("Direccion Correspondencia");
		contactNumber.setForeground(Color.BLACK);
		contactNumber.setFont(new Font("Perpetua Titling MT", Font.BOLD, 14));
		
		txtname = new JTextField();
		txtname.setColumns(10);
		
		txtcedula = new JTextField();
		txtcedula.setColumns(10);
		
		txtemail = new JTextField();
		txtemail.setColumns(10);
		
		txtDireccionCorrespondencia = new JTextField();
		txtDireccionCorrespondencia.setColumns(10);
		
		JLabel homeCity = new JLabel("Direccion Residencia");
		homeCity.setForeground(Color.BLACK);
		homeCity.setFont(new Font("Perpetua Titling MT", Font.BOLD, 14));
		
		JButton submit = new JButton("Crear cliente");
		submit.setForeground(Color.BLACK);
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					String nombre = txtname.getText();
					String apellido = txtApellidos.getText();
					String cedula = txtcedula.getText();
					String email= txtemail.getText();
					String direccionC = txtDireccionCorrespondencia.getText();
					String direccionR = txtDireccionResidencia.getText();
					
					//usuario nuevoCliente = new usuario(cedula, nombre, apellido, email, direccionR, direccionC);
					
					usuario nuevoCliente = new usuario();
					String mensajeAlerta =nuevoCliente.crearNuevoClienteSinNotificaciones(cedula, nombre, apellido, email, direccionR, direccionC);
					
					
					ArrayList<usuario> listadoClientes = new ArrayList<usuario>();
					listadoClientes.add(nuevoCliente);
					JOptionPane.showConfirmDialog(submit, mensajeAlerta);
					
					//usuario nuevoCliente = new usuario(
					//JOptionPane.showMessageDialog(null, "Cliente agregado correctamente :" + nuevoCliente.toString());
					dispose();
					Menu menu = new Menu();
					menu.show();
					
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, ex);
				}
				
			}
		});
		submit.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		txtDireccionResidencia = new JTextField();
		txtDireccionResidencia.setColumns(10);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.GRAY);
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu menu = new Menu();
				menu.show();
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JDesktopPane desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBackground(Color.GRAY);
		
		JDesktopPane desktopPane_2 = new JDesktopPane();
		desktopPane_2.setBackground(Color.GRAY);
		
		JDesktopPane desktopPane_3 = new JDesktopPane();
		desktopPane_3.setBackground(Color.GRAY);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setForeground(Color.BLACK);
		lblApellidos.setFont(new Font("Dialog", Font.BOLD, 14));
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Recibir notificaciones?");
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Si");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(desktopPane, GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(desktopPane_1, GroupLayout.PREFERRED_SIZE, 563, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(desktopPane_2, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
							.addComponent(studentDetails)
							.addGap(137))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(119)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(btnNewButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(submit, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
							.addGap(128))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(43)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(chckbxNewCheckBox))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblclientName, GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
										.addComponent(emailAddress)
										.addComponent(contactNumber)
										.addComponent(homeCity)
										.addComponent(entryNumber)
										.addComponent(lblApellidos, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(txtDireccionResidencia, 247, 247, 247)
										.addComponent(txtemail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
											.addComponent(txtcedula, Alignment.LEADING)
											.addComponent(txtDireccionCorrespondencia, Alignment.LEADING, 242, 242, Short.MAX_VALUE))
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
											.addComponent(txtname, Alignment.LEADING)
											.addComponent(txtApellidos, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)))
									.addGap(34)))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(desktopPane_3, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
					.addGap(18))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(desktopPane, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(studentDetails)
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblclientName, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtname, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblApellidos, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtApellidos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(8)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtcedula, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(entryNumber))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtemail, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addComponent(emailAddress))
							.addGap(37)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(contactNumber)
								.addComponent(txtDireccionCorrespondencia, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
							.addGap(41)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtDireccionResidencia, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addComponent(homeCity))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(chckbxNewCheckBox))
							.addGap(9)
							.addComponent(submit, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
						.addComponent(desktopPane_2, GroupLayout.PREFERRED_SIZE, 506, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(desktopPane_3, GroupLayout.PREFERRED_SIZE, 506, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGap(13)
					.addComponent(desktopPane_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(6))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
