
package ventanas;

import sistemacheckin.CheckIn;
import sistemacheckin.Pasajero;
import sistemacheckin.Terminal;

public class EquipajeFrame extends javax.swing.JFrame {

    /**
     * Creates new form EquipajeFrame
     */
    private Terminal t;
    private Pasajero p;
    private CheckIn check;
    private int asiento;
    public EquipajeFrame(Terminal t, Pasajero p, CheckIn c, int i) {
        this.t = t;
        this.p = p;
        this.check = c;
        this.asiento = i;
        initComponents();
        ocultar();
        this.setResizable(false);
        
    }
    public EquipajeFrame(Terminal t, Pasajero p, CheckIn c) {
        this.t = t;
        this.p = p;
        this.check = c;
        initComponents();
        ocultar();
        this.setResizable(false);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jToggleButton4 = new javax.swing.JToggleButton();
        jLabel17 = new javax.swing.JLabel();
        jToggleButton5 = new javax.swing.JToggleButton();
        comboCant = new javax.swing.JComboBox<>();
        equipaje = new javax.swing.JCheckBox();
        lblCant = new javax.swing.JLabel();
        lblPeso3 = new javax.swing.JLabel();
        peso3 = new javax.swing.JTextField();
        lblKg3 = new javax.swing.JLabel();
        lblPeso4 = new javax.swing.JLabel();
        peso4 = new javax.swing.JTextField();
        lblKg4 = new javax.swing.JLabel();
        peso2 = new javax.swing.JTextField();
        lblPeso2 = new javax.swing.JLabel();
        lblKg2 = new javax.swing.JLabel();
        lblPeso1 = new javax.swing.JLabel();
        peso1 = new javax.swing.JTextField();
        lblKg1 = new javax.swing.JLabel();
        especial1 = new javax.swing.JCheckBox();
        mascota1 = new javax.swing.JCheckBox();
        especial2 = new javax.swing.JCheckBox();
        especial3 = new javax.swing.JCheckBox();
        especial4 = new javax.swing.JCheckBox();
        mascota2 = new javax.swing.JCheckBox();
        mascota3 = new javax.swing.JCheckBox();
        mascota4 = new javax.swing.JCheckBox();
        asistencia = new javax.swing.JCheckBox();
        comboTipo = new javax.swing.JComboBox<>();
        lblTipo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Equipaje y Asistencia");

        jToggleButton4.setBackground(new java.awt.Color(255, 255, 51));
        jToggleButton4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jToggleButton4.setText("Atras");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));

        jToggleButton5.setBackground(new java.awt.Color(255, 255, 51));
        jToggleButton5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jToggleButton5.setText("Siguiente");
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });

        comboCant.setBackground(new java.awt.Color(255, 255, 255));
        comboCant.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        comboCant.setForeground(new java.awt.Color(0, 0, 0));
        comboCant.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboCant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCantActionPerformed(evt);
            }
        });

        equipaje.setBackground(new java.awt.Color(204, 255, 204));
        equipaje.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        equipaje.setForeground(new java.awt.Color(51, 51, 51));
        equipaje.setText("Equipaje en Bodega");
        equipaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equipajeActionPerformed(evt);
            }
        });

        lblCant.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCant.setForeground(new java.awt.Color(51, 51, 51));
        lblCant.setText("Cantidad");

        lblPeso3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPeso3.setForeground(new java.awt.Color(51, 51, 51));
        lblPeso3.setText("Peso Estimado 3");

        peso3.setBackground(new java.awt.Color(255, 255, 255));
        peso3.setForeground(new java.awt.Color(51, 51, 51));
        peso3.setText("0");

        lblKg3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblKg3.setForeground(new java.awt.Color(51, 51, 51));
        lblKg3.setText("Kg");

        lblPeso4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPeso4.setForeground(new java.awt.Color(51, 51, 51));
        lblPeso4.setText("Peso Estimado 4");

        peso4.setBackground(new java.awt.Color(255, 255, 255));
        peso4.setForeground(new java.awt.Color(51, 51, 51));
        peso4.setText("0");

        lblKg4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblKg4.setForeground(new java.awt.Color(51, 51, 51));
        lblKg4.setText("Kg");

        peso2.setBackground(new java.awt.Color(255, 255, 255));
        peso2.setForeground(new java.awt.Color(51, 51, 51));
        peso2.setText("0");

        lblPeso2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPeso2.setForeground(new java.awt.Color(51, 51, 51));
        lblPeso2.setText("Peso Estimado 2");

        lblKg2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblKg2.setForeground(new java.awt.Color(51, 51, 51));
        lblKg2.setText("Kg");

        lblPeso1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPeso1.setForeground(new java.awt.Color(51, 51, 51));
        lblPeso1.setText("Peso Estimado 1");

        peso1.setBackground(new java.awt.Color(255, 255, 255));
        peso1.setForeground(new java.awt.Color(51, 51, 51));
        peso1.setText("0");

        lblKg1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblKg1.setForeground(new java.awt.Color(51, 51, 51));
        lblKg1.setText("Kg");

        especial1.setBackground(new java.awt.Color(204, 255, 204));
        especial1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        especial1.setForeground(new java.awt.Color(51, 51, 51));
        especial1.setText("Especial");
        especial1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especial1ActionPerformed(evt);
            }
        });

        mascota1.setBackground(new java.awt.Color(204, 255, 204));
        mascota1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        mascota1.setForeground(new java.awt.Color(51, 51, 51));
        mascota1.setText("Mascota");
        mascota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mascota1ActionPerformed(evt);
            }
        });

        especial2.setBackground(new java.awt.Color(204, 255, 204));
        especial2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        especial2.setForeground(new java.awt.Color(51, 51, 51));
        especial2.setText("Especial");
        especial2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especial2ActionPerformed(evt);
            }
        });

        especial3.setBackground(new java.awt.Color(204, 255, 204));
        especial3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        especial3.setForeground(new java.awt.Color(51, 51, 51));
        especial3.setText("Especial");
        especial3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especial3ActionPerformed(evt);
            }
        });

        especial4.setBackground(new java.awt.Color(204, 255, 204));
        especial4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        especial4.setForeground(new java.awt.Color(51, 51, 51));
        especial4.setText("Especial");
        especial4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especial4ActionPerformed(evt);
            }
        });

        mascota2.setBackground(new java.awt.Color(204, 255, 204));
        mascota2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        mascota2.setForeground(new java.awt.Color(51, 51, 51));
        mascota2.setText("Mascota");
        mascota2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mascota2ActionPerformed(evt);
            }
        });

        mascota3.setBackground(new java.awt.Color(204, 255, 204));
        mascota3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        mascota3.setForeground(new java.awt.Color(51, 51, 51));
        mascota3.setText("Mascota");
        mascota3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mascota3ActionPerformed(evt);
            }
        });

        mascota4.setBackground(new java.awt.Color(204, 255, 204));
        mascota4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        mascota4.setForeground(new java.awt.Color(51, 51, 51));
        mascota4.setText("Mascota");
        mascota4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mascota4ActionPerformed(evt);
            }
        });

        asistencia.setBackground(new java.awt.Color(204, 255, 204));
        asistencia.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        asistencia.setForeground(new java.awt.Color(51, 51, 51));
        asistencia.setText("Asistencia Especial");
        asistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asistenciaActionPerformed(evt);
            }
        });

        comboTipo.setBackground(new java.awt.Color(255, 255, 255));
        comboTipo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        comboTipo.setForeground(new java.awt.Color(0, 0, 0));
        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblTipo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(51, 51, 51));
        lblTipo.setText("Tipo");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel17)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(equipaje)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblCant)
                                .addGap(18, 18, 18)
                                .addComponent(comboCant, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(144, 144, 144)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblPeso3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(peso3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblKg3)
                                .addGap(18, 18, 18)
                                .addComponent(especial3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mascota3))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblPeso2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(peso2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblKg2)
                                .addGap(18, 18, 18)
                                .addComponent(especial2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mascota2))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblPeso1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(peso1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblKg1)
                                .addGap(18, 18, 18)
                                .addComponent(especial1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mascota1))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblPeso4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(peso4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblKg4)
                                .addGap(18, 18, 18)
                                .addComponent(especial4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mascota4)))
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(asistencia)
                            .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 402, Short.MAX_VALUE)
                                .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(lblTipo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(equipaje))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCant)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPeso2)
                            .addComponent(peso2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblKg2)
                            .addComponent(especial2)
                            .addComponent(mascota2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPeso3)
                            .addComponent(peso3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblKg3)
                            .addComponent(especial3)
                            .addComponent(mascota3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPeso4)
                            .addComponent(peso4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblKg4)
                            .addComponent(especial4)
                            .addComponent(mascota4)))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPeso1)
                        .addComponent(peso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblKg1)
                        .addComponent(especial1)
                        .addComponent(mascota1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTipo))
                    .addComponent(asistencia))
                .addGap(43, 43, 43)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        // TODO add your handling code here:
        if(this.check.isBusiness()){
            Asiento asiento = new Asiento(t,p,check,this.asiento);
            asiento.show();
            dispose();
        }
        else{
            MigracionFrame migracionFrame = new MigracionFrame(this.p,this.t);
            migracionFrame.show();
            dispose();
        }
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        // TODO add your handling code here:
        if (this.equipaje.isSelected()) {
            if (this.comboCant.getSelectedItem().equals("1")) {
                int peso = Integer.parseInt(this.peso1.getText());
                this.check.addEquipaje(peso, this.especial1.isSelected(), this.mascota1.isSelected());

            } else if (this.comboCant.getSelectedItem().equals("2")) {
                int peso1 = Integer.parseInt(this.peso1.getText());
                int peso2 = Integer.parseInt(this.peso2.getText());
                this.check.addEquipaje(peso1, this.especial1.isSelected(), this.mascota1.isSelected());
                this.check.addEquipaje(peso2, this.especial2.isSelected(), this.mascota2.isSelected());

            } else if (this.comboCant.getSelectedItem().equals("3")) {
                int peso1 = Integer.parseInt(this.peso1.getText());
                int peso2 = Integer.parseInt(this.peso2.getText());
                int peso3 = Integer.parseInt(this.peso3.getText());
                this.check.addEquipaje(peso1, this.especial1.isSelected(), this.mascota1.isSelected());
                this.check.addEquipaje(peso2, this.especial2.isSelected(), this.mascota2.isSelected());
                this.check.addEquipaje(peso3, this.especial3.isSelected(), this.mascota3.isSelected());

            } else if (this.comboCant.getSelectedItem().equals("4")) {
                int peso1 = Integer.parseInt(this.peso1.getText());
                int peso2 = Integer.parseInt(this.peso2.getText());
                int peso3 = Integer.parseInt(this.peso3.getText());
                int peso4 = Integer.parseInt(this.peso4.getText());
                this.check.addEquipaje(peso1, this.especial1.isSelected(), this.mascota1.isSelected());
                this.check.addEquipaje(peso2, this.especial2.isSelected(), this.mascota2.isSelected());
                this.check.addEquipaje(peso3, this.especial3.isSelected(), this.mascota3.isSelected());
                this.check.addEquipaje(peso4, this.especial4.isSelected(), this.mascota4.isSelected());

            }
        }
        if(this.asistencia.isSelected()){
            this.check.setAsistencia(true);
            this.check.setTipoAsistencia((String) this.comboTipo.getSelectedItem());
        }
        else{
            this.check.setAsistencia(false);
        }
        
        ImpresionTicket impresionTicket = new ImpresionTicket(t,p,check);
        impresionTicket.show();
        dispose();

    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void ocultar(){
        //Combo Box Personalizado
        comboCant.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Discapacitado","Embarazada","Otro"}));
        
        //Ocultar
        this.comboCant.setVisible(false);
        this.comboTipo.setVisible(false);
        this.especial1.setVisible(false);
        this.especial2.setVisible(false);
        this.especial3.setVisible(false);
        this.especial4.setVisible(false);
        this.lblCant.setVisible(false);
        this.lblKg1.setVisible(false);
        this.lblKg2.setVisible(false);
        this.lblKg3.setVisible(false);
        this.lblKg4.setVisible(false);
        this.lblPeso1.setVisible(false);
        this.lblPeso2.setVisible(false);
        this.lblPeso3.setVisible(false);
        this.lblPeso4.setVisible(false);
        this.lblTipo.setVisible(false);
        this.mascota1.setVisible(false);
        this.mascota2.setVisible(false);
        this.mascota3.setVisible(false);
        this.mascota4.setVisible(false);
        this.peso1.setVisible(false);
        this.peso2.setVisible(false);
        this.peso3.setVisible(false);
        this.peso4.setVisible(false);
    }
    
    public void hidePeso1(){
        this.lblPeso1.setVisible(false);
        this.peso1.setVisible(false);
        this.lblKg1.setVisible(false);
        this.especial1.setVisible(false);
        this.mascota1.setVisible(false);
    }
    public void hidePeso2(){
        this.lblPeso2.setVisible(false);
        this.peso2.setVisible(false);
        this.lblKg2.setVisible(false);
        this.especial2.setVisible(false);
        this.mascota2.setVisible(false);
    }
    public void hidePeso3(){
        this.lblPeso3.setVisible(false);
        this.peso3.setVisible(false);
        this.lblKg3.setVisible(false);
        this.especial3.setVisible(false);
        this.mascota3.setVisible(false);
    }
    public void hidePeso4(){
        this.lblPeso4.setVisible(false);
        this.peso4.setVisible(false);
        this.lblKg4.setVisible(false);
        this.especial4.setVisible(false);
        this.mascota4.setVisible(false);
    }

    
    public void showPeso1(){
        this.lblPeso1.setVisible(true);
        this.peso1.setVisible(true);
        this.lblKg1.setVisible(true);
        this.especial1.setVisible(true);
        this.mascota1.setVisible(true);
    }
    public void showPeso2(){
        this.lblPeso2.setVisible(true);
        this.peso2.setVisible(true);
        this.lblKg2.setVisible(true);
        this.especial2.setVisible(true);
        this.mascota2.setVisible(true);
    }
    public void showPeso3(){
        this.lblPeso3.setVisible(true);
        this.peso3.setVisible(true);
        this.lblKg3.setVisible(true);
        this.especial3.setVisible(true);
        this.mascota3.setVisible(true);
    }
    public void showPeso4(){
        this.lblPeso4.setVisible(true);
        this.peso4.setVisible(true);
        this.lblKg4.setVisible(true);
        this.especial4.setVisible(true);
        this.mascota4.setVisible(true);
    }
    
    public void showCantEquipaje(){
        this.lblCant.setVisible(true);
        this.comboCant.setVisible(true);
    }
    
    public void hideCantEquipaje(){
        this.lblCant.setVisible(false);
        this.comboCant.setVisible(false);
    }
    
    public void showTipoAsistencia(){
        this.comboTipo.setVisible(true);
        this.lblTipo.setVisible(true);
    }
    
    public void hideTipoAsistencia(){
        this.comboTipo.setVisible(false);
        this.lblTipo.setVisible(false);
    }
    
    
    private void equipajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equipajeActionPerformed
        // TODO add your handling code here:
        if(this.equipaje.isSelected()){
            this.showCantEquipaje();
            this.showPeso1();
        }
        else{
            this.hideCantEquipaje();
            this.hidePeso1();
            this.hidePeso2();
            this.hidePeso3();
            this.hidePeso4();
        }
    }//GEN-LAST:event_equipajeActionPerformed

    private void especial1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especial1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_especial1ActionPerformed

    private void mascota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mascota1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mascota1ActionPerformed

    private void especial2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especial2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_especial2ActionPerformed

    private void especial3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especial3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_especial3ActionPerformed

    private void especial4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especial4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_especial4ActionPerformed

    private void mascota2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mascota2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mascota2ActionPerformed

    private void mascota3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mascota3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mascota3ActionPerformed

    private void mascota4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mascota4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mascota4ActionPerformed

    private void asistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asistenciaActionPerformed
        // TODO add your handling code here:
        if(this.asistencia.isSelected()){
            this.showTipoAsistencia();
        }
        else{
            this.hideTipoAsistencia();
        }
            
    }//GEN-LAST:event_asistenciaActionPerformed

    private void comboCantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCantActionPerformed
        // TODO add your handling code here:
        if (this.comboCant.getSelectedItem().equals("1")) {
            this.showPeso1();
            this.hidePeso2();
            this.hidePeso3();
            this.hidePeso4();
        }
        else if (this.comboCant.getSelectedItem().equals("2")) {
            this.showPeso1();
            this.showPeso2();
            this.hidePeso3();
            this.hidePeso4();
        }
        else if (this.comboCant.getSelectedItem().equals("3")) {
            this.showPeso1();
            this.showPeso2();
            this.showPeso3();
            this.hidePeso4();
        }
        else if (this.comboCant.getSelectedItem().equals("4")) {
            this.showPeso1();
            this.showPeso2();
            this.showPeso3();
            this.showPeso4();
        }

    }//GEN-LAST:event_comboCantActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox asistencia;
    private javax.swing.JComboBox<String> comboCant;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JCheckBox equipaje;
    private javax.swing.JCheckBox especial1;
    private javax.swing.JCheckBox especial2;
    private javax.swing.JCheckBox especial3;
    private javax.swing.JCheckBox especial4;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JLabel lblCant;
    private javax.swing.JLabel lblKg1;
    private javax.swing.JLabel lblKg2;
    private javax.swing.JLabel lblKg3;
    private javax.swing.JLabel lblKg4;
    private javax.swing.JLabel lblPeso1;
    private javax.swing.JLabel lblPeso2;
    private javax.swing.JLabel lblPeso3;
    private javax.swing.JLabel lblPeso4;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JCheckBox mascota1;
    private javax.swing.JCheckBox mascota2;
    private javax.swing.JCheckBox mascota3;
    private javax.swing.JCheckBox mascota4;
    private javax.swing.JTextField peso1;
    private javax.swing.JTextField peso2;
    private javax.swing.JTextField peso3;
    private javax.swing.JTextField peso4;
    // End of variables declaration//GEN-END:variables
}
