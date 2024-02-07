import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/* <applet code="FactApplet.class" width=500 height=100> </applet> */

public class FactApplet extends Applet {

    Label lblInput;
    TextField tfInput;
    TextField tfOutput;
    Button btnCompute;

    public void init() {
        this.setTitle("Factorial Applet");

        lblInput = new Label("Enter an Integer: ");
        tfInput = new TextField(10);
        btnCompute = new Button("Compute");
        tfOutput = new TextField(40);
        tfOutput.setEditable(false);

        add(lblInput);
        add(tfInput);
        add(btnCompute);
        add(tfOutput);

        btnCompute.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(tfInput.getText());
                long fact = 1;
                for (int i = 1; i <= num; i++) {
                    fact *= i;
                }
                tfOutput.setText("Factorial of " + num + " is " + fact);
            }
        });
    }
}