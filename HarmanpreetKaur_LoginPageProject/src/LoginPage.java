import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage extends JFrame{
    private JTextField tf1email;
    private JPasswordField tf2password;
    private JLabel label1email;
    private JLabel label2password;
    private JPanel LoginPage;
    private JButton buttonlogin;

    public LoginPage() {

        buttonlogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = tf1email.getText();
                String password = new String(tf2password.getPassword());

                if (email.equals("harman@gmail.com") && password.equals("harman")) {
                    JOptionPane.showMessageDialog(buttonlogin, "Login is successful!!!!!");
                } else {
                    JOptionPane.showMessageDialog(buttonlogin, "Invalid email or password, TRY AGAIN", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }


    public static void main(String[] args) {

        LoginPage loginPage = new LoginPage();
        loginPage.setTitle("Login Page");
        loginPage.setContentPane(new LoginPage().LoginPage);
        loginPage.setSize(490, 300);
        loginPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginPage.setLocationRelativeTo(null);
        loginPage.setVisible(true);
    }
}
