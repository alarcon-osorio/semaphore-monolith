package com.ud.semaphore.presentation;

import com.ud.semaphore.presentation.semaphore.LightP;
import com.ud.semaphore.presentation.semaphore.LightV;

import javax.swing.*;
import java.awt.*;

public class Intersection3 extends JFrame {

    // Variables declaration - do not modify
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JPanel jPanel5;
    private JPanel jPanel6;

    private LightV semaphore1 = new LightV();
    private LightV semaphore2 = new LightV();
    private LightV semaphore3 = new LightV();
    private LightV semaphore4 = new LightV();
    private LightV semaphore5 = new LightV();
    // End of variables declaration

    public Intersection3() {
        initComponents();
    }

    private void initComponents(){

        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        jPanel3 = new JPanel();
        jPanel4 = new JPanel();
        jPanel5 = new JPanel();
        jPanel6 = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();

        jPanel1.setBorder(BorderFactory.createEtchedBorder());
        GroupLayout groupLayout1 = new GroupLayout(jPanel1);
        jPanel1.setLayout(groupLayout1);

        jPanel2.setBorder(BorderFactory.createEtchedBorder());
        GroupLayout groupLayout2 = new GroupLayout(jPanel2);
        jPanel1.setLayout(groupLayout2);

        jPanel3.setBorder(BorderFactory.createEtchedBorder());
        GroupLayout groupLayout3 = new GroupLayout(jPanel3);
        jPanel1.setLayout(groupLayout3);

        jPanel4.setBorder(BorderFactory.createEtchedBorder());
        GroupLayout groupLayout4 = new GroupLayout(jPanel3);
        jPanel1.setLayout(groupLayout4);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(38, 38, 38)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(32, 32, 32)
                                                                .addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(56, 56, 56)
                                                .addComponent(jPanel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jPanel6, GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.setSize(200, 200);
        jPanel1.setLayout(new FlowLayout(FlowLayout.CENTER));
        semaphore1.setSize(100, 90);
        jPanel1.add(semaphore1);
        getContentPane().add(jPanel1, BorderLayout.CENTER);
        jPanel2.setSize(200, 200);
        jPanel2.setLayout(new FlowLayout(FlowLayout.CENTER));
        semaphore2.setSize(100, 90);
        jPanel2.add(semaphore2);
        getContentPane().add(jPanel2, BorderLayout.CENTER);
        jPanel3.setSize(200, 200);
        jPanel3.setLayout(new FlowLayout(FlowLayout.CENTER));
        semaphore3.setSize(100, 90);
        jPanel3.add(semaphore3);
        getContentPane().add(jPanel3, BorderLayout.CENTER);
        jPanel4.setSize(200, 200);
        jPanel4.setLayout(new FlowLayout(FlowLayout.CENTER));
        semaphore4.setSize(100, 90);
        jPanel4.add(semaphore4);
        getContentPane().add(jPanel4, BorderLayout.CENTER);
        jPanel4.setSize(200, 200);
        jPanel4.setLayout(new FlowLayout(FlowLayout.CENTER));
        semaphore4.setSize(100, 90);
        jPanel4.add(semaphore4);
        getContentPane().add(jPanel4, BorderLayout.CENTER);

        pack();

    }

}
