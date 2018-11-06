/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.MCG.imagen;

import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import sm.image.BufferedImageOpAdapter;

/**
 * Clase Propia que contiene un nuevo filtro pixel a pixel.
 * @author mati
 */
public class PropioPP extends BufferedImageOpAdapter{

    /**
     * Constructor por defecto de la clase PropioPP para generar un nuevo objeto.
     */
    public PropioPP() {
    }

    @Override
    @SuppressWarnings("empty-statement")
    
    /**
     * Filtro propio pixel a pixel.
     * @param src, La imagen origen a copiar.
     * @param dest, La imagen destio donde se copiara la imagen origen con la transformacion.
     * @return BufferedImage, La imagen filtrada.
     */
    public BufferedImage filter(BufferedImage src, BufferedImage dest) {
        if (src == null) {
            throw new NullPointerException("src es null");
        }
        if (dest == null) {
            dest = createCompatibleDestImage(src, null);
        }

        WritableRaster rasterdest = dest.getRaster();
        WritableRaster rastersrc= src.getRaster();
        for (int x = 0; x < src.getWidth(); x++) {
            for (int y = 0; y < src.getHeight(); y++) {       
                int[] pixelComp=null;
                pixelComp = rastersrc.getPixel(x, y, pixelComp);
                pixelComp[1] *= x*y;
                if(src.getColorModel().hasAlpha()){
                    int[] aux = {pixelComp[0], pixelComp[1], pixelComp[2],pixelComp[3]};  
                    rasterdest.setPixel(x, y, aux);
                }else{
                    int[] aux = {pixelComp[0], pixelComp[1], pixelComp[2]};  
                    rasterdest.setPixel(x, y, aux);
                }   
            }
        }
        return dest;
    }
    
}
