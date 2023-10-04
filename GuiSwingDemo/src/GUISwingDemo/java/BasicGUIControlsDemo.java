package GUISwingDemo.java;

import java.awt.Color;

import javax.swing.*;
import javax.swing.border.*;//package for border design

//JLabel, JTextField, Border, JPasswordField,
//JCheckBox, JComboBox, JSlider, JScrollPane, JList, JButton,
//JRadioButton, ButtonGroup, JTextArea;



public class BasicGUIControlsDemo extends JFrame {
	JLabel lblusername, lblpassword;	//labeling the text name
	JTextField txtusername;		//creating a textfield where we can have our input
	JPasswordField password;	//similar to textfield but the text is hidden
	JTextArea message;			//text writing section for more content 
	JCheckBox cbsinging, cbdancing, cbcoding;	//to choose multiple options
	JRadioButton rbmale, rbfemale;		//select one option from multiple choice
	ButtonGroup bg;			//used to select only one option for JRadioButton
	JButton btnsubmit;		//make a button like structure
	
	public BasicGUIControlsDemo() {
		lblusername = new JLabel("UserName:- ");
		add(lblusername).setBounds(20,20,100,20);
		lblusername.setBorder(new BevelBorder(BevelBorder.LOWERED));
		
		txtusername = new JTextField();
		add(txtusername).setBounds(120,20,100,20);
		
		lblpassword = new JLabel("Password");
		add(lblpassword).setBounds(20,60,100,20);
		
		password = new JPasswordField();
		add(password).setBounds(120,60,100,20);
		
		message = new JTextArea(10,20);
		add(message).setBounds(20,100,100,50);
		
		cbsinging = new JCheckBox("Singing");
		add(cbsinging).setBounds(20,160,100,20);
		
		cbdancing = new JCheckBox("Dancing");
		add(cbdancing).setBounds(120,160,100,20);
		
		cbcoding = new JCheckBox("Coding");
		add(cbcoding).setBounds(220,160,100,20);
		
		rbmale = new JRadioButton("Male");
		add(rbmale).setBounds(20,200,100,20);
		
		rbfemale = new JRadioButton("Female");
		add(rbfemale).setBounds(120,200,100,20);
		
		bg = new ButtonGroup();
		bg.add(rbmale);
		bg.add(rbfemale);
		
		String categories[]= {"","Business","IT","Marketing","Design","Finance"};
		JComboBox cb = new JComboBox(categories);
		add(cb).setBounds(20,240,100,20);
		
		JSlider sl = new JSlider();
		add(sl).setBounds(20,280,100,20);
		
		String education[] = {"Intermediate","Bachelor","Masters","PHD"};
		JList mylist = new JList(education);
		JScrollPane sp = new JScrollPane(mylist);
		add(sp).setBounds(20,320,100,20);
		
		btnsubmit = new JButton("Submit");
		add(btnsubmit).setBounds(20,360,100,20);
		
		setSize(600,600);
		setTitle("GUIAPPLICATION");
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new BasicGUIControlsDemo();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
