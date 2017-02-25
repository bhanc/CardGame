package main.java;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

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

        setBackground();

    }

    public void setBackground(){
        JPanel panel=new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                try {
                    BufferedImage image = ImageIO.read(new File("E:\\Programowanie\\GitHub\\CardGame\\src\\main\\java\\Background.jpg"));
                    Image image1 = image.getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH);
                    g.drawImage(image1, 0, 0, null);
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
        };

        add(panel);
    }

}
