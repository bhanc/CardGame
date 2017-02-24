import javax.swing.*;

/**
 * Created by Bartosz Hanc on 2017-02-24.
 */
public class MainFrame extends JFrame {
    private final static String title = "Gra Karciana";

    public MainFrame(){
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
}
