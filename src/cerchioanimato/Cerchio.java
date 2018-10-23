package cerchioanimato;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Cerchio extends JPanel implements ActionListener {

    final int SIZE_PANEL = 50;
    Timer timer = new Timer(10, this);
    int x = 0, y = 0, dx = 2, dy = 2;

    public Cerchio() {
        setBackground(Color.PINK);
        setPreferredSize(new Dimension(SIZE_PANEL, SIZE_PANEL));
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.YELLOW);
        g.fillOval(x, y, SIZE_PANEL, SIZE_PANEL);
    }

    public void sposta() {
        if (x < 0 || x + SIZE_PANEL >= Finestra.SIZE_FRAME_X - 22) {
            dx = -dx;
        }
        if (y < 0 || y + SIZE_PANEL >= Finestra.SIZE_FRAME_Y - 42) {
            dy = -dy;
        }
        x += dx; 
        y += dy;
        repaint();
    }

    public void actionPerformed(ActionEvent e) {
        sposta();
    }
}
