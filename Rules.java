package quiz_application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules implements ActionListener {
   JFrame f;
   JButton start,back;
   String n;

    Rules(String n){
      this.n=n;

      f=new JFrame();

        JLabel heading=new JLabel("Welcome "+n+" to Simple Minds");
        heading.setBounds(50,20,800,40);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,38));
        heading.setForeground(new Color(30,144,254));
        f.add(heading);


        JLabel l1=new JLabel();
        l1.setBounds(20,90,600,350);
        l1.setFont(new Font("Tahoma",Font.PLAIN,16));

                l1.setText(
                        "<html>"+
                                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
                                "<html>"
                );
        f.add(l1);
        //button
        start=new JButton("Start");
        start.setBounds(400,480,100,28);
        start.setBackground(new Color(30,144,254));
        start.setForeground(Color.white);
        start.addActionListener(this);
        f.add(start);

        back=new JButton("Back");
        back.setBounds(250,480,100,28);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.white);
        back.addActionListener(this);
        f.add(back);


      f.getContentPane().setBackground(Color.white);
      f.setBounds(300,75,800,600);
      f.setLayout(null);
      f.setUndecorated(true);
      f.setVisible(true);

    }
    public static void main(String[] args) {
new Rules("");


    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==start){
           f.setVisible(false);
           new quiz(n).setVisible(true);

       } else if (e.getSource()==back) {
           f.setVisible(false);
           new Login().f.setVisible(true);
       }


    }
}
