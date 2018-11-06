/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.MCG.graficos;

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

 /**
 * Declaración de la clase MElipse, hereda de MFigurasRelleno
 * @author mati
 */
public class MElipse extends MFigurasRelleno{
    
    /**
     * miElipse, Figura a pintar de tipo Ellipse2D.
     */
    private Ellipse2D miElipse;
    
    /**
     * punto, punto2D donde se inicia la ellipse.
     */
    private Point2D punto;

    /**
     * Constructor con un solo punto de referencia.
     * @param p, punto de inicio, esquina superior izquierda de la ellipse.
     */
    public MElipse(Point2D p) {
        miElipse = new Ellipse2D.Double(p.getX(),p.getY(),p.getX(),p.getY());
        punto = p ;
    }
    
    /**
     * Constructor con dos puntos de referencia
     * @param p1, punto de inicio, esquina superior izquierda de la ellipse.
     * @param p2, punto de finalización, esquina derecha de la ellipse. 
     */
    public MElipse(Point2D p1,Point2D p2) {
        miElipse = new Ellipse2D.Double(p1.getX(),p1.getY(),p2.getX(),p2.getY());
        punto = p1 ;
    }
    
    /**
     * Constructor con dos puntos de referencia
     * @param p1, punto de inicio, esquina izquierda de la ellipse.
     * @param p2, punto de finalización, esquina derecha de la ellipse.
     * @param conto, El contorno de la ellipse.
     * @param rell, El relleno de la ellipse.
     */
    public MElipse(Point2D p1,Point2D p2,MContorno conto, MRelleno rell) {
        micontorno = conto ;
        mirelleno = rell;
        miElipse = new Ellipse2D.Double(p1.getX(),p1.getY(),p2.getX(),p2.getY());
        punto = p1 ;
    }

    /**
     * Metodo que devuelve si el punto pasado como parametro se encuentra en nuestra figura ellipse
     * @param pos, punto actual
     * @return booleano, Si esta contenido o no en la ellipse actual
     */
    @Override
    public boolean contains(Point2D pos) {
        return miElipse.contains(pos);
    }

    /**
     * Setter que mueve el rectangulo actual a la posición dada por el punto pasado como parametro
     * @param p, El punto actual de la nueva localización de la ellipse.
     */
    @Override
    public void setLocation(Point2D p) {
        miElipse.setFrame(p.getX(), p.getY(), miElipse.getWidth(), miElipse.getHeight());
        punto = p ;
    }
    
    /**
     * Getter que da la posición actual de la ellipse.
     * @return Point2D, El punto donde empieza la ellipse.
     */
    @Override
    public Point2D getLocation(){
        return miElipse.getBounds().getLocation();
    }

    /**
     * Actualiza la ellipse con el punto pasado por parametro
     * @param p, Punto2D para la actualización de la ellipse
     */
    @Override
    public void updateShape(Point2D p) {
        miElipse.setFrameFromDiagonal(punto, p);
    }

    /**
     * Metodo que dibuja la ellipse
     * @param g2d, El Graphics que dibuja la ellipse actual
     */
    @Override
    public void paint(Graphics2D g2d) {
        super.miPaint(g2d, miElipse);
    }
    
    /**
     * Getter del rectangulo que engloba la figura actual
     * @return Rectangle2D, El rectangulo que engloba a la ellipse actual
     */
    @Override
    public Rectangle2D getBounds2D(){
        return miElipse.getBounds2D();
    }
}
