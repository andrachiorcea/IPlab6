package components;
import javax.swing.*;


public class GPanel extends JPanel {
    private final GraphicInterface frame;
    private JLabel titleLabel = new JLabel("Title of the project");
    protected JTextField titleField= new JTextField();
    private JLabel descriptionLabel = new JLabel("Description of the project");
    protected JTextField descriptionField= new JTextField();

    public GPanel(GraphicInterface frame){
        this.frame=frame;
        init();
    }
    public void init(){
        setLayout(null);
        add(titleLabel);
        add(titleField);
        add(descriptionLabel);
        add(descriptionLabel);
        titleLabel.setBounds(10,20,500,25);
        titleField.setBounds(10,45,460,25);
        descriptionLabel.setBounds(10,70,500,25);
        descriptionField.setBounds(10,95,460,25);
    }
}