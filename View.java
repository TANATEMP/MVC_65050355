import javax.swing.*;
import java.awt.event.ActionListener;

public class View {
    private JFrame frame;
    private JTextField idField;
    private JButton submitButton;
    private JLabel resultLabel;

    public View() {
        frame = new JFrame("Cow Strike");
        idField = new JTextField(20);
        submitButton = new JButton("Submit");
        resultLabel = new JLabel("");

        JPanel panel = new JPanel();
        panel.add(new JLabel("Enter Animal ID:"));
        panel.add(idField);
        panel.add(submitButton);
        panel.add(resultLabel);

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public String getAnimalID() {
        return idField.getText();
    }

    public void setResult(String result) {
        resultLabel.setText(result);
    }

    public void addSubmitButtonListener(ActionListener listener) {
        submitButton.addActionListener(listener);
    }
}
