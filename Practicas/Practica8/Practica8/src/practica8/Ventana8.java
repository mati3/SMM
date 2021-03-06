/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica8;

import sm.MCG.iu.Dibujo;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

/**
 *
 * @author chipi
 */
public class Ventana8 extends javax.swing.JFrame {

    /**
     * Creates new form Ventana7
     */
    public Ventana8() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lapiz = new javax.swing.JToggleButton();
        linea = new javax.swing.JToggleButton();
        rectangulo = new javax.swing.JToggleButton();
        ovalo = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        etiqueta_barra_menu = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        black = new javax.swing.JButton();
        rojo = new javax.swing.JButton();
        azul = new javax.swing.JButton();
        write = new javax.swing.JButton();
        yelow = new javax.swing.JButton();
        green = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        grosor = new javax.swing.JSpinner();
        jPanel8 = new javax.swing.JPanel();
        relleno = new javax.swing.JCheckBox();
        alisar = new javax.swing.JCheckBox();
        transparencia = new javax.swing.JCheckBox();
        mover = new javax.swing.JCheckBox();
        jPanel9 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        archivo = new javax.swing.JMenu();
        nuevo = new javax.swing.JMenuItem();
        abrir = new javax.swing.JMenuItem();
        guardar = new javax.swing.JMenuItem();
        edicion = new javax.swing.JMenu();
        barra_estado = new javax.swing.JCheckBoxMenuItem();
        barra_formas = new javax.swing.JCheckBoxMenuItem();
        barra_atributos = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        lapiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica8/iconos/Lapiz.gif"))); // NOI18N
        lapiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lapizActionPerformed(evt);
            }
        });
        jPanel1.add(lapiz);

        linea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica8/iconos/Linea.gif"))); // NOI18N
        linea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lineaActionPerformed(evt);
            }
        });
        jPanel1.add(linea);

        rectangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica8/iconos/Rectangulo.gif"))); // NOI18N
        rectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectanguloActionPerformed(evt);
            }
        });
        jPanel1.add(rectangulo);

        ovalo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica8/iconos/Ovalo.gif"))); // NOI18N
        ovalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ovaloActionPerformed(evt);
            }
        });
        jPanel1.add(ovalo);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        etiqueta_barra_menu.setText("Etiqueta de barra de menu");
        jPanel4.add(etiqueta_barra_menu);

        jPanel2.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel5.setPreferredSize(new java.awt.Dimension(858, 125));
        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.LINE_AXIS));

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));
        jPanel10.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder("color"), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        jPanel10.setMaximumSize(new java.awt.Dimension(247, 125));
        jPanel10.setMinimumSize(new java.awt.Dimension(247, 125));
        jPanel10.setPreferredSize(new java.awt.Dimension(149, 125));

        black.setBackground(new java.awt.Color(0, 0, 0));
        black.setPreferredSize(new java.awt.Dimension(33, 33));
        black.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blackActionPerformed(evt);
            }
        });
        jPanel10.add(black);

        rojo.setBackground(new java.awt.Color(255, 0, 0));
        rojo.setMaximumSize(new java.awt.Dimension(33, 33));
        rojo.setMinimumSize(new java.awt.Dimension(33, 33));
        rojo.setPreferredSize(new java.awt.Dimension(33, 33));
        rojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rojoActionPerformed(evt);
            }
        });
        jPanel10.add(rojo);

        azul.setBackground(new java.awt.Color(0, 0, 255));
        azul.setForeground(new java.awt.Color(0, 0, 255));
        azul.setPreferredSize(new java.awt.Dimension(33, 33));
        azul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                azulActionPerformed(evt);
            }
        });
        jPanel10.add(azul);

        write.setBackground(new java.awt.Color(255, 255, 255));
        write.setForeground(new java.awt.Color(255, 255, 255));
        write.setPreferredSize(new java.awt.Dimension(33, 33));
        write.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                writeActionPerformed(evt);
            }
        });
        jPanel10.add(write);

        yelow.setBackground(new java.awt.Color(255, 255, 0));
        yelow.setForeground(new java.awt.Color(255, 255, 0));
        yelow.setPreferredSize(new java.awt.Dimension(33, 33));
        yelow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yelowActionPerformed(evt);
            }
        });
        jPanel10.add(yelow);

        green.setBackground(new java.awt.Color(0, 204, 51));
        green.setForeground(new java.awt.Color(0, 204, 51));
        green.setPreferredSize(new java.awt.Dimension(33, 33));
        green.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greenActionPerformed(evt);
            }
        });
        jPanel10.add(green);

        jPanel5.add(jPanel10);

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder("Grosor"), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        jPanel7.setMaximumSize(new java.awt.Dimension(80, 125));
        jPanel7.setMinimumSize(new java.awt.Dimension(80, 125));
        jPanel7.setPreferredSize(new java.awt.Dimension(125, 125));

        grosor.setModel(new javax.swing.SpinnerNumberModel(2, 1, null, 1));
        grosor.setMaximumSize(new java.awt.Dimension(30, 22));
        grosor.setValue(2);
        grosor.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                grosorStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(grosor, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(grosor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(""), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        jPanel8.setMaximumSize(new java.awt.Dimension(230, 140));
        jPanel8.setMinimumSize(new java.awt.Dimension(230, 140));
        jPanel8.setPreferredSize(new java.awt.Dimension(230, 140));

        relleno.setText("Relleno");
        relleno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rellenoActionPerformed(evt);
            }
        });

        alisar.setText("Alisar");
        alisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alisarActionPerformed(evt);
            }
        });

        transparencia.setText("Transparencia");
        transparencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transparenciaActionPerformed(evt);
            }
        });

        mover.setText("Editar");
        mover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(relleno)
                    .addComponent(alisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(transparencia)
                    .addComponent(mover))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(relleno)
                    .addComponent(transparencia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alisar)
                    .addComponent(mover))
                .addGap(55, 55, 55))
        );

        jPanel5.add(jPanel8);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 356, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 125, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel9);

        jPanel2.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 861, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 432, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        archivo.setText("Archivo");

        nuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        nuevo.setText("Nuevo");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });
        archivo.add(nuevo);

        abrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        abrir.setText("Abrir");
        abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirActionPerformed(evt);
            }
        });
        archivo.add(abrir);

        guardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        archivo.add(guardar);

        jMenuBar1.add(archivo);

        edicion.setText("Edición");

        barra_estado.setSelected(true);
        barra_estado.setText("Ver barra de estado");
        barra_estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barra_estadoActionPerformed(evt);
            }
        });
        edicion.add(barra_estado);

        barra_formas.setSelected(true);
        barra_formas.setText("Ver barra de formas");
        barra_formas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barra_formasActionPerformed(evt);
            }
        });
        edicion.add(barra_formas);

        barra_atributos.setSelected(true);
        barra_atributos.setText("Ver barra de atributos");
        barra_atributos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barra_atributosActionPerformed(evt);
            }
        });
        edicion.add(barra_atributos);

        jMenuBar1.add(edicion);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void blackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blackActionPerformed
        ((ventana_interna) this.jDesktopPane1.getSelectedFrame()).lienzo1().setColor(Color.black);
    }//GEN-LAST:event_blackActionPerformed

    private void rojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rojoActionPerformed
        ((ventana_interna) this.jDesktopPane1.getSelectedFrame()).lienzo1().setColor(Color.red);
    }//GEN-LAST:event_rojoActionPerformed

    private void azulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_azulActionPerformed
        ((ventana_interna) this.jDesktopPane1.getSelectedFrame()).lienzo1().setColor(Color.blue);
    }//GEN-LAST:event_azulActionPerformed

    private void writeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_writeActionPerformed
        ((ventana_interna) this.jDesktopPane1.getSelectedFrame()).lienzo1().setColor(Color.white);
    }//GEN-LAST:event_writeActionPerformed

    private void yelowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yelowActionPerformed
        ((ventana_interna) this.jDesktopPane1.getSelectedFrame()).lienzo1().setColor(Color.yellow);
    }//GEN-LAST:event_yelowActionPerformed

    private void greenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greenActionPerformed
        ((ventana_interna) this.jDesktopPane1.getSelectedFrame()).lienzo1().setColor(Color.green);
    }//GEN-LAST:event_greenActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        externa = new ventana_interna("nuevo", this);
        jDesktopPane1.add(externa);
       
        //crea una nueva imagen
        BufferedImage img;
        img = new BufferedImage(300,300,BufferedImage.TYPE_INT_RGB);
        externa.lienzo1().setImage(img);
        
        externa.setVisible(true);
        externa.setBounds(20, 20, img.getWidth(), img.getHeight());
    }//GEN-LAST:event_nuevoActionPerformed

    private void lapizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lapizActionPerformed
        ((ventana_interna) this.jDesktopPane1.getSelectedFrame()).lienzo1().setDibujo(Dibujo.enum_punto);
        etiqueta_barra_menu.setText("Lapiz");
        lapiz.setSelected(true);
        linea.setSelected(false);
        rectangulo.setSelected(false);
        ovalo.setSelected(false);
    }//GEN-LAST:event_lapizActionPerformed

    private void lineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineaActionPerformed
        ((ventana_interna) this.jDesktopPane1.getSelectedFrame()).lienzo1().setDibujo(Dibujo.enum_linea);
        etiqueta_barra_menu.setText("Linea");
        linea.setSelected(true);
        lapiz.setSelected(false);
        rectangulo.setSelected(false);
        ovalo.setSelected(false);
    }//GEN-LAST:event_lineaActionPerformed

    private void rectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectanguloActionPerformed
        ((ventana_interna) this.jDesktopPane1.getSelectedFrame()).lienzo1().setDibujo(Dibujo.enum_rectangulo);
        etiqueta_barra_menu.setText("Rectangulo");
        rectangulo.setSelected(true);
        linea.setSelected(false);
        lapiz.setSelected(false);
        ovalo.setSelected(false);
    }//GEN-LAST:event_rectanguloActionPerformed

    private void ovaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ovaloActionPerformed
        ((ventana_interna) this.jDesktopPane1.getSelectedFrame()).lienzo1().setDibujo(Dibujo.enum_elipse);
        etiqueta_barra_menu.setText("Ovalo");
        ovalo.setSelected(true);
        linea.setSelected(false);
        rectangulo.setSelected(false);
        lapiz.setSelected(false);
    }//GEN-LAST:event_ovaloActionPerformed

    private void barra_estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barra_estadoActionPerformed
        if(this.barra_estado.isSelected()){
            this.etiqueta_barra_menu.setVisible(true);
        }else{
            this.etiqueta_barra_menu.setVisible(false);
        }
    }//GEN-LAST:event_barra_estadoActionPerformed

    private void abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirActionPerformed
        JFileChooser dlg = new JFileChooser();
        int resp = dlg.showOpenDialog(this);
        if( resp == JFileChooser.APPROVE_OPTION) {
            //File f = dlg.getSelectedFile();
            try{
                File f = dlg.getSelectedFile();
                BufferedImage img = ImageIO.read(f);
                ventana_interna vi = new ventana_interna("Nuevo imagen", this);
                vi.lienzo1().setImage(img);
                this.jDesktopPane1.add(vi);
                vi.setTitle(f.getName());
                vi.setVisible(true);
            }catch(Exception ex){
            System.err.println("Error al leer la imagen");
}
        }
    }//GEN-LAST:event_abrirActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        ventana_interna vi = (ventana_interna)this.jDesktopPane1.getSelectedFrame();
        if(vi != null){
            JFileChooser dlg = new JFileChooser();
            int resp = dlg.showOpenDialog(this);
            if( resp == JFileChooser.APPROVE_OPTION) {
               //File f = dlg.getSelectedFile();
               try {
                BufferedImage img = vi.lienzo1().getImage(true);
                    if (img != null) {
                    File f = dlg.getSelectedFile();
                    ImageIO.write(img, "jpg", f);
                    vi.setTitle(f.getName());
                }
                }catch (Exception ex) {
                    System.err.println("Error al guardar la imagen");
                }
            }
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void barra_formasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barra_formasActionPerformed
        if(this.barra_formas.isSelected()){
            this.jPanel1.setVisible(true);
        }else{
            this.jPanel1.setVisible(false);
        }
    }//GEN-LAST:event_barra_formasActionPerformed

    private void barra_atributosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barra_atributosActionPerformed
        if(this.barra_atributos.isSelected()){
            this.jPanel5.setVisible(true);
        }else{
            this.jPanel5.setVisible(false);
        }
    }//GEN-LAST:event_barra_atributosActionPerformed

    private void rellenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rellenoActionPerformed
        if (this.relleno.isSelected()){
            ((ventana_interna) this.jDesktopPane1.getSelectedFrame()).lienzo1().setRelleno(true);
        }else{
            ((ventana_interna) this.jDesktopPane1.getSelectedFrame()).lienzo1().setRelleno(false);
        }
    }//GEN-LAST:event_rellenoActionPerformed

    private void alisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alisarActionPerformed
         if (this.alisar.isSelected()){
            ((ventana_interna) this.jDesktopPane1.getSelectedFrame()).lienzo1().setRender(true);
        }else{
            ((ventana_interna) this.jDesktopPane1.getSelectedFrame()).lienzo1().setRender(false);
        }
    }//GEN-LAST:event_alisarActionPerformed

    private void transparenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transparenciaActionPerformed
        if (this.transparencia.isSelected()){
            ((ventana_interna) this.jDesktopPane1.getSelectedFrame()).lienzo1().setComposicion(true);
        }else{
            ((ventana_interna) this.jDesktopPane1.getSelectedFrame()).lienzo1().setComposicion(false);
        }
    }//GEN-LAST:event_transparenciaActionPerformed

    private void moverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moverActionPerformed
         if (this.mover.isSelected()){
            ((ventana_interna) this.jDesktopPane1.getSelectedFrame()).lienzo1().setEditar(true);
        }else{
            ((ventana_interna) this.jDesktopPane1.getSelectedFrame()).lienzo1().setEditar(false);
        }
    }//GEN-LAST:event_moverActionPerformed

    private void grosorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_grosorStateChanged
        ((ventana_interna) this.jDesktopPane1.getSelectedFrame()).lienzo1().setStroke((int) this.grosor.getValue());
    }//GEN-LAST:event_grosorStateChanged

    public void setMiVentana(Dibujo dibujo, Boolean relleno,int trazo_grosor,boolean composicion, boolean render, boolean mov){
        ActionEvent evt = null;
        if(dibujo == Dibujo.enum_punto){
            this.lapizActionPerformed(evt);
        }else if(dibujo==Dibujo.enum_linea){
            lineaActionPerformed(evt);
        }else if(dibujo==Dibujo.enum_rectangulo){
            rectanguloActionPerformed(evt);
        }else if(dibujo == Dibujo.enum_elipse){
            ovaloActionPerformed(evt);
        }
        this.relleno.setSelected(relleno);
        this.grosor.setValue(trazo_grosor);
        this.transparencia.setSelected(composicion);
        this.alisar.setSelected(render);
        this.mover.setSelected(mov);
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem abrir;
    private javax.swing.JCheckBox alisar;
    private javax.swing.JMenu archivo;
    private javax.swing.JButton azul;
    private javax.swing.JCheckBoxMenuItem barra_atributos;
    private javax.swing.JCheckBoxMenuItem barra_estado;
    private javax.swing.JCheckBoxMenuItem barra_formas;
    private javax.swing.JButton black;
    private javax.swing.JMenu edicion;
    private javax.swing.JLabel etiqueta_barra_menu;
    private javax.swing.JButton green;
    private javax.swing.JSpinner grosor;
    private javax.swing.JMenuItem guardar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JToggleButton lapiz;
    private javax.swing.JToggleButton linea;
    private javax.swing.JCheckBox mover;
    private javax.swing.JMenuItem nuevo;
    private javax.swing.JToggleButton ovalo;
    private javax.swing.JToggleButton rectangulo;
    private javax.swing.JCheckBox relleno;
    private javax.swing.JButton rojo;
    private javax.swing.JCheckBox transparencia;
    private javax.swing.JButton write;
    private javax.swing.JButton yelow;
    // End of variables declaration//GEN-END:variables
    private practica8.ventana_interna externa;
    
}
