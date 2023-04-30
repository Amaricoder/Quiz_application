package quiz_application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class quiz extends JFrame  implements ActionListener {
    JButton b1,b2,b3;
    int score=0;
    String questions[][]=new String[10][5];
    String answers[][] =new String[10][2];
    String user_ans[][]=new String[10][1];
    int timer=15;

    int c=0;
    ButtonGroup bg;

    JLabel l1,q1;
    JRadioButton r1,r2,r3,r4;

    String name;

    quiz(String name){

        this.name=name;
       new JFrame();
       setLayout(null);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("quiz_icon/quiz.jpg"));
        JLabel image=new JLabel(i1);
        image.setBounds(0,0,1200,320);
       add(image);
//1 question


        questions[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        questions[0][1] = "JVM";
        questions[0][2] = "JDB";
        questions[0][3] = "JDK";
        questions[0][4] = "JRE";

        questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
        questions[1][1] = "int";
        questions[1][2] = "Object";
        questions[1][3] = "long";
        questions[1][4] = "void";

        questions[2][0] = "Which package contains the Random class?";
        questions[2][1] = "java.util package";
        questions[2][2] = "java.lang package";
        questions[2][3] = "java.awt package";
        questions[2][4] = "java.io package";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";

        questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        questions[4][1] = "Stack";
        questions[4][2] = "String memory";
        questions[4][3] = "Random storage space";
        questions[4][4] = "Heap memory";

        questions[5][0] = "Which of the following is a marker interface?";
        questions[5][1] = "Runnable interface";
        questions[5][2] = "Remote interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Result interface";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] = "Which of the following option leads to the portability and security of Java?";
        questions[9][1] = "Bytecode is executed by JVM";
        questions[9][2] = "The applet makes the Java code secure and portable";
        questions[9][3] = "Use of exception handling";
        questions[9][4] = "Dynamic binding between objects";

//answer
        answers[0][1] = "JDB";
        answers[1][1] = "int";
        answers[2][1] = "java.util package";
        answers[3][1] = "Marker Interface";
        answers[4][1] = "Heap memory";
        answers[5][1] = "Remote interface";
        answers[6][1] = "import";
        answers[7][1] = "Java Archive";
        answers[8][1] = "java.lang.StringBuilder";
        answers[9][1] = "Bytecode is executed by JVM";


         l1=new JLabel();
        l1.setBounds(75,360,50,30);
        l1.setFont(new Font("Tahoma",Font.PLAIN,22));
        add(l1);

         q1=new JLabel();
        q1.setBounds(125,360,900,30);
        q1.setFont(new Font("Tahoma",Font.PLAIN,22));
        add(q1);

         r1=new JRadioButton();
        r1.setBounds(160,410,500,30);
        r1.setBackground(Color.white);
        r1.setFont(new Font("Dialod",Font.PLAIN,18));
        add(r1);

         r2=new JRadioButton();

        r2.setBounds(160,445,500,30);
        r2.setBackground(Color.white);
        r2.setFont(new Font("Dialod",Font.PLAIN,18));
        add(r2);
         r3=new JRadioButton();

        r3.setBounds(160,480,500,30);
        r3.setBackground(Color.white);
        r3.setFont(new Font("Dialod",Font.PLAIN,18));
       add(r3);

         r4=new JRadioButton();

        r4.setBounds(160,515,500,30);
        r4.setBackground(Color.white);
        r4.setFont(new Font("Dialod",Font.PLAIN,18));
        add(r4);

         bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        bg.add(r4);

        //button
        b1=new JButton("Next");
        b1.setFont(new Font("Tahoma",Font.PLAIN,20));
b1.addActionListener(this);
        b1.setBounds(940,440,180,35);
        b1.setBackground(new Color(30,144,254));
        b1.setForeground(Color.white);
add(b1);

        b2=new JButton("50-50 Lifeline");
        b2.setBounds(940,500,180,35);
        b2.setBackground(new Color(30,144,254));
        b2.setFont(new Font("Tahoma",Font.PLAIN,20));
        b2.addActionListener(this);

        b2.setForeground(Color.white);
        add(b2);

        b3=new JButton("Submit");
        b3.setBounds(940,560,180,35);
        b3.setBackground(new Color(30,144,254));
        b3.setFont(new Font("Tahoma",Font.PLAIN,20));
        b3.setEnabled(false);
        b3.addActionListener(this);

        b3.setForeground(Color.white);
        add(b3);



        setBounds(70,30,1200,620);
        getContentPane().setBackground(Color.white);
        setUndecorated(true);
        setVisible(true);
start(c);

    }

    public void start(int c){
        l1.setText(""+(c+1)+"");
q1.setText(questions[c][0]);

        r1.setText(questions[c][1]);
        r1.setActionCommand(questions[c][1]);

        r2.setText(questions[c][2]);
        r2.setActionCommand(questions[c][2]);


        r3.setText(questions[c][3]);
        r3.setActionCommand(questions[c][3]);

        r4.setText(questions[c][4]);
        r4.setActionCommand(questions[c][4]);

        bg.clearSelection();
    }


    public static void main(String[] args) {
        new  quiz("");

    }
    public void paint(Graphics g){
        super.paint(g);
        String time="Time left - "+timer+ " Secound";
        g.setFont(new Font("Tahoma",Font.BOLD,18));
        g.setColor(Color.red);
        if(timer>0){
            g.drawString(time,930,375);
        }else {
            g.drawString("Time up!!",955,375);
        }
        try {
            Thread.sleep(1000);
repaint();
        }catch (Exception ae){
            System.out.println(ae);
        }
        timer--;


        if (timer<0) {
            r1.setEnabled(true);
            r2.setEnabled(true);
            r3.setEnabled(true);
            r4.setEnabled(true);
            timer=15;
            if(c==8){
                b1.setEnabled(false);
                b3.setEnabled(true);

            }if(c==9){
                if (bg.getSelection() == null) {
                    user_ans[c][0] = "";
                } else {
                    user_ans[c][0] = bg.getSelection().getActionCommand();
                }

                for (int i=0;i<user_ans.length;i++){
                    if(user_ans[i][0].equals(answers[i][1])){
                        score=score+10;
                    }
                }
                setVisible(false);
                new Score(name,score).setVisible(true);

            }else{

                if (bg.getSelection() == null) {
                    user_ans[c][0] = "";
                } else {
                    user_ans[c][0] = bg.getSelection().getActionCommand();
                }

                c++;
                start(c);
            }



        }




    }




    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            repaint();

            r1.setEnabled(true);
            r2.setEnabled(true);
            r3.setEnabled(true);
            r4.setEnabled(true);

             timer=15;

            if (bg.getSelection() == null) {
                user_ans[c][0] = "";
            } else {
                user_ans[c][0] = bg.getSelection().getActionCommand();
            }
            if(c==8){
                b1.setEnabled(false);
                b3.setEnabled(true);
            }

            c++;
            start(c);


//50-50
        } else if (e.getSource()==b2) {
            if(c%2==0){
                r1.setEnabled(false);
                r4.setEnabled(false);
            }else {
                r2.setEnabled(false);
                r3.setEnabled(false);
            }
            b2.setEnabled(false);

        }
        //submit
        else if (e.getSource()==b3) {


            if (bg.getSelection() == null) {
                user_ans[c][0] = "";
            } else {
                user_ans[c][0] = bg.getSelection().getActionCommand();
            }

           for (int i=0;i<user_ans.length;i++){
               if(user_ans[i][0].equals(answers[i][1])){
                   score=score+10;
               }
           }

            setVisible(false);
            new Score(name,score).setVisible(true);

        }
    }

}







