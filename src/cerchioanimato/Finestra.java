package cerchioanimato;

import java.awt.*;
import javax.swing.*;

public class Finestra extends JFrame {
    public static final int SIZE_FRAME_X = 600;
    public static final int SIZE_FRAME_Y = 500;
    public Finestra() {
        super("Vogliamo vederlo scorrere");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(SIZE_FRAME_X,SIZE_FRAME_Y));
        
        Cerchio c = new Cerchio();
        add(c);
        pack();
        setVisible(true);
    } 
    public static void test() {
        Finestra f = new Finestra();
    }
}
