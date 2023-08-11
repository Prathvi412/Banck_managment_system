/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banck_managment;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 

/**
 *
 * @author prath
 */
public class test extends JFrame implements ActionListener {
    JButton letsgo;
test(){
     setTitle("test");
      setLayout(null);
       letsgo=new JButton("SIGN IN");
      letsgo.setBounds(300, 300, 100, 30);
      letsgo.setBackground(Color.BLACK);
      letsgo.setForeground(Color.WHITE);
      letsgo.addActionListener(this);
      add(letsgo);
       getContentPane().setBackground(Color.white); 
        setSize(800,480);
        setVisible(true);
        setLocation(350,200);
}
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==letsgo){
            JOptionPane.showMessageDialog(null, "ok lets go");
       }
    }
    public static void main(String [] args){
        new test();
    }
    
}
