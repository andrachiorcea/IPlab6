import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import components.SearchElement;
import components.SearchElementBuilder;

public class GPanel extends JPanel {
    private final GraphicInterface frame;
    protected SearchElement search = new SearchElementBuilder().createSearchElement();
    private JLabel titleLabel = new JLabel("Title of the project");
    protected JTextField titleField= new JTextField();
    private JLabel descriptionLabel = new JLabel("Description of the project");
    protected JTextField descriptionField= new JTextField();
    protected JButton button = new JButton("Submit");


    public GPanel(GraphicInterface frame){
        this.frame=frame;
        init();
    }
    public void init(){
        setLayout(null);
        add(titleLabel);
        add(titleField);
        add(descriptionLabel);
        add(descriptionField);
        add(button);
        titleLabel.setBounds(10,20,500,25);
        titleField.setBounds(10,45,460,25);
        descriptionLabel.setBounds(10,70,500,25);
        descriptionField.setBounds(10,95,460,45);
        button.setBounds(200,170,100,30);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                search.setDescription(descriptionField.getText());
                search.addKeyword(titleField.getText());
            }
        });
    }

}