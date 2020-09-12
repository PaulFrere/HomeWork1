package HomeWork_8_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Drawing extends JFrame {
    public Drawing() {
        super("Lines Drawing");

        setSize(680, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("MousePos: " + e.getX() + " " + e.getY());
            }});
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        simpleDrawLines(g);
    }

    private void simpleDrawLines(Graphics g2d) {
        g2d.drawLine(120, 50, 360, 50);

        g2d.setColor(Color.BLUE);
        g2d.drawRect(100, 100, 150, 200);

        g2d.setColor(Color.GREEN);
        g2d.fillRect(101, 101, 148, 99);
        g2d.drawLine(120, 50, 550, 150);
        g2d.drawOval(350, 150, 200, 150);

        g2d.setColor(Color.RED);
        g2d.fillOval(351, 151, 201, 151);

        g2d.setColor(Color.YELLOW);
        g2d.fillOval(280, 400, 100, 100);
        g2d.drawLine(330,400, 330, 350);
        g2d.drawLine(380,450, 430, 450);
        g2d.drawLine(330,500, 330, 550);
        g2d.drawLine(280,450, 230, 450);
        g2d.drawLine(295,415, 255, 370);
        g2d.drawLine(360,410, 400, 365);
        g2d.drawLine(370,480, 415, 525);
        g2d.drawLine(295,485, 250, 525);
    }

    public static void main(String[] args) {
        new Drawing().setVisible(true);
    }
}
