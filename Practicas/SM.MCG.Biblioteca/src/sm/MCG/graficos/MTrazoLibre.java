/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.MCG.graficos;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 * Declaración de la clase MTrazoLibre, hereda de MFiguras
 * @author mati
 */
public class MTrazoLibre extends MFiguras{

    /**
     * gpth, Figura a pintar, de tipo GeneralPath.
     */
    private GeneralPath gpth ;
    
    /**
     * punto1, punto donde inicia el trazo.
     */
    private Point2D punto1;
    
    /**
     * Constructor con un solo punto de referencia.
     * @param p, punto de inicio del trazo.
     */
    public MTrazoLibre(Point2D p){        
        punto1 = p;
        gpth = new GeneralPath();   
        gpth.moveTo(p.getX(), p.getY());
        gpth.lineTo(p.getX(), p.getY());
    }
    
    /**
     * Constructor con dos puntos de referencia
     * @param p1, punto de inicio del trazo.
     * @param p2, punto de finalización del trazo.
     */
    public MTrazoLibre(Point2D p1,Point2D p2){        
        punto1 = p1;
        gpth = new GeneralPath();   
        gpth.moveTo(p1.getX(), p2.getY());
        gpth.lineTo(p1.getX(), p2.getY());
    }
    
    /**
     * Constructor con dos puntos de referencia y contorno.
     * @param p1, punto de inicio del trazo.
     * @param p2, punto de finalización del trazo.
     * @param conto, El contorno del rectangulo
     */
    public MTrazoLibre(Point2D p1,Point2D p2,MContorno conto) {
        micontorno = conto ;        
        punto1 = p1;
        gpth = new GeneralPath();   
        gpth.moveTo(p1.getX(), p2.getY());
        gpth.lineTo(p1.getX(), p2.getY());
    }

    /**
     * Metodo que devuelve si el punto pasado como parametro se encuentra en nuestra figura trazo libre
     * @param pos, punto actual
     * @return booleano, Si esta contenido o no en el trazo actual
     */
    @Override
    public boolean contains(Point2D pos) {
        return gpth.contains(pos);
    }

    /**
     * Setter que mueve el trazo libre actual a la posición dada por el punto pasado como parametro
     * @param p, El punto actual de la nueva localización del trazo libre
     */
    @Override
    public void setLocation(Point2D p) {
        double distX = p.getX() - punto1.getX();
        double distY = p.getY() - punto1.getY();
        AffineTransform at = new AffineTransform();
        at.setToTranslation(distX, distY);
        gpth.transform(at);
        punto1 = p;
        
    }
    
    /**
     * Getter que da la posición actual del trazo libre.
     * @return Point2D, El punto donde empieza el trazo libre.
     */
    @Override
    public Point2D getLocation(){
        return punto1;
    }

    /**
     * Actualiza el trazo libre con el punto pasado por parametro.
     * @param p, Punto2D para la actualización del trazo libre.
     */
    @Override
    public void updateShape(Point2D p) {
        gpth.lineTo(p.getX(), p.getY());
    }

    /**
     * Metodo que dibuja el trazo libre.
     * @param g2d, El Graphics que dibuja el trazo libre actual.
     */
    @Override
    public void paint(Graphics2D g2d) {
        super.miPaint(g2d, gpth);        
    }
    
    /**
     * Getter del rectangulo que engloba la figura actual
     * @return Rectangle2D, El rectangulo que engloba el trazo libre actual.
     */
    @Override
    public Rectangle2D getBounds2D(){
        return gpth.getBounds2D();
    }
}
