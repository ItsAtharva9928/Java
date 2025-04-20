import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class swingLogin extends JFrame implements ActionListener{
    JLabel label1,label2;
    JTextField textField1;
    JPasswordField passFeild;
    JButton button1;
    swingLogin(){
        setTitle("Login Form");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        label1 = new JLabel("Username:");
        label2 = new JLabel("Password:");
        textField1 = new JTextField();
        passFeild = new JPasswordField();
        button1 = new JButton("Login");
        button1.addActionListener(this);

        add(label1);
        add(label2);
        add(textField1);
        add(passFeild);
        add(button1);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String username = textField1.getText();
        String password = new String(passFeild.getPassword());
        if(username.equals("admin") && password.equals("admin")){
            JOptionPane.showMessageDialog(this, "Login Successful");
        }
        else{
            JOptionPane.showMessageDialog(this, "Invalid Username or Password");
        }
    }
    public static void main(String[] args) {
        new swingLogin();
    }
}