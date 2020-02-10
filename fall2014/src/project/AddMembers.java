package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;

public class AddMembers extends JFrame implements ActionListener{

	JLabel name,address,mobile,id;
	
	JTextField nameField,addressField,mobileField,idField;
	
	JButton exit,add;
	
	public AddMembers(){
		
		name=new JLabel("Name");
		address=new JLabel("Address");
		mobile=new JLabel("Mobile");
		id=new JLabel("ID");
		
		nameField=new JTextField();
		addressField=new JTextField();
		mobileField=new JTextField();
		idField=new JTextField();
		
		exit=new JButton("Exit");
		add=new JButton("Add");
		
	}
	
	public void initMembers(){
		
		GridLayout g=new GridLayout(5,2);
		super.setLayout(g);
		

		super.add(name);
		super.add(nameField);
		
		super.add(address);
		super.add(addressField);
		
		super.add(mobile);
		super.add(mobileField);
		
		super.add(id);
		super.add(idField);
		
		super.add(exit);
		super.add(add);
		
		
		add.addActionListener(this);
		exit.addActionListener(this);
		
	}
	
	
	public void screenMembers(){
		
		initMembers();
		
		super.setSize(500,500);
		super.setLocation(100,100);
		super.setDefaultCloseOperation(super.EXIT_ON_CLOSE);
		super.setVisible(true);

		
	}
	
		
	
public void writeMembers(){
	
	try{
		
		FileWriter fw=new FileWriter("D:\\New folder\\fall2014\\addBooks");
		
		fw.write(nameField.getText()+"\n");
		fw.write(addressField.getText()+"\n");
		fw.write(mobileField.getText()+"\n");
		fw.write(idField.getText()+"\n");
		
		fw.close();
		
		
	}
	catch(Exception e){
		
		System.out.print(e);
	}
	
	
}
	

public void actionPerformed(ActionEvent e){
	
	if(e.getSource()==add){
		
		writeMembers();
		
	}
	
	else if(e.getSource()==exit){
		
		super.dispose();
		
	}
	
}

	
}
