package quiz_application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame implements ActionListener {
    String name;
    JButton b1, exit;

    int s;
    Score(String name,int s){
        this.s=s;
        this.name=name;
        new JFrame();
ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("quiz_icon/score.png"));
Image i=i1.getImage().getScaledInstance(500,400,Image.SCALE_DEFAULT);
ImageIcon i2=new ImageIcon(i);
JLabel l1=new JLabel(i2);
l1.setBounds(0,100,500,400);
add(l1);

JLabel l2=new JLabel("Thankyou "+name+" for playing Simple mind");
l2.setBounds(30,30,500,40);
l2.setFont(new Font("tahoma",Font.BOLD,24));
add(l2);


        JLabel l3=new JLabel("Your Score is "+s+" ");
        l3.setBounds(600,150,300,30);
        l3.setFont(new Font("tahoma",Font.BOLD,30));
        add(l3);


        b1=new JButton("Play Again!");
        b1.setBounds(620,230,180,35);
        b1.setBackground(new Color(30,144,254));
        b1.setForeground(Color.white);
        b1.setFont(new Font("Tahoma",Font.BOLD,20));

         b1.addActionListener(this);
        add(b1);

        exit=new JButton("Exit");
        exit.setBounds(620,330,180,35);
        exit.setBackground(new Color(30,144,254));
        exit.setForeground(Color.white);
        exit.setFont(new Font("Tahoma",Font.BOLD,20));

        exit.addActionListener(this);
        add(exit);

        setBounds(100,10,1000,500);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        setUndecorated(true);
        setVisible(true);

    }
    public static void main(String[] args) {
new Score("",0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            setVisible(false);
            new Login().f.setVisible(true);
        }else {
            System.exit(0);
        }
    }
}
