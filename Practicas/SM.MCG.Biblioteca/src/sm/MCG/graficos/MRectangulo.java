/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.MCG.graficos;

import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 * Declaración de la clase MRectangulo, hereda de MFigurasRelleno
 * @author mati
 */
public class MRectangulo extends MFigurasRelleno{
    
    /**
     * miRectangulo, Figura a pintar, de tipo Rectangle.
     */
    private Rectangle miRectangulo;
    
    /**
     * pAux, punto donde inicia el rectangulo.
     */
    private Point2D pAux;
    
    /**
     * Constructor con un solo punto de referencia.
     * @param p, punto de inicio, esquina superior izquierda del rectangulo.
     */
    public MRectangulo(Point2D p) {
        miRectangulo = new Rectangle((Point) p);
        pAux=p;
    }
    
    /**
     * Constructor con dos puntos de referencia
     * @param p1, punto de inicio, esquina superior izquierda del rectangulo.
     * @param p2, punto de finalización, esquina derecha del rectangulo 
     */
    public MRectangulo(Point2D p1,Point2D p2) {
        miRectangulo = new Rectangle((Point) p1);
        pAux=p1;
    }
    
    /**
     * Constructor con un solo punto de referencia, relleno y contorno.
     * @param p, punto de inicio, esquina superior izquierda del rectangulo.
     * @param conto, El contorno del rectangulo
     * @param relln, El relleno del rectangulo
     */
    public MRectangulo(Point2D p,MContorno conto, MRelleno relln) {
        miRectangulo = new Rectangle((Point) p);
        pAux=p;
        micontorno = conto ;
        mirelleno = relln;
    }

    /**
     * Metodo que dibuja el rectangulo
     * @param g2d, El Graphics que dibuja el rectangulo actual
     */
    @Override
    public void paint(Graphics2D g2d) {
        super.miPaint(g2d, miRectangulo);
    }
    
    /**
     * Metodo que devuelve si el punto pasado como parametro se encuentra en nuestra figura rectangulo
     * @param pos, punto actual
     * @return booleano, Si esta contenido o no en el rectangulo actual
     */
    @Override
    public boolean contains(Point2D pos) {
        return miRectangulo.contains(pos);
    }

    /**
     * Setter que mueve el rectangulo actual a la posición dada por el punto pasado como parametro
     * @param p, El punto actual de la nueva localización del rectangulo
     */
    @Override
    public void setLocation(Point2D p) {
        miRectangulo.setFrame(p.getX(),p.getY(), miRectangulo.getWidth(), miRectangulo.getHeight());
    }
    
    /**
     * Getter que da la posición actual del rectangulo.
     * @return Point2D, El punto donde empieza el rectangulo.
     */
    @Override
    public Point2D getLocation(){
        return miRectangulo.getLocation();
    }

    /**
     * Actualiza el rectangulo con el punto pasado por parametro
     * @param p, Punto2D para la actualización del rectangulo
     */
    @Override
    public void updateShape(Point2D p) {
        miRectangulo.setFrameFromDiagonal(pAux, p);
    }

    /**
     * Getter del rectangulo que engloba la figura actual
     * @return Rectangle2D, El rectangulo que engloba al rectangulo actual
     */
    @Override
    public Rectangle2D getBounds2D() {
        return miRectangulo.getBounds2D();
    }
}
