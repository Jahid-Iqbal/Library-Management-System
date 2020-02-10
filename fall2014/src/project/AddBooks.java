package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;



public class AddBooks extends JFrame implements ActionListener{
	
	JLabel author,subject,title,publisher,edition,isbn,bookId;
	
	JTextField authorField,subjectField,titleField,publisherField,editionField,isbnField,bookIdField;
	
	JButton add,exit;
	
	public AddBooks(){
		
		author=new JLabel("Author");
		subject=new JLabel("Subject");
		title=new JLabel("Title");
		publisher=new JLabel("Publisher");
		edition=new JLabel("Edition");
		isbn=new JLabel("ISBN");
		bookId=new JLabel("Book ID");
		
		add=new JButton("Add");
		exit=new JButton("Exit");
		
		authorField=new JTextField();
		subjectField=new JTextField();
		titleField=new JTextField();
		publisherField=new JTextField();
		editionField=new JTextField();
		isbnField=new JTextField();
		bookIdField=new JTextField();
		
		
	}
	
	public void initialization(){
		
		GridLayout g=new GridLayout(8,2);
		super.setLayout(g);
		
		super.add(subject);
		super.add(subjectField);
		super.add(title);
		super.add(titleField);
		super.add(author);
		super.add(authorField);
		super.add(edition);
		super.add(editionField);
		super.add(isbn);
		super.add(isbnField);
		super.add(bookId);
		super.add(bookIdField);
		super.add(publisher);
		super.add(publisherField);
		
		super.add(exit);
		super.add(add);
		
		add.addActionListener(this);
		exit.addActionListener(this);
		
	}
	
	
	public void screenBooks(){
		
		initialization();
		
		super.setSize(500,500);
		super.setLocation(100,100);
		super.setDefaultCloseOperation(super.EXIT_ON_CLOSE);
		super.setVisible(true);
		
		
		
		
	}
	
	public void writeBooks(){
		
		try{
		
		FileWriter fw=new FileWriter("D:\\New folder\\fall2014\\addBooks",true);
		
		fw.write(subjectField.getText()+"\n");
		fw.write(titleField.getText()+"\n");
		fw.write(authorField.getText()+"\n");
		fw.write(editionField.getText()+"\n");
		fw.write(isbnField.getText()+"\n");
		fw.write(bookIdField.getText()+"\n");
		fw.write(publisherField.getText()+"\n");
		
		fw.close();
		
		}
		catch(Exception e){
			
			System.out.print(e);
		}
		
	}	
	
	public void actionPerformed(ActionEvent e){
		
		
		if(e.getSource()==add){
			
			
			writeBooks();
			
			
		}
		
		else if(e.getSource()==exit){
			
			super.dispose();
		}
		
		
	}
	
}
