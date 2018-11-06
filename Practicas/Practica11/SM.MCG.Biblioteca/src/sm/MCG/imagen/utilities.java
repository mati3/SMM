/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.MCG.imagen;

import java.awt.Point;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.ByteLookupTable;
import java.awt.image.LookupTable;
import static java.lang.Math.abs;
import static java.lang.Math.sin;
import static java.lang.Math.toRadians;

/**
 *
 * @author mati
 */
public class utilities {
    

    //funcion que comprueba las extensiones de las imagenes para ver si estan dentro de las posibles. usado en guardar imagen
    public boolean extensionesImagen(String sub){
        boolean salida = false ;
        if("gif".equals(sub) || "jpg".equals(sub) || "png".equals(sub) || "jpeg".equals(sub)){ // comprobar si hay que poner alguno mas...
            salida = true;
        }
        return salida;
    }
    
    //funcion seno usada en ventana10/senoActionPerformed
    public LookupTable seno(float w){
        double K = 255.0;
        byte lt[] = new byte[256];
        lt[0]=0;
        for (int l=1; l<256; l++){
            lt[l] = (byte)(K*(abs(sin(toRadians(w)*((double)l)))));
        }
        ByteLookupTable slt = new ByteLookupTable(0,lt);
        return slt;
    }
    
    // metodo usado en rotacion 90, 180, 270
    /*public void rotation(int roto){
        ventana_interna vi = (ventana_interna) (this.jDesktopPane1.getSelectedFrame());
        if (vi != null) {
            BufferedImage imgSource = vi.lienzo1().getImage();
        
        double r = Math.toRadians(roto);
        Point c = new Point(imgSource.getWidth()/2, imgSource.getHeight()/2);
        AffineTransform at = AffineTransform.getRotateInstance(r,c.x,c.y);
        AffineTransformOp atop;
        atop = new AffineTransformOp(at,AffineTransformOp.TYPE_BILINEAR);
        BufferedImage imgdest = atop.filter(imgSource, null);
        
            vi.lienzo1().setImage(imgdest);
            vi.lienzo1().repaint();
        }
    }*/
    
    //buscar las clases public de ventana.
}