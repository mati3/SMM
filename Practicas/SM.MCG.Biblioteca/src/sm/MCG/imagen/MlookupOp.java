/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.MCG.imagen;

import java.awt.image.LookupTable;
import java.awt.image.ShortLookupTable;
import sm.image.LookupTableProducer;

/**
 * Clase MlookupOp que hereda de LookupTableProducer para nuevos procesamientos de imagenes
 * @author mati
 */
public class MlookupOp extends LookupTableProducer{

    /**
     * Contructor para un nuevo objeto MlookupOp
     */
    public MlookupOp() {
    }
    
    /**
     * Crea un nuevo LookupTable para binarizar la imagen.
     * @return LookupTable, la nueva tabla para crear la imagen
     */
    public static LookupTable createLookupTableBinariza(){
        short[] data= new short[256];
        for(int i = 0 ; i < 256 ; i++){
            data[i] = (i < 128) ? (short) 0 : (short) 255 ;
        }
        LookupTable nuevo = new ShortLookupTable(0, data);
        return nuevo;
    }
    
    /**
     * Crea un nuevo LookupTable donde la imagen coge aspecto de posted.
     * @return LookupTable, la nueva tabla para crear la imagen
     */
    public static LookupTable createLookupTablePosteriza(){
        
        short[] data= new short[256];
        for(int i = 0 ; i < 256 ; i++){
            data[i] = (short) (i - (i% 32)) ;
        }
        
        LookupTable nuevo = new ShortLookupTable(0, data);
        return nuevo;
    }   
}
