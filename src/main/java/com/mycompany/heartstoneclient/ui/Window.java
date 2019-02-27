package com.mycompany.heartstoneclient.ui;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Window {

    JFrame frame;
    JScrollPane pane;
    JTextArea textArea;

    public Window() throws IOException {
        
        BufferedImage myImage = ImageIO.read(new File("C:\\Users\\Daniels\\Documents\\NetBeansProjects\\HearthStoneClient\\Heartstone-Client\\src\\main\\java\\res\\newPicture.jpg"));
        
        frame = new MainFrame("Hello",myImage);
        frame.setResizable(false);
        frame.setSize(800,600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.requestFocus();
        frame.setVisible(true);
      
        
    }

}
