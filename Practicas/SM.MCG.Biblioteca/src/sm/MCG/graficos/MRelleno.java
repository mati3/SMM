/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.MCG.graficos;

import java.awt.Color;

/**
 * Declaración de la clase MRelleno, hereda de MAtributos. Compuesta por los atributos propios del relleno de una figura.
 * @author mati.
 */
public class MRelleno extends MAtributos{
    
    private Color colorDegradado ;
    private Color colorRelleno ;
    private Boolean  sidegradado,relleno;
    private int opcionDegradado = 0;
    
    /**
     * Constructor por defecto de la clase
     */
    public MRelleno(){
        super();
        colorRelleno = Color.BLACK ;
        colorDegradado = Color.BLACK;
        sidegradado = Boolean.FALSE;
        relleno = Boolean.FALSE;
    }
    
    /**
     * Constructor que inicializa por defecto y llama a la superclase con los atributos pasados.
     * @param color, color de MAtributos
     * @param transparencia, transparencia de MAtributos
     * @param alisar, alisado de MAtributos
     */
    public MRelleno(Color color,boolean transparencia, boolean alisar ){
        super(color,transparencia,alisar );
        colorRelleno = color ;
        colorDegradado = Color.BLACK;
        sidegradado = Boolean.FALSE;
        relleno = Boolean.FALSE;
    }
    
    /**
     * Contructor de la clase donde se le puede especificar si tiene relleno y cual será su color
     * @param colorr, color de MAtributos, color del relleno
     * @param transparencia, transparencia de MAtributos
     * @param alisar, alisado de MAtributos
     * @param rell, booleano que nos dice si la fugura contendrá relleno. 
     */
    public MRelleno(Color colorr,boolean transparencia, boolean alisar, boolean rell){
        super(colorr,transparencia,alisar );
        this.colorRelleno =colorDegradado= colorr ;
        sidegradado = Boolean.FALSE;
        relleno = rell;
    }
    
    /**
     * Constructor de la clase, con opciones de relleno, degradado y dar valores a su superclase.
     * @param colorr, color de MAtributos, color del relleno, si hay degradado será su primer color.
     * @param colord, color del degradado, su segundo color.
     * @param transparencia, transparencia de MAtributos,
     * @param alisar, alisado de MAtributos,
     * @param rell, booleano que nos dice si la fugura contendrá relleno.
     * @param sidegra, booleano que nos dice si la figura tendrá degradado.
     */
    public MRelleno(Color colorr,Color colord,boolean transparencia, boolean alisar, boolean rell, boolean sidegra){
        super(colorr,transparencia,alisar );
        this.colorRelleno = colorr ;
        colorDegradado = colord;
        sidegradado = sidegra;
        relleno = rell;
    }
    
    /**
     * Constructor de la clase, con opciones de relleno, degradado, opciones de degradado y dar valores a su superclase.
     * @param colorr, color de MAtributos, color del relleno, si hay degradado será su primer color.
     * @param colord, color del degradado, su segundo color.
     * @param transparencia, transparencia de MAtributos,
     * @param alisar, alisado de MAtributos,
     * @param rell, booleano que nos dice si la fugura contendrá relleno.
     * @param sidegra, booleano que nos dice si la figura tendrá degradado.
     * @param option, int que indica el tipo de degradado, pudiendo ser horizontal(0), vertical(1) o inclinado(2) 
     */
    public MRelleno(Color colorr,Color colord,boolean transparencia, boolean alisar, boolean rell, boolean sidegra, int option){
        super(colorr,transparencia,alisar );
        this.colorRelleno = colorr ;
        colorDegradado = colord;
        sidegradado = sidegra;
        relleno = rell;
        opcionDegradado=option;
    }
    
    /**
     * Constructor de la clase, con opciones de relleno y degradado
     * @param colorr, color de MAtributos, color del relleno, si hay degradado será su primer color.
     * @param colord, color del degradado, su segundo color.
     * @param rell, booleano que nos dice si la fugura contendrá relleno.
     * @param sidegra, booleano que nos dice si la figura tendrá degradado.
     * @param option, int que indica el tipo de degradado, pudiendo ser horizontal(0), vertical(1) o inclinado(2) 
     */
    public MRelleno(Color colorr,Color colord, boolean rell, boolean sidegra, int option){
        super();
        this.colorRelleno = colorr ;
        colorDegradado = colord;
        sidegradado = sidegra;
        relleno = rell;
        opcionDegradado=option;
    }
    
    /**
     * Getter de la propia clase, MRelleno
     * @return MRelleno, La clase relleno con todos sus atributos
     */
    public MRelleno getRelleno(){
        return this;
    }
    
    /**
     * Getter del color del relleno actual
     * @return Color, El color del relleno
     */
    public Color getColorRelleno(){
        return this.colorRelleno;
    }
    
    /**
     * Setter del color del relleno
     * @param color, El nuevo color del relleno.
     */
    public void setColorRelleno(Color color) {
        this.colorRelleno = color;
    }
    
    /**
     * Setter del color del degradado
     * @param color, El nuevo color del degradado
     */
    public void setColorDegradado(Color color) {
        this.colorDegradado = color;
    }
    
    /**
     * Getter del color del degradado
     * @return Color , El color del degradado. 
     */
    public Color getColorDegradado(){
        return this.colorDegradado;
    }
    
    /**
     * Setter de las opciones del degradado
     * @param option, La nueva opción del tipo de degradado, pudiendo ser horizontal(0), vertical(1) o inclinado(2)
     */
    public void setOpcionDegradado(int option){
        opcionDegradado = option;
    }
    
    /**
     * Getter de las opciones del degradado
     * @return int, Entero que representa la opcion de degradado elegida
     *  pudiendo ser horizontal(0), vertical(1) o inclinado(2)
     */
    public int getOptionDegradado(){
        return opcionDegradado;
    }
    
    /**
     * Setter de si hay degradado o no
     * @param si, Booleano que nos dice si hay o no degradado.
     */
    public void SetSiDegradado(boolean si){
        sidegradado = si ;
    }
    
    /**
     * Getter para decidir si hay degradado o no lo hay 
     * @return booleano, Booleano que nos permite saber si tenemos o no degradado
     */
    public boolean getSiDegradado(){
        return sidegradado  ;
    }
    
    /**
     * Setter para decir si hay relleno en la figura
     * @param booleano, Booleano que nos dice si hay o no relleno. 
     */
    public void setBoolRelleno(Boolean booleano){
        relleno = booleano;
    }
    
    /**
     * Getter para darle la opcion de tener relleno.
     * @return booleano, Booleano que nos permite saber si tenemos o no relleno 
     */
    public boolean getBoolRelleno(){
        return relleno;
    }

}
