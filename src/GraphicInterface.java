import javax.swing.*;

public class GraphicInterface extends JFrame {
    GPanel panel;

    public GraphicInterface(){
        super("Your project");
        init();
    }
    public void init(){
        panel=new GPanel(this);
        add(panel);
        setSize(500,480);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
	
}