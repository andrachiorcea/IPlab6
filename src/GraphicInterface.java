import javax.swing.*;
import java.awt.*;

public class GraphicInterface extends JFrame {
    GPanel panel;

    public GraphicInterface(){
        super("Your project");
        init();
    }
    public void init(){
        panel=new GPanel(this);
        add(panel, BorderLayout.CENTER);
        panel.setPreferredSize(new Dimension(500,480));
        setSize(500,480);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}