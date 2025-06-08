/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fl.zaplify.util;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author MSI CYBORG
 */
public class AppIcon {
    
    private static Image appIcon;
    static {
        try {
            URL iconpath = AppIcon.class.getResource("/fl/zaplify/img/mainLogo.png");
            ImageIcon icon = new ImageIcon(iconpath);
            AppIcon.appIcon =icon.getImage();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "invalid icon path");
        }
    
    
    
    }
    public static void applyIcon(JFrame frame){
        if(frame != null){
            frame.setIconImage(appIcon);
        }
    }
    
    
    
}
