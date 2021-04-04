/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rbe;

import javax.swing.JFrame;

/**
 *
 * @author YDRGZM
 */
public class PromptMessage extends javax.swing.JFrame {

    JFrame frameSource;
    JFrame frameOut;
    /**
     * 
     * @param str
     * @param j 
     */
    public PromptMessage(String str,JFrame f,JFrame f1) {
        initComponents();
        msgPrompt.setText(str);
        frameSource=f;
        frameOut=f1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        prompt = new javax.swing.JPanel();
        prompt2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        okPrompt = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        msgPrompt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        prompt.setBackground(new java.awt.Color(16, 16, 16));
        prompt.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                promptMouseDragged(evt);
            }
        });
        prompt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                promptMousePressed(evt);
            }
        });

        prompt2.setBackground(new java.awt.Color(243, 202, 32));
        prompt2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                prompt2MouseDragged(evt);
            }
        });
        prompt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                prompt2MousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rbe/img/icons8_close_window_40px_1.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("RBE");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rbe/img/icons8_student_male_40px.png"))); // NOI18N

        javax.swing.GroupLayout prompt2Layout = new javax.swing.GroupLayout(prompt2);
        prompt2.setLayout(prompt2Layout);
        prompt2Layout.setHorizontalGroup(
            prompt2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, prompt2Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );
        prompt2Layout.setVerticalGroup(
            prompt2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(prompt2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(prompt2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        okPrompt.setBackground(new java.awt.Color(243, 202, 32));
        okPrompt.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        okPrompt.setText("OK");
        okPrompt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        okPrompt.setFocusPainted(false);
        okPrompt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okPromptActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(243, 202, 32));

        jLabel4.setBackground(new java.awt.Color(16, 16, 16));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rbe/img/icons8_checkmark_30px.png"))); // NOI18N

        msgPrompt.setBackground(new java.awt.Color(16, 16, 16));
        msgPrompt.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        msgPrompt.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout promptLayout = new javax.swing.GroupLayout(prompt);
        prompt.setLayout(promptLayout);
        promptLayout.setHorizontalGroup(
            promptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(prompt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, promptLayout.createSequentialGroup()
                .addGroup(promptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(promptLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel4)
                        .addGroup(promptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(promptLayout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE))
                            .addGroup(promptLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(msgPrompt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(promptLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(okPrompt, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        promptLayout.setVerticalGroup(
            promptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(promptLayout.createSequentialGroup()
                .addComponent(prompt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(promptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, promptLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, promptLayout.createSequentialGroup()
                        .addComponent(msgPrompt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(okPrompt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(prompt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(prompt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        System.exit(0);
    }//GEN-LAST:event_jLabel3MousePressed

    private void prompt2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prompt2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_prompt2MouseDragged

    private void prompt2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prompt2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_prompt2MousePressed

    private void okPromptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okPromptActionPerformed
        this.setVisible(false);
        frameSource.setVisible(false);
        frameOut.setVisible(true);
    }//GEN-LAST:event_okPromptActionPerformed

    private void promptMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_promptMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_promptMouseDragged

    private void promptMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_promptMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_promptMousePressed

    int xMouse;
    int yMouse;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel msgPrompt;
    private javax.swing.JButton okPrompt;
    private javax.swing.JPanel prompt;
    private javax.swing.JPanel prompt2;
    // End of variables declaration//GEN-END:variables
}
