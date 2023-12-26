package Component;

import javax.swing.JOptionPane;

public class MSG {
    static public void success(String msg){
        JOptionPane.showMessageDialog(null, msg, "",JOptionPane.INFORMATION_MESSAGE );
    }
    static public void warning(String msg){
        JOptionPane.showMessageDialog(null, msg, "",JOptionPane.WARNING_MESSAGE );
    }
    static public void error(String msg){
        JOptionPane.showMessageDialog(null, msg, "",  JOptionPane.ERROR_MESSAGE);
    }
}
