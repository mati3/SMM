/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.MCG.imagen;

import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import static java.lang.Math.abs;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import sm.image.BufferedImageOpAdapter;

/**
 * Clase Propia que contiene un nuevo filtro componente a componente.
 * @author mati
 */
public class PropioCC extends BufferedImageOpAdapter{
    
    /**
     * Constructor por defecto de la clase PropioCC para generar un nuevo objeto.
     */
    public PropioCC() {
    }

    @SuppressWarnings("empty-statement")
    
    /**
     * Filtro propio componente a componente, le aplicamos la funcion coseno a cada componente.
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
                for (int band = 0; band < rastersrc.getNumBands(); band++) {
                    int sample = rastersrc.getSample(x, y, band);
                    sample *= abs(cos(sample));
                    rasterdest.setSample(x, y, band, sample);
                }  
            }
        }
        return dest;
    }
}
