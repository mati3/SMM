/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.MCG.graficos;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 * Declaración de la clase MFigurasRelleno, hereda de MFiguras
 * @author mati
 */
public abstract class MFigurasRelleno extends MFiguras{

    /**
     * Constructor por defecto
     */
    public MFigurasRelleno() {
    }
    
    /**
     * Constructor con relleno y contorno.
     * @param conto, El contorno del rectangulo
     * @param rell, El relleno del rectangulo
     */
    public MFigurasRelleno(MContorno conto, MRelleno rell) {
        super(conto, rell);
    }
    
    @Override
    public abstract boolean contains(Point2D pos);

    @Override
    public abstract void setLocation(Point2D p);

    @Override
    public abstract Point2D getLocation();

    @Override
    public abstract void updateShape(Point2D p);

    @Override
    public abstract void paint(Graphics2D g2d);
    
    /**
     * Setter para saber si hay relleno en la figura
     * @param booleano, Booleano que nos dice si hay o no relleno. 
     */  
    @Override
    public void setBoolRelleno(Boolean booleano){
        mirelleno.setBoolRelleno(booleano);
    }
    
    /**
     * Getter para darle la opcion de tener relleno.
     * @return booleano, Booleano que nos permite saber si tenemos o no relleno 
     */
    @Override
    public boolean getBoolRelleno(){        
        return mirelleno.getBoolRelleno();
    }
    
    /**
     * Getter del color del relleno actual
     * @return Color, El color del relleno
     */
    @Override
    public Color getColorRelleno(){
        return mirelleno.getColorRelleno();
    }
    
    /**
     * Setter del color del relleno
     * @param color, El nuevo color del relleno.
     */
    @Override
    public void setColorRelleno(Color color) {
        mirelleno.setColorRelleno(color);
    }
    
    /**
     * Setter del color del degradado
     * @param color, El nuevo color del degradado
     */
    @Override
    public void setColorDegradado(Color color){
        mirelleno.setColorDegradado(color);
    }
    
    /**
     * Getter del color del degradado
     * @return Color , El color del degradado. 
     */
    @Override
    public Color getColorDegradado(){
        return mirelleno.getColorDegradado();
    }
    
    /**
     * Setter de las opciones del degradado
     * @param option, La nueva opción del tipo de degradado, pudiendo ser horizontal(0), vertical(1) o inclinado(2)
     */
    @Override
    public void setOpcionDegradado(int option){
        mirelleno.setOpcionDegradado(option);
    }
    
    /**
     * Getter de las opciones del degradado
     * @return int, Entero que representa la opcion de degradado elegida
     *  pudiendo ser horizontal(0), vertical(1) o inclinado(2)
     */
    @Override
    public int getOptionDegradado(){
        return mirelleno.getOptionDegradado();
    }
    
    /**
     * Setter de si hay degradado o no
     * @param si, Booleano que nos dice si hay o no degradado.
     */
    @Override
    public void SetSiDegradado(boolean si){
        mirelleno.SetSiDegradado(si);
    }
    
    /**
     * Getter para decidir si hay degradado o no lo hay 
     * @return booleano, Booleano que nos permite saber si tenemos o no degradado
     */
    @Override
    public boolean getSiDegradado(){
        return mirelleno.getSiDegradado()  ;
    }
    
    /**
     * Getter del rectangulo que engloba la figura actual
     * @return Rectangle2D, El rectangulo que engloba la figura actual
     */
    @Override
    public abstract Rectangle2D getBounds2D(); 
 
    
}
