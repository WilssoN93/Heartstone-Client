package com.mycompany.heartstoneclient.ui;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Window {

    JFrame frame;
    JScrollPane pane;
    JTextArea textArea;

    public Window() {
        
        frame = new MainFrame("Hello");
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(800,600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.requestFocus();
       
        
    }

}
