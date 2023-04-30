package quiz_application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login implements ActionListener {
    JFrame f;
    JButton exit,start;
    JTextField tf;
    Login(){
     f=new JFrame();

    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("quiz_icon/login.jpeg")) ;

    JLabel l=new JLabel(i1);
    l.setBounds(0,0,600,450);
     f.add(l);

     //heading

     JLabel heading=new JLabel("Simple Minds");
     heading.setBounds(665,40,300,40);
     heading.setFont(new Font("Viner Hand ITC",Font.BOLD,38));
     heading.setForeground(new Color(30,144,254));
     f.add(heading);

        JLabel name=new JLabel("Enter Your Name");
        name.setBounds(710,110,300,40);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
        name.setForeground(new Color(30,144,254));
        f.add(name);

        //tf
         tf=new JTextField();
        tf.setBounds(670,160,250,30);
        f.add(tf);

        start=new JButton("Rules");
start.setBounds(670,230,100,28);
start.setBackground(new Color(30,144,254));
start.setForeground(Color.white);
start.addActionListener(this);
f.add(start);

        exit=new JButton("Exit");
        exit.setBounds(820,230,100,28);
        exit.setBackground(new Color(30,144,254));
        exit.setForeground(Color.white);
        exit.addActionListener(this);
f.add(exit);

     f.setBounds(200,120,1000,400);
     f.getContentPane().setBackground(Color.white);
     f.setUndecorated(true);
     f.setLayout(null);
        f.setVisible(true);

    }
    public static void main(String[] args) {

        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==start){
            String name=tf.getText();

            f.setVisible(false);
            new Rules(name).f.setVisible(true);
        } else if (e.getSource()==exit) {
            f.setVisible(false);
        }
        {







        }
    }
}
