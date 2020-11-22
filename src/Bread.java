import javax.swing.*;
import java.awt.*;

public class Bread
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(() ->
        {
            var frame = new BreadFrame();
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setTitle("Bread");
            frame.setVisible(true);
            frame.setLocation(400,200);
        });
    }
}

class BreadFrame extends JFrame
{
    private static final int DEFAULT_WIDHT = 500;
    private static final int DEFAULT_HEIGHT = 400;
    private JPanel panel;
    private JLabel label;

    public BreadFrame()
    {
        setSize(DEFAULT_WIDHT, DEFAULT_HEIGHT);

        panel = new JPanel();
        label = new JLabel("Our bread is the best");
        panel.add(label);
        add(panel, BorderLayout.CENTER);
    }
}