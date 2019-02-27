
package com.mycompany.heartstoneclient.ui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JComponent;

class ImagePane extends JComponent {
    private Image image;
    public ImagePane(Image image) {
        this.image = image;
        
    }
    
    public void setImage(Image image ){
    this.image = image;
    Dimension size = new Dimension(this.getWidth(),this.getHeight());
    this.setPreferredSize(size);
    this.setMaximumSize(size);
    this.setMinimumSize(size);
    this.setSize(size);
    this.setOpaque(false);
    
    
    
    
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
    }
}
