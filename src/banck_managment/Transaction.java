
package banck_managment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Transaction extends JFrame implements ActionListener{
    
    JButton deposite,ministatement,withdraw,fastcash,balanceenquiry,exit,pinchange;
    String pinnumber;
    Transaction(String pinnumber){
        this.pinnumber=pinnumber;
     setLayout(null);
      
      ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/icons1/atm.jpg"));
      Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
      ImageIcon i3=new ImageIcon(i2);
     JLabel image=new JLabel(i3);
      image.setBounds(0,0,900,900);
      add(image);
      
      JLabel text=new JLabel("Please Select Your Transaction ");
      text.setBounds(210,300,700,35);
      text.setForeground(Color.WHITE);
       text.setFont(new Font("System",Font.BOLD,16));
       image.add(text);
        deposite =new JButton("Deposite");
       deposite.setBounds(170,415,150,30);
       deposite.addActionListener(this);
       image.add(deposite);
          withdraw =new JButton("Cash Withdraw");
       withdraw.setBounds(355,415,150,30);
       withdraw.addActionListener(this);
       image.add(withdraw);
          fastcash =new JButton("Fast Cash");
       fastcash.setBounds(170,450,150,30);
       fastcash.addActionListener(this);
       image.add(fastcash);
         ministatement =new JButton("Mini Statement");
       ministatement.setBounds(355,450,150,30);
       ministatement.addActionListener(this);
       image.add(ministatement);
        pinchange =new JButton("Pin Change");
       pinchange.setBounds(170,485,150,30);
       pinchange.addActionListener(this);
       image.add(pinchange);
        balanceenquiry =new JButton("Balance Enquiry");
       balanceenquiry.setBounds(355,485,150,30);
       balanceenquiry.addActionListener(this);
       image.add(balanceenquiry);
        exit =new JButton("Exit");
       exit.setBounds(355,520,150,30);
       exit.addActionListener(this);
       image.add(exit);


      
      
        setSize(800,800);
        setLocation(300,0);
        setVisible(true);
    } 
    
     
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==exit){
            System.exit(0);
        }
    }
    
    
    public static void main(String [] args){
       new Transaction(""); 
    }

   
}
