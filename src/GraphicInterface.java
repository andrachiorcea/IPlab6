import javax.swing.*;
import java.awt.*;

public class GraphicInterface extends JFrame {
    GPanel panel;

    public GraphicInterface(){
        super("Your project");
        init();
        panel.setPreferredSize(new Dimension(500,480));
    }
    public void init(){
        panel=new GPanel(this);
        add(panel);

        setSize(500,480);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}