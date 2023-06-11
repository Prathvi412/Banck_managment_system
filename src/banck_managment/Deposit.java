
package banck_managment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Deposit extends JFrame implements ActionListener {
    
    JLabel text;
    JTextField amount;
    JButton deposit,back;
    String pinnumber;
    Deposit(String pinnumber){
    this.pinnumber=pinnumber;
    ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/icons1/atm.jpg"));
      Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
      ImageIcon i3=new ImageIcon(i2);
     JLabel image=new JLabel(i3);
      image.setBounds(0,0,900,900);
      add(image);
      
       text=new JLabel("Enter the amount you want to deposite");
      text.setForeground(Color.WHITE);
      text.setFont(new Font("System",Font.BOLD,16));
      text.setBounds(170,300,400,20);
      image.add(text);
      
       amount =new JTextField();
      amount.setFont(new Font("Ralewy",Font.BOLD,22));
      amount.setBounds(170,350,320,25);
      image.add(amount);
      
       deposit = new JButton("Deposit");
      deposit.setBounds(355,485,150,30);
      deposit.addActionListener(this);
      image.add(deposit);
        back = new JButton("Back");
        back.setBounds(355,525,150,30);
       back.addActionListener(this);
        image.add(back);
        
        
      
      
      
      setSize(900,900);
      setLocation(300,0);
      setVisible(true);
    }
    
    
     
    public void actionPerformed(ActionEvent ae) {
         
        if(ae.getSource()== deposit){
            
        }else if(ae.getSource()== back){
            new Transaction(pinnumber).setVisible(true);
        }

    }
      public static void main(String [] args){
          new Deposit("");
      }

  
}
