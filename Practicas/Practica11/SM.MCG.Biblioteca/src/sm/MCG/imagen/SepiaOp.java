/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.MCG.imagen;

import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import static java.lang.Math.min;
import sm.image.BufferedImageOpAdapter;

/**
 *
 * @author mati
 */
public class SepiaOp extends BufferedImageOpAdapter{
    
    public SepiaOp(){
    }
    
    @Override
    public BufferedImage filter(BufferedImage src, BufferedImage dest){
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
                int sepiaR = (int) min(255 , 0.393*pixelComp[0] + 0.769*pixelComp[1] + 0.189*pixelComp[2]);
                int sepiaG = (int) min(255, 0.349*pixelComp[0] + 0.686*pixelComp[1] + 0.168*pixelComp[2]);
                int sepiaB = (int) min(255, 0.272*pixelComp[0] + 0.534*pixelComp[1] + 0.131*pixelComp[2]);
                if(src.getColorModel().hasAlpha()){
                    int[] aux = {sepiaR, sepiaG,sepiaB,pixelComp[3]};         
                    rasterdest.setPixel(x, y, aux);   
                }else{
                    int[] aux = {sepiaR, sepiaG,sepiaB};         
                    rasterdest.setPixel(x, y, aux);
                }
            }
        }
        return dest;

                
        }

}
