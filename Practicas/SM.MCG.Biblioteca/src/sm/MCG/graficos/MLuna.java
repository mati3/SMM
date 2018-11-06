/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.MCG.graficos;

import java.awt.Graphics2D;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
 /**
 * Declaración de la clase MLuna, hereda de MFigurasRelleno
 * @author mati
 */
public class MLuna extends  MFigurasRelleno{ 
    
    /**
     * area1, area2 componen la figura a pintar, yuxtaposición de estas.
     */
    private Area area1, area2;
    
    /**
     * circulo1, circulo2 componen la figuras a introducir en los areas anteriores.
     */
    private Ellipse2D circulo1, circulo2 ;
    
    /**
     * Puntos de inicio de las ellipses que compondran la figura.
     */
    private Point2D punto1, punto2;
    
    /**
     * Booleano para controlar la dirección de la figura.
     */
    private boolean derecha = false;

    /**
     * Constructor con un solo punto de referencia.
     * @param p, punto de inicio, esquina superior izquierda de la figura area luna.
     */
    public MLuna(Point2D p){ 
        punto1 = p;
        punto2 = new Point2D.Double(p.getX()+50,p.getY());
        circulo1 = new Ellipse2D.Double(p.getX(),p.getY(),p.getX(),p.getY());
        circulo2 = new Ellipse2D.Double(p.getX()+50,p.getY(),p.getX()+50,p.getY());
        area1 = new Area(circulo1);
        area2 = new Area(circulo2);
        area1.subtract(area2);
    }
    
    /**
     * Constructor con dos puntos de referencia
     * @param p1, punto de inicio, esquina superior izquierda de la area luna.
     * @param p2, punto de finalización, esquina derecha de la area luna. 
     */
    public MLuna(Point2D p1,Point2D p2){ 
        punto1 = p1;
        punto2 = new Point2D.Double(p2.getX()+50,p2.getY());
        circulo1 = new Ellipse2D.Double(p1.getX(),p1.getY(),p2.getX(),p2.getY());
        circulo2 = new Ellipse2D.Double(p1.getX()+50,p1.getY(),p2.getX()+50,p2.getY());
        area1 = new Area(circulo1);
        area2 = new Area(circulo2);
        area1.subtract(area2);
    }
    
    /**
     * Constructor con dos puntos de referencia
     * @param p1, punto de inicio, esquina izquierda de la area luna.
     * @param p2, punto de finalización, esquina derecha de la area luna.
     * @param conto, El contorno de la area luna.
     * @param rell, El relleno de la area luna.
     */
    public MLuna(Point2D p1,Point2D p2,MContorno conto, MRelleno rell){ 
        micontorno = conto ;
        mirelleno = rell;
        punto1 = p1;
        punto2 = new Point2D.Double(p2.getX()+50,p2.getY());
        circulo1 = new Ellipse2D.Double(p1.getX(),p1.getY(),p2.getX(),p2.getY());
        circulo2 = new Ellipse2D.Double(p1.getX()+50,p1.getY(),p2.getX()+50,p2.getY());
        area1 = new Area(circulo1);
        area2 = new Area(circulo2);
        area1.subtract(area2);
    }

    /**
     * Metodo que devuelve si el punto pasado como parametro se encuentra en nuestra figura area luna.
     * @param pos, punto actual
     * @return booleano, Si esta contenido o no en la area luna actual
     */
    @Override
    public boolean contains(Point2D pos) {
        return area1.contains(pos);
    }

    /**
     * Setter que mueve la area luna actual a la posición dada por el punto pasado como parametro
     * @param p, El punto actual de la nueva localización de la area luna.
     */
    @Override
    public void setLocation(Point2D p) {
        circulo1.setFrame(p.getX(), p.getY(), circulo1.getWidth(), circulo1.getHeight());
        area1 = new Area(circulo1);
        if(derecha){
            circulo2.setFrame(p.getX(), p.getY(), circulo2.getWidth(), circulo2.getHeight());
        }else{
            circulo2.setFrame(p.getX()+50, p.getY(), circulo2.getWidth(), circulo2.getHeight());
        }
        area2 = new Area(circulo2);
        area1.subtract(area2);
        
        punto1 = p ;
    }
    
    /**
     * Getter que da la posición actual de la area luna.
     * @return Point2D, El punto donde empieza la area luna.
     */
    @Override
    public Point2D getLocation(){
        return circulo1.getBounds().getLocation();
    }

    /**
     * Actualiza la area luna con el punto pasado por parametro
     * @param p, Punto2D para la actualización de la area luna.
     */
    @Override
    public void updateShape(Point2D p) { 
        if(p.getX()<punto1.getX()){
            Point2D punto;
            punto = new Point2D.Double(punto1.getX()-50, punto1.getY());
            circulo1.setFrameFromDiagonal(punto1, p);
            area1 = new Area(circulo1);
            circulo2.setFrameFromDiagonal(punto, p);
            area2 = new Area(circulo2);
            area1.subtract(area2);
            derecha = true;
        }else{ // bueno
            circulo1.setFrameFromDiagonal(punto1, p);
            area1 = new Area(circulo1);
            circulo2.setFrameFromDiagonal(punto2, p);
            area2 = new Area(circulo2);
            area1.subtract(area2);
            derecha = false;
        }
    }

    /**
     * Metodo que dibuja la area luna.
     * @param g2d, El Graphics que dibuja la area luna actual
     */
    @Override
    public void paint(Graphics2D g2d) {
        super.miPaint(g2d, area1);
    }

    /**
     * Getter del rectangulo que engloba la figura actual
     * @return Rectangle2D, El rectangulo que engloba a la area luna actual
     */
    @Override
    public Rectangle2D getBounds2D() {
        return area1.getBounds2D();
    }

    
}
