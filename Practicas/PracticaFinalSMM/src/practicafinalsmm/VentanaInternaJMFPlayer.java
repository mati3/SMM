/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicafinalsmm;

import java.awt.Component;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.media.Buffer;
import javax.media.Manager;
import javax.media.MediaLocator;
import javax.media.Player;
import javax.media.control.FrameGrabbingControl;
import javax.media.format.VideoFormat;
import javax.media.util.BufferToImage;

/**
 * Ventana interna para la reproducción de video.
 * @author mati   
 */
public class VentanaInternaJMFPlayer extends VentanaInternaSM  {

    private Player player = null;
    /**
     * Constructor para generar un nuevo objeto de la clase.
     * @param f, El archivo donde está el video a reproducir.
     */
    public VentanaInternaJMFPlayer(File f) {
        initComponents();
        String sfichero = "file:" + f.getAbsolutePath();
        MediaLocator ml = new MediaLocator(sfichero);
        try {
            player = Manager.createRealizedPlayer(ml);
            Component vc = player.getVisualComponent();
            if(vc!=null)add(vc, java.awt.BorderLayout.CENTER);
            Component cpc = player.getControlPanelComponent();
            if(cpc!=null)add(cpc, java.awt.BorderLayout.SOUTH);
            this.pack();
        }catch(Exception e) {
        System.err.println("VentanaInternaJMFPlayer: "+e);
        player = null;
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

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        playVideo = new javax.swing.JButton();
        stopVideo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
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

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jToolBar1.setRollover(true);

        playVideo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica10/iconosPracticaVideo/Play.png"))); // NOI18N
        playVideo.setFocusable(false);
        playVideo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        playVideo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        playVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playVideoActionPerformed(evt);
            }
        });
        jToolBar1.add(playVideo);

        stopVideo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica10/iconosPracticaVideo/Stop.png"))); // NOI18N
        stopVideo.setFocusable(false);
        stopVideo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        stopVideo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        stopVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopVideoActionPerformed(evt);
            }
        });
        jToolBar1.add(stopVideo);

        jPanel2.add(jToolBar1);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 267, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static VentanaInternaJMFPlayer getInstance(File f){
    VentanaInternaJMFPlayer v = new VentanaInternaJMFPlayer(f);
    return (v.player!=null?v:null);
    }
    private void playVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playVideoActionPerformed
        if (player != null) {
            try {
                player.start();
            } catch (Exception e) {
                System.err.println("VentanaInternaJMFPlayer: "+e);
            }
        }
    }//GEN-LAST:event_playVideoActionPerformed

    private void stopVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopVideoActionPerformed
         if (player != null) {
            try {
                player.stop();
            } catch (Exception e) {
                System.err.println("VentanaInternaJMFPlayer: "+e);
            }
        }
    }//GEN-LAST:event_stopVideoActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        if (player != null) {
            try {
                player.close();
            } catch (Exception e) {
                System.err.println("VentanaInternaJMFPlayer: "+e);
            }
        }
    }//GEN-LAST:event_formInternalFrameClosing
    
     /**
     * Getter de la imagen instantanea.
     * @return BufferedImage, La instantanea seleccionada
     */
    @Override
    public BufferedImage getShot(){
        FrameGrabbingControl fgc;
        String claseCtr = "javax.media.control.FrameGrabbingControl";
        fgc = (FrameGrabbingControl) player.getControl(claseCtr);
        Buffer bufferFrame= fgc.grabFrame();
        BufferToImage bti;
        bti = new BufferToImage((VideoFormat)bufferFrame.getFormat());
        Image img = bti.createImage(bufferFrame);
        return (BufferedImage) img;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton playVideo;
    private javax.swing.JButton stopVideo;
    // End of variables declaration//GEN-END:variables
}
