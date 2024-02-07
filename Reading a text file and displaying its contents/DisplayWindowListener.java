import java.awt.event.*;

public class DisplayWindowListener extends WindowAdapter {
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
}