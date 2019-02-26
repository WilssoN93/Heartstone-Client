
package com.mycompany.heartstoneclient.ui;

import java.awt.image.BufferedImage;
import java.net.URL;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javax.imageio.ImageIO;


public class ImageLoader {
    
    
    public ImageLoader(String url){
        
               for (int i = 0; i < 30; i++) {
            if (o.javaObject().getAllCards().get(i).getImg() != null) {

                URL url = new URL(o.javaObject().getAllCards().get(i).getImg());
                BufferedImage bufferedimage = ImageIO.read(url);
                System.out.println(o.javaObject().getAllCards().get(i).getImg());
                Image image = SwingFXUtils.toFXImage(bufferedimage, null);

                new ImageView(image);

            }

        }
    
    }

}
