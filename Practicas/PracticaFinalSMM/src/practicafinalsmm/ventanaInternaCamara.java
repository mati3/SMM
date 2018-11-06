/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicafinalsmm;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import java.awt.BorderLayout;
import java.awt.image.BufferedImage;

/**
 * Clase ventanaInternaCamara para activar la webcam, hereda de VentanaInternaSM
 * @author mati
 */
public class ventanaInternaCamara extends VentanaInternaSM  {
    /**
     * Contiene la Webcam del sistema y le da la funcionalidad a la clase.
     */
    private Webcam camara = null;
    
    /**
     * Constructor de la clase ventanaInternaCamara.
     */
    public ventanaInternaCamara() {
        initComponents();
        camara = Webcam.getDefault();
        if (camara != null) {
//            Dimension resoluciones[] = camara.getViewSizes();
//            Dimension maxRes = resoluciones[resoluciones.length-1];
//            camara.setViewSize(maxRes);
            WebcamPanel areaVisual = new WebcamPanel(camara);
            areaVisual.setFitArea(false);
            
            if (areaVisual!= null) {
                getContentPane().add(areaVisual, BorderLayout.CENTER);
                pack();
            }
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
                if (camara != null) {
            try {
                camara.close();
            } catch (Exception e) {
                System.err.println("VentanaInternaCamara: "+e);
            }
        }
    }//GEN-LAST:event_formInternalFrameClosing
    
    /**
     * Instanciacion de la clase VentanaInternaVLCPlayer.
     * @return null si ya hay una insancia creada o la clase si no la hay.
     */
    public static ventanaInternaCamara getInstance(){
        ventanaInternaCamara v = new ventanaInternaCamara();
        return (v.camara!=null?v:null);
    }
    
    /**
     * Getter de la imagen instantanea.
     * @return BufferedImage, La instantanea seleccionada
     */
    public BufferedImage getShot(){
        return camara.getImage();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
