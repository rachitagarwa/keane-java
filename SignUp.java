package sycs_01;

import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

class UserFrame extends JFrame implements ActionListener{
    
    JTextField uNameText;
    JPasswordField uPasswordField;
    JButton btn;
    
    
    UserFrame(){
        setTitle("Signup Form");
        JPanel c = new JPanel();
        this.add(c);
        
        JLabel uName = new JLabel("Enter username:");
        uNameText = new JTextField(30);
        c.add(uName);
        c.add(uNameText);
        
        JLabel passName = new JLabel("Enter password");
        uPasswordField = new JPasswordField(30);
        c.add(passName);
        c.add(uPasswordField);
        
        btn = new JButton("Submit");
        btn.addActionListener(this);
        c.add(btn);
        
        setBounds(20, 20, 400, 650);
        setVisible(true);
        setResizable(true);
        
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        System.out.println("Action being performed");
        if(e.getSource() == btn){
            System.out.println("The user inputted username: "+uNameText.getText()+" and password: "+uPasswordField.getText());
        }
    }
    
    
}

public class SignUp{
    
    public static void main(String args[]){
        UserFrame demo = new UserFrame();
    }
}