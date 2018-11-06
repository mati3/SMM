/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.MCG.imagen;

import java.awt.Color;
import java.awt.Point;
import java.awt.Transparency;
import java.awt.color.ColorSpace;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.ByteLookupTable;
import java.awt.image.ComponentColorModel;
import java.awt.image.DataBuffer;
import java.awt.image.LookupTable;
import java.awt.image.WritableRaster;
import static java.lang.Math.abs;
import static java.lang.Math.sin;
import static java.lang.Math.toRadians;
import sm.image.BufferedImageOpAdapter;

/**
 * Clase propia utilities que hereda de BufferedImageOpAdapter.
 * Agrupa todos los metodos que nos han echo falta para darle funcionalidad a nuestra clase final.
 * @author mati
 */
public class utilities extends BufferedImageOpAdapter{

    /**
     * Constructor para nuevo objeto de la clase utilities.
     */
    public utilities() {
    }
    

    /**
     * Metodo que comprueba si la extensión del nombre de la imagen está en buen formato.
     * @param sub, la extension de la imagen.
     * @return verdadero si es alguna de las extensiones propias de una imagen, falso en otro lugar.
     */
    public boolean extensionesImagen(String sub){
        boolean salida = false ;
        if("gif".equals(sub) || "jpg".equals(sub) || "png".equals(sub) || "jpeg".equals(sub)){ // comprobar si hay que poner alguno mas...
            salida = true;
        }
        return salida;
    }
    
    /**
     * Funcion seno que crea un LookupTable.
     * @param w, grado del seno.
     * @return LookupTable, para el nuevo filtro
     */
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
    
    /**
     * Metodo para sacar las bandas de la imagen.
     * @param iBanda, el numero de banda del cual queremos generar la nueva imagen.
     * @param src, imagen a la que queremos sacar la banda.
     * @return BufferedImage, la nueva imagen de la banda. 
     */
    public BufferedImage getBanda(int iBanda, BufferedImage src){
        ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_GRAY);
        //Creamos el nuevo raster a partir del raster de la imagen original
        int bandList[] = {iBanda};
        WritableRaster bandRaster = (WritableRaster)src.getRaster().createWritableChild(0,0,src.getWidth(), src.getHeight(), 0, 0, bandList);
        ComponentColorModel cm = new ComponentColorModel(cs, false, false,Transparency.OPAQUE,DataBuffer.TYPE_BYTE);
        BufferedImage imgBanda  = new BufferedImage(cm,bandRaster,false,null);
        
        return imgBanda;
    }
    
    /**
     * Rota la imagen.
     * @param roto, El  grado de rotación que queremos conseguir.
     * @param imgSource, imagen que queremos rotar.
     * @return BufferedImage, la imagen en su nueva posicion.
     */
    public BufferedImage rotation(int roto,BufferedImage imgSource){
        double r = Math.toRadians(roto);
        Point c = new Point(imgSource.getWidth()/2, imgSource.getHeight()/2);
        AffineTransform at = AffineTransform.getRotateInstance(r,c.x,c.y);
        AffineTransformOp atop;
        atop = new AffineTransformOp(at,AffineTransformOp.TYPE_BILINEAR);
        BufferedImage imgdest=null;
        if(imgSource.getType()==0){
            imgdest = atop.filter(this.filter(imgSource, null), null);
        }else{
            imgdest = atop.filter(imgSource, null);
        }
        return imgdest;
    }
    
    /**
     * Filtro propio para cuando capturamos la imagen de la cam pasarlo por algunas funciones antes de pasarle el filtro propio de la accion que queremos realizar.
     * @param src, La imagen origen a copiar.
     * @param dest, La imagen destio donde se copiara la imagen origen con la transformacion.
     * @return BufferedImage, La imagen filtrada.
     */
    @Override
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
                
                                
                if(src.getColorModel().getNumComponents()==4){
                    int[] aux = {pixelComp[0], pixelComp[1],pixelComp[2],pixelComp[3]};         
                    rasterdest.setPixel(x, y, aux);   
                }else if(src.getColorModel().getNumComponents()==3){
                    int[] aux = {pixelComp[0], pixelComp[1],pixelComp[2]};         
                    rasterdest.setPixel(x, y, aux);
                }else if(src.getColorModel().getNumComponents()==2){
                    int[] aux = {pixelComp[0], pixelComp[1]};         
                    rasterdest.setPixel(x, y, aux);
                }else if(src.getColorModel().getNumComponents()==1){
                    int[] aux = {pixelComp[0]};         
                    rasterdest.setPixel(x, y, aux);
                }
            }
        }
        return dest;
    }
    
    /**
     * Filtro propio que tinta la imagen de color rojo.
     /**
     * Filtro sepia.
     * @param src, La imagen origen a copiar.
     * @param dest, La imagen destio donde se copiara la imagen origen con la transformacion.
     * @param color, El color del que quieres tintar la imagen.
     * @return BufferedImage, La imagen filtrada.
     */
    public BufferedImage filterColor(BufferedImage src, BufferedImage dest, Color color){
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
                    int sepiaR,sepiaG,sepiaB;
                    
                    if(color == Color.red){
                        sepiaG =  0 ;
                    }else{
                        sepiaG = pixelComp[0];
                    }
                    if(color == Color.GREEN){
                        sepiaR =  0 ;
                    }else{
                        sepiaR = pixelComp[1];
                    }
                    if(color == Color.red){
                        sepiaB =  0 ;
                    }else{
                        sepiaB = pixelComp[2];
                    }
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