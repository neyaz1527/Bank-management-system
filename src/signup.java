package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class signup extends JFrame {

    JLabel label1, label2, Uname, Fname, dob, email, status, address, city, pin,
    state;
    JDateChooser dateChooser;
    JRadioButton g1, g2, s1, s2, s3;
    JButton next;
    JTextField field1, field2, field3, field4, field5, field6, field7 ;

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = " "+ Math.abs(first4);

    signup(){
        super("BANK SignUp Form");

        ImageIcon a = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image b= a.getImage().getScaledInstance(170, 130, Image.SCALE_DEFAULT);
        ImageIcon c =new ImageIcon(b);
        JLabel image = new JLabel(c);
        image.setBounds(25, 10, 100, 100);
        add(image);

        label1 = new JLabel("Application Form: " + first4);
        label1.setBounds(260, 20, 600, 40);
        label1.setFont(new Font("Verdana", Font.PLAIN, 35));
        add(label1);

        label2 = new JLabel("Personal Details");
        label2.setFont(new Font("verdana", Font.PLAIN, 25));
        label2.setBounds(290, 90, 600, 30);
        add(label2);

        //User name
        Uname = new JLabel("User Name");
        Uname.setFont(new Font("verdana", Font.PLAIN, 20));
        Uname.setBounds(135, 150, 150, 30);
        add(Uname);

        field1 = new JTextField();
        field1.setFont(new Font("verdana", Font.PLAIN, 15));
        field1.setBounds(250, 150, 400, 30);
        add(field1);

        //Date of Birth
        dob = new JLabel("Enter DOB");
        dob.setFont(new Font("verdan", Font.PLAIN, 20));
        dob.setBounds(140, 195, 150, 30);
        add(dob);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(Color.black);
        dateChooser.setBounds(250, 195, 150,30);
        add(dateChooser);

        //Father's Name
        Fname = new JLabel("Father Name");
        Fname.setFont(new Font("verdana", Font.PLAIN, 20));
        Fname.setBounds(120, 240, 150, 30);
        add(Fname);

        field2 = new JTextField();
        field2.setFont(new Font("verdana", Font.PLAIN, 15));
        field2.setBounds(250, 240, 400, 30);
        add(field2);


        JLabel labelG = new JLabel("Gender");
        labelG.setFont(new Font("verdana", Font.PLAIN, 20));
        labelG.setBounds(170,285,200,30);
        add(labelG);


        //radio button for gender selection
        g1 = new JRadioButton("Male");
        g1.setFont(new Font("verdana", Font.PLAIN,14));
        g1.setBackground(Color.gray);
        g1.setBounds(280,285,90,30);
        add(g1);

        g2 = new JRadioButton("Female");
        g2.setFont(new Font("verdana", Font.PLAIN,14));
        g2.setBackground(Color.gray);
        g2.setBounds(400,285,90,30);
        add(g2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(g1);
        buttonGroup.add(g2);

        email = new JLabel("Email address");
        email.setFont(new Font("verdana", Font.PLAIN, 20));
        email.setBounds(110,330,200,30);
        add(email);

        field3 = new JTextField();
        field3.setFont(new Font("verdana",Font.PLAIN, 14));
        field3.setBounds(250,330,400,30);
        add(field3);

        //marriage Status
        status = new JLabel("Marital Status");
        status.setFont(new Font("verdana", Font.PLAIN, 20));
        status.setBounds(110,375,200,30);
        add(status);

        s1 = new JRadioButton("Married");
        s1.setBounds(280,375,100,30);
        s1.setBackground(Color.gray);
        s1.setFont(new Font("verdana", Font.PLAIN,14));
        add(s1);

        s2 = new JRadioButton("Unmarried");
        s2.setBackground(Color.gray);
        s2.setBounds(400,375,100,30);
        s2.setFont(new Font("verdana", Font.PLAIN,14));
        add(s2);

        s3 = new JRadioButton("Other");
        s3.setBackground(Color.gray);
        s3.setBounds(520,375,100,30);
        s3.setFont(new Font("verdana", Font.PLAIN,14));
        add(s3);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(s1);
        buttonGroup1.add(s2);
        buttonGroup1.add(s3);


        //address signup page
        address = new JLabel("Address");
        address.setFont(new Font("verdana", Font.PLAIN, 20));
        address.setBounds(150,450,200,30);
        add(address);

        field4 = new JTextField();
        field4.setFont(new Font("verdana",Font.PLAIN, 14));
        field4.setBounds(250,450,400,30);
        add(field4);

        //city details
        city = new JLabel("City");
        city.setFont(new Font("verdana", Font.PLAIN, 20));
        city.setBounds(180,500,200,30);
        add(city);

        field5 = new JTextField();
        field5.setFont(new Font("verdana",Font.PLAIN, 14));
        field5.setBounds(250,500,400,30);
        add(field5);

        //pincode of the city
        pin = new JLabel("Pin Code");
        pin.setFont(new Font("verdana", Font.PLAIN, 20));
        pin.setBounds(150,550,200,30);
        add(pin);

        field6 = new JTextField();
        field6.setFont(new Font("verdana",Font.PLAIN, 14));
        field6.setBounds(250,550,400,30);
        add(field6);


        //state details
        state = new JLabel("State");
        state.setFont(new Font("verdana", Font.PLAIN, 20));
        state.setBounds(180,600,200,30);
        add( state);

        field7 = new JTextField();
        field7.setFont(new Font("verdana",Font.PLAIN, 14));
        field7.setBounds(250,600,400,30);
        add(field7);

        //next button creation
        next = new JButton("Next");
        next.setFont(new Font("verdana",Font.PLAIN, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,650,80,30);
        add(next);

        getContentPane().setBackground(Color.gray);
        setLayout(null);
        setSize(850, 800);
        setResizable(false);
        setDefaultCloseOperation(signup.EXIT_ON_CLOSE);
        setLocation(360, 40);
        setVisible(true);
    }

    public static void main(String[] args) {
        new signup();
    }
}
