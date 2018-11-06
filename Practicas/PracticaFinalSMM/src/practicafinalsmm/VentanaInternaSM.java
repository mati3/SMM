/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicafinalsmm;

import java.awt.image.BufferedImage;

/**
 * Clase principal VentanaInternaSM de la que heredaran todas las ventanas internas, extiende de JInternalFrame.
 * @author mati
 */
public class VentanaInternaSM extends javax.swing.JInternalFrame{

    /**
     * Constructor por defecto.
     */
    public VentanaInternaSM() {
    }
    
    /**
     * Constructor por defecto, le da nombre a la nueva imagen.
     * @param nuevo , El nombre de la nueva imagen.
     */
    public VentanaInternaSM(String nuevo) {
        super(nuevo, true, true, true, true);
    }
    
    /**
     * Getter de la imagen seleccionada.
     * @return BufferedImage, La imagen seleccionada.
     */
    public BufferedImage getImagen(){
        return null;
    }
    
    /**
     * Getter de la imagen instantanea.
     * @return BufferedImage, La instantanea seleccionada
     */
    public BufferedImage getShot(){
        return null;
    }
    
    /**
     * Getter de la imagen de la Cam.
     * @return BufferedImage, La instantanea seleccionada
     */
    public BufferedImage getCam(){
        return null;
    }
    
}
