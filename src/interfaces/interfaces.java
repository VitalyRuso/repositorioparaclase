package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;

public class interfaces extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JTextField textField = new JTextField();
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfaces frame = new interfaces();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public interfaces() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 671, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		textField.setBounds(49, 64, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(49, 174, 102, 19);
		contentPane.add(passwordField);
		
		JTextArea txtrAlumno = new JTextArea();
		txtrAlumno.setEnabled(false);
		txtrAlumno.setEditable(false);
		txtrAlumno.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtrAlumno.setText("Alumno");
		txtrAlumno.setBounds(49, 39, 96, 15);
		contentPane.add(txtrAlumno);
		
		JTextArea txtrContrasea = new JTextArea();
		txtrContrasea.setEnabled(false);
		txtrContrasea.setEditable(false);
		txtrContrasea.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtrContrasea.setText("Contraseña");
		txtrContrasea.setBounds(49, 145, 103, 19);
		contentPane.add(txtrContrasea);
		
		JButton btnNewButton = new JButton("Aceptrar");
		btnNewButton.setBounds(49, 231, 85, 21);
		contentPane.add(btnNewButton);
	}
}
