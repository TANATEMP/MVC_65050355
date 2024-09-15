import javax.swing.*;
import java.awt.event.ActionListener;

public class CowView {
    JFrame frame;
    private JLabel messageLabel;
    private JButton closeButton;

    public CowView() {
        frame = new JFrame("Cow Details");
        messageLabel = new JLabel("");
        closeButton = new JButton("Close");

        JPanel panel = new JPanel();
        panel.add(messageLabel);
        panel.add(closeButton);

        frame.add(panel);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Close only the CowView window
        frame.setVisible(false); // Initially hidden
    }

    public void show() {
        frame.setVisible(true);
    }

    public void setMessage(String message) {
        messageLabel.setText(message);
    }

    public void addCloseButtonListener(ActionListener listener) {
        closeButton.addActionListener(listener);
    }
}
