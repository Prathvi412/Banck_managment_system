
package banck_managment;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;
public class Signuptwo extends JFrame implements ActionListener{
    
    long random;
    JTextField panTextField,adharTextField;
    JButton next;
    JRadioButton yes,no;
    String formno;
     JComboBox religion,category,income,education;
    
    Signuptwo(String formno){
        this.formno=formno;
        setLayout(null);
        
       setTitle(" New Account Application Page 2");
        
       
       
         JLabel AddtionalDeatails =new JLabel("Page 2:Addtional Detailas" );
        AddtionalDeatails.setFont(new Font("Raleway",Font.BOLD,22));
      AddtionalDeatails.setBounds(140,80,600,40);
        add(AddtionalDeatails);
         JLabel name =new JLabel("Religion:" );
        name.setFont(new Font("Raleway",Font.BOLD,20));
      name.setBounds(100,140,100,30);
        add(name);
        
       String vaiReligin[] ={"HIndu","Muslim","Shikh","other"};
        religion =new JComboBox(vaiReligin);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);
        JLabel Category =new JLabel("Category:" );
        Category.setFont(new Font("Raleway",Font.BOLD,20));
      Category.setBounds(100,190,200,30);
        add(Category);
         String vaiCategory[] ={"Genral","OBC","ST","other"};
        category =new JComboBox(vaiCategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);
        
          JLabel Income =new JLabel("Income:" );
        Income.setFont(new Font("Raleway",Font.BOLD,20));
      Income.setBounds(100,240,200,30);
        add(Income);
          String VaiIncome[] ={"0","<100000","<200000","other"};
        income =new JComboBox(VaiIncome);
         income.setBounds(300,240,400,30);
        income.setBackground(Color.WHITE);
        add(income);
        
        
         JLabel Educational =new JLabel("Educational:" );
        Educational.setFont(new Font("Raleway",Font.BOLD,20));
      Educational.setBounds(100,290,200,30);
        add(Educational);
            String VaiEducation[] ={"Non-Graduation","Graduation","post-Graduation","other"};
        education =new JComboBox(VaiEducation);
         education.setBounds(300,290,400,30);
        education.setBackground(Color.WHITE);
        add(education);
        
       
                
        JLabel adharno =new JLabel("Adhar Number:" );
        adharno.setFont(new Font("Raleway",Font.BOLD,20));
      adharno.setBounds(100,340,200,30);
        add(adharno);
        
          adharTextField=new JTextField();
        adharTextField.setFont(new Font("Raleway",Font.BOLD,22));
        adharTextField.setBounds(300,340,400,30);
        add(adharTextField);
        
        
        JLabel panno =new JLabel("Pan NO:" );
        panno.setFont(new Font("Raleway",Font.BOLD,20));
      panno.setBounds(100,390,200,30);
      add(panno);
      
       panTextField=new JTextField();
        panTextField.setFont(new Font("Raleway",Font.BOLD,22));
        panTextField.setBounds(300,390,400,30);
        add(panTextField);
        
         JLabel SeniorCitizen =new JLabel("Senior Citizen:" );
        SeniorCitizen.setFont(new Font("Raleway",Font.BOLD,20));
      SeniorCitizen.setBounds(100,440,200,30);
        add(SeniorCitizen);
        
          yes=new JRadioButton("Yes");
        yes.setBounds(300,440,60,30);
        yes.setBackground(Color.WHITE);
        add(yes);
         no=new JRadioButton("No");
        no.setBounds(450,440,120,30);
        no.setBackground(Color.WHITE);
        add(no);
        ButtonGroup gendergrooup=new ButtonGroup();
        gendergrooup.add(yes);
        gendergrooup.add(no);
        
         JLabel ExistingAccount =new JLabel("Existing Account:" );
        ExistingAccount.setFont(new Font("Raleway",Font.BOLD,20));
      ExistingAccount.setBounds(100,490,200,30);
        add(ExistingAccount);
        
        yes=new JRadioButton("Yes");
        yes.setBounds(300,490,60,30);
        yes.setBackground(Color.WHITE);
        add(yes);
         no=new JRadioButton("No");
        no.setBounds(450,490,120,30);
        no.setBackground(Color.WHITE);
        add(no);
        ButtonGroup accountexistance=new ButtonGroup();
        accountexistance.add(yes);
        accountexistance.add(no);
        
      
         next =new JButton("next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
         next.setFont(new Font("Raleway",Font.BOLD,14));
         next.setBounds(620,560,80,30);
         next.addActionListener(this);
         add(next);
        
        
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        
        
       
    }
 public void actionPerformed(ActionEvent ae){
            
            String formno="" +random;
            String sreligion=(String) religion.getSelectedItem();
            String scategory=(String) category.getSelectedItem();
            String sincome=(String) income.getSelectedItem();
            String seducation=(String) education.getSelectedItem();
            String pan=panTextField.getText();
              String adhar=adharTextField.getText();
         
            String seniorcitizen=null;
            if(yes.isSelected()){
                seniorcitizen="Yes";
            }else if(no.isSelected()){
                seniorcitizen="No";
            }
            
                      
            String accountexistance=null;
            if(yes.isSelected()){
                accountexistance="Yes";
            }else if(no.isSelected()){
                accountexistance="No";
           }
             
              
                
                try{
                    if(pan.equals("")){
                        JOptionPane.showMessageDialog(null,"Name is Required ");
                    }else{
                        conn c =new conn();
                        String query="insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+adhar+"','"+pan+"','"+seniorcitizen+"','"+accountexistance+"')";
                        c.s.executeUpdate(query);
                        setVisible(false);
                        new Signupthree(formno).setVisible(true);
                    }
                    
                }catch(Exception e){
                   System.out.println(e);
                }
            
        }
    public static void main(String [] args){
    new Signuptwo("");
 }  
}
