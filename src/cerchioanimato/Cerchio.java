package cerchioanimato;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Cerchio extends JPanel implements ActionListener {

    final int SIZE_PANEL = 50;
    Timer timer = new Timer(20, this);
    int x = 0, y = 0, dx = 2, dy = 2;

    public Cerchio() {
        setBackground(Color.YELLOW);
        setPreferredSize(new Dimension(SIZE_PANEL, SIZE_PANEL));
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(x, y, SIZE_PANEL, SIZE_PANEL);
    }

    public void sposta() {
        if (y + dy + SIZE_PANEL + 42 > Finestra.SIZE_FRAME_Y) {
            dy = -dy;
        }
        if (y + dy < 0) {
            dy = -dy;
        }
        if (x + dx + SIZE_PANEL + 10 > Finestra.SIZE_FRAME_X) {
            dx = -dx;
        }
        if (x + dx < 0) {
            dx = -dx;
        }
        x += dx;
        y += dy;
    }

    public void actionPerformed(ActionEvent e) {
        sposta();
        repaint();
    }
}
