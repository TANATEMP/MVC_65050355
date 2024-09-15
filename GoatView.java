import javax.swing.*;
import java.awt.event.ActionListener;

public class GoatView {
    JFrame frame;
    private JButton removeButton;
    private JLabel messageLabel;

    public GoatView() {
        frame = new JFrame("Goat Detected");
        removeButton = new JButton("Remove Goat");
        messageLabel = new JLabel("Goat detected! Click the button to remove it.");

        JPanel panel = new JPanel();
        panel.add(messageLabel);
        panel.add(removeButton);

        frame.add(panel);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Close only the GoatView window
        frame.setVisible(false); // Initially hidden
    }

    public void show() {
        frame.setVisible(true);
    }

    public void addRemoveButtonListener(ActionListener listener) {
        removeButton.addActionListener(listener);
    }
}
