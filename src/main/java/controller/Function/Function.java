/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Function;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author LENOVO
 */
public class Function {

    public static ImageIcon scaleImg(JLabel jLabel, String url) {
        ImageIcon imageIcon = new ImageIcon(Function.class.getResource(url));
        Image image = imageIcon.getImage();
        Image scaledImage = image.getScaledInstance(jLabel.getWidth(), jLabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        return scaledIcon;
    }

    public static ImageIcon scaleImg(JLabel jLabel, ImageIcon icon) {
        Image image = icon.getImage();
        Image scaledImage = image.getScaledInstance(jLabel.getWidth(), jLabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        return scaledIcon;
    }

}
