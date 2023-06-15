import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {
    private JTextField textField1;
    private JButton button1;
    private JTextArea textArea1;
public Test() {
    button1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String txt = textField1.getText();
            textArea1.setText(txt);
        }
    });
}
}
