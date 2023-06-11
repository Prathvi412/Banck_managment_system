
package banck_managment;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;
public class Signupone extends JFrame implements ActionListener{
    
    long random;
    JTextField nameTextField,fnameTextField,dobTextField,emailTextField,stateTextField,pinTextField,addressTextField,cityTextField;
    JButton next;
    JRadioButton male,female,other,marride,unmarride;
     JDateChooser dateChooser;
    
    Signupone(){
        
        setLayout(null);
        Random ran=new Random();
        long random=Math.abs((ran.nextLong()%9000L)+1000L);
        
        JLabel formno=new JLabel("APPLICATION FORM NO. " +random );
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
         JLabel PersonalDeatails =new JLabel("Page 1:PersonalDeatails" );
        PersonalDeatails.setFont(new Font("Raleway",Font.BOLD,22));
      PersonalDeatails.setBounds(140,80,600,40);
        add(PersonalDeatails);
         JLabel name =new JLabel("Name:" );
        name.setFont(new Font("Raleway",Font.BOLD,20));
      name.setBounds(100,140,100,30);
        add(name);
        
         nameTextField=new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,22));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
        
        
        JLabel fname =new JLabel("father name:" );
        fname.setFont(new Font("Raleway",Font.BOLD,20));
      fname.setBounds(100,190,200,30);
        add(fname);
          fnameTextField=new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.BOLD,22));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);
        
          JLabel dob =new JLabel("Date Of birth:" );
        dob.setFont(new Font("Raleway",Font.BOLD,20));
      dob.setBounds(100,240,200,30);
        add(dob);
         dateChooser =new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);
        
        
         JLabel gender =new JLabel("Gender:" );
        gender.setFont(new Font("Raleway",Font.BOLD,20));
      gender.setBounds(100,290,200,30);
        add(gender);
        
         male=new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);
         female=new JRadioButton("Female");
        female.setBounds(450,290,120,30);
        female.setBackground(Color.WHITE);
        add(female);
        ButtonGroup gendergrooup=new ButtonGroup();
        gendergrooup.add(male);
        gendergrooup.add(female);
                
                
        JLabel email =new JLabel("Email:" );
        email.setFont(new Font("Raleway",Font.BOLD,20));
      email.setBounds(100,340,200,30);
        add(email);
        
          emailTextField=new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.BOLD,22));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);
        
        
        JLabel marital =new JLabel("Marital:" );
        marital.setFont(new Font("Raleway",Font.BOLD,20));
      marital.setBounds(100,390,200,30);
      add(marital);
      
        marride=new JRadioButton("marride");
        marride.setBounds(300,390,100,30);
        marride.setBackground(Color.WHITE);
        add(marride);
         unmarride=new JRadioButton("unmarride");
        unmarride.setBounds(450,390,100,30);
        unmarride.setBackground(Color.WHITE);
        add(unmarride);
          other=new JRadioButton("other");
        other.setBounds(630,390,100,30);
        other.setBackground(Color.WHITE);
        add(other);
        ButtonGroup gendergrooup1=new ButtonGroup();
        gendergrooup1.add(marride);
        gendergrooup1.add(unmarride);
        gendergrooup1.add(other);
        
         JLabel address =new JLabel("Address:" );
        address.setFont(new Font("Raleway",Font.BOLD,20));
      address.setBounds(100,440,200,30);
        add(address);
        
          addressTextField=new JTextField();
        addressTextField.setFont(new Font("Raleway",Font.BOLD,22));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);
        
         JLabel city =new JLabel("City:" );
        city.setFont(new Font("Raleway",Font.BOLD,20));
      city.setBounds(100,490,200,30);
        add(city);
        
          cityTextField=new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.BOLD,22));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);
        
        
         JLabel state =new JLabel("State:" );
        state.setFont(new Font("Raleway",Font.BOLD,20));
      state.setBounds(100,540,200,30);
        add(state);
          stateTextField=new JTextField();
        stateTextField.setFont(new Font("Raleway",Font.BOLD,22));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);
        
          JLabel pin =new JLabel("pin:" );
        pin.setFont(new Font("Raleway",Font.BOLD,20));
      pin.setBounds(100,590,200,30);
        add(pin);
        
          pinTextField=new JTextField();
        pinTextField.setFont(new Font("Raleway",Font.BOLD,22));
        pinTextField.setBounds(300,590,400,30);
        add(pinTextField);
        
         
         next =new JButton("next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
         next.setFont(new Font("Raleway",Font.BOLD,14));
         next.setBounds(620,630,80,30);
         next.addActionListener(this);
         add(next);
        
        
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        
        
       
    }
 public void actionPerformed(ActionEvent ae){
            
            String formno="" +random;
            String name=nameTextField.getText();
            String fname=nameTextField.getText();
            String dob=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
            String gender=null;
            if(male.isSelected()){
                gender="Male";
            }else if(female.isSelected()){
                gender="Female";
            }
            
            String email=emailTextField.getText();
            
            String marital=null;
            if(marride.isSelected()){
                marital="marride";
            }else if(unmarride.isSelected()){
                marital="unmarride";
                
            }else if(other.isSelected()){
                marital="other";
            }
             String address=addressTextField.getText();
              String city=cityTextField.getText();
               String state=stateTextField.getText();
                String pin=pinTextField.getText();
                
                try{
                    if(name.equals("")){
                        JOptionPane.showMessageDialog(null,"Name is Required ");
                    }else{
                        conn c =new conn();
                        String query="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
                        c.s.executeUpdate(query);
                        
                        setVisible(false);
                        new Signuptwo(formno).setVisible(true);
                    }
                    
                }catch(Exception e){
                   System.out.println(e);
                }
            
        }
    public static void main(String [] args){
    new Signupone();
 }  
}
