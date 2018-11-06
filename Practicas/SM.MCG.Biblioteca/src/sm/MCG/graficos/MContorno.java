/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.MCG.graficos;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Stroke;

/**
 * Declaración de la clase MContorno, hereda de MAtributos. Compuesta por los atributos propios del contorno de una figura.
 * @author mati.
 */
public class MContorno extends MAtributos{
    /**
     * Stroke del contorno
     */
    private Stroke  trazoDiscontinuidad ;
    /**
     * Entero que representa el grosor del trazo
     */
    private int grosor ;
    /**
     * El tipo de acabado del contorno o trazo
     */
    private int cap ;
    /**
     * Separación del trazo en caso de ser discontinua
     */
    private float patronDiscontinuidad[] = {15.0f, 15.0f};
            
    /**
     * Constructor por defecto
     */
    public MContorno(){
        super(Color.BLACK,false,false);
        grosor = 2 ;
        cap = 3 ;
        setStrokeInterno();
    }
    
    /**
     * Constructor que inicializa por defecto y llama a la superclase con los atributos pasados.
     * @param c, color de MAtributos
     * @param transp, transparencia de MAtributos
     * @param alisar, alisado de MAtributos 
     */
    public MContorno(Color c, boolean transp, boolean alisar){
        super(c,transp,alisar);
        grosor = 2 ;
        cap = 3 ;
        setStrokeInterno();
    }
    
    /**
     * Constructor de la clase donde se le puede especificar el grosor y el tipo de discontinuidad del trazo
     * @param c, color de MAtributos, color del relleno
     * @param transp, transparencia de MAtributos
     * @param alisar, alisado de MAtributos
     * @param g, grosor de la linea
     * @param ca, tipo de discontinuidad 
     */
    public MContorno(Color c, boolean transp, boolean alisar, int g, int ca){
        super(c,transp,alisar);
        grosor = g ;
        cap = ca ;
        setStrokeInterno();
    }
    
    /**
     * Constructor de la clase donde se le puede especificar el grosor y el tipo de discontinuidad del trazo
     * @param c, color de MAtributos, color del relleno
     * @param transp, transparencia de MAtributos
     * @param grado, grado de MAtributos, dice el grado de transparencia de la figura
     * @param alisar, alisado de MAtributos
     * @param g, grosor del trazo
     * @param ca, tipo de discontinuidad del trazo
     */
    public MContorno(Color c, boolean transp,float grado, boolean alisar, int g, int ca){
        super(c,transp,grado,alisar);
        grosor = g ;
        cap = ca ;
        setStrokeInterno();
    }
    
    /**
     * Constructor de la clase donde se le puede especificar el grosor y el tipo de discontinuidad del trazo
     * @param c, color de MAtributos, color del relleno
     * @param transp, transparencia de MAtributos
     * @param grado, grado de MAtributos, dispone la separación cuando el trazo es discontinuo
     * @param alisar, alisado de MAtributos
     * @param g, grosor del trazo
     * @param ca, tipo de discontinuidad del trazo
     * @param patron, patron de la discontinuidad, dispone la separación cuando el trazo es discontinuo  
     */
    public MContorno(Color c, boolean transp,float grado, boolean alisar, int g, int ca, float[] patron){
        super(c,transp,grado,alisar);
        grosor = g ;
        cap = ca ;
        patronDiscontinuidad = patron ;
        setStrokeInterno();
    }
    
    /**
     * Getter de la propia clase, MContorno
     * @return MContorno, La clase contorno con todos sus atributos
     */
    public MContorno getContorno(){
        return this;
    }  
    
    /**
     * Setter del grosor del trazo
     * @param nuevo, El nuevo grosor del trazo
     */
    public void setGrosor(int nuevo){
        grosor = nuevo ;
        setStrokeInterno();
    }
    
    /**
     * Getter del grosor del trazo
     * @return int, grosor del trazo de la figura.
     */
    public int getGrosor(){
        return grosor;
    }
    
    /**
     * Setter del valor de la decoración, terminación del trazo o contorno
     * @param valor, int que indica el tipo de decoracion de la discontinuidad
     */
    public void setDiscontinuidad(int valor){
        cap = valor;
        setStrokeInterno();
    }
    
    /**
     * Getter del valor de la decoración, terminación del trazo o contorno
     * @return cap, int que indica el tipo de decoración de la discontinuidad
     */
    public int getDiscontinuidad(){
        return cap;
    }
    
    /**
     * Setter del patron de la discontinuidad, separación del trazo cuando es discontinua
     * @param patron, El nuevo valor del patron, separación del entrelineado. 
     */
    public void setPatronDiscontinuidad(int patron){
        float aux[] = {(float)patron, (float)patron};
        patronDiscontinuidad = aux ;
        setStrokeInterno();
    }
    
    /**
     * Getter de la separacion del entrelineado
     * @return int, el patron de separación del entrelineado.
     */
    public int getPatronDiscontinuidad(){
        return (int) patronDiscontinuidad[0];
    }
    
    /**
     * Getter del stroke del trazo.
     * @return trazo, tipo de contorno.
     */
    public Stroke getTrazoDiscontinuidad(){
        return trazoDiscontinuidad;
    }
    
    /**
     * metodo privado para generar el stroke dependiendo de los diferentes argumentos
     */
    private void setStrokeInterno(){
        if(cap == 3 ){
            trazoDiscontinuidad =  new BasicStroke(grosor);
        }else{
            trazoDiscontinuidad = new BasicStroke(grosor,cap,BasicStroke.JOIN_MITER, 1.0f,patronDiscontinuidad, 0.0f);
        } 
    }
}
