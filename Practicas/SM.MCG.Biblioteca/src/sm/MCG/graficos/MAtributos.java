/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.MCG.graficos;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Composite;
import java.awt.RenderingHints;

/**
 * Declaración de la clase MAtributos, Compuesta por los atributos propios de una figura.
 * @author mati.
 */
public class MAtributos{
    
    private Color colorContorno ;
    private Composite composicion;
    private Boolean  transcompo, alisarRend;
    private RenderingHints render;
    private float gradoTransparencia= 0.50F;
    
    /**
     * Constructor por defecto
     */
    public MAtributos(){
        colorContorno = Color.black ;
        transcompo = Boolean.FALSE;
        composicion = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f);
        alisarRend = Boolean.FALSE;
        render = new RenderingHints(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_OFF);
    }
    
    /**
     * Constructor que inicializa con los parametros del color, define si hay transparencia y si hay alisado 
     * @param c, color del contorno de la figura
     * @param transp, transparencia de la figura
     * @param alisar, alisado de la figura 
     */
    public MAtributos(Color c, boolean transp, boolean alisar){ // constructor que se llama en contorno
        colorContorno = c ;
        transcompo = transp;
        setComposicion(transcompo);
        alisarRend = alisar;
        setRender(alisarRend);
    }
    
    /**
     * Constructor que inicializa con los parametros del color, define si hay transparencia y si hay alisado 
     * @param c, color del contorno de la figura
     * @param transp, transparencia de la figura
     * @param grado, define el grado de transparencia de la figura
     * @param alisar, alisado de la figura 
     */
    public MAtributos(Color c, boolean transp,float grado, boolean alisar){
        colorContorno = c ;
        transcompo = transp;
        gradoTransparencia = grado;
        setComposicion(transcompo);
        alisarRend = alisar;
        setRender(alisarRend);
    }
    
    /**
     * Getter del color del contorno
     * @return Color, El color del contorno
     */
    public Color getColorContorno(){
        return this.colorContorno;
    }
    
    /**
     * Setter del color del contorno
     * @param color, El nuevo color del contorno
     */
    public void setColorContorno(Color color) {
        this.colorContorno = color;
    }   
    
    /**
     * Getter del activo de la transparencia de la figura
     * @return booleano, Devuelve si la transparencia de la figura está activa o no 
     */
    public boolean getCompo(){
        return transcompo;
    }
    
    /**
     * Getter de la Composicion, transparencia de la figura
     * @return Composite, La composicion de la figura
     */
    public Composite getComposicion(){
        return composicion;
    }
  
    /**
     * Setter de la Composicion, transparencia de la figura
     * @param transparencia, Determina si hay transparencia o no, si es que si la inicializa a un grado por defecto
     */
    public void setComposicion(boolean transparencia){
        if(transparencia){
            gradoTransparencia((int)(gradoTransparencia*100));
        }else{
            composicion =  AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f);
        }
        transcompo = transparencia;
    }

    /**
     * Setter del grado de transparencia de la figura
     * @param valor, El nuevo grado de transparencia de la figura.
     */
    public void gradoTransparencia(int valor) {
        gradoTransparencia = (float)valor/100;
        composicion =  AlphaComposite.getInstance(AlphaComposite.SRC_OVER, gradoTransparencia);
    }
    
    /**
     * Getter del grado de transparencia de la figura
     * @return float, El grado de transparencia de la figura
     */
    public float getGradoTransparencia(){
        return gradoTransparencia;
    }
    
    /**
     * Getter del booleano que representa renderizado de la figura
     * @return boolean, Determina si está activo el renderizado de la figura
     */
    public boolean getRender(){
        return alisarRend;
    }
    
    /**
     * Getter del renderizado de la figura
     * @return renderinghints, El renderizado de la figura.
     */
    public RenderingHints getAlisar(){
        return render;
    }

    /**
     * Setter del renderizado de la figura
     * @param alisar, Booleano que nos dice si hay o no rendering.
     */
    public void setRender(boolean alisar){
        if(alisar){
            render = new RenderingHints(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        }else{
            render = new RenderingHints(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_OFF);
        }
        alisarRend = alisar ;
    } 
    
}
