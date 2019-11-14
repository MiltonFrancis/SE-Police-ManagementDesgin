package lockup;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class MainView {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainView window = new MainView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 785, 560);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAddPrisoner = new JButton("Add Prisoner");
		btnAddPrisoner.setBounds(567, 34, 173, 23);
		frame.getContentPane().add(btnAddPrisoner);
		
		JButton btnAddCaseFile = new JButton("Add Case File");
		btnAddCaseFile.setBounds(567, 68, 173, 23);
		frame.getContentPane().add(btnAddCaseFile);
		
		JButton btnAddExhibit = new JButton("Add Exhibit");
		btnAddExhibit.setBounds(567, 102, 173, 23);
		frame.getContentPane().add(btnAddExhibit);
		
		JButton btnAddPrisonerProperty = new JButton("Add Prisoner Property");
		btnAddPrisonerProperty.setBounds(567, 136, 173, 23);
		frame.getContentPane().add(btnAddPrisonerProperty);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(297, 444, -23, -406);
		frame.getContentPane().add(scrollPane);
		
		JButton btnNewButton = new JButton("Update Prisoner Record");
		btnNewButton.setBounds(567, 168, 173, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnUpdateCaseFile = new JButton("Update Case File");
		btnUpdateCaseFile.setBounds(567, 202, 173, 23);
		frame.getContentPane().add(btnUpdateCaseFile);
		
		JButton btnUpdateExhibits = new JButton("Update Exhibits");
		btnUpdateExhibits.setBounds(567, 236, 173, 23);
		frame.getContentPane().add(btnUpdateExhibits);
		
		JButton btnUpdatePriosnerProperty = new JButton("View Prisoner Records");
		btnUpdatePriosnerProperty.setBounds(567, 270, 173, 23);
		frame.getContentPane().add(btnUpdatePriosnerProperty);
		
		JButton btnViewCaseFiles = new JButton("View Case Files");
		btnViewCaseFiles.setBounds(567, 304, 173, 23);
		frame.getContentPane().add(btnViewCaseFiles);
		
		JButton btnViewPrisonerProperties = new JButton("View Prisoner Properties");
		btnViewPrisonerProperties.setBounds(567, 338, 173, 23);
		frame.getContentPane().add(btnViewPrisonerProperties);
		
		JButton btnViewExhibits = new JButton("View Exhibits");
		btnViewExhibits.setBounds(567, 374, 173, 23);
		frame.getContentPane().add(btnViewExhibits);
		
		JTextArea txtrDisplayscreen = new JTextArea();
		txtrDisplayscreen.setText("Displayscreen");
		txtrDisplayscreen.setBounds(22, 69, 535, 438);
		frame.getContentPane().add(txtrDisplayscreen);
		
		textField = new JTextField();
		textField.setBounds(517, 35, 40, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblSearchExhibit = new JLabel("Search Exhibit:");
		lblSearchExhibit.setBounds(435, 38, 72, 14);
		frame.getContentPane().add(lblSearchExhibit);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(385, 35, 40, 20);
		frame.getContentPane().add(textField_1);
		
		JLabel lblSearchPrisonerPoperty = new JLabel("Search Prisoner Poperty");
		lblSearchPrisonerPoperty.setBounds(269, 38, 106, 14);
		frame.getContentPane().add(lblSearchPrisonerPoperty);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(219, 35, 40, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(107, 35, 40, 20);
		frame.getContentPane().add(textField_3);
		
		JLabel lblSearchCase = new JLabel("Search Case:");
		lblSearchCase.setBounds(152, 38, 72, 14);
		frame.getContentPane().add(lblSearchCase);
		
		JLabel lblSearchPrisoner = new JLabel("Search Prisoner:");
		lblSearchPrisoner.setBounds(22, 38, 91, 14);
		frame.getContentPane().add(lblSearchPrisoner);
	}
}
