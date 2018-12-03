package packagename;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SuperLibrary extends JFrame {
    private JPanel panel1;
    private JPanel myInnerPanel;
    private JTextField txtEmail;
    private JPasswordField pswdPassword;
    private JButton Login;

    private String userEmail;
    private String userPassword;


    public SuperLibrary() {
        txtEmail.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        Login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userEmail = txtEmail.getText();
                userPassword = pswdPassword.getText();
            }
        });
    }
}
