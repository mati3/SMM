/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.MCG.graficos;

import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 * Declaración de la clase MLinea, hereda de MFiguras
 * @author mati
 */
public class MLinea extends MFiguras{
    
    /**
     * linea, figura a pintar de tipo Linea2D.
     */
    private Line2D linea ;
       
    /**
     * Constructor con un solo punto de referencia.
     * @param p, punto de inicio, esquina izquierda de la linea.
     */
    public MLinea(Point2D p) {
        linea = new Line2D.Float(p,p);
    }
    
    /**
     * Constructor con dos puntos de referencia
     * @param p1, punto de inicio, esquina izquierda de la linea.
     * @param p2, punto de finalización, esquina derecha de la linea.
     */
    public MLinea(Point2D p1,Point2D p2) {
        linea = new Line2D.Float(p1,p2);
    }
    
    /**
     * Constructor con un solo punto de referencia y contorno.
     * @param p, punto de inicio, esquina izquierda de la linea.
     * @param conto, El contorno del rectangulo
     */
    public MLinea(Point2D p, MContorno conto) {
        micontorno = conto ;
        linea = new Line2D.Float(p,p);
    }
      
    /**
     * Metodo que dibuja la linea
     * @param g2d, El Graphics que dibuja la linea actual
     */
    @Override
    public void paint(Graphics2D g2d) {
        super.miPaint(g2d, linea);
    }
    
    /**
     * Metodo que devuelve si el punto pasado como parametro se encuentra en nuestra figura linea
     * @param pos, punto actual
     * @return booleano, Si esta contenido o no en la linea actual
     */
    @Override
    public boolean contains(Point2D pos) {
        if (this.linea.ptLineDist(pos) <= 4.0) {
            return true;
        }
        return false;
    }
    
    /**
     * Setter que mueve la linea actual a la posición dada por el punto pasado como parametro
     * @param p, El punto actual de la nueva localización de la linea
     */
    @Override
    public void setLocation(Point2D p) {
        double distX = p.getX() - linea.getX1();
        double distY = p.getY() - linea.getY1();
        Point2D punto;
        punto = new Point2D.Double(linea.getX2() + distX, linea.getY2() + distY);
        linea.setLine(p, punto);
    }
    
    /**
     * Getter que da la posición actual de la linea.
     * @return Point2D, El punto donde empieza la linea.
     */
    @Override
    public Point2D getLocation(){
        return linea.getP1();
    }

    /**
     * Actualiza la linea con el punto pasado por parametro
     * @param p, Punto2D para la actualización de la linea
     */
    @Override
    public void updateShape(Point2D p) {
        linea.setLine(linea.getP1(),p);
    }
    
    /**
     * Getter del rectangulo que engloba la figura actual
     * @return Rectangle2D, El rectangulo que engloba la linea actual
     */
    @Override
    public Rectangle2D getBounds2D(){
        return linea.getBounds2D();
    }
}
