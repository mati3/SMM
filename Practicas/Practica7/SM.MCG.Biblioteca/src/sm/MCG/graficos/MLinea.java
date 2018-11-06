/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.MCG.graficos;

import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 *
 * @author mati
 */
public class MLinea extends Line2D.Float{

    public MLinea() {
        super();
    }
    
    public MLinea(Point2D evt, Point2D evt2) {
        super.setLine(evt,evt2);
    }
    
    @Override
    public boolean contains(Point2D pos) {
        if (this.ptLineDist(pos) <= 4.0) {
            return true;
        }
        return false;
    }
    
    public void setLocation(Point2D pos) {
        double distX = pos.getX() - this.getX1();
        double distY = pos.getY() - this.getY1();
        Point2D punto;
        punto = new Point2D.Double(this.getX2() + distX, this.getY2() + distY);
        this.setLine(pos, punto);
    }
     
}
