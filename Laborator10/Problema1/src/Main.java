import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main extends JFrame implements ActionListener {

    JButton  button1 = new JButton("buton1");
    JButton button2 = new JButton("buton2");
    JButton button3 = new JButton("buton3");

    JLabel label;
    JLabel cvText;
    JLabel cvText2;

    JTextField textArea;

    private int n = 0;
    public Main(){


        cvText = new JLabel("numar:" + n);
        cvText2 = new JLabel("");

        cvText.setBounds(100,0,100,50);
        cvText2.setBounds(200,50,100,50);
        this.add(cvText);
        this.add(cvText2);

        textArea = new JTextField("");
        textArea.setBounds(100,50,100,50);
        this.add(textArea);

        button1.setBounds(0,0,100,50);
        button2.setBounds(0,50,100,50);
        button3.setBounds(0,100,100,50);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);


        label = new JLabel();
        label.add(button1);
        label.add(button2);
        label.add(button3);

        this.add(label);


        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        Main q = new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1){
            n++;
            cvText.setText("numar:" + n);
        }
        if(e.getSource() == button2){
            String s = textArea.getText();
            cvText2.setText(s);
        }
        if(e.getSource() == button3){
            Random q = new Random();
            int nr1 = q.nextInt(255) ;
            int nr2 = q.nextInt(255) ;
            int nr3 = q.nextInt(255) ;
            Color c = new Color(nr1,nr2,nr3);
            this.getContentPane().setBackground(c);
        }
    }
}