/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mat202.project;

import com.orsoncharts.label.StandardCategoryItemLabelGenerator;
import java.awt.Paint;
import java.text.DecimalFormat;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.ValueAxis;
import static javafx.scene.input.KeyCode.P;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.YELLOW;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.TextAnchor;

/**
 *
 * @author Himanshu Patel
 */
public class practice extends javax.swing.JFrame {

    /**
     * Creates new form practice
     */
    public practice() {
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

        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(null);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Heart Disease Predictor");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(350, 20, 400, 30);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mat202/project/NewsImage_52230.jpg"))); // NOI18N
        jLabel15.setText("jLabel15");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(10, 0, 290, 200);

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Predict");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(190, 630, 160, 30);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(null);

        jTextField7.setBackground(new java.awt.Color(204, 204, 204));
        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel1.add(jTextField7);
        jTextField7.setBounds(270, 70, 150, 31);

        jTextField8.setBackground(new java.awt.Color(204, 204, 204));
        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel1.add(jTextField8);
        jTextField8.setBounds(190, 130, 150, 31);

        jTextField9.setBackground(new java.awt.Color(204, 204, 204));
        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel1.add(jTextField9);
        jTextField9.setBounds(290, 190, 150, 31);

        jTextField10.setBackground(new java.awt.Color(204, 204, 204));
        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel1.add(jTextField10);
        jTextField10.setBounds(330, 250, 130, 31);

        jTextField11.setBackground(new java.awt.Color(204, 204, 204));
        jTextField11.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel1.add(jTextField11);
        jTextField11.setBounds(310, 310, 130, 31);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("Possibility of Rapid Heartbeats : ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 310, 300, 25);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel9.setText("Chances of Heart Diseases: ");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 70, 260, 25);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel10.setText("Possibility of Angina Pectrosis : ");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 190, 300, 25);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel11.setText("Possibility of Miocardial Infraction : ");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 250, 360, 25);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel12.setText("Possibility of ECG : ");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(10, 130, 290, 25);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, -40, 40, 460);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel16.setText("Result");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(200, 10, 150, 20);

        jPanel3.add(jPanel1);
        jPanel1.setBounds(540, 210, 460, 410);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("Probability of adverse medicine taken :");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 240, 360, 25);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("Exercise (Near to -> (0 - Low , 1 - High)) :");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 340, 390, 25);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("Probability of smoking and alcohol :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 110, 320, 25);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setText("Probability of family history having ");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 160, 320, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setText("heart disease : ");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(20, 190, 180, 25);

        jTextField4.setBackground(new java.awt.Color(204, 204, 204));
        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField4);
        jTextField4.setBounds(370, 240, 120, 31);

        jTextField5.setBackground(new java.awt.Color(204, 204, 204));
        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField5);
        jTextField5.setBounds(360, 290, 130, 28);

        jTextField6.setBackground(new java.awt.Color(204, 204, 204));
        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel2.add(jTextField6);
        jTextField6.setBounds(400, 340, 90, 31);

        jTextField3.setBackground(new java.awt.Color(204, 204, 204));
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField3);
        jTextField3.setBounds(350, 160, 140, 31);

        jTextField2.setBackground(new java.awt.Color(204, 204, 204));
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField2);
        jTextField2.setBounds(350, 110, 140, 31);

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1);
        jTextField1.setBounds(310, 60, 140, 31);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setText("Diet [Near to -> (0 - bad , 1 - good)]:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(20, 290, 360, 25);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel8.setText("Probability of medicine taken : ");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(20, 60, 290, 25);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setText("Prior Information");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(130, 0, 290, 30);

        jPanel3.add(jPanel2);
        jPanel2.setBounds(10, 210, 500, 410);

        jSeparator2.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));
        jPanel3.add(jSeparator2);
        jSeparator2.setBounds(350, 60, 380, 10);

        jSeparator3.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator3);
        jSeparator3.setBounds(520, 190, 40, 480);

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("Generate Graph");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(650, 630, 230, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1014, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//DefaultCategoryDataset as = new DefaultCategoryDataset();

        float vectExcDiet[] = new float[4];
        float Obesity[] = {0.6f, 0.1f, 0.1f, 0.05f};
        //float NegObesity[] = {0.4,0.9,0.9,0.95};
        float ATS[] = {0.84f, 0.83f, 0.83f, 0.81f, 0.61f, 0.57f, 0.57f, 0.52f, 0.74f, 0.71f, 0.71f, 0.68f, 0.35f, 0.28f, 0.28f, 0.20f};
        //float ATS[] = {1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f};
        float HBP[] = {0.92f, 0.87f, 0.85f, 0.79f, 0.76f, 0.70f, 0.58f, 0.52f, 0.58f, 0.52f, 0.40f, 0.34f, 0.31f, 0.25f, 0.13f, 0.07f};
        //float HBP[] = {1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f};
        float HD[] = {0.94f, 0.93f, 0.92f, 0.91f, 0.84f, 0.82f, 0.80f, 0.78f, 0.91f, 0.91f, 0.90f, 0.89f, 0.80f, 0.78f, 0.76f, 0.73f, 0.79f, 0.77f, 0.74f, 0.71f, 0.48f, 0.42f, 0.35f, 0.28f, 0.74f, 0.71f, 0.68f, 0.64f, 0.35f, 0.28f, 0.19f, 0.10f};
        //float HD[] = {1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f};
        //float HD[] = {0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f,0f, 0f};

        float answerObesity = 0;
        float answerSLDL = 0;
        float answerSTRIG = 0;
        float answerCHDLR = 0;
        float answerATS = 0;
        float answerHBP = 0;
        float answerSSM = 0;
        float answerHD = 0;
        float answerECG = 0;
        float answerANGP = 0;
        float answerMIOCAR = 0;
        float answerRHB = 0;

        float Diet[] = new float[2];                  // 0 -> bad , 1 -> good for all
        float Exc[] = new float[2];                   // 0 -> bad , 1 -> good
        float SLDL[] = new float[2];
        float STRIG[] = new float[2];
        float CHDLR[] = new float[2];
        float SSM[] = new float[2];
        float MED[] = new float[2];
        float SMALC[] = new float[2];
        float FH[] = new float[2];
        float ADM[] = new float[2];
        float ECG[] = new float[2];
        float ANGP[] = new float[2];
        float MIOCAR[] = new float[2];
        float RHB[] = new float[2];

        float answerObesity1[] = new float[2];
        float answerSLDL1[] = new float[2];
        float answerSTRIG1[] = new float[2];
        float answerCHDLR1[] = new float[2];
        float answerSSM1[] = new float[2];
        float answerHBP1[] = new float[2];
        float answerATS1[] = new float[2];
        float answerHD1[] = new float[2];

        SLDL[1] = 0.25f;
        SLDL[0] = 0.75f;

        STRIG[1] = 0.30f;
        STRIG[0] = 0.70f;

        CHDLR[1] = 0.25f;
        CHDLR[0] = 0.75f;

        SSM[1] = 0.30f;
        SSM[0] = 0.70f;

        ECG[1] = 0.95f;
        ECG[0] = 0.05f;

        ANGP[1] = 0.85f;
        ANGP[0] = 0.15f;

        MIOCAR[1] = 0.90f;
        MIOCAR[0] = 0.10f;

        RHB[1] = 0.99f;
        RHB[0] = 0.01f;

       // System.out.println("Enter : ");
        MED[1] = Float.parseFloat(jTextField1.getText());
        MED[0] = 1 - MED[1];
       // System.out.println("Enter : ");
        SMALC[1] = Float.parseFloat(jTextField2.getText());
        SMALC[0] = 1 - SMALC[1];

       // System.out.println("Enter : ");
        FH[1] = Float.parseFloat(jTextField3.getText());
        FH[0] = 1 - FH[1];
       // System.out.println("Enter : ");
        ADM[1] = Float.parseFloat(jTextField4.getText());
        ADM[0] = 1 - ADM[1];

       // System.out.println("Enter : ");
        Diet[1] = Float.parseFloat(jTextField5.getText());
        Diet[0] = 1 - Diet[1];
       // System.out.println("Enter : ");
        Exc[1] = Float.parseFloat(jTextField6.getText());
        Exc[0] = 1 - Exc[1];
        vectExcDiet[0] = Exc[0] * Diet[0];
        vectExcDiet[1] = Exc[0] * Diet[1];
        vectExcDiet[2] = Exc[1] * Diet[0];
        vectExcDiet[3] = Exc[1] * Diet[1];

        for (int m = 0; m < 2; m++) {
            answerSLDL = answerSLDL + Diet[m] * SLDL[m];
            //cout << Diet[i] << " " << STRIG[i] << "\n";
            answerSTRIG = answerSTRIG + Diet[m] * STRIG[m];
            answerCHDLR = answerCHDLR + Diet[m] * CHDLR[m];
            //cout << "Hiii";
            //cout << Diet[i]*SSM[i] << "\n";
            answerSSM = answerSSM + Diet[m] * SSM[m];
        }

        answerSLDL1[0] = 1 - answerSLDL;
        answerSLDL1[1] = answerSLDL;
        answerSTRIG1[0] = 1 - answerSTRIG;
        answerSTRIG1[1] = answerSTRIG;
        answerCHDLR1[0] = 1 - answerCHDLR;
        //cout << answerCHDLR1[0] << "\n\n\n";
        answerCHDLR1[1] = answerCHDLR;
        answerSSM1[1] = 1 - answerSSM;
        answerSSM1[0] = answerSSM;

        answerATS = probATS(answerSLDL1, answerSTRIG1, Exc, answerCHDLR1, ATS);
        answerATS1[0] = 1 - answerATS;
        answerATS1[1] = answerATS;
        //cout << "ATS : " << answerATS << "\n";

        // Table6
        answerObesity = probObesity(vectExcDiet, Obesity);
        answerObesity1[0] = 1 - answerObesity;
        answerObesity1[1] = answerObesity;
        //cout << "Obesity : " << answerObesity << "\n";

        // Table2
        answerHBP = probHBP(MED, SMALC, Exc, answerObesity1, HBP);
        answerHBP1[0] = 1 - answerHBP;
        answerHBP1[1] = answerHBP;
        //cout << "HBP : " << answerHBP << "\n";

        // Table1
        answerHD = probHD(answerATS1, answerSSM1, answerHBP1, FH, ADM, HD);
        answerHD1[0] = 1 - answerHD;
        answerHD1[1] = answerHD;

        for (int m = 0; m < 2; m++) {
            //cout << answerHD1[j] << " " << RHB[j] << "\n";
            answerECG = answerECG + answerHD1[m] * ECG[m];
            //cout << answerHD1[j] << " " << ANGP[j] << "\n";
            answerANGP = answerANGP + answerHD1[m] * ANGP[m];
            answerMIOCAR = answerMIOCAR + answerHD1[m] * MIOCAR[m];
            answerRHB = answerRHB + answerHD1[m] * RHB[m];
        }

        //    System.out.println("Chances of Heart Disease is : " + answerHD * 100 + "% \n");
        //  System.out.println("Possibility of ECG : " + answerECG * 100 + " % \n");
        //System.out.println("Possibility of Angina Pectrosis : " + answerANGP * 100 + "% \n");
        //System.out.println("Possibility of Miocardial Infraction : " + answerMIOCAR * 100 + "% \n");
        //System.out.println("Possibility of Rapid Heartbeats : " + answerRHB * 100 + "% \n");
        String s1 = String.valueOf(answerHD * 100);
        String s2 = String.valueOf(answerECG * 100);
        String s3 = String.valueOf(answerANGP * 100);
        String s4 = String.valueOf(answerMIOCAR * 100);
        String s5 = String.valueOf(answerRHB * 100);
        jTextField7.setText(s1);
        jTextField8.setText(s2);
        jTextField9.setText(s3);
        jTextField10.setText(s4);
        jTextField11.setText(s5);

        // jLayeredPane1.removeAll();
//        jLayeredPane1.add(jPanel2);
//        jLayeredPane1.repaint();
//        jLayeredPane1.revalidate();
//        jTextField7.setText("dsd");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        dataset.setValue(new Double(jTextField7.getText()), "Values", "Heart Disease");
        dataset.setValue(new Double(jTextField8.getText()), "Values", "ECG ");

        dataset.setValue(new Double(jTextField9.getText()), "Values", "Angina Pectrosis");

        dataset.setValue(new Double(jTextField10.getText()), "Values", "Miocardial Infraction");
        dataset.setValue(new Double(jTextField11.getText()), "Values", "Rapid Heartbeats");

        JFreeChart chart = ChartFactory.createBarChart("Prediction Rate", "Parameter", "Percentage", dataset);

        CategoryPlot p = chart.getCategoryPlot();
        
        BarRenderer renderer = (BarRenderer)p.getRenderer();
        DecimalFormat decimalformat =new DecimalFormat("##.##");
        renderer.setItemLabelGenerator(new org.jfree.chart.labels.StandardCategoryItemLabelGenerator("{2}",decimalformat) );
        p.setRenderer(renderer);
        renderer.setBasePositiveItemLabelPosition(new ItemLabelPosition(ItemLabelAnchor.CENTER, TextAnchor.CENTER));
       renderer.setItemLabelsVisible(true);
       chart.getCategoryPlot().setRenderer(renderer);
        org.jfree.chart.axis.ValueAxis yAxis = p.getRangeAxis();
		yAxis.setRange(0, 100);
        
        
//XYPlot plot = chart.getXYPlot();


        ChartFrame frame = new ChartFrame("Bar chart", chart);

        frame.setVisible(true);
        frame.setSize(1000, 1000);


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    float probObesity(float vectExcDiet[], float Obesity[]) {
        float ans = 0;
        for (int i = 0; i < 4; i++) {
            ans = ans + Obesity[i] * vectExcDiet[i];
        }
        return ans;
    }

    float probATS(float answerSLDL1[], float answerSTRIG1[], float Exc[], float answerCHDLR1[], float ATS[]) {
        float answerATS = 0;
        int cnt = 0;
        for (int i = 1; i >= 0; i--) {
            for (int j = 1; j >= 0; j--) {
                for (int k = 0; k < 2; k++) {
                    for (int l = 1; l >= 0; l--) {
                        //cout << answerSLDL1[i] << " " << answerSTRIG1[j] << " " << Exc[k] << " " << answerCHDLR1[l] << " " << ATS[cnt] << "\n";
                        answerATS = answerATS + answerSLDL1[i] * answerSTRIG1[j] * Exc[k] * answerCHDLR1[l] * ATS[cnt];
                        cnt++;
                    }
                }
            }
        }

        return answerATS;
    }

    float probHBP(float MED[], float SMALC[], float Exc[], float answerObesity1[], float HBP[]) {

        float answerHBP = 0;
        int cnt = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 1; j >= 0; j--) {
                for (int k = 0; k < 2; k++) {
                    for (int l = 1; l >= 0; l--) {
                        //cout << MED[i] << " " << SMALC[j] << " " << Exc[k] << " " << answerObesity1[l] << " " << HBP[cnt] << "\n";
                        answerHBP = answerHBP + MED[i] * SMALC[j] * Exc[k] * answerObesity1[l] * HBP[cnt];
                        cnt++;
                    }
                }
            }
        }
        return answerHBP;
    }

    float probHD(float ATS1[], float SSM1[], float HBP1[], float FH[], float ADM[], float HD[]) {

        float answerHD = 0;
        int cnt = 0;
        for (int i = 1; i >= 0; i--) {
            for (int j = 0; j < 2; j++) {
                for (int k = 1; k >= 0; k--) {
                    for (int l = 1; l >= 0; l--) {
                        for (int z = 1; z >= 0; z--) {
                            //cout << ATS1[i] << " " << SSM1[j] << " " << HBP1[k] << " " << FH[l] << " " << ADM[z] << " "<< HD[cnt] << "\n";
                            answerHD = answerHD + ATS1[i] * SSM1[j] * HBP1[k] * FH[l] * ADM[z] * HD[cnt];
                            cnt++;
                        }
                    }
                }
            }
        }
        return answerHD;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(practice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(practice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(practice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(practice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new practice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
