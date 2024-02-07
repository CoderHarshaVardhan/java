import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class GreetApplet extends Applet{
    GridBagLayout gbl;
    GridBagConstraints gbc;
    Label lblstatus;
    Label lblName;
    Label lblOption;
    Label lblInput;
    TextField tfName;

    public void init(){
        Frame f = (Frame)this.getParent().getParent();
        f.setTitle("Greeting!");
        gbl = new GridBagLayout();
        gbc = new GridBagConstraints();
        this.setLayout(gbl);

        gbc.fill = GridBagConstraints.HORIZONTAL;

        lblName = new Label("Enter your name: ", Label.LEFT);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0.3;
        gbc.insets = new Insets(0,5,10,5);

        this.add(lblName,gbc);

        tfName = new TextField();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 0.7;
        this.add(tfName, gbc);

        lblOption = new Label("Choose an option: ", Label.LEFT);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 0.3;
        this.add(lblOption, gbc);

        Choice choice = new Choice();
        choice.add("Afternoon");
        choice.add("Evening");
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.weightx = 0.7;
        this.add(choice,gbc);

        lblstatus = new Label("_________", Label.CENTER);
        lblstatus.setBackground(Color.MAGENTA);
        gbc.ipady = 20;
        gbc.gridwidth = 2;
        gbc.gridx = 2;
        gbc.gridy = 2;
        this.add(lblstatus,gbc);


        tfName.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String greet = choice.getSelectedItem();
                lblstatus.setText("Good" + greet + " " + tfName.getText());
            }            
        });

        choice.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                lblstatus.setText("Good" + e.getItem() + " " + tfName.getText());
            }
        });
    }
}