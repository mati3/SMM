/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

/**
 *
 * @author chipi
 */
public class ventana extends javax.swing.JFrame {

    /**
     * Creates new form ventana
     */
    public ventana() {
        initComponents();
        setSize(500,500);
        setTitle("Mati");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barra_de_Menu = new javax.swing.JMenuBar();
        archivo = new javax.swing.JMenu();
        Nuevo = new javax.swing.JMenuItem();
        Abrir = new javax.swing.JMenuItem();
        Guardar = new javax.swing.JMenuItem();
        Imprimir = new javax.swing.JMenu();
        Impresora = new javax.swing.JMenuItem();
        Fichero = new javax.swing.JMenuItem();
        editar = new javax.swing.JMenu();
        copiar = new javax.swing.JMenuItem();
        cortar = new javax.swing.JMenuItem();
        pegar = new javax.swing.JMenuItem();
        ver = new javax.swing.JMenu();
        barra_de_estado = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        archivo.setText("Archivo");

        Nuevo.setText("Nuevo");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });
        archivo.add(Nuevo);

        Abrir.setText("Abrir");
        archivo.add(Abrir);

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        archivo.add(Guardar);

        Imprimir.setText("Imprimir");

        Impresora.setText("Impresora");
        Imprimir.add(Impresora);

        Fichero.setText("Fichero");
        Imprimir.add(Fichero);

        archivo.add(Imprimir);

        barra_de_Menu.add(archivo);

        editar.setText("Editar");

        copiar.setText("Copiar");
        editar.add(copiar);

        cortar.setText("Cortar");
        editar.add(cortar);

        pegar.setText("Pegar");
        pegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pegarActionPerformed(evt);
            }
        });
        editar.add(pegar);

        barra_de_Menu.add(editar);

        ver.setText("Ver");

        barra_de_estado.setSelected(true);
        barra_de_estado.setText("Barra de estado");
        barra_de_estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barra_de_estadoActionPerformed(evt);
            }
        });
        ver.add(barra_de_estado);

        barra_de_Menu.add(ver);

        setJMenuBar(barra_de_Menu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GuardarActionPerformed

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NuevoActionPerformed

    private void pegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pegarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pegarActionPerformed

    private void barra_de_estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barra_de_estadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_barra_de_estadoActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Abrir;
    private javax.swing.JMenuItem Fichero;
    private javax.swing.JMenuItem Guardar;
    private javax.swing.JMenuItem Impresora;
    private javax.swing.JMenu Imprimir;
    private javax.swing.JMenuItem Nuevo;
    private javax.swing.JMenu archivo;
    private javax.swing.JMenuBar barra_de_Menu;
    private javax.swing.JCheckBoxMenuItem barra_de_estado;
    private javax.swing.JMenuItem copiar;
    private javax.swing.JMenuItem cortar;
    private javax.swing.JMenu editar;
    private javax.swing.JMenuItem pegar;
    private javax.swing.JMenu ver;
    // End of variables declaration//GEN-END:variables
}