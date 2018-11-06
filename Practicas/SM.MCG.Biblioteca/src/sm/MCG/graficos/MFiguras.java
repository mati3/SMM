/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.MCG.graficos;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 * Declaración de la clase abstracta MFiguras
 * @author mati
 */
public abstract class MFiguras{
    
    /**
     * Contorno de la figura
     */
    protected MContorno micontorno;
    
    /**
     * Relleno de la figura
     */
    protected MRelleno mirelleno;
    
    /**
     * Paint para cuando la figura tiene color degradado
     */
    protected Paint degradado;
    
    /**
     * Constructor por defecto, crea un contorno y un relleno por defecto
     */
    public MFiguras() {
        micontorno = new MContorno();
        mirelleno = new MRelleno();
    }
    /**
     * Constructor que crea el contorno pre establecido de la figura.
     * @param conto, El contorno de la figura
     */   
    public MFiguras(MContorno conto) { //se hacen figuras solo con contorno
        micontorno = conto;
        mirelleno = new MRelleno();
    }
    /**
     * Constructor de figura con contorno y relleno
     * @param conto, El contorno de la figura
     * @param rell, El relleno de la figura
     */
    public MFiguras(MContorno conto, MRelleno rell) { // figura con contorno y relleno
        micontorno = conto;
        mirelleno = rell;
    }  
    
    /**
     * Getter del contorno de la figura
     * @return MContorno, el contorno de la figura
     */
    public MContorno getContorno(){
        return  micontorno;
    }
    
    /**
     * Setter del contorno de la figura
     * @param cont, El contorno de la figura 
     */
    public void setContorno(MContorno cont){
        micontorno = cont;
    }
    
    /**
     * Getter del relleno de la figura
     * @return MRelleno, el relleno de la figura
     */
    public MRelleno getRelleno(){
        return mirelleno;
    }
    
    /**
     * Setter del relleno de la figura.
     * @param rell, El relleno de la figura.
     */
    public void setRelleno(MRelleno rell){
        mirelleno = rell;
    }
    
     /**
     * Metodo que devuelve si el punto pasado como parametro se encuentra en nuestra figura 
     * @param pos, punto actual
     * @return booleano, Si esta contenido o no en la figura actual
     */
    public abstract boolean contains(Point2D pos);
    
    /**
     * Setter que mueve la figura actual a la posición dada por el punto pasado como parametro
     * @param p, El punto actual de la nueva localización de la figura.
     */
    public abstract void setLocation( Point2D p);
    
    /**
     * Getter que da la posición actual de la figura.
     * @return Point2D, El punto donde empieza la figura.
     */
    public abstract Point2D getLocation();
    
    /**
     * Actualiza la figura con el punto pasado por parametro
     * @param p, Punto2D para la actualización de la figura
     */
    public abstract void updateShape(Point2D p);
    
    /**
     * Metodo que dibuja la figura
     * @param g2d, El Graphics que dibuja la figura actual
     */
    public abstract void paint(Graphics2D g2d);
    
    /**
     * Getter del rectangulo que engloba la figura actual
     * @return Rectangle2D, El rectangulo que engloba a la ellipse actual
     */
    public abstract Rectangle2D getBounds2D();
    
    /**
     * Metodo privado que dibuja la figura
     * @param g2d, El Graphics que dibuja la figura actual
     * @param mifigura, La figura a pintar.
     */
    protected void miPaint(Graphics2D g2d,Shape mifigura ){
        g2d.setPaint(micontorno.getColorContorno());
        g2d.setStroke(micontorno.getTrazoDiscontinuidad());
        g2d.setComposite(micontorno.getComposicion());
        g2d.setRenderingHints(micontorno.getAlisar());
        
        g2d.draw(mifigura);
              if(mirelleno.getBoolRelleno()){ 
          g2d.setPaint(mirelleno.getColorRelleno()); //color liso de relleno

          if(mirelleno.getSiDegradado()){
            if(mirelleno.getOptionDegradado()==0){
              Point2D uno = new Point2D.Double(mifigura.getBounds().getMinX(),mifigura.getBounds().getMinY());
              Point2D dos = new Point2D.Double(mifigura.getBounds().getMaxX(),mifigura.getBounds().getMaxY());
              degradado = new GradientPaint(uno,mirelleno.getColorRelleno(), dos, mirelleno.getColorDegradado()); // degradado horizontal, entre el color elejido y el azul
              g2d.setPaint(degradado);
            }else if(mirelleno.getOptionDegradado()==1){
              Point2D uno = new Point2D.Double(mifigura.getBounds().getMaxY(),mifigura.getBounds().getMinY());
              Point2D dos = new Point2D.Double(mifigura.getBounds().getMinX(),mifigura.getBounds().getMaxX());
              degradado = new GradientPaint(uno,mirelleno.getColorRelleno(), dos, mirelleno.getColorDegradado()); // degradado vertical, entre el color elejido y el azul
              g2d.setPaint(degradado);         
            }else if(mirelleno.getOptionDegradado()==2){
              Point2D uno = new Point2D.Double(mifigura.getBounds().getMinX(),mifigura.getBounds().getMaxX());
              Point2D dos = new Point2D.Double(mifigura.getBounds().getMinY(),mifigura.getBounds().getMaxY());
              degradado = new GradientPaint(uno,mirelleno.getColorRelleno(), dos, mirelleno.getColorDegradado()); // degradado inclinado
            }
          }
          g2d.fill(mifigura); 
            
        }
    }
       
    /**
     * Setter del color del contorno
     * @param color, El nuevo color del contorno.
     */ 
    public void setColorContorno(Color color){
       micontorno.setColorContorno(color);
    }
    
    /**
     * Getter del color del contorno de la figura
     * @return Color, El color del contorno de la figura
     */
    public Color getColorContorno(){
        return micontorno.getColorContorno();
    }
    
    /**
     * Setter del grosor del trazo
     * @param nuevo, El nuevo grosor del trazo
     */
    public void setGrosor(int nuevo){
        micontorno.setGrosor(nuevo);
    }
    
    /**
     * Getter del grosor del trazo
     * @return int, grosor del trazo de la figura.
     */
    public int getGrosor(){
        return micontorno.getGrosor();
    }
    
    /**
     * Setter del valor de la decoración, terminación del trazo o contorno
     * @param continua, int que indica el tipo de decoracion de la discontinuidad
     */
    public void setDiscontinuidad(int continua){
        micontorno.setDiscontinuidad(continua);
    }
    
    /**
     * Getter del valor de la decoración, terminación del trazo o contorno
     * @return cap, int que indica el tipo de decoración de la discontinuidad
     */
    public int getDiscontinuidad(){
        return micontorno.getDiscontinuidad();
    }
    
    /**
     * Setter del patron de la discontinuidad, separación del trazo cuando es discontinua
     * @param patron, El nuevo valor del patron, separación del entrelineado. 
     */
    public void setPatronDiscontinuidad(int patron){
        micontorno.setPatronDiscontinuidad(patron);
    }
    
    /**
     * Getter de la separacion del entrelineado
     * @return int, el patron de separación del entrelineado.
     */
    public int getPatronDiscontinuidad(){
        return micontorno.getPatronDiscontinuidad();
    }
    
    /**
     * Getter del activo de la transparencia de la figura
     * @return booleano, Devuelve si la transparencia de la figura está activa o no 
     */
    public boolean getCompo(){
        return micontorno.getCompo();
    }
    
    /**
     * Setter de la Composicion, transparencia de la figura
     * @param transparencia, Determina si hay transparencia o no, si es que si la inicializa a un grado por defecto
     */
    public void setComposicion(boolean transparencia){
        micontorno.setComposicion(transparencia);
    }
    
    /**
     * Setter del grado de transparencia de la figura
     * @param grado, El nuevo grado de transparencia de la figura.
     */
    public void gradoTransparencia(int grado){
        micontorno.gradoTransparencia(grado);
    }
    
    /**
     * Getter del grado de transparencia de la figura
     * @return float, El grado de transparencia de la figura
     */
    public float getGradoTransparencia(){
        return micontorno.getGradoTransparencia();
    }
    
    /**
     * Getter del booleano que representa renderizado de la figura
     * @return boolean, Determina si está activo el renderizado de la figura
     */
    public boolean getRender(){
        return micontorno.getRender();
    }
    
    /**
     * Setter del renderizado de la figura
     * @param alisar, Booleano que nos dice si hay o no rendering.
     */
    public void setRender(boolean alisar){
        micontorno.setRender(alisar);
    }

    /**
     * Setter para saber si hay relleno en la figura
     * @param booleano, Booleano que nos dice si hay o no relleno. 
     */
    public void setBoolRelleno(Boolean booleano){
    }
    
    /**
     * Getter para darle la opcion de tener relleno.
     * @return booleano, Booleano que nos permite saber si tenemos o no relleno 
     */
    public boolean getBoolRelleno(){        
        return false;
    }
    
    /**
     * Getter del color del relleno actual
     * @return Color, El color del relleno
     */
    public Color getColorRelleno(){
        return null;
    }

    /**
     * Setter del color del relleno
     * @param color, El nuevo color del relleno.
     */
    public void setColorRelleno(Color color) {
    }
    
    /**
     * Setter del color del degradado
     * @param color, El nuevo color del degradado
     */
    public void setColorDegradado(Color color){
    }
    
    /**
     * Getter del color del degradado
     * @return Color , El color del degradado. 
     */
    public Color getColorDegradado(){
        return null;
    }
    
    /**
     * Setter de las opciones del degradado
     * @param option, La nueva opción del tipo de degradado, pudiendo ser horizontal(0), vertical(1) o inclinado(2)
     */
    public void setOpcionDegradado(int option){
    }
    
    /**
     * Getter de las opciones del degradado
     * @return int, Entero que representa la opcion de degradado elegida
     *  pudiendo ser horizontal(0), vertical(1) o inclinado(2)
     */
    public int getOptionDegradado(){
        return 50000;
    }
    
    /**
     * Setter de si hay degradado o no
     * @param si, Booleano que nos dice si hay o no degradado.
     */
    public void SetSiDegradado(boolean si){
    }
    
    /**
     * Getter para decidir si hay degradado o no lo hay 
     * @return booleano, Booleano que nos permite saber si tenemos o no degradado
     */
    public boolean getSiDegradado(){
        return false;
    }
}