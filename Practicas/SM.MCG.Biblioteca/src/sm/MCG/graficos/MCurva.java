/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.MCG.graficos;

import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.geom.QuadCurve2D;
import java.awt.geom.Rectangle2D;

/**
 * Declaración de la clase MCurva, hereda de MFiguras
 * @author mati
 */
public class MCurva extends MFiguras{
    /**
     * curva, Figura a pintar de tipo QuadCurve2D.
     */
    private QuadCurve2D curva ;
    
    /**
     * Puntos de inicio, fin y control de la curva.
     */
    private Point2D puntoA, puntoB, p_Control;

    /**
     * Constructor con un solo punto de referencia.
     * @param p, punto de inicio, esquina izquierda de la curva.
     */
    public MCurva(Point2D p){
        puntoA = puntoB = p;
        p_Control = new Point2D.Double((p.getX() +  p.getX())/2, (p.getY() +  p.getY())/2);
        curva = new QuadCurve2D.Double(puntoA.getX(), puntoA.getY(),p_Control.getX()+50,p_Control.getY()-50, puntoB.getX(), puntoB.getY());
    }
    
    /**
     * Constructor con dos puntos de referencia
     * @param p1, punto de inicio, esquina izquierda de la curva.
     * @param p2, punto de finalización, esquina derecha de la curva.
     */
    public MCurva(Point2D p1, Point2D p2){
        puntoA = p1;
        puntoB = p2;
        p_Control = new Point2D.Double((p1.getX() +  p1.getX())/2, (p2.getY() +  p2.getY())/2);
        curva = new QuadCurve2D.Double(puntoA.getX(), puntoA.getY(),p_Control.getX()+50,p_Control.getY()-50, puntoB.getX(), puntoB.getY());
    }
    
    /**
     * Constructor con dos puntos de referencia y contorno.
     * @param p1, punto de inicio, esquina izquierda de la curva.
     * @param p2, punto de finalización, esquina derecha de la curva.
     * @param conto, El contorno del rectangulo
     */
    public MCurva(Point2D p1, Point2D p2, MContorno conto){
        micontorno = conto ;
        puntoA = p1;
        puntoB = p2;
        p_Control = new Point2D.Double((p1.getX() +  p1.getX())/2, (p2.getY() +  p2.getY())/2);
        curva = new QuadCurve2D.Double(puntoA.getX(), puntoA.getY(),p_Control.getX()+50,p_Control.getY()-50, puntoB.getX(), puntoB.getY());
    }

    /**
     * Metodo que devuelve si el punto pasado como parametro se encuentra en nuestra figura curva
     * @param pos, punto actual
     * @return booleano, Si esta contenido o no en la curva actual
     */
    @Override
    public boolean contains(Point2D pos) {
        p_Control = pos;
        return curva.contains(pos);
    }

    /**
     * Setter que mueve la curva actual a la posición dada por el punto pasado como parametro
     * @param p, El punto actual de la nueva localización de la curva
     */
    @Override
    public void setLocation(Point2D p) {
       Point2D p2 = new Point2D.Double(curva.getX2() + (p.getX() - curva.getX1()), curva.getY2() + (p.getY() - curva.getY1()));
       Point2D p1 = new Point2D.Double(curva.getCtrlX() + p.getX() - curva.getX1(), curva.getCtrlY() + p.getY() - curva.getY1());
       puntoA = p ;
       curva.setCurve(p, p1, p2);
    }
    
    /**
     * Getter que da la posición actual de la curva.
     * @return Point2D, El punto donde empieza la curva.
     */
    @Override
    public Point2D getLocation(){
        return puntoA;
    }
    
    /**
     * Setter, Metodo que actualiza el punto de control
     * @param puntoControl, Point2D, punto donde se inclinará la curva.
     */
    public void setPuntoControl(Point2D puntoControl){
        curva.setCurve(curva.getP1(),puntoControl, curva.getP2());
    }

    /**
     * Actualiza la curva con el punto pasado por parametro
     * @param p, Punto2D para la actualización de la curva
     */
    @Override
    public void updateShape(Point2D p) {
        curva.setCurve(puntoA, puntoB,p);
        
    }

    /**
     * Metodo que dibuja la curva
     * @param g2d, El Graphics que dibuja la curva actual
     */
    @Override
    public void paint(Graphics2D g2d) {
        super.miPaint(g2d, curva);
    }
    
    /**
     * Getter del rectangulo que engloba la figura actual
     * @return Rectangle2D, El rectangulo que engloba la curva actual
     */
    @Override
    public Rectangle2D getBounds2D(){
        return curva.getBounds2D();
    }
}