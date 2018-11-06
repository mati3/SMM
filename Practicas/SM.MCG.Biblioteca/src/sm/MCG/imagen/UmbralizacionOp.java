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
 * Clase propia UmbralizacionOp que hereda de BufferedImageOpAdapter.
 * Este filtro cambia el aspecto visual a blanco y negro dependiendo del umbral pasado por parametro en su creación.
 * @author mati
 */
public class UmbralizacionOp extends BufferedImageOpAdapter{
    /**
     * Umbral de la clase, todo por debajo de este umbral será blanco y por encima negro.
     */
    private int umbral;
    
    /**
     * Constructor de la clase Umbralización para crear un nuevo objeto
     * @param umbral, El umbral para el tratamiento de la imagen. 
     */
    public UmbralizacionOp(int umbral) {
        this.umbral = umbral;
    }
    
    /**
     * Filtro que copia la imagen de entrada a la de salida aplicando los cambios propios de la clase
     * Todo lo que esté por debajo del umbral será blanco y lo que esté por encima negro.
     * @param src, La imagen a copiar.
     * @param dest, La imagen de destino.
     * @return BufferedImage, la imagen de salida con los cambios propios del filtro.
     */
    @Override
    public BufferedImage filter(BufferedImage src, BufferedImage dest){
        //Código de umbralización
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
                
                    int intensidad = (pixelComp[0] + pixelComp[1] + pixelComp[2]) / 3 ;

                    int sepiaR = (intensidad < umbral) ? (int) 0 : (int) 255 ;
                    int sepiaG = (intensidad < umbral) ? (int) 0 : (int) 255 ;
                    int sepiaB = (intensidad < umbral) ? (int) 0 : (int) 255 ;

                
                
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
