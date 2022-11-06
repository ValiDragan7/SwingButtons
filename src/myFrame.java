import javax.swing.*;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class myFrame extends JFrame implements ActionListener{
    JButton buton;
    JLabel label;
    ImageIcon icon = new ImageIcon("icon3.png");
    ImageIcon icon2= new ImageIcon("icon.jpeg");
    myFrame(){


        label = new JLabel("IACASA");
        label.setIcon(icon2);
        label.setBounds(250, 100, 400, 300);
        label.setVisible(false);


        buton = new JButton("APASA ACI te rog io");
        buton.setBounds(50,100,200,200);
        buton.addActionListener(this); // asculta instructiunile in cazul unui event
        buton.setFocusable(false);// scrisul are border , false ca sa nu mai
        buton.setIcon(icon);
        buton.setHorizontalTextPosition(JButton.CENTER);
        buton.setVerticalTextPosition(JButton.BOTTOM);
        buton.setFont(new Font("Comic Sans",Font.BOLD,16));
        buton.setIconTextGap(-23);
        buton.setForeground(Color.MAGENTA);
        buton.setBackground(Color.PINK);
        buton.setBorder(BorderFactory.createEtchedBorder());
        // buton.setEnabled(false); daca butonul este activ sau nu


        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(600,600);
        this.setVisible(true);
        this.add(buton);
        this.add(label);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== buton){
            label.setVisible(true);
        }
    }
}
