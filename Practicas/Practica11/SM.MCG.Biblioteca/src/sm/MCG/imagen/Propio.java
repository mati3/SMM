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
 *
 * @author mati
 */
public class Propio extends BufferedImageOpAdapter{

    public Propio() {
    }

    @Override
    @SuppressWarnings("empty-statement")
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
