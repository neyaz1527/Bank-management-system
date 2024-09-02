package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame implements ActionListener {

    JLabel label1, label2, label3;
    JTextField textField;
    JPasswordField password;
    JButton button1, button2, button3;

    login (){
        super("Bank Management System"); //nothing can come above the super!!
        //Image for the Bank ICON
        ImageIcon a = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image b= a.getImage().getScaledInstance(170, 130, Image.SCALE_DEFAULT);
        ImageIcon c = new ImageIcon(b);
        JLabel image = new JLabel(c);
        image.setBounds(380, 10, 100, 100);
        add(image);

        //Image for the Card Icon
        ImageIcon a1= new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image b1= a1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon c1 = new ImageIcon(b1);
        JLabel image1 = new JLabel(c1);
        image1.setBounds(700, 350, 100, 100);
        add(image1);


        //JLabel for WELCOME text!!
        label1 = new JLabel("Please Enter your Details \n to proceed");
        label1.setForeground(Color.black);
        label1.setFont(new Font("Verdana", Font.PLAIN, 20));
        label1.setBounds(260, 125, 450, 40);
        add(label1);

        //JLabel for account number
        label2= new JLabel("Account No: ");
        label2.setForeground(Color.BLACK);
        label2.setFont(new Font("Verdana", Font.PLAIN, 28));
        label2.setBounds(150, 190, 375, 30);
        add(label2);

        //JTextField for Account number
        textField = new JTextField(15);
        textField.setFont(new Font("Verdana", Font.PLAIN, 16));
        textField.setBounds(325, 190, 230, 30);
        add(textField);

        //JLabel for PIN
        label3 = new JLabel("Enter PIN: ");
        label3.setForeground(Color.BLACK);
        label3.setFont(new Font("Verdana", Font.PLAIN, 28));
        label3.setBounds(150, 250, 375, 30);
        add(label3);

        //JPasswordField for PIN  // in this the password will not be seen
        password = new JPasswordField(15);
        password.setFont(new Font("Verdana", Font.PLAIN, 16));
        password.setBounds(325, 250, 230, 30);
        add(password);


        //JButton for the Frame!!
        button1 = new JButton("Sign in");
        button1.setFont(new Font("Verdana", Font.PLAIN, 15));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setBounds(327, 300, 100, 30);
        button1.addActionListener(this);
        add(button1);

        //Sign up button
        button2 = new JButton("Clear");
        button2.setFont(new Font("Verdana", Font.PLAIN, 15));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.setBounds(450, 300, 100, 30);
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton("Sign UP");
        button3.setFont(new Font("Verdana", Font.PLAIN, 15));
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        button3.setBounds(328, 350, 220, 30);
        button3.addActionListener(this);
        add(button3);

        //End of buttons


        //Image for the Background
        ImageIcon a2 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image b2= a2.getImage().getScaledInstance(850, 480, Image.SCALE_SMOOTH);
        ImageIcon c2 = new ImageIcon(b2);
        JLabel image2 = new JLabel(c2);
        image2.setBounds(0,0,850, 480);
        add(image2);

        //Frame settings and visibility
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(login.EXIT_ON_CLOSE);
        setSize(850,480);
        setLocation(350, 200);
        setVisible(true);  //for making everything above visible we meed to use the
                           //setVisible at the end of the code!!
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if (e.getSource() == button1){
                
            } else if (e.getSource() == button2) {
                textField.setText("");
                password.setText("");

            } else if (e.getSource() == button3) {

                
            }

        }
        catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new login();
    }
}
