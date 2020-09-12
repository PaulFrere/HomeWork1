package HomeWork_8;

import javax.swing.*;
import java.awt.*;

public class Graf extends JFrame {
    public Graf() {
        setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 600, 600);
        JButton[] jbs = new JButton[9];
        setLayout(new GridLayout(7,5));
        for (int i=1; i <jbs.length; i++){
            jbs[i] = new JButton("#" + i);
            add(jbs[i]);
        }
        setVisible(true);
    }
}
