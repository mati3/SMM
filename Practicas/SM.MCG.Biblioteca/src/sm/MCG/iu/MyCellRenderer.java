/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.MCG.iu;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.border.Border;
import javax.swing.border.SoftBevelBorder;

/**
 * Clase MyCellRenderer, nos da la parte visual del combobox.
 * @author mati
 */                            
public class MyCellRenderer extends JLabel implements ListCellRenderer<Object> {
    
    /**
     * Constructor por defecto, opaco puesto a falso.
     */
     public MyCellRenderer() {
        setOpaque(true); //set opaque es para la transparencia, no hay transparencia
     }

     @Override
     public Component getListCellRendererComponent(JList<?> list,Object value,int index, boolean isSelected,boolean cellHasFocus) {

         setText(" ");
         setBackground((Color) value);
         Dimension preferredSize = new Dimension(30,30);
         this.setPreferredSize(preferredSize);
         Border border;
         border = BorderFactory.createBevelBorder(SoftBevelBorder.LOWERED, Color.white, (Color) value, (Color) value, Color.white);
         this.setBorder(border);
         return this;
     }
 }