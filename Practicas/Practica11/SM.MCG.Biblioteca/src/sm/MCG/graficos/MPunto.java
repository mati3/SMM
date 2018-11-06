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
 * @author chipi
 */
public class MPunto extends Line2D.Float {
    
    public MPunto(){
        super();
    }
    
    public MPunto(Point2D p1, Point2D p2) {
        super.setLine(p1,p2);
    }
    
    @Override
    public boolean contains(Point2D pos) {
        if (this.ptLineDist(pos) <= 4.0) {
            return true;
        }
        return false;
    }

     public void setLocation(Point2D p) {
        super.setLine(p.getX(), p.getY(), p.getX() + 1, p.getY() + 1);
    }
    
     public void update(Point2D p1, Point2D p2) {
        this.setLine(p1, p1);
    }
     
}
