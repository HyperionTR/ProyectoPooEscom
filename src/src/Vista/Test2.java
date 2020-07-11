package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Controlador.ConOutput;
import Controlador.Factory;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.util.ArrayList;
import java.util.Calendar;

public class Test2 {

	private JFrame frame;
	private JTextField txtInput;
	private JTextField txtOutput;
	private JButton btnTest;

	/**
	 * Create the application.
	 */
	
	public Test2() {
		initialize();
	}
	
	public JFrame getFrame(){
		return frame;
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{73, 114, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{19, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblTestinput = new JLabel("TestInput:");
		GridBagConstraints gbc_lblTestinput = new GridBagConstraints();
		gbc_lblTestinput.anchor = GridBagConstraints.WEST;
		gbc_lblTestinput.insets = new Insets(0, 0, 5, 5);
		gbc_lblTestinput.gridx = 1;
		gbc_lblTestinput.gridy = 4;
		frame.getContentPane().add(lblTestinput, gbc_lblTestinput);
		
		txtInput = new JTextField();
		GridBagConstraints gbc_txtInput = new GridBagConstraints();
		gbc_txtInput.insets = new Insets(0, 0, 5, 0);
		gbc_txtInput.gridx = 3;
		gbc_txtInput.gridy = 4;
		frame.getContentPane().add(txtInput, gbc_txtInput);
		txtInput.setColumns(10);
		
		JLabel lblTestoutput = new JLabel("TestOutput");
		GridBagConstraints gbc_lblTestoutput = new GridBagConstraints();
		gbc_lblTestoutput.anchor = GridBagConstraints.WEST;
		gbc_lblTestoutput.insets = new Insets(0, 0, 5, 5);
		gbc_lblTestoutput.gridx = 1;
		gbc_lblTestoutput.gridy = 5;
		frame.getContentPane().add(lblTestoutput, gbc_lblTestoutput);
		
		txtOutput = new JTextField();
		txtOutput.setText("Output");
		GridBagConstraints gbc_txtOutput = new GridBagConstraints();
		gbc_txtOutput.insets = new Insets(0, 0, 5, 0);
		gbc_txtOutput.gridx = 3;
		gbc_txtOutput.gridy = 5;
		frame.getContentPane().add(txtOutput, gbc_txtOutput);
		txtOutput.setColumns(10);
		
		btnTest = new JButton("Crear Paciente");
		//ESTE BOTÓN CREA UN PACIENTE DE PRUEBA
		btnTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Factory.crearPaciente(txtInput.getText().toString(), "Test", "Test", "Test", new ArrayList<String>(3), Calendar.getInstance(), txtInput.getText(), "", Factory.getHistoriales().get(0));
				txtOutput.setText(Factory.getPacientes().get(txtInput.getText()).getNombre());
				ConOutput.imprimirInfo();
			}
		});
		GridBagConstraints gbc_btnTest = new GridBagConstraints();
		gbc_btnTest.gridwidth = 3;
		gbc_btnTest.insets = new Insets(0, 0, 0, 5);
		gbc_btnTest.gridx = 1;
		gbc_btnTest.gridy = 6;
		frame.getContentPane().add(btnTest, gbc_btnTest);
		frame.setVisible(true);
	}

}
