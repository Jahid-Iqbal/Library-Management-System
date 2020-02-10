package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Centre extends JFrame implements ActionListener{
	
	
	JMenuBar bar;
	
	JMenu library,help,admin;
	
	JMenuItem bookList,memberList,borrowBook,addBook,addMember,deleteBook,cancelMembership,modifyInformation,howToBorrow,howToGetMembership,aboutLibrary;
	
	JLabel bookName,author;
	JTextField bookNameField,authorField;
	JButton search,exit;
	
	public Centre(){
		
		bar=new JMenuBar();
		
		library=new JMenu("Library");
		help=new JMenu("Help");
		
		admin=new JMenu("Admin");
		bookList=new JMenuItem("Book List");
		memberList=new JMenuItem("Member List");
		borrowBook=new JMenuItem("Borrow Books");
		addBook=new JMenuItem("Add Books");
		addMember=new JMenuItem("Add Members");
		deleteBook=new JMenuItem("Delete book");
		cancelMembership=new JMenuItem("Cancel Membership");
		modifyInformation=new JMenuItem("Modify Information");
		
		howToBorrow=new JMenuItem("How To Borrow");
		howToGetMembership=new JMenuItem("How To Get Membership");
		aboutLibrary=new JMenuItem("About Library");
		
		bookName=new JLabel("Book Name");
		author=new JLabel("Author");
		bookNameField=new JTextField();
		authorField=new JTextField();
		search=new JButton("Search");
		exit=new JButton("Exit");
		
		
		
	}
	

	public void initCentre(){
		
		
		super.setJMenuBar(bar);
		
		bar.add(library);
		bar.add(help);
		
		library.add(admin);
		library.add(bookList);
		library.add(memberList);
		library.add(borrowBook);
		
		admin.add(addBook);
		admin.add(addMember);
		admin.add(deleteBook);
		admin.add(cancelMembership);
		admin.add(modifyInformation);
		
		help.add(howToBorrow);
		help.add(howToGetMembership);
		help.add(aboutLibrary);
		
		GridLayout g=new GridLayout(3,2,10,10);
		super.setLayout(g);
		
		super.add(bookName);
		super.add(bookNameField);
		super.add(author);
		super.add(authorField);
		super.add(search);
		super.add(exit);
		
		
	}
	
	
	public void screenCentre(){
		
		initCentre();
		
		super.setSize(600,600);
		super.setLocation(200,200);
		super.setDefaultCloseOperation(super.EXIT_ON_CLOSE);
		super.setVisible(true);
		
		
		
	}

	public void actionPerformed(ActionEvent e){
		
		if(e.getSource()==exit){
			
			super.dispose();
		}
		
		else if(e.getSource()==addBook){
			
			AddBooks ab=new AddBooks();
			ab.screenBooks();
		}
		
		else if(e.getSource()==addMember){
	
			AddMembers am=new AddMembers();
			am.screenMembers();
		
		
	}
			
	}
	
	
	
}
