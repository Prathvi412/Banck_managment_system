    
package banck_managment;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class Signupthree extends JFrame implements ActionListener{
    
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno;
    
    Signupthree(String formno){
        
        this.formno=formno;
        setLayout(null);
        
          setSize(850,820);
        setLocation(350,0);
        setTitle("Page 3: Account Detailas ");
        setVisible(true);
        
        JLabel l1=new JLabel("Page 3: Accound Details");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280, 20, 400, 40);
        add(l1);
         
         JLabel type=new JLabel("Accound Details");
        type.setFont(new Font("Raleway",Font.BOLD,22));
        type.setBounds(100, 100, 200, 30);
        add(type);
        
        r1=new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBounds(100,150,200,20);
        r1.setBackground(Color.WHITE);
        add(r1);
        
         r2=new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBounds(350,150,250,22);
        r2.setBackground(Color.WHITE);
        add(r2);
         r3=new JRadioButton("current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBounds(100,190,200,22);
        r3.setBackground(Color.WHITE);
        add(r3);
         r4=new JRadioButton("Recurring Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBounds(350,190,250,22);
        r4.setBackground(Color.WHITE);
        add(r4);
        
        ButtonGroup groupaccount =new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);
        
        JLabel card=new JLabel("Card Number:");
        card.setFont(new Font("Raleway",Font.BOLD,22));
        card.setBounds(100, 250, 200, 30);
        add(card);
         JLabel number=new JLabel("xxxx-xxxx-xxxx-4184");
        number.setFont(new Font("Raleway",Font.BOLD,22));
        number.setBounds(330, 250, 300, 30);
        add(number);
        JLabel carddetails=new JLabel("Your 16 Digit Card Number");
        carddetails.setFont(new Font("Raleway",Font.BOLD,12));
        carddetails.setBounds(100, 280, 300, 20);
        add(carddetails);
          JLabel pin=new JLabel("PIN:");
        pin.setFont(new Font("Raleway",Font.BOLD,22));
        pin.setBounds(100, 320, 300, 30);
        add(pin);
          JLabel pinno=new JLabel("xxxx");
        pinno.setFont(new Font("Raleway",Font.BOLD,22));
        pinno.setBounds(330, 320, 300, 30);
        add(pinno);
        JLabel pindetails=new JLabel("Your 4 Digit PIN ");
        pindetails.setFont(new Font("Raleway",Font.BOLD,12));
        pindetails.setBounds(100, 350, 300, 20);
        add(pindetails);
        
        JLabel services=new JLabel("Required Services:");
        services.setFont(new Font("Raleway",Font.BOLD,22));
        services.setBounds(100, 380, 400, 30);
        add(services);
      
        c1=new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,420 , 200, 30);
        add(c1);
          c2=new JCheckBox("Internet Bancking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350,420 , 200, 30);
        add(c2);
          c3=new JCheckBox("MObile  Bancking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,460 , 200, 30);
        add(c3);
          c4=new JCheckBox("Email and SMS Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,460 , 200, 30);
        add(c4);
          c5=new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100,500 , 200, 30);
        add(c5);
          c6=new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,500 , 200, 30);
        add(c6);
          c7=new JCheckBox("I hereby declares that above entered information is correct");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway",Font.BOLD,16));
        c7.setBounds(100,550 , 600, 30);
        add(c7);
       submit=new JButton("Submit");
       submit.setBackground(Color.BLACK);
       submit.setForeground(Color.WHITE);
       submit.setFont(new Font("Raleway",Font.BOLD,14));
       submit.setBounds(250, 590, 100, 30);
       submit.addActionListener(this);
       add(submit);
       cancel=new JButton("Cancel");
       cancel.setBackground(Color.BLACK);
       cancel.setForeground(Color.WHITE);
       cancel.setFont(new Font("Raleway",Font.BOLD,14));
       cancel.setBounds(420, 590, 100, 30);
       cancel.addActionListener(this);
       add(cancel);

       getContentPane().setBackground(Color.WHITE);
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
            String accountType=null;
            if(r1.isSelected()){
                accountType="Saving Account";
            }else if(r2.isSelected()){
                accountType="Fixed Deposit Account";
            }
            else if(r3.isSelected()){
                accountType="current Account";
            }
            
            else if(r4.isSelected()){
                accountType="Recurring Account";
            }
            
            Random random=new Random();
            String cardnumber=""+Math.abs((random.nextLong()%90000000L) + 5040936000000000L);
            String pinnumber=""+Math.abs((random.nextLong()%9000L) + 1000L);
            String facility="";
            if(c1.isSelected()){
                facility=facility+ "ATM Card";
            }else if(c2.isSelected()){
                facility=facility+ "Internet Bancking";
            }else if(c3.isSelected()){
                facility=facility+ "MObile  Bancking";
            }else if(c4.isSelected()){
                facility=facility+ "Email and SMS Alerts";
            }else if(c5.isSelected()){
                facility=facility+ "Cheque Book";
            }else if(c6.isSelected()){
                facility=facility+ "E-Statement";
            }
            try{
                if(accountType.equals("")){
                    JOptionPane.showMessageDialog(null, "Account Type is  Required");
                }else{
                    conn conn=new conn();
                    String query1="insert into Signupthree values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')"; 
                    String query2="insert into login values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"')"; 

                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);

                    JOptionPane.showMessageDialog(null,"cardnumber:"+cardnumber +"\n Pin:"+pinnumber);
                    setVisible(false);
                    new Deposit(pinnumber).setVisible(false);
                    
                }
                
            }catch(Exception e){
                System.out.println(e);
            }
            
            
        }else if(ae.getSource()==cancel) {
            setVisible(false);
            new Login().setVisible(true);
        }
        
    }
    
    public static void main(String[] args){
        new Signupthree("");
    }

    
}
