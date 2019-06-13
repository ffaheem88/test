package javaapplication11;

import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import com.ximpleware.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.Vector;
import java.io.*;
//import org.jfree.beans.JLineChart;
//import org.jfree.data.category.CategoryDataset;
//import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.*;
import org.jfugue.*;
import java.util.Random;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewJFrame1.java
 *
 * Created on Mar 16, 2011, 6:12:31 PM
 */

/**
 *
 * @author faisal
 */
public class NewJFrame1 extends javax.swing.JFrame {
   int totalframes = 0;
    int countframes = 0;
 int le = 50;//scale
 int down = 80;//
    int grid = le * down;
Player player = new Player();
    /** Creates new form NewJFrame1 */


    double[] se = new double[10000];
    double[] ee = new double[10000];
    double[] dev=new double[10000];
    double[] cd = new double[20000];

    public NewJFrame1() {
        GridLayout gl = new GridLayout();
        gl.setColumns(le+1);
        gl.setRows(down+1);
        p1.setLayout(gl);
        JPanel p2 = new JPanel();
        p2.setPreferredSize(new Dimension(100,100));
        



for(int i=1;i<grid+le+1;i++){
    if (i<grid+1){
        
        button[i]= new JButton(Integer.toString(i));
        p1.add(button[i]);
       // button[i].setSize(5, 5);
        button[i].setRolloverEnabled(true);
        
        button[i].setForeground(Color.white);
        button[i].setText("");
        button[i].setActionCommand(Integer.toString(i));
        button[i].setBorder(null);
        button[i].addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    actionPerformed123(evt);
                        }
                });
        
        if (i==le/2){
        button[i].setBackground(Color.black);
        }else{
        button[i].setBackground(Color.white);
        }
      
if (i%(le)==0 /*&& (i!=grid)*/ && (i!=0)){
    label[i/(le)] = new JLabel(Integer.toString(i/(le)));
    label[i/(le)].setFont(new java.awt.Font("DejaVu Sans", 0, 7));
    
    p1.add(label[i/(le)]);
    
}
    }
    if(i>grid){
        labelx[i-grid]=new JLabel(Integer.toString(i-grid));
        labelx[i-grid].setFont(new java.awt.Font("DejaVu Sans", 0, 7));
       // System.out.println(i-grid);
        p1.add(labelx[i-grid]);
    }

        }

Container c=getContentPane();

p1.setPreferredSize(new Dimension(le,down));//scope

sp1.setPreferredSize(new Dimension(600,675));
sp1.setVerticalScrollBar(new JScrollBar());
//sp1.add(p1);
//sp1.setHorizontalScrollBar(new JScrollBar());
c.add(p2,GroupLayout.DEFAULT_SIZE);
c.add(sp1,GroupLayout.DEFAULT_SIZE);


pack();
setVisible(true);
initComponents();

jList1.setListData(getprofile());
       
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jFrame4 = new javax.swing.JFrame();
        jPanel11 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jLineChart2 = new org.jfree.beans.JLineChart();
        jLineChart1 = new org.jfree.beans.JLineChart();
        jLineChart3 = new org.jfree.beans.JLineChart();
        jLineChart4 = new org.jfree.beans.JLineChart();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel12 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel54 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jSlider2 = new javax.swing.JSlider();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();
        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        Play = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel14 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        canvas1 = new java.awt.Canvas();
        jPanel13 = new javax.swing.JPanel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame4Layout = new javax.swing.GroupLayout(jFrame4.getContentPane());
        jFrame4.getContentPane().setLayout(jFrame4Layout);
        jFrame4Layout.setHorizontalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame4Layout.setVerticalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(207, 1300));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 492, -1, -1));

        jTabbedPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("FeedBack"));
        jTabbedPane2.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        jLineChart2.setLegendPosition(org.jfree.beans.LegendPosition.NONE);
        jLineChart2.setChartBackgroundPaint(new java.awt.Color(234, 234, 234, 255));
        jLineChart2.setPlotBackgroundPaint(new java.awt.Color(165, 188, 184, 255));
        jLineChart2.setSource("");
        jLineChart2.setSubtitle("Shannon Information Entropy");
        jLineChart2.setTitle("Entropy");
        jLineChart2.setXAxisLabel("Frames");
        jLineChart2.setXAxisScale(org.jfree.beans.AxisScale.INTEGER);
        jLineChart2.setYAxisAutoRangeIncludesZero(false);
        jLineChart2.setYAxisLabel("Entropy");

        javax.swing.GroupLayout jLineChart2Layout = new javax.swing.GroupLayout(jLineChart2);
        jLineChart2.setLayout(jLineChart2Layout);
        jLineChart2Layout.setHorizontalGroup(
            jLineChart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 393, Short.MAX_VALUE)
        );
        jLineChart2Layout.setVerticalGroup(
            jLineChart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 259, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Image", jLineChart2);

        jLineChart1.setLegendItemPaint(new java.awt.Color(1, 1, 1, 255));
        jLineChart1.setLegendPosition(org.jfree.beans.LegendPosition.NONE);
        jLineChart1.setChartBackgroundPaint(new java.awt.Color(234, 234, 234, 255));
        jLineChart1.setPlotBackgroundPaint(new java.awt.Color(180, 168, 181, 255));
        jLineChart1.setSource("");
        jLineChart1.setSubtitle("Entropy of Line Entropy");
        jLineChart1.setTitle("Image Entropy");
        jLineChart1.setXAxisAutoRangeIncludesZero(true);
        jLineChart1.setXAxisLabel("Frames");
        jLineChart1.setXAxisScale(org.jfree.beans.AxisScale.INTEGER);
        jLineChart1.setYAxisAutoRangeIncludesZero(false);
        jLineChart1.setYAxisLabel("Entropy");

        javax.swing.GroupLayout jLineChart1Layout = new javax.swing.GroupLayout(jLineChart1);
        jLineChart1.setLayout(jLineChart1Layout);
        jLineChart1Layout.setHorizontalGroup(
            jLineChart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 393, Short.MAX_VALUE)
        );
        jLineChart1Layout.setVerticalGroup(
            jLineChart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 259, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Line", jLineChart1);

        jLineChart3.setLegendPosition(org.jfree.beans.LegendPosition.NONE);
        jLineChart3.setChartBackgroundPaint(new java.awt.Color(234, 234, 234, 255));
        jLineChart3.setPlotBackgroundPaint(new java.awt.Color(106, 109, 107, 255));
        jLineChart3.setSource("");
        jLineChart3.setSubtitle("Entropy of Image Entropy");
        jLineChart3.setTitle("System Entropy");
        jLineChart3.setXAxisLabel("Frames");
        jLineChart3.setXAxisScale(org.jfree.beans.AxisScale.INTEGER);
        jLineChart3.setYAxisAutoRangeIncludesZero(false);
        jLineChart3.setYAxisLabel("Entropy");

        javax.swing.GroupLayout jLineChart3Layout = new javax.swing.GroupLayout(jLineChart3);
        jLineChart3.setLayout(jLineChart3Layout);
        jLineChart3Layout.setHorizontalGroup(
            jLineChart3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 393, Short.MAX_VALUE)
        );
        jLineChart3Layout.setVerticalGroup(
            jLineChart3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 259, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("System", jLineChart3);

        jLineChart4.setLegendPosition(org.jfree.beans.LegendPosition.NONE);
        jLineChart4.setChartBackgroundPaint(new java.awt.Color(234, 234, 234, 255));
        jLineChart4.setPlotBackgroundPaint(new java.awt.Color(215, 214, 204, 255));
        jLineChart4.setSource("");
        jLineChart4.setSubtitle("Average Line Entropy");
        jLineChart4.setTitle("Image Entropy");
        jLineChart4.setXAxisLabel("");
        jLineChart4.setXAxisScale(org.jfree.beans.AxisScale.INTEGER);
        jLineChart4.setYAxisAutoRangeIncludesZero(false);
        jLineChart4.setYAxisLabel("Entropy");

        javax.swing.GroupLayout jLineChart4Layout = new javax.swing.GroupLayout(jLineChart4);
        jLineChart4.setLayout(jLineChart4Layout);
        jLineChart4Layout.setHorizontalGroup(
            jLineChart4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 393, Short.MAX_VALUE)
        );
        jLineChart4Layout.setVerticalGroup(
            jLineChart4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 259, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Zoom", jLineChart4);

        jPanel1.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 410, 310));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 380, 0));

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Save State"));

        jButton5.setFont(new java.awt.Font("DejaVu Sans", 0, 10)); // NOI18N
        jButton5.setText("Save");
        jButton5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("DejaVu Sans", 0, 10)); // NOI18N
        jButton6.setText("Load");
        jButton6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel54.setFont(new java.awt.Font("DejaVu Sans", 1, 10)); // NOI18N
        jLabel54.setText("No Comments");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addGap(16, 16, 16))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel54)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 140, 130));

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Control Panel"));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel9MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel9MouseReleased(evt);
            }
        });

        jLabel30.setBackground(java.awt.Color.white);
        jLabel30.setForeground(new java.awt.Color(252, 242, 14));
        jLabel30.setText("jLabel2");
        jLabel30.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel30.setOpaque(true);

        jLabel31.setBackground(java.awt.Color.white);
        jLabel31.setForeground(new java.awt.Color(252, 242, 14));
        jLabel31.setText("jLabel2");
        jLabel31.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel31.setOpaque(true);

        jLabel32.setBackground(java.awt.Color.white);
        jLabel32.setForeground(new java.awt.Color(252, 242, 14));
        jLabel32.setText("jLabel2");
        jLabel32.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel32.setOpaque(true);

        jLabel41.setBackground(java.awt.Color.white);
        jLabel41.setForeground(java.awt.Color.yellow);
        jLabel41.setText("jLabel2");
        jLabel41.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel41.setOpaque(true);
        jLabel41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel41MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );

        jPanel10.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, -1, 39));

        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel8MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel8MouseReleased(evt);
            }
        });

        jLabel26.setBackground(java.awt.Color.white);
        jLabel26.setForeground(new java.awt.Color(252, 242, 14));
        jLabel26.setText("jLabel2");
        jLabel26.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel26.setOpaque(true);

        jLabel27.setBackground(java.awt.Color.white);
        jLabel27.setForeground(new java.awt.Color(252, 242, 14));
        jLabel27.setText("jLabel2");
        jLabel27.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel27.setOpaque(true);

        jLabel28.setBackground(new java.awt.Color(1, 1, 1));
        jLabel28.setText("jLabel2");
        jLabel28.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel28.setOpaque(true);

        jLabel40.setBackground(java.awt.Color.white);
        jLabel40.setForeground(java.awt.Color.yellow);
        jLabel40.setText("jLabel2");
        jLabel40.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel40.setOpaque(true);
        jLabel40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel40MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );

        jPanel10.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, 39));

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel7MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel7MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel7MouseReleased(evt);
            }
        });

        jLabel22.setBackground(java.awt.Color.white);
        jLabel22.setForeground(new java.awt.Color(252, 242, 14));
        jLabel22.setText("jLabel2");
        jLabel22.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel22.setOpaque(true);

        jLabel23.setBackground(new java.awt.Color(1, 1, 1));
        jLabel23.setText("jLabel2");
        jLabel23.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel23.setOpaque(true);

        jLabel24.setBackground(java.awt.Color.white);
        jLabel24.setForeground(new java.awt.Color(252, 242, 14));
        jLabel24.setText("jLabel2");
        jLabel24.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel24.setOpaque(true);

        jLabel39.setBackground(java.awt.Color.white);
        jLabel39.setText("jLabel2");
        jLabel39.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel39.setOpaque(true);
        jLabel39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel39MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );

        jPanel10.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, 40));

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel6MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel6MouseReleased(evt);
            }
        });

        jLabel18.setBackground(java.awt.Color.white);
        jLabel18.setForeground(new java.awt.Color(252, 242, 14));
        jLabel18.setText("jLabel2");
        jLabel18.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel18.setOpaque(true);

        jLabel19.setBackground(new java.awt.Color(1, 1, 1));
        jLabel19.setText("jLabel2");
        jLabel19.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel19.setOpaque(true);

        jLabel20.setBackground(new java.awt.Color(1, 1, 1));
        jLabel20.setText("jLabel2");
        jLabel20.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel20.setOpaque(true);

        jLabel38.setBackground(java.awt.Color.white);
        jLabel38.setForeground(java.awt.Color.yellow);
        jLabel38.setText("jLabel2");
        jLabel38.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel38.setOpaque(true);
        jLabel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel38MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );

        jPanel10.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, 40));

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel5MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel5MouseReleased(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(1, 1, 1));
        jLabel14.setText("jLabel2");
        jLabel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel14.setOpaque(true);

        jLabel15.setBackground(java.awt.Color.white);
        jLabel15.setForeground(new java.awt.Color(252, 242, 14));
        jLabel15.setText("jLabel2");
        jLabel15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel15.setOpaque(true);

        jLabel16.setBackground(java.awt.Color.white);
        jLabel16.setForeground(new java.awt.Color(252, 242, 14));
        jLabel16.setText("jLabel2");
        jLabel16.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel16.setOpaque(true);

        jLabel37.setBackground(java.awt.Color.white);
        jLabel37.setForeground(new java.awt.Color(252, 242, 14));
        jLabel37.setText("jLabel2");
        jLabel37.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel37.setOpaque(true);
        jLabel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel37MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );

        jPanel10.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, 40));

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel4MouseReleased(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(1, 1, 1));
        jLabel10.setText("jLabel2");
        jLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel10.setOpaque(true);

        jLabel11.setBackground(java.awt.Color.white);
        jLabel11.setForeground(new java.awt.Color(252, 242, 14));
        jLabel11.setText("jLabel2");
        jLabel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel11.setOpaque(true);

        jLabel12.setBackground(new java.awt.Color(1, 1, 1));
        jLabel12.setText("jLabel2");
        jLabel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel12.setOpaque(true);

        jLabel36.setBackground(java.awt.Color.white);
        jLabel36.setForeground(new java.awt.Color(252, 242, 14));
        jLabel36.setText("jLabel2");
        jLabel36.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel36.setOpaque(true);
        jLabel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel36MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );

        jPanel10.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, 40));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel3MouseReleased(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(1, 1, 1));
        jLabel6.setText("jLabel2");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel6.setOpaque(true);

        jLabel7.setBackground(new java.awt.Color(1, 1, 1));
        jLabel7.setText("jLabel2");
        jLabel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel7.setOpaque(true);

        jLabel8.setBackground(java.awt.Color.white);
        jLabel8.setForeground(new java.awt.Color(252, 242, 14));
        jLabel8.setText("jLabel2");
        jLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel8.setOpaque(true);

        jLabel35.setBackground(java.awt.Color.white);
        jLabel35.setForeground(java.awt.Color.yellow);
        jLabel35.setText("jLabel2");
        jLabel35.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel35.setOpaque(true);
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel35MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );

        jPanel10.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 44, 40));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel2MouseReleased(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(1, 1, 1));
        jLabel2.setText("jLabel2");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel2.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(1, 1, 1));
        jLabel3.setText("jLabel2");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel3.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(1, 1, 1));
        jLabel4.setText("jLabel2");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel4.setOpaque(true);

        jLabel34.setBackground(new java.awt.Color(255, 255, 255));
        jLabel34.setForeground(new java.awt.Color(1, 1, 1));
        jLabel34.setText("jLabel2");
        jLabel34.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel34.setOpaque(true);
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel34MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel33)
                .addGap(39, 39, 39))
        );

        jPanel10.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 43, 40));

        jSlider2.setMaximum(600);
        jSlider2.setMinimum(1);
        jSlider2.setPaintLabels(true);
        jSlider2.setPaintTicks(true);
        jSlider2.setSnapToTicks(true);
        jSlider2.setValue(80);
        jSlider2.setBorder(javax.swing.BorderFactory.createTitledBorder("Scope"));
        jSlider2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jSlider2MouseReleased(evt);
            }
        });
        jSlider2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider2StateChanged(evt);
            }
        });
        jPanel10.add(jSlider2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 390, 40));

        jButton4.setFont(new java.awt.Font("DejaVu Sans", 0, 10)); // NOI18N
        jButton4.setText("Step");
        jButton4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 50, 20));

        jButton1.setActionCommand("start");
        jButton1.setFont(new java.awt.Font("DejaVu Sans", 0, 10)); // NOI18N
        jButton1.setText("Start");
        jButton1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 50, 20));

        jSlider1.setMaximum(600);
        jSlider1.setMinimum(1);
        jSlider1.setMinorTickSpacing(1);
        jSlider1.setToolTipText("Scale");
        jSlider1.setBorder(javax.swing.BorderFactory.createTitledBorder("Scale"));
        jSlider1.setVerifyInputWhenFocusTarget(false);
        jSlider1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jSlider1MouseReleased(evt);
            }
        });
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });
        jPanel10.add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 390, 40));

        jButton2.setActionCommand("stop");
        jButton2.setFont(new java.awt.Font("DejaVu Sans", 0, 10)); // NOI18N
        jButton2.setText("Stop");
        jButton2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 50, 20));

        Play.setActionCommand("reset");
        jButton7.setFont(new java.awt.Font("DejaVu Sans", 0, 10)); // NOI18N
        jButton7.setText("Reset");
        jButton7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 50, 20));

        Play.setActionCommand("reset");
        Play.setFont(new java.awt.Font("DejaVu Sans", 0, 10)); // NOI18N
        Play.setText("Play");
        Play.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        Play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayActionPerformed(evt);
            }
        });
        jPanel10.add(Play, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 50, 20));

        jCheckBox1.setText("Show grid");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jCheckBox1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCheckBox1PropertyChange(evt);
            }
        });
        jPanel10.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, 20));

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 410, 190));

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder("Parameters"));

        jLabel53.setFont(new java.awt.Font("DejaVu Sans", 0, 11)); // NOI18N
        jLabel53.setText("Rule:");

        jLabel52.setFont(new java.awt.Font("DejaVu Sans", 0, 11)); // NOI18N
        jLabel52.setText("0");

        jLabel43.setFont(new java.awt.Font("DejaVu Sans", 0, 11)); // NOI18N
        jLabel43.setText("0%");

        jLabel47.setFont(new java.awt.Font("DejaVu Sans", 0, 11)); // NOI18N
        jLabel47.setText("0");

        jLabel44.setBackground(new java.awt.Color(1, 1, 1));
        jLabel44.setText("jLabel2");
        jLabel44.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel44.setOpaque(true);
        jLabel44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel44MouseClicked(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("DejaVu Sans", 0, 11)); // NOI18N
        jLabel46.setText("Steps:");

        jLabel45.setBackground(java.awt.Color.white);
        jLabel45.setForeground(new java.awt.Color(244, 255, 0));
        jLabel45.setText("jLabel2");
        jLabel45.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel45.setOpaque(true);
        jLabel45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel45MouseClicked(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("DejaVu Sans", 0, 11)); // NOI18N
        jLabel42.setText("100%");

        jLabel49.setFont(new java.awt.Font("DejaVu Sans", 0, 11)); // NOI18N
        jLabel49.setText("Scale: 50");
        jLabel49.setOpaque(true);

        jLabel48.setFont(new java.awt.Font("DejaVu Sans", 0, 11)); // NOI18N
        jLabel48.setText("Scope: 10");
        jLabel48.setOpaque(true);

        jLabel50.setFont(new java.awt.Font("DejaVu Sans", 0, 11)); // NOI18N
        jLabel50.setText("Max Entropy : 0");

        jLabel55.setFont(new java.awt.Font("DejaVu Sans", 0, 11)); // NOI18N
        jLabel55.setText("Entropy : 0");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel14Layout.createSequentialGroup()
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel14Layout.createSequentialGroup()
                                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(50, 50, 50)
                                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel14Layout.createSequentialGroup()
                                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20)
                                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel14Layout.createSequentialGroup()
                                            .addGap(7, 7, 7)
                                            .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(20, 20, 20)
                                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGap(7, 7, 7))
                        .addGroup(jPanel14Layout.createSequentialGroup()
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel46)
                            .addComponent(jLabel47))
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel43)
                            .addComponent(jLabel53)
                            .addComponent(jLabel52))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel48)
                    .addComponent(jLabel49))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(jLabel55))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 260, 130));

        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(717, 717, 717)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(769, 769, 769)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(852, 852, 852)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(630, 630, 630)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(466, 466, 466)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(478, 478, 478)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        actionPerformed123(evt);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        actionPerformed123(evt);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void PlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayActionPerformed
      Random generator = new Random();

        int spacing = 1;
         for (int x = 1 ;x < le + 1;x = x+spacing){
              button[x].setBackground(Color.black);
              spacing = generator.nextInt(4);
          }

         File f;
      f=new File("music.midi");
      File f2;
      f2 = new File("bass.midi");
        String piano = " ";
        String bass = " ";
       // Player player = new Player();
         for(int i=0;i<countframes-1;i++){
            
            bass = "["+(dev[i])+"] " + bass;
        }
        for(int i=0;i<countframes-1;i++){
            long freq = Math.round((ee[i]/3)*10);
            long freq2 = Math.round(dev[i]*4);
            String oct = "A";
            
            if(freq2>1){
                oct = "C";
            }
            if(freq>2){
                oct = "E";
            }
             if(freq>3){
                oct = "G";
            }
            piano = oct+(freq)+"q " + piano;
           
        }
         System.out.println(piano);
        System.out.println(bass);
        Pattern pattern = new Pattern(piano);
        Pattern basspattern = new Pattern(bass);
       // player.play(pattern);
        
//        Rhythm rhythm = new Rhythm();
//        rhythm.setLayer(1, "O..oO...O..oOO..");
//rhythm.setLayer(2, "..*...*...*...*.");
//rhythm.setLayer(3, "^^^^^^^^^^^^^^^^");
//rhythm.setLayer(4, "...............!");
//rhythm.addSubstitution('O', "[BASS_DRUM]i");
//rhythm.addSubstitution('o', "Rs [BASS_DRUM]s");
//rhythm.addSubstitution('*', "[ACOUSTIC_SNARE]i");
//rhythm.addSubstitution('^', "[PEDAL_HI_HAT]s Rs");
//rhythm.addSubstitution('!', "[CRASH_CYMBAL_1]s Rs");
//rhythm.addSubstitution('.', "Ri");
// pattern = rhythm.getPattern();
//pattern.repeat(4);
////player.play(pattern);
//        
//        
//Pattern pattern1 = new Pattern("C5q D5q E5q C5q");
//
//// "Dormez-vous?"
//Pattern pattern2 = new Pattern("E5q F5q G5h");
//
//// "Sonnez les matines"
//Pattern pattern3 = new Pattern("G5i A5i G5i F5i E5q C5q");
//
//// "Ding ding dong"
//Pattern pattern4 = new Pattern("C5q G4q C5h");
//
//// Put all of the patters together to form the song
//Pattern song = new Pattern();
//song.add(pattern1, 2); // Adds 'pattern1' to 'song' twice
//song.add(pattern2, 2); // Adds 'pattern2' to 'song' twice
//song.add(pattern3, 2); // Adds 'pattern3' to 'song' twice
//song.add(pattern4, 2); // Adds 'pattern4' to 'song' twice

// Play the song!
 //player.play(song);
        
        try {
            player.saveMidi(pattern, f);
            player.saveMidi(basspattern, f2);
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_PlayActionPerformed

    private void jLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseClicked
        if (jLabel34.getBackground().equals(Color.white)){
                    jLabel34.setBackground(Color.black);
                    int a = Integer.parseInt(jLabel52.getText());
                    a = a+128;
                    jLabel52.setText(Integer.toString(a));

                }else{
		jLabel34.setBackground(Color.white);
                int a = Integer.parseInt(jLabel52.getText());
                    a = a-128;
                    jLabel52.setText(Integer.toString(a));
               }
    }//GEN-LAST:event_jLabel34MouseClicked

    private void jLabel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseClicked
       if (jLabel35.getBackground().equals(Color.white)){
                    jLabel35.setBackground(Color.black);
                    int a = Integer.parseInt(jLabel52.getText());
                    a = a+64;
                    jLabel52.setText(Integer.toString(a));
                }else{
		jLabel35.setBackground(Color.white);
                int a = Integer.parseInt(jLabel52.getText());
                    a = a-64;
                    jLabel52.setText(Integer.toString(a));
               }
    }//GEN-LAST:event_jLabel35MouseClicked

    private void jLabel36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseClicked
        if (jLabel36.getBackground().equals(Color.white)){
                    jLabel36.setBackground(Color.black);
                    int a = Integer.parseInt(jLabel52.getText());
                    a = a+32;
                    jLabel52.setText(Integer.toString(a));
                }else{
		jLabel36.setBackground(Color.white);
                int a = Integer.parseInt(jLabel52.getText());
                    a = a-32;
                    jLabel52.setText(Integer.toString(a));
               }
    }//GEN-LAST:event_jLabel36MouseClicked

    private void jLabel37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseClicked
        if (jLabel37.getBackground().equals(Color.white)){
                    jLabel37.setBackground(Color.black);
                    int a = Integer.parseInt(jLabel52.getText());
                    a = a+16;
                    jLabel52.setText(Integer.toString(a));
                }else{
		jLabel37.setBackground(Color.white);
                int a = Integer.parseInt(jLabel52.getText());
                    a = a-16;
                    jLabel52.setText(Integer.toString(a));
               }
    }//GEN-LAST:event_jLabel37MouseClicked

    private void jLabel38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseClicked
       if (jLabel38.getBackground().equals(Color.white)){
                    jLabel38.setBackground(Color.black);
                    int a = Integer.parseInt(jLabel52.getText());
                    a = a+8;
                    jLabel52.setText(Integer.toString(a));
                }else{
		jLabel38.setBackground(Color.white);
                int a = Integer.parseInt(jLabel52.getText());
                    a = a-8;
                    jLabel52.setText(Integer.toString(a));
               }
    }//GEN-LAST:event_jLabel38MouseClicked

    private void jLabel39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MouseClicked
        if (jLabel39.getBackground().equals(Color.white)){
                    jLabel39.setBackground(Color.black);
                    int a = Integer.parseInt(jLabel52.getText());
                    a = a+4;
                    jLabel52.setText(Integer.toString(a));
                }else{
		jLabel39.setBackground(Color.white);
                int a = Integer.parseInt(jLabel52.getText());
                    a = a-4;
                    jLabel52.setText(Integer.toString(a));
               }
    }//GEN-LAST:event_jLabel39MouseClicked

    private void jLabel40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseClicked
        if (jLabel40.getBackground().equals(Color.white)){
                    jLabel40.setBackground(Color.black);
                    int a = Integer.parseInt(jLabel52.getText());
                    a = a+2;
                    jLabel52.setText(Integer.toString(a));
                }else{
		jLabel40.setBackground(Color.white);
                int a = Integer.parseInt(jLabel52.getText());
                    a = a-2;
                    jLabel52.setText(Integer.toString(a));
               }
    }//GEN-LAST:event_jLabel40MouseClicked

    private void jLabel41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseClicked
       if (jLabel41.getBackground().equals(Color.white)){
                    jLabel41.setBackground(Color.black);
                    int a = Integer.parseInt(jLabel52.getText());
                    a = a+1;
                    jLabel52.setText(Integer.toString(a));
                }else{
		jLabel41.setBackground(Color.white);
                int a = Integer.parseInt(jLabel52.getText());
                    a = a-1;
                    jLabel52.setText(Integer.toString(a));
               }
    }//GEN-LAST:event_jLabel41MouseClicked

    private void jLabel44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel44MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel44MouseClicked

    private void jLabel45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel45MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel45MouseClicked
private void procreate(){
    cd[0] = 0;
    double[] allevalues = new double[down];
              int linenumber = 0;
              
for(int i=1;i<9;i++){
    entropyy[i]=0;
}
double blacknum = 0;
double yellownum = 0;
int obstruction = 185000;
int obstruction2 = 700;
/*Obstruction*/
//button[obstruction+le].setBackground(Color.red);
//button[obstruction2+le].setBackground(Color.red);
//button[1917+le].setBackground(Color.red);
//button[1918+le].setBackground(Color.red);
double[][] example= new double[down+1][9];
            for(int x=1;x<grid+1;x++){
                steps= steps+1;
                
                
               if ((x==(grid - le +1)) && ((x!=obstruction ))){

                   button[1].setBackground(rules(button[grid].getBackground(),button[x].getBackground(),button[x+1].getBackground()));
                            if(button[1].getBackground().equals(Color.white)){
                                yellownum = yellownum + 1;
                            }



                }else{
                 if((x>(grid-le) && x<grid)&& ((x!=obstruction ))){

                     button[x-(grid-le)].setBackground(rules(button[x-1].getBackground(),button[x].getBackground(),button[x+1].getBackground()));
                     if(button[x-(grid-le)].getBackground().equals(Color.white)){
                                yellownum = yellownum + 1;
                            }
                  }else{
                      


              if(((x%le==0) && (x!=0)) && ((x!=obstruction ))){
                            if(x==grid){

                          button[le].setBackground(rules(button[x-1].getBackground(),button[x].getBackground(),button[grid - le + 1].getBackground()));
                       if(button[le].getBackground().equals(Color.white)){
                                yellownum = yellownum + 1;
                      }
                          double shannon = 0;
                  double numrules = 0;
                  //System.out.println("For line number "+(x/le)+ ":");
                  for(int i=1;i<9;i++){
                      example[x/le][i]=entropyy[i];
                      if (entropyy[i]!=0){

                      shannon = shannon + ((example[x/le][i]/le)*(-Math.log(example[x/le][i]/le)/Math.log(2)));
                      //System.out.println(("For Line Number: "+linenumber+" ,Rule #"+i + " occured " +example[x/le][i]+" times , Probability is "+ example[x/le][i]/le));


                       numrules++;
                      entropyy[i] = 0;
                      }
                      }

                     // System.out.println("Line entropy:" +shannon);
                  double avg = shannon;

                  String digit = Double.toString(avg);
                  String lastvalue = "";

                  char[] single = new char[3];
                  for(int c = 0;c<3;c++){
                      single[c] = digit.charAt(c);
                      lastvalue = lastvalue+Character.toString(single[c]);
                  }
                    label[x/le].setText(lastvalue);
                    allevalues[linenumber] = avg;
                    linenumber++;
                     }else{
                  button[x+le].setBackground(rules(button[x-1].getBackground(),button[x].getBackground(),button[x-le+1].getBackground()));
                    if(button[x+le].getBackground().equals(Color.white)){
                                yellownum = yellownum + 1;
                            }
                  double shannon = 0;
                  double numrules = 0;
                  //System.out.println("For line number "+(x/le)+ ":");
                  for(int i=1;i<9;i++){
                      example[x/le][i]=entropyy[i];
                      if (entropyy[i]!=0){

                      shannon = shannon + ((example[x/le][i]/le)*(-Math.log(example[x/le][i]/le)/Math.log(2)));
                     // System.out.println(("For Line Number: "+linenumber+" ,Rule #"+i + " occured " +example[x/le][i]+" times , Probability is "+ example[x/le][i]/le));


                       numrules++;
                      entropyy[i] = 0;
                      }
                      }

                      //System.out.println("Line entropy:" +shannon);
                  double avg = (shannon);

                  String digit = Double.toString(avg);
                  String lastvalue = "";

                  char[] single = new char[3];
                  for(int c = 0;c<3;c++){
                      single[c] = digit.charAt(c);
                      lastvalue = lastvalue+Character.toString(single[c]);
                  }
                    label[x/le].setText(lastvalue);
                    allevalues[linenumber] = avg;
                    linenumber++;
                   
                  }
              }else{
                  if(((x-1)%le==0) && ((x!=obstruction ))){
                      button[x+le].setBackground(rules(button[x+(le-1)].getBackground(),button[x].getBackground(),button[x+1].getBackground()));
                       if(button[x+le].getBackground().equals(Color.white)){
                                yellownum = yellownum + 1;
                            }

                  }else{
                      if((x==1)){
                          button[x+le].setBackground(rules(button[le].getBackground(),button[x].getBackground(),button[x+1].getBackground()));
                       if(button[x+le].getBackground().equals(Color.white)){
                                yellownum = yellownum + 1;
                          }
                      }else{
                          if( ((x!=obstruction ))){
                      button[x+le].setBackground(rules(button[x-1].getBackground(),button[x].getBackground(),button[x+1].getBackground()));
                       if(button[x+le].getBackground().equals(Color.white)){
                                yellownum = yellownum + 1;
                            
                                                        
                          }
                  }
                  }
              }
                }

                   }


                }
    }

              /*button[x].setBackground(Color.white);
                button[x-1].setBackground(Color.black);
                x++;*/


              

int realsteps =steps/le;
jLabel47.setText(Integer.toString(realsteps));
blacknum = grid-yellownum;
double blacknumper = (blacknum/(grid));
double yellownumper = (yellownum/(grid));
double ent = -((yellownumper*Math.log(yellownumper))/Math.log(2))-((blacknumper*Math.log(blacknumper))/Math.log(2));

se[countframes]=ent;//Entropy by wolframle

//Calculating Entropy of Image from lines
int unique = 0;
double[] uniqueval = new double[10000];

    for (int i=0;i<down;i++) {
   boolean found=false;
    for (int k=i+1;k<down;k++) {
        if (allevalues[i]==allevalues[k]) found=true;

        }
    if (!found){
        uniqueval[unique]=allevalues[i];

         
         unique++;
    }
    }

double[] countuniqueval = new double[unique];
for (int i=0;i<down;i++) {

    for (int k=0;k<unique;k++) {
        if (allevalues[i]==uniqueval[k]){
        countuniqueval[k]++;
        }
        }

    }

double shannon = 0;

                  for(int i=0;i<unique;i++){


                      shannon = shannon + (countuniqueval[i]/le*(-Math.log(countuniqueval[i]/le)/Math.log(2)));


                      }
double avg = 0;
for (int i=0;i<down;i++){

   avg = avg + allevalues[i];
  // System.out.println(i + ": " +allevalues[i]);
}
                  
ee[countframes]= avg/down;
     //Calculating Entropy of image entropy of entropy of lines
        unique = 0;
uniqueval = new double[10000];

    for (int i=0;i<countframes;i++) {
   boolean found=false;
    for (int k=i+1;k<countframes;k++) {
        if (ee[i]==ee[k]) found=true;

        }
    if (!found){
        uniqueval[unique]=ee[i];

        
         unique++;
    }
    }

countuniqueval = new double[unique];
for (int i=0;i<countframes;i++) {

    for (int k=0;k<unique;k++) {
        if (ee[i]==uniqueval[k]){
        countuniqueval[k]++;
        }
        }

    }

shannon = 0;

                  for(int i=0;i<unique;i++){


                      shannon = shannon + ((countuniqueval[i]/countframes)*(-Math.log(countuniqueval[i]/countframes)/Math.log(2)));


                      }
double maxentropy = 0;
if (unique > 0){
    double howmany = 1/Double.parseDouble(Integer.toString(countframes));
    maxentropy = (-Math.log(howmany)/Math.log(2));
//System.out.println("Unique values :" +countframes +"  "+ howmany + " max entropy is :" + (-Math.log(howmany)/Math.log(2)));
    }
//System.out.println("The resultant(macro) entropy is: " + Math.round(shannon));

/*double total = 0;
double sqrroot =0;
for (int i=0;i<countframes;i++){
    
    total = total + dev[i];
    
    
    
}*/
//Calculating the image entropy by taking the mean of the lines entropy


//dev[countframes]=avg/le;
cd[countframes]=shannon/maxentropy;
jLabel50.setText("Max Entropy : "+maxentropy);
jLabel55.setText("Entropy : "  + shannon);
//Calculating entropy by taking entropy of wolframs entropy
unique = 0;
uniqueval = new double[10000];

    for (int i=0;i<countframes;i++) {
   boolean found=false;
    for (int k=i+1;k<countframes;k++) {
        if (se[i]==se[k]) found=true;

        }
    if (!found){
        uniqueval[unique]=se[i];

        
         unique++;
    }
    }

countuniqueval = new double[unique];
for (int i=0;i<countframes;i++) {

    for (int k=0;k<unique;k++) {
        if (se[i]==uniqueval[k]){
        countuniqueval[k]++;
        }
        }

    }

shannon = 0;

                  for(int i=0;i<unique;i++){


                      shannon = shannon + ((countuniqueval[i]/countframes)*(-Math.log(countuniqueval[i]/countframes)/Math.log(2)));


                      }




//cd[countframes]=shannon;
countframes++;
int maxframe = le;
if (countframes>((maxframe))){




    for(int i = 0;i<(maxframe);i++){
        
        dev[i]=cd[countframes-maxframe+i];
    }
    }
    /*double systemavg = 0;
    double[] first3 = new double[5];
for(int i = 0;i<maxframe;i++){
    if(i<5){
        first3[i]=cd[i];
    }else{
        if(first3[0]==cd[i] && first3[1]==cd[i+1] && first3[2]==cd[i+2] && first3[3]==cd[i+3] && first3[4]==cd[i+4]){
            System.out.println(i);
            dev[totalframes] = i;

            totalframes++;

            break;
        }
    }
  double max = 0;

            for (int b = 0; b < dev.length; b++)
            {
                if(max < dev[b])
                {
                   max = dev[b];
                }
            }
  System.out.println(max);
   //systemavg = cd[i] + systemavg;
   //System.out.println("Value"+i+": "+cd[i]+", Sum: "+ systemavg+", Avg: "+(systemavg/maxframe));
}


 
    countframes = (maxframe);
    if (totalframes > maxframe) {
        for(int i = 0;i<(maxframe);i++){

        dev[i]=dev[i+1];
    }
    }
    totalframes=maxframe;
}
*/
                   jLabel42.setText(Double.toString(blacknum));
                   jLabel43.setText(Double.toString(yellownum));
                   


    
}
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed


        procreate();
        jLineChart1.setDataset(createEEDataset());
             jLineChart2.setDataset(createSEDataset());
             jLineChart3.setDataset(createCDDataset());
             jLineChart4.setDataset(createDEVDataset());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        jLabel49.setText("Scale: "+jSlider1.getValue());
         jLabel49.setBackground(Color.yellow);
    }//GEN-LAST:event_jSlider1StateChanged

    private void jSlider2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider2StateChanged
       jLabel48.setText("Scope: "+jSlider2.getValue());
       jLabel48.setBackground(Color.yellow);
    }//GEN-LAST:event_jSlider2StateChanged

    private void jSlider1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider1MouseReleased
        sizechange();
        jLabel49.setBackground(jLabel46.getBackground());
        jCheckBox1.setSelected(false);
    }//GEN-LAST:event_jSlider1MouseReleased

    private void jSlider2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider2MouseReleased
jCheckBox1.setSelected(false);
jLabel48.setBackground(jLabel46.getBackground());
        Container c=getContentPane();
le=jSlider1.getValue();
jLabel48.setText("Scope: "+Integer.toString(jSlider2.getValue()));
jLabel49.setText("Scale: "+Integer.toString(le));
down = jSlider2.getValue();
grid=le*down;
p1.removeAll();

button=new JButton[grid+1];
label = new JLabel[down+1];
labelx = new JLabel[le+1];




        GridLayout gl = new GridLayout();
        gl.setColumns(le+1);
        gl.setRows(down+1);
        p1.setLayout(gl);
        JPanel p2 = new JPanel();
        p2.setPreferredSize(new Dimension(100,100));




for(int i=1;i<grid+le+1;i++){
    if (i<grid+1){

        button[i]= new JButton(Integer.toString(i));
        p1.add(button[i]);
        
        button[i].setSize(5, 5);
        button[i].setForeground(Color.white);
        button[i].setBackground(Color.white);
        button[i].setText("");
        button[i].setActionCommand(Integer.toString(i));
        button[i].setBorder(null);
        button[i].addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    actionPerformed123(evt);
                        }
                });


if (i%(le)==0 /*&& (i!=grid)*/ && (i!=0)){
    label[i/(le)] = new JLabel(Integer.toString(i/(le)));
    label[i/(le)].setFont(new java.awt.Font("DejaVu Sans", 0, 7));

    p1.add(label[i/(le)]);

}
    }
    if(i>grid){
        labelx[i-grid]=new JLabel(Integer.toString(i-grid));
        labelx[i-grid].setFont(new java.awt.Font("DejaVu Sans", 0, 7));
        //System.out.println(i-grid);
        p1.add(labelx[i-grid]);
    }

        }


p1.setPreferredSize(new Dimension(le,down*10));//scope

sp1.setPreferredSize(new Dimension(600,600));
sp1.setVerticalScrollBar(new JScrollBar());
//sp1.add(p1);
//sp1.setHorizontalScrollBar(new JScrollBar());

c.add(sp1,GroupLayout.DEFAULT_SIZE);

pack();
setVisible(true);
    }//GEN-LAST:event_jSlider2MouseReleased
private void sizechange(){
          

        Container c = getContentPane();
le=jSlider1.getValue();
//System.out.println(le);
jLabel48.setText("Scope: "+Integer.toString(jSlider2.getValue()));
jLabel49.setText("Scale: "+Integer.toString(le));
down = jSlider2.getValue();
grid=le*down;
p1.removeAll();

button=new JButton[grid+1];
label = new JLabel[down+1];
labelx = new JLabel[le+1];
ee = new double[10000];
se = new double[10000];
dev = new double[10000];
//cd = new double[le+1];
countframes = 1;
GridLayout gl = new GridLayout();
        gl.setColumns(le+1);
        gl.setRows(down+1);
        p1.setLayout(gl);
        JPanel p2 = new JPanel();
        p2.setPreferredSize(new Dimension(100,100));




for(int i=1;i<grid+le+1;i++){
    if (i<grid+1){

        button[i]= new JButton(Integer.toString(i));
        p1.add(button[i]);
        button[i].setSize(5, 5);
        button[i].setForeground(Color.white);
        button[i].setText("");
        button[i].setActionCommand(Integer.toString(i));
        button[i].setBorder(null);
        //System.out.println(i);
        button[i].addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    actionPerformed123(evt);
                        }
                });
        if (i==le/2){
        button[i].setBackground(Color.black);
        }else{
        button[i].setBackground(Color.white);
        }

if (i%(le)==0 && (i!=0)){
    label[i/(le)] = new JLabel(Integer.toString(i/(le)));
    label[i/(le)].setFont(new java.awt.Font("DejaVu Sans", 0, 7));

    p1.add(label[i/(le)]);

}
    }
    if(i>grid){
        labelx[i-grid]=new JLabel(Integer.toString(i-grid));
        labelx[i-grid].setFont(new java.awt.Font("DejaVu Sans", 0, 7));
        //System.out.println(i-grid);
        p1.add(labelx[i-grid]);
    }

        }



p1.setPreferredSize(new Dimension(le,down));//scope

sp1.setPreferredSize(new Dimension(600,600));
sp1.setVerticalScrollBar(new JScrollBar());
//sp1.add(p1);
//sp1.setHorizontalScrollBar(new JScrollBar());

c.add(sp1,GroupLayout.DEFAULT_SIZE);

pack();
setVisible(true);
}
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed



        String str = JOptionPane.showInputDialog(null, "eg:Emergent behavior..","Any Notes?", 1);
        String ci = "";
        Character[] unit = new Character[le];
        for (int f = 1;f<le+1;f++){
            if(button[le+f].getBackground().equals(Color.white)){
                unit[f-1] = "1".charAt(0);
            }else{
                unit[f-1]="0".charAt(0);
            }
            ci = ci + unit[f-1].toString();
        }
        //System.out.println(ci);
        VTDGen vg = new VTDGen(); // Instantiate VTDGen
        XMLModifier xm = new XMLModifier(); //Instantiate XMLModifier
System.out.println("<State><Id>"+(jList1.getModel().getSize()+1)+"</Id><scale>"+jSlider1.getValue()+"</scale><scope>"+jSlider2.getValue()+"</scope><cell1>"+jLabel41.getBackground().getRGB()+"</cell1><cell2>"+jLabel40.getBackground().getRGB()+"</cell2><cell3>"+jLabel39.getBackground().getRGB()+"</cell3><cell4>"+jLabel38.getBackground().toString()+"</cell4><cell5>"+jLabel37.getBackground().toString()+"</cell5><cell6>"+jLabel36.getBackground().toString()+"</cell6><cell7>"+jLabel35.getBackground().toString()+"</cell7><cell8>"+jLabel34.getBackground().toString()+"</cell8><ci>"+ci+"</ci><notes>"+str+"</notes></State></Data>");
        if (vg.parseFile("CA.xml",false)){
         VTDNav vn = vg.getNav();
        try{
         xm.bind(vn);
            File fo = new File("CA.xml");
	FileOutputStream fos = new FileOutputStream(fo);

        vn.toElement(VTDNav.R);
    vn.toElement(VTDNav.LC,"State");


    xm.insertAfterElement("<State><Id>"+(jList1.getModel().getSize()+1)+"</Id><scale>"+jSlider1.getValue()+"</scale><scope>"+jSlider2.getValue()+"</scope><cell1>"+jLabel41.getBackground().getRGB()+"</cell1><cell2>"+jLabel40.getBackground().getRGB()+"</cell2><cell3>"+jLabel39.getBackground().getRGB()+"</cell3><cell4>"+jLabel38.getBackground().getRGB()+"</cell4><cell5>"+jLabel37.getBackground().getRGB()+"</cell5><cell6>"+jLabel36.getBackground().getRGB()+"</cell6><cell7>"+jLabel35.getBackground().getRGB()+"</cell7><cell8>"+jLabel34.getBackground().getRGB()+"</cell8><ci>"+ci+"</ci><notes> "+str+" </notes></State>");
    vn.toElement(VTDNav.R);
xm.output(fos);
fos.close();
            }catch(Exception e){

            }
        }
        jList1.setListData(getprofile());


    }//GEN-LAST:event_jButton5ActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked



}
private Vector getprofile(){
    //Getting all the ID from XML File for jList and other purposes.
        Vector<String> ID = new Vector<String>();



try {
  File file = new File("CA.xml");
  DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
  DocumentBuilder db = dbf.newDocumentBuilder();
  Document doc = db.parse(file);
  doc.getDocumentElement().normalize();
  //System.out.println("Root element " + doc.getDocumentElement().getNodeName());
  NodeList nodeLst = doc.getElementsByTagName("Data");


  for (int s = 0; s < nodeLst.getLength(); s++) {

    Node fstNode = nodeLst.item(s);

    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {

      Element fstElmnt = (Element) fstNode;
      NodeList fstNmElmntLst = fstElmnt.getElementsByTagName("State");

        for (int a = 0; a < fstNmElmntLst.getLength(); a++) {
             Node scndNode = fstNmElmntLst.item(a);

                  if (scndNode.getNodeType() == Node.ELEMENT_NODE) {

                   Element titleElmnt = (Element) scndNode;
                   NodeList contentNmElmntLst = titleElmnt.getElementsByTagName("Id");
                        Element contentNmElmnt = (Element) contentNmElmntLst.item(0);
                        NodeList contentNm = contentNmElmnt.getChildNodes();
                        ID.add(((Node) contentNm.item(0)).getNodeValue());





            }

        }


    }

  }

  }catch (Exception e) {
    e.printStackTrace();
  }
return ID;
    }//GEN-LAST:event_jList1MouseClicked

private void jCheckBox1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCheckBox1PropertyChange
  
}//GEN-LAST:event_jCheckBox1PropertyChange

private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
      if (jCheckBox1.getModel().isSelected()){
        for(int i = 1;i< grid+1;i++){
            button[i].setBorder(javax.swing.BorderFactory.createLineBorder(Color.GRAY));
        }
        }else{
        
         if (!(jCheckBox1.getModel().isSelected())){
            for(int i = 1;i< grid+1;i++){
            button[i].setBorder(null);
             }

        }
    }
}//GEN-LAST:event_jCheckBox1ActionPerformed

private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed


        String scale="";
        String scope= "";
        String cell1="";
        String cell2="";
        String cell3="";
        String cell4="";
        String cell5="";
        String cell6="";
        String cell7="";
        String cell8="";

        String notes="";
        String ic = "";


        try {
            File file = new File("CA.xml");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(file);
            doc.getDocumentElement().normalize();
            //System.out.println("Root element " + doc.getDocumentElement().getNodeName());
            NodeList nodeLst = doc.getElementsByTagName("Data");


            for (int s = 0; s < nodeLst.getLength(); s++) {

                Node fstNode = nodeLst.item(s);

                if (fstNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element fstElmnt = (Element) fstNode;
                    NodeList fstNmElmntLst = fstElmnt.getElementsByTagName("State");

                    for (int a = 0; a < fstNmElmntLst.getLength(); a++) {
                        Node scndNode = fstNmElmntLst.item(a);

                        if (scndNode.getNodeType() == Node.ELEMENT_NODE) {

                            Element titleElmnt = (Element) scndNode;
                            NodeList NmElmntLst = titleElmnt.getElementsByTagName("Id");
                            Element NmElmnt = (Element) NmElmntLst.item(0);
                            NodeList Nm = NmElmnt.getChildNodes();
                            if((((Node) Nm.item(0)).getNodeValue().equals(jList1.getSelectedValue().toString()))){//Adding All Variables with Name selected
                                NodeList scaleElmntLst = titleElmnt.getElementsByTagName("scale");
                                Element scaleElmnt = (Element) scaleElmntLst.item(0);
                                NodeList scaleNode = scaleElmnt.getChildNodes();
                                scale = (((Node) scaleNode.item(0)).getNodeValue());

                                NodeList scopeElmntLst = titleElmnt.getElementsByTagName("scope");
                                Element scopeElmnt = (Element) scopeElmntLst.item(0);
                                NodeList scopeNode = scopeElmnt.getChildNodes();
                                scope = (((Node) scopeNode.item(0)).getNodeValue());

                                NodeList cell1ElmntLst = titleElmnt.getElementsByTagName("cell1");
                                Element cell1Elmnt = (Element) cell1ElmntLst.item(0);
                                NodeList cell1Node = cell1Elmnt.getChildNodes();
                                cell1 = (((Node) cell1Node.item(0)).getNodeValue());

                                NodeList cell2ElmntLst = titleElmnt.getElementsByTagName("cell2");
                                Element cell2Elmnt = (Element) cell2ElmntLst.item(0);
                                NodeList cell2Node = cell2Elmnt.getChildNodes();
                                cell2 = (((Node) cell2Node.item(0)).getNodeValue());


                                NodeList cell3ElmntLst = titleElmnt.getElementsByTagName("cell3");
                                Element cell3Elmnt = (Element) cell3ElmntLst.item(0);
                                NodeList cell3Node = cell3Elmnt.getChildNodes();
                                cell3 = (((Node) cell3Node.item(0)).getNodeValue());


                                NodeList cell4ElmntLst = titleElmnt.getElementsByTagName("cell4");
                                Element cell4Elmnt = (Element) cell4ElmntLst.item(0);
                                NodeList cell4Node = cell4Elmnt.getChildNodes();
                                cell4 = (((Node) cell4Node.item(0)).getNodeValue());

                                NodeList cell5ElmntLst = titleElmnt.getElementsByTagName("cell5");
                                Element cell5Elmnt = (Element) cell5ElmntLst.item(0);
                                NodeList cell5Node = cell5Elmnt.getChildNodes();
                                cell5 = (((Node) cell5Node.item(0)).getNodeValue());

                                NodeList cell6ElmntLst = titleElmnt.getElementsByTagName("cell6");
                                Element cell6Elmnt = (Element) cell6ElmntLst.item(0);
                                NodeList cell6Node = cell6Elmnt.getChildNodes();
                                cell6 = (((Node) cell6Node.item(0)).getNodeValue());

                                NodeList cell7ElmntLst = titleElmnt.getElementsByTagName("cell7");
                                Element cell7Elmnt = (Element) cell7ElmntLst.item(0);
                                NodeList cell7Node = cell7Elmnt.getChildNodes();
                                cell7 = (((Node) cell7Node.item(0)).getNodeValue());

                                NodeList cell8ElmntLst = titleElmnt.getElementsByTagName("cell8");
                                Element cell8Elmnt = (Element) cell8ElmntLst.item(0);
                                NodeList cell8Node = cell8Elmnt.getChildNodes();
                                cell8 = (((Node) cell8Node.item(0)).getNodeValue());

                                NodeList icElmntLst = titleElmnt.getElementsByTagName("ci");
                                Element icElmnt = (Element) icElmntLst.item(0);
                                NodeList icNode = icElmnt.getChildNodes();
                                ic = (((Node)icNode.item(0)).getNodeValue());

                                NodeList notesElmntLst = titleElmnt.getElementsByTagName("notes");
                                Element notesElmnt = (Element) notesElmntLst.item(0);
                                NodeList notesNode = notesElmnt.getChildNodes();
                                notes = (((Node) notesNode.item(0)).getNodeValue());

                            }



                        }

                    }


                }

            }



        }catch (Exception e) {
            e.printStackTrace();
        }
       // System.out.println();
        jSlider1.setValue(Integer.parseInt(scale));

        //System.out.println(scale);
        jSlider2.setValue(Integer.parseInt(scope));
        sizechange();
        int r = 0;
        jLabel52.setText(Integer.toString(r));
        jLabel41.setBackground(new Color(Integer.parseInt(cell1)));
        if (jLabel41.getBackground().equals(Color.black)){
             r = r +1;

        }
        jLabel40.setBackground(new Color(Integer.parseInt(cell2)));
        if (jLabel40.getBackground().equals(Color.black)){
             r = r +2;

        }
        jLabel39.setBackground(new Color(Integer.parseInt(cell3)));
        if (jLabel39.getBackground().equals(Color.black)){
             r = r +4;

        }
        jLabel38.setBackground(new Color(Integer.parseInt(cell4)));
        if (jLabel38.getBackground().equals(Color.black)){
             r = r +8;

        }
        jLabel37.setBackground(new Color(Integer.parseInt(cell5)));
        if (jLabel37.getBackground().equals(Color.black)){
             r = r +16;

        }
        jLabel36.setBackground(new Color(Integer.parseInt(cell6)));
        if (jLabel36.getBackground().equals(Color.black)){
             r = r +32;

        }
        jLabel35.setBackground(new Color(Integer.parseInt(cell7)));
        if (jLabel35.getBackground().equals(Color.black)){
             r = r +64;

        }
        jLabel34.setBackground(new Color(Integer.parseInt(cell8)));
        if (jLabel34.getBackground().equals(Color.black)){
             r = r +128;

        }

        jLabel54.setText(notes);
        jLabel52.setText(Integer.toString(r));
for(int q=1;q<le+1;q++){
    if (ic.charAt(q-1)=="1".charAt(0)){
        button[q].setBackground(Color.white);
    }else{
        button[q].setBackground(Color.black);
    }
    }
}//GEN-LAST:event_jButton6ActionPerformed

private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged



        String notes="";



        try {
            File file = new File("CA.xml");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(file);
            doc.getDocumentElement().normalize();
            //System.out.println("Root element " + doc.getDocumentElement().getNodeName());
            NodeList nodeLst = doc.getElementsByTagName("Data");


            for (int s = 0; s < nodeLst.getLength(); s++) {

                Node fstNode = nodeLst.item(s);

                if (
                        fstNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element fstElmnt = (Element) fstNode;
                    NodeList fstNmElmntLst = fstElmnt.getElementsByTagName("State");

                    for (int a = 0; a < fstNmElmntLst.getLength(); a++) {
                        Node scndNode = fstNmElmntLst.item(a);

                        if (scndNode.getNodeType() == Node.ELEMENT_NODE) {

                            Element titleElmnt = (Element) scndNode;
                            NodeList NmElmntLst = titleElmnt.getElementsByTagName("Id");
                            Element NmElmnt = (Element) NmElmntLst.item(0);
                            NodeList Nm = NmElmnt.getChildNodes();
                            if((((Node) Nm.item(0)).getNodeValue().equals(jList1.getSelectedValue().toString()))){//Adding All Variables with Name selected


                                NodeList notesElmntLst = titleElmnt.getElementsByTagName("notes");
                                Element notesElmnt = (Element) notesElmntLst.item(0);
                                NodeList notesNode = notesElmnt.getChildNodes();
                                notes = (((Node) notesNode.item(0)).getNodeValue());

                            }



                        }

                    }


                }

            }



        }catch (Exception e) {
            e.printStackTrace();
        }



        jLabel54.setText(notes);


}//GEN-LAST:event_jList1ValueChanged

private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    countframes = 0;
                           for (int b=1;b<grid+1;b++){
                               if (b==le/2){
                            button[b].setBackground(Color.black);
                                    }else{
                            button[b].setBackground(Color.white);
                                           }
                               steps =0;
                               jLabel47.setText("0");
                               totalframes=0;
                               cd = new double[20000];
                           }

}//GEN-LAST:event_jButton7ActionPerformed

private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
   if (jLabel34.getBackground().equals(Color.white)){
                    jLabel34.setBackground(Color.black);
                    int a = Integer.parseInt(jLabel52.getText());
                    a = a+128;
                    jLabel52.setText(Integer.toString(a));

                }else{
		jLabel34.setBackground(Color.white);
                int a = Integer.parseInt(jLabel52.getText());
                    a = a-128;
                    jLabel52.setText(Integer.toString(a));
               }
   jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
}//GEN-LAST:event_jPanel2MousePressed

private void jPanel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseReleased
    jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
}//GEN-LAST:event_jPanel2MouseReleased

private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
    if (jLabel35.getBackground().equals(Color.white)){
                    jLabel35.setBackground(Color.black);
                    int a = Integer.parseInt(jLabel52.getText());
                    a = a+64;
                    jLabel52.setText(Integer.toString(a));

                }else{
		jLabel35.setBackground(Color.white);
                int a = Integer.parseInt(jLabel52.getText());
                    a = a-64;
                    jLabel52.setText(Integer.toString(a));
               }
   jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
}//GEN-LAST:event_jPanel3MousePressed

private void jPanel3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseReleased
    jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
}//GEN-LAST:event_jPanel3MouseReleased

private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
    if (jLabel36.getBackground().equals(Color.white)){
                    jLabel36.setBackground(Color.black);
                    int a = Integer.parseInt(jLabel52.getText());
                    a = a+32;
                    jLabel52.setText(Integer.toString(a));

                }else{
		jLabel36.setBackground(Color.white);
                int a = Integer.parseInt(jLabel52.getText());
                    a = a-32;
                    jLabel52.setText(Integer.toString(a));
               }
   jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
}//GEN-LAST:event_jPanel4MousePressed

private void jPanel4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseReleased
    jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
}//GEN-LAST:event_jPanel4MouseReleased

private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
    if (jLabel37.getBackground().equals(Color.white)){
                    jLabel37.setBackground(Color.black);
                    int a = Integer.parseInt(jLabel52.getText());
                    a = a+16;
                    jLabel52.setText(Integer.toString(a));

                }else{
		jLabel37.setBackground(Color.white);
                int a = Integer.parseInt(jLabel52.getText());
                    a = a-16;
                    jLabel52.setText(Integer.toString(a));
               }
   jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
}//GEN-LAST:event_jPanel5MousePressed

private void jPanel5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseReleased
    jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
}//GEN-LAST:event_jPanel5MouseReleased

private void jPanel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MousePressed
   if (jLabel38.getBackground().equals(Color.white)){
                    jLabel38.setBackground(Color.black);
                    int a = Integer.parseInt(jLabel52.getText());
                    a = a+8;
                    jLabel52.setText(Integer.toString(a));

                }else{
		jLabel38.setBackground(Color.white);
                int a = Integer.parseInt(jLabel52.getText());
                    a = a-8;
                    jLabel52.setText(Integer.toString(a));
               }
   jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
}//GEN-LAST:event_jPanel6MousePressed

private void jPanel6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseReleased
   jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
}//GEN-LAST:event_jPanel6MouseReleased

private void jPanel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MousePressed
    if (jLabel39.getBackground().equals(Color.white)){
                    jLabel39.setBackground(Color.black);
                    int a = Integer.parseInt(jLabel52.getText());
                    a = a+4;
                    jLabel52.setText(Integer.toString(a));

                }else{
		jLabel39.setBackground(Color.white);
                int a = Integer.parseInt(jLabel52.getText());
                    a = a-4;
                    jLabel52.setText(Integer.toString(a));
               }
   jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
}//GEN-LAST:event_jPanel7MousePressed

private void jPanel7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseReleased
   jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
}//GEN-LAST:event_jPanel7MouseReleased

private void jPanel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MousePressed
     if (jLabel40.getBackground().equals(Color.white)){
                    jLabel40.setBackground(Color.black);
                    int a = Integer.parseInt(jLabel52.getText());
                    a = a+2;
                    jLabel52.setText(Integer.toString(a));

                }else{
		jLabel40.setBackground(Color.white);
                int a = Integer.parseInt(jLabel52.getText());
                    a = a-2;
                    jLabel52.setText(Integer.toString(a));
               }
   jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
}//GEN-LAST:event_jPanel8MousePressed

private void jPanel8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseReleased
     jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
}//GEN-LAST:event_jPanel8MouseReleased

private void jPanel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MousePressed
   if (jLabel41.getBackground().equals(Color.white)){
                    jLabel41.setBackground(Color.black);
                    int a = Integer.parseInt(jLabel52.getText());
                    a = a+1;
                    jLabel52.setText(Integer.toString(a));

                }else{
		jLabel41.setBackground(Color.white);
                int a = Integer.parseInt(jLabel52.getText());
                    a = a-1;
                    jLabel52.setText(Integer.toString(a));
               }
   jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
}//GEN-LAST:event_jPanel9MousePressed

private void jPanel9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseReleased
    jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
}//GEN-LAST:event_jPanel9MouseReleased

private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
    
}//GEN-LAST:event_jPanel7MouseEntered

private XYDataset createEEDataset() {



XYSeries series = new XYSeries("Entropy");
for(int i = 0; i <countframes;i++){
        series.add(i, ee[i]);
       
    }
        final XYDataset dataset = new XYSeriesCollection(series);

        
        return dataset;

    }
private XYDataset createDEVDataset() {


XYSeries series = new XYSeries("Complexity");
for(int i = 0; i <le;i++){
        series.add(i, dev[i]);

    }
        final XYDataset dataset = new XYSeriesCollection(series);


        return dataset;

    }
private XYDataset createSEDataset() {


XYSeries series = new XYSeries("Entropy");
for(int i = 0; i <countframes;i++){
        series.add(i, se[i]);

    }
        final XYDataset dataset = new XYSeriesCollection(series);


        return dataset;

    }
private XYDataset createCDDataset() {


XYSeries series = new XYSeries("Complexity");
for(int i = 0; i <countframes;i++){
        series.add(i, cd[i]);

    }
if(cd[countframes-1]<0.3){
    jLineChart3.setPlotBackgroundPaint(Color.WHITE);
    jLineChart3.setSubtitle("Simple System");

}
    if(cd[countframes-1]>0.3 && cd[countframes-1]<1 ){
        jLineChart3.setPlotBackgroundPaint(Color.lightGray);
        jLineChart3.setSubtitle("Complex System");
    }
    if(cd[countframes-1]>0.99){
        jLineChart3.setPlotBackgroundPaint(Color.BLACK);
        jLineChart3.setSubtitle("Chaotic System");
    }
        final XYDataset dataset = new XYSeriesCollection(series);


        return dataset;

    }

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
       /* java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame1().setVisible(true);
            }
        });*/
        NewJFrame1 newj1 = new NewJFrame1();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Play;
    private java.awt.Canvas canvas1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JFrame jFrame4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private org.jfree.beans.JLineChart jLineChart1;
    private org.jfree.beans.JLineChart jLineChart2;
    private org.jfree.beans.JLineChart jLineChart3;
    private org.jfree.beans.JLineChart jLineChart4;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
JButton button[]=new JButton[grid+1];
JLabel label[] = new JLabel[down+1];
           JPanel p1=new JPanel();
JLabel labelx[] = new JLabel[le+1];
JScrollPane sp1=new JScrollPane(p1);
double entropyy[] = new double[9];
double entropyx[] = new double[9];

    public void actionPerformed123(ActionEvent e) {

               String a = e.getActionCommand();

               if (a.equals("start")){

                   t1.start();
               }else{
                   if (a.equals("stop")){
                   t1.stop();

               }else{
                       
                      int b = Integer.parseInt(a);
                if (button[b].getBackground().equals(Color.white)){
                    button[b].setBackground(Color.black);
                }else{
		button[b].setBackground(Color.white);
               }
               }


    }
          System.out.print(a);

    }
    public void mousehover(MouseEvent evt){
       
    }

public Color rules(Color right,Color middle,Color left){

    if (right.equals(Color.black) && middle.equals(Color.black) && left.equals(Color.black)){
        entropyy[1]++;
        return jLabel34.getBackground();
    }else{
        if (right.equals(Color.black) && middle.equals(Color.black) && left.equals(Color.white)){
            entropyy[2]++;
        return jLabel35.getBackground();
    }else{
                 if (right.equals(Color.black) && middle.equals(Color.white) && left.equals(Color.black)){
                     entropyy[3]++;
        return jLabel36.getBackground();
    }else{
                      if (right.equals(Color.black) && middle.equals(Color.white) && left.equals(Color.white)){
                          entropyy[4]++;
        return jLabel37.getBackground();
    }else{
                           if (right.equals(Color.white) && middle.equals(Color.black) && left.equals(Color.black)){
                               entropyy[5]++;
        return jLabel38.getBackground();
    }else{
                                if (right.equals(Color.white) && middle.equals(Color.black) && left.equals(Color.white)){
                                    entropyy[6]++;
        return jLabel39.getBackground();
    }else{
                                     if (right.equals(Color.white) && middle.equals(Color.white) && left.equals(Color.black)){
                                         entropyy[7]++;
        return jLabel40.getBackground();
    }else{
                                         if (right.equals(Color.white) && middle.equals(Color.white) && left.equals(Color.white)){
                                             entropyy[8]++;
        return jLabel41.getBackground();
    }else{
                                            
                                         return Color.white;
    }
    }
    }
    }
    }
    }
    }
    }
    }


public int steps = 0;
Timer t1 = new javax.swing.Timer(le, new ActionListener() {
          public void actionPerformed(ActionEvent g) {
            procreate();
           
            
             jLineChart1.setDataset(createEEDataset());
             jLineChart2.setDataset(createSEDataset());
             jLineChart3.setDataset(createCDDataset());
             jLineChart4.setDataset(createDEVDataset());
          }
       });
}
