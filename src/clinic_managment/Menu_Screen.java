/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic_managment;

import static com.sun.glass.ui.Cursor.setVisible;
import java.awt.Color;
import java.awt.Toolkit;

import static java.lang.System.exit;
//import java.awt.List;



import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import java.sql.Connection;
//import java.sql.Date;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author youss
 */
public class Menu_Screen extends javax.swing.JFrame {

    /**
     * Creates new form Menu_Screen
     */
     Connection myconn= null; //To connect to database
     Statement mystat= null; //setting the query 
     ResultSet myres= null; //preservering the result after applying the query
     DefaultTableModel dm;
    
    
        String url= "jdbc:sqlserver://localhost:1433;databaseName=ClinicManagment";
        String user = "sa";
        String password="12345";
        
    public Menu_Screen() {
        initComponents();
        icon();
    }
    private void icon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));   
    }
    
    
    Visit_Report jtRowData = new Visit_Report();
    public Menu_Screen(String para){
        
        initComponents();
        icon();
        //userDisplay.setText(para); come to this later to display the user
    }
    
    
    
    private void filter(String query){
        DefaultTableModel model = (DefaultTableModel) History_Table.getModel();
        TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(model);
        History_Table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query.trim()));
        
    }
    
    private void filter2(String query2){
        DefaultTableModel model = (DefaultTableModel) NewPAdd.getModel();
        TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(model);
        NewPAdd.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query2.trim()));
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        IDSearch = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        History_Table = new javax.swing.JTable();
        HideButton = new javax.swing.JButton();
        history_search = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        notesL = new javax.swing.JLabel();
        DOLV = new javax.swing.JLabel();
        diagnosisL = new javax.swing.JLabel();
        phoneL = new javax.swing.JLabel();
        phoneT = new javax.swing.JTextField();
        EnterVisit = new javax.swing.JButton();
        DrugL = new javax.swing.JLabel();
        jDateChooserDOV = new com.toedter.calendar.JDateChooser();
        jScrollPane3 = new javax.swing.JScrollPane();
        InvestT = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        NotesT = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        diagnosisT = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        investL = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        investt = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        nameVist = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        investigationL = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        addName = new javax.swing.JTextField();
        AddID = new javax.swing.JTextField();
        AddButton = new javax.swing.JButton();
        RefreshT = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        NewPAdd = new javax.swing.JTable();
        DOBLabel = new javax.swing.JLabel();
        AddressL = new javax.swing.JLabel();
        Address = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        MaleRadio = new javax.swing.JRadioButton();
        FemaleRadio = new javax.swing.JRadioButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        contractRadio = new javax.swing.JRadioButton();
        privateRadio = new javax.swing.JRadioButton();
        patientSearch = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        New_Patient = new javax.swing.JButton();
        New_Visit = new javax.swing.JButton();
        History = new javax.swing.JButton();
        Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 102, 255));
        setMinimumSize(new java.awt.Dimension(1380, 800));
        setPreferredSize(new java.awt.Dimension(1380, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        IDSearch.setText("Search");
        jPanel2.add(IDSearch);
        IDSearch.setBounds(26, 74, 58, 37);

        History_Table.setBackground(new java.awt.Color(204, 204, 204));
        History_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Phone Number", "Name", "Date of birth", "Date of visit", "History", "Treatment", "Clinical Examination", "Investigation", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        History_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                History_TableMouseClicked(evt);
            }
        });
        History_Table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                History_TableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(History_Table);
        if (History_Table.getColumnModel().getColumnCount() > 0) {
            History_Table.getColumnModel().getColumn(1).setMinWidth(150);
            History_Table.getColumnModel().getColumn(1).setPreferredWidth(150);
            History_Table.getColumnModel().getColumn(1).setMaxWidth(200);
            History_Table.getColumnModel().getColumn(2).setMinWidth(100);
            History_Table.getColumnModel().getColumn(2).setPreferredWidth(100);
            History_Table.getColumnModel().getColumn(2).setMaxWidth(150);
            History_Table.getColumnModel().getColumn(3).setMinWidth(100);
            History_Table.getColumnModel().getColumn(3).setPreferredWidth(100);
            History_Table.getColumnModel().getColumn(3).setMaxWidth(150);
        }

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 190, 1110, 366);

        HideButton.setBackground(new java.awt.Color(255, 255, 255));
        HideButton.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        HideButton.setText("Hide");
        HideButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 10));
        HideButton.setContentAreaFilled(false);
        HideButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HideButton.setOpaque(true);
        HideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HideButtonActionPerformed(evt);
            }
        });
        jPanel2.add(HideButton);
        HideButton.setBounds(410, 70, 98, 41);

        history_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                history_searchActionPerformed(evt);
            }
        });
        history_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                history_searchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                history_searchKeyReleased(evt);
            }
        });
        jPanel2.add(history_search);
        history_search.setBounds(96, 72, 289, 41);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinic_managment/resources/doctor.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(-320, -20, 1600, 840);

        jTabbedPane1.addTab("tab2", jPanel2);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        notesL.setText("History");
        jPanel1.add(notesL);
        notesL.setBounds(30, 200, 80, 23);

        DOLV.setText("Date of visit");
        jPanel1.add(DOLV);
        DOLV.setBounds(440, 320, 70, 20);

        diagnosisL.setText("Clinical Examination");
        jPanel1.add(diagnosisL);
        diagnosisL.setBounds(30, 350, 130, 27);

        phoneL.setText("Phone Number");
        jPanel1.add(phoneL);
        phoneL.setBounds(20, 120, 100, 32);

        phoneT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTActionPerformed(evt);
            }
        });
        jPanel1.add(phoneT);
        phoneT.setBounds(160, 120, 240, 32);

        EnterVisit.setBackground(new java.awt.Color(255, 255, 255));
        EnterVisit.setText("Enter");
        EnterVisit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 10));
        EnterVisit.setContentAreaFilled(false);
        EnterVisit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EnterVisit.setOpaque(true);
        EnterVisit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterVisitActionPerformed(evt);
            }
        });
        jPanel1.add(EnterVisit);
        EnterVisit.setBounds(460, 450, 80, 40);

        DrugL.setText("Treatment");
        jPanel1.add(DrugL);
        DrugL.setBounds(440, 70, 71, 32);

        jDateChooserDOV.setDateFormatString("dd/MM/yyyy");
        jPanel1.add(jDateChooserDOV);
        jDateChooserDOV.setBounds(570, 310, 240, 30);

        InvestT.setColumns(20);
        InvestT.setRows(5);
        jScrollPane3.setViewportView(InvestT);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(570, 70, 240, 100);

        NotesT.setColumns(20);
        NotesT.setRows(5);
        jScrollPane4.setViewportView(NotesT);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(160, 180, 240, 100);

        diagnosisT.setColumns(20);
        diagnosisT.setRows(5);
        jScrollPane5.setViewportView(diagnosisT);

        jPanel1.add(jScrollPane5);
        jScrollPane5.setBounds(160, 310, 240, 100);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Print");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 10));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(550, 450, 80, 40);

        investL.setText("Investigation");
        jPanel1.add(investL);
        investL.setBounds(30, 450, 100, 20);

        investt.setColumns(20);
        investt.setRows(5);
        investt.setText("No investigations");
        jScrollPane6.setViewportView(investt);

        jPanel1.add(jScrollPane6);
        jScrollPane6.setBounds(160, 450, 240, 100);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Clear");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 10));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(640, 450, 80, 40);
        jPanel1.add(nameVist);
        nameVist.setBounds(160, 60, 240, 30);

        jLabel5.setText("Name");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 60, 90, 20);

        investigationL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinic_managment/resources/bonedoc2.jpg"))); // NOI18N
        investigationL.setText("kk");
        jPanel1.add(investigationL);
        investigationL.setBounds(0, -450, 2120, 1620);

        jTabbedPane1.addTab("tab1", jPanel1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        name.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        name.setText("Name");
        jPanel3.add(name);
        name.setBounds(46, 40, 131, 33);

        ID.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ID.setText("Phone");
        jPanel3.add(ID);
        ID.setBounds(46, 91, 131, 33);

        addName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNameActionPerformed(evt);
            }
        });
        jPanel3.add(addName);
        addName.setBounds(189, 39, 165, 33);
        jPanel3.add(AddID);
        AddID.setBounds(189, 91, 165, 33);

        AddButton.setBackground(new java.awt.Color(255, 255, 255));
        AddButton.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        AddButton.setText("Add Patient");
        AddButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 10));
        AddButton.setContentAreaFilled(false);
        AddButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddButton.setOpaque(true);
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        jPanel3.add(AddButton);
        AddButton.setBounds(300, 220, 140, 37);

        RefreshT.setBackground(new java.awt.Color(255, 255, 255));
        RefreshT.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        RefreshT.setText("View/Refresh");
        RefreshT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 10));
        RefreshT.setContentAreaFilled(false);
        RefreshT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RefreshT.setOpaque(true);
        RefreshT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshTActionPerformed(evt);
            }
        });
        jPanel3.add(RefreshT);
        RefreshT.setBounds(480, 220, 140, 37);

        NewPAdd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Phone Number", "Name", "Date of Birth", "Address", "Gender", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        NewPAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewPAddMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(NewPAdd);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(12, 292, 1090, 370);

        DOBLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        DOBLabel.setText("Date of Birth");
        jPanel3.add(DOBLabel);
        DOBLabel.setBounds(730, 40, 76, 29);

        AddressL.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        AddressL.setText("Address");
        jPanel3.add(AddressL);
        AddressL.setBounds(46, 136, 131, 37);
        jPanel3.add(Address);
        Address.setBounds(189, 140, 165, 33);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setText("Gender");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(539, 40, 57, 33);

        MaleRadio.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(MaleRadio);
        MaleRadio.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        MaleRadio.setText("Male");
        MaleRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleRadioActionPerformed(evt);
            }
        });
        jPanel3.add(MaleRadio);
        MaleRadio.setBounds(615, 39, 87, 29);

        FemaleRadio.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(FemaleRadio);
        FemaleRadio.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        FemaleRadio.setText("Female");
        FemaleRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleRadioActionPerformed(evt);
            }
        });
        jPanel3.add(FemaleRadio);
        FemaleRadio.setBounds(615, 67, 87, 29);
        jPanel3.add(jDateChooser1);
        jDateChooser1.setBounds(810, 40, 151, 29);

        jLabel3.setText("Status");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(550, 130, 40, 20);

        buttonGroup2.add(contractRadio);
        contractRadio.setText("Contract");
        jPanel3.add(contractRadio);
        contractRadio.setBounds(620, 120, 80, 29);

        buttonGroup2.add(privateRadio);
        privateRadio.setText("Private");
        jPanel3.add(privateRadio);
        privateRadio.setBounds(620, 150, 80, 29);

        patientSearch.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        patientSearch.setText("Search For Patient");
        patientSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientSearchActionPerformed(evt);
            }
        });
        patientSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                patientSearchKeyReleased(evt);
            }
        });
        jPanel3.add(patientSearch);
        patientSearch.setBounds(10, 250, 210, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinic_managment/resources/doctor.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(-320, 0, 1670, 860);
        jPanel3.add(jDateChooser2);
        jDateChooser2.setBounds(830, 100, 119, 26);

        jTabbedPane1.addTab("tab3", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, -30, 1240, 820));

        jPanel4.setBackground(new java.awt.Color(174, 227, 253));

        New_Patient.setBackground(new java.awt.Color(255, 255, 255));
        New_Patient.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        New_Patient.setText("New Patient");
        New_Patient.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 10));
        New_Patient.setContentAreaFilled(false);
        New_Patient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        New_Patient.setOpaque(true);
        New_Patient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                New_PatientActionPerformed(evt);
            }
        });

        New_Visit.setBackground(new java.awt.Color(255, 255, 255));
        New_Visit.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        New_Visit.setText("New Visit");
        New_Visit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));
        New_Visit.setContentAreaFilled(false);
        New_Visit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        New_Visit.setOpaque(true);
        New_Visit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                New_VisitActionPerformed(evt);
            }
        });

        History.setBackground(new java.awt.Color(255, 255, 255));
        History.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        History.setText("History");
        History.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 10));
        History.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        History.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoryActionPerformed(evt);
            }
        });

        Exit.setBackground(new java.awt.Color(0, 0, 0));
        Exit.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setText("Sign out ");
        Exit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));
        Exit.setContentAreaFilled(false);
        Exit.setOpaque(true);
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(History, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(New_Visit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(New_Patient, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(History, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(New_Visit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(New_Patient)
                .addGap(154, 154, 154)
                .addComponent(Exit)
                .addContainerGap(420, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 810));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void HistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistoryActionPerformed
        // TODO add your handling code here:
         jTabbedPane1.setSelectedIndex(0);
        
        
        //read database into the table
            try{    
                myconn = DriverManager.getConnection(url, user, password);
                mystat = myconn.createStatement();
                myres = mystat.executeQuery("select i.P_ID,i.P_FNAME,i.P_DOB,h.DOLV,h.VISIT_INFO,h.PRESCRIBED_DRUGS, H.DIAGNOSIS, H.investigations,i.status from  history h, PATIENT_INFO i \n" +
"where\n" +
"i.P_ID=h.P_ID \n" +
"order by dolv desc");

                while(myres.next()){
                    //All the data will be added
                    String P_ID =myres.getString(1); 
                    String P_name = myres.getString(2);
                    String DOB = myres.getString(3);
                    String DOLV = myres.getString(4);
                    String Visit_Info = myres.getString(5);
                    String Drugs = myres.getString(6);
                    String diagnosis = myres.getString(7);
                    String investigation= myres.getString(8);
                    String status=myres.getString(9);
                    
                    //String array to store the data into the table
                    String tbData[] = {P_ID, P_name, DOB,DOLV,Visit_Info,Drugs,diagnosis,investigation,status};
                    DefaultTableModel tb1Model = (DefaultTableModel)History_Table.getModel();

                    //add string array table into jTable1
                    while(tb1Model.getRowCount()>0){
                    tb1Model.setRowCount(0);
                    }                    
                }
                myconn.close();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            updateTable2();             
            History_Table.setVisible(true);

    }//GEN-LAST:event_HistoryActionPerformed

    private void New_VisitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_New_VisitActionPerformed
        jTabbedPane1.setSelectedIndex(1);
        jDateChooserDOV.setVisible(false);
        DOLV.setVisible(false);
    }//GEN-LAST:event_New_VisitActionPerformed

    private void New_PatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_New_PatientActionPerformed
        jTabbedPane1.setSelectedIndex(2);
        jDateChooser2.setVisible(false);
        
    }//GEN-LAST:event_New_PatientActionPerformed

    private void addNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addNameActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
         // TODO add your handling code here:
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); 
        Date date = new Date(); 
        jDateChooser2.setDate(date);
        String idInput = AddID.getText().toLowerCase();
        String nameInput = addName.getText().toLowerCase();
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
        String DOB= sdf.format(jDateChooser1.getDate());
        String address = Address.getText().toLowerCase();     
        if (MaleRadio.isSelected()){
            String gender = MaleRadio.getText().toLowerCase();}
        else if(FemaleRadio.isSelected()){
            String gender = FemaleRadio.getText().toLowerCase();  
        }
        if(contractRadio.isSelected()){
            String status= contractRadio.getText().toLowerCase();}
        else if(privateRadio.isSelected()){
            String status= privateRadio.getText().toLowerCase();
        }
        String doe=sdf.format(jDateChooser2.getDate());
        
        
        
        //creating a list to store values in
        int exist=0;
        List<String> idList=new ArrayList<String>();
        List<String> nameList=new ArrayList<String>();
        List<String> DOBList=new ArrayList<String>();
        List<String> AddressList=new ArrayList<String>();
        List<String> GenderList=new ArrayList<String>();
        List<String> statusList=new ArrayList<String>();
        List<String> doeList=new ArrayList<String>();
        
        //Reading data from SQL Table
            
                try{ 
                    
                    myconn = DriverManager.getConnection(url, user, password);
                    mystat = myconn.createStatement();
                    myres = mystat.executeQuery("Select p_id,p_fname,p_dob,p_address,p_gender,status from Patient_info order by entry_date desc ");

                    while(myres.next()){
                        //All the data will be added
                        String  id = myres.getString(1);
                        String name = myres.getString(2);
                        String dob = String.valueOf(myres.getDate(3));
                        String add = myres.getString(4);
                        String genders = myres.getString(5);
                        String statuss= myres.getString(6);
                        
                        
                                               
                        idList.add(id);
                        nameList.add(name);
                        DOBList.add(dob);
                        AddressList.add(add);
                        GenderList.add(genders);
                        statusList.add(statuss);
                        
                    }
                    String[] idArr = new String[idList.size()];
                    idArr = idList.toArray(idArr);
                    String[] nameArr = new String[nameList.size()];
                    nameArr = nameList.toArray(nameArr);
                    String[] dobArr = new String[DOBList.size()];
                    dobArr = DOBList.toArray(dobArr);
                    String[] addArr = new String[AddressList.size()];
                    addArr = AddressList.toArray(addArr);
                    String[] genArr = new String[GenderList.size()];
                    genArr = GenderList.toArray(genArr);
                    String[] statArr = new String[statusList.size()];
                    statArr = statusList.toArray(statArr);
                   
                    
                        exist=0;
                        for(int i=0; i<idArr.length; i++){
                            if(AddID.getText().equals(idArr[i])){
                                exist=1;
                                JOptionPane.showMessageDialog(null, "Phone already exists!", "Clinic System", JOptionPane.ERROR_MESSAGE);
                                AddID.setText("");               
                                break;
                                
                            }                            
                        }
                        
                        if(exist==0){
                            try{    
                            myconn = DriverManager.getConnection(url, user, password);
                            String SQL= "INSERT INTO PATIENT_INFO(p_id,p_fname,p_dob,p_address,p_gender,status,entry_date)  VALUES (?,?,?,?,?,?,?)";
                            PreparedStatement pstate = myconn.prepareStatement(SQL);
                            pstate.setString(1,AddID.getText().toLowerCase());
                            pstate.setString(2, addName.getText().toLowerCase());
                            pstate.setString(3,DOB);
                            pstate.setString(4, Address.getText().toLowerCase());                             
                           if (MaleRadio.isSelected()){
                                pstate.setString(5,MaleRadio.getText().toLowerCase());
                           }
                           else if(FemaleRadio.isSelected()){
                                 pstate.setString(5,FemaleRadio.getText().toLowerCase());
                           }
                           
                           if(contractRadio.isSelected()){
                               pstate.setString(6,contractRadio.getText().toLowerCase());
                           }
                           else if(privateRadio.isSelected()){
                               pstate.setString(6,privateRadio.getText().toLowerCase());
                           }
                           pstate.setString(7,doe);

                            pstate.executeUpdate();
                            JOptionPane.showMessageDialog(null,"Insertion Successful");
                            AddID.setText("");               
                            addName.setText("");
                            Address.setText("");
                            buttonGroup1.clearSelection();
                            buttonGroup2.clearSelection();
                            jDateChooser1.setCalendar(null);

                            myconn.close();
                            }
                            catch(Exception e){
                                System.out.println(e.getMessage());
                            }
                            
                        }
                    
                    myconn.close();
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                }
    }//GEN-LAST:event_AddButtonActionPerformed

    private void RefreshTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshTActionPerformed
        // TODO add your handling code here:
          try{    
                myconn = DriverManager.getConnection(url, user, password);
                mystat = myconn.createStatement();
                myres = mystat.executeQuery("Select p_id,p_fname,p_dob,p_address,p_gender,status from PATIENT_INFO order by entry_date desc");

                while(myres.next()){
                    //All the data will be added
                    String patient_ID = myres.getString(1);
                    String patient_name = myres.getString(2);
                    String patient_DOB = myres.getString(3);
                    String patient_Add = myres.getString(4);
                    String patient_gender = myres.getString(5);
                    String patient_status= myres.getString(6);

                    //String array to store the data into the table
                    String tbData[] = {patient_ID, patient_name,patient_DOB,patient_Add,patient_gender,patient_status};
                    DefaultTableModel tb1Model = (DefaultTableModel)NewPAdd.getModel();
                    
                    //To instantly refresh the table without exiting
                    while(tb1Model.getRowCount()>0){
                    tb1Model.setRowCount(0);
                    }

                    //add string array table into jTable1
                    //tb1Model.addRow(tbData);
                }

                myconn.close();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        updateTable();
    }//GEN-LAST:event_RefreshTActionPerformed

    private void HideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HideButtonActionPerformed
        History_Table.setVisible(false);
    }//GEN-LAST:event_HideButtonActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void MaleRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleRadioActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_MaleRadioActionPerformed

    private void EnterVisitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterVisitActionPerformed
        // TODO add your handling code here:
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); 
        Date date = new Date();
        jDateChooserDOV.setDate(date);
        String drugs = InvestT.getText();
        String notes= NotesT.getText();
        String Diagnosis= diagnosisT.getText();
        String phonenumV=phoneT.getText();
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
        String DOB= sdf.format(jDateChooserDOV.getDate());
        String invest= investt.getText();
        
         //creating a list to store values in
        int exist=0;
        List<String> drugslist=new ArrayList<String>();
        List<String> notelist=new ArrayList<String>();
        List<String> diagnosislist=new ArrayList<String>();
        List<String> phonenumList=new ArrayList<String>();
        List<String> datelist=new ArrayList<String>();
        List<String> investigationList=new ArrayList<String>();
        
        //Reading data from SQL Table
        
        try{    
                            myconn = DriverManager.getConnection(url, user, password);
                            mystat = myconn.createStatement();
                            myres = mystat.executeQuery("Select p_id from Patient_info");
                            
                            while(myres.next()){
                                String  phonenum = myres.getString(1);
                                phonenumList.add(phonenum);
                            }
                            
                            String[] phoneArr = new String[phonenumList.size()];
                            
                            phoneArr = phonenumList.toArray(phoneArr);
                            
                            exist=0;
                            
                        for(int i=0; i<phoneArr.length; i++){
                            if(phoneT.getText().equals(phoneArr[i])){
                                 try{
                                //insert into database
                            myconn = DriverManager.getConnection(url, user, password);
                            String SQL= "INSERT INTO history(p_id,dolv,visit_info,prescribed_drugs,diagnosis,investigations)  VALUES (?,?,?,?,?,?)";
                            PreparedStatement pstate = myconn.prepareStatement(SQL);
                            pstate.setString(1,phoneT.getText());
                            pstate.setString(2,DOB);
                            pstate.setString(3, NotesT.getText());
                            pstate.setString(4, InvestT.getText());  
                            pstate.setString(5, diagnosisT.getText()); 
                            pstate.setString(6, investt.getText()); 
     
                            pstate.executeUpdate();
                            JOptionPane.showMessageDialog(null,"Insertion Successful");
                          
                            myconn.close();
                            }
                            catch(Exception e){
                                System.out.println(e.getMessage());
                            }
                                
                                exist=1;
                                
                                break;
                                
                            }                            
                        }
                        
                        if(exist==0){
                            JOptionPane.showMessageDialog(null, "Phone/patient does not exist!", "Clinic System", JOptionPane.ERROR_MESSAGE);

                                exist=1;
                            
                           

                            myconn.close();
                            }
                            
                            
        }
                            catch(Exception e){
                                System.out.println(e.getMessage());
                            }
        
    }//GEN-LAST:event_EnterVisitActionPerformed

    private void History_TableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_History_TableKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_History_TableKeyReleased

    private void History_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_History_TableMouseClicked
        // TODO add your handling code here:
        
       //convertingfiltered table into modle so when it is clicked the right row is selected
       
       int modelRow = History_Table.convertRowIndexToModel(History_Table.getSelectedRow());
        TableModel model = History_Table.getModel();
        String name= model.getValueAt(modelRow, 1).toString();
        String dob= model.getValueAt(modelRow, 2).toString();
        String dov= model.getValueAt(modelRow,3).toString();
        String notes= model.getValueAt(modelRow, 4).toString();
        String drugs= model.getValueAt(modelRow, 5).toString();
        String diagnosis= model.getValueAt(modelRow, 6).toString();
        String investigation= model.getValueAt(modelRow, 7).toString();
        
        jtRowData.setVisible(true);
        jtRowData.pack();
        jtRowData.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        //sending visit info to the form 

        jtRowData.nameA.setText(name);
        jtRowData.DOBAdd.setText(dob);
        jtRowData.diagnosisA.setText(diagnosis);
        jtRowData.DateA.setText(dov);
        jtRowData.jTextArea2.setText(notes);
        jtRowData.DrugsA.setText(drugs);
        jtRowData.investA1.setText(investigation);

    }//GEN-LAST:event_History_TableMouseClicked

    private void history_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_history_searchKeyReleased
        String query= history_search.getText();
        filter(query);
        
    }//GEN-LAST:event_history_searchKeyReleased

    private void history_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_history_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_history_searchActionPerformed

    private void history_searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_history_searchKeyPressed
        // TODO add your handling code here:
        //Dea
    }//GEN-LAST:event_history_searchKeyPressed

    private void phoneTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTActionPerformed

    private void FemaleRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FemaleRadioActionPerformed

    private void patientSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_patientSearchKeyReleased
        // TODO add your handling code here:
        String query= patientSearch.getText();
        filter2(query);
        
    }//GEN-LAST:event_patientSearchKeyReleased

    private void patientSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientSearchActionPerformed

    private void NewPAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewPAddMouseClicked
        // TODO add your handling code here:
        int modelRow = NewPAdd.convertRowIndexToModel(NewPAdd.getSelectedRow());
        TableModel model = NewPAdd.getModel();
        String number= model.getValueAt(modelRow, 0).toString();
        String name= model.getValueAt(modelRow,1).toString();
          phoneT.setText(number);
          nameVist.setText(name);
    }//GEN-LAST:event_NewPAddMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          //getting text in text fields so it will be passed into prescription
          String treatment= InvestT.getText();
          String name= nameVist.getText();
          Date date=jDateChooserDOV.getDate();
          String dates  = ((JTextField)jDateChooserDOV.getDateEditor().getUiComponent()).getText();
          
          new prescription(treatment,name,dates).setVisible(true);
          
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //clear text field in new visit button
        phoneT.setText("");               
        NotesT.setText("");
        InvestT.setText("");
        diagnosisT.setText("");
        jDateChooserDOV.setCalendar(null);
        investt.setText("");
        nameVist.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
        public void selection(){
        History_Table.setSelectionBackground(Color.YELLOW);
        }
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
            java.util.logging.Logger.getLogger(Menu_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Screen().setVisible(true);
            }
        });
    }

    private void updateTable(){
        DefaultTableModel tb1Model = (DefaultTableModel)NewPAdd.getModel();
        try{    
                myconn = DriverManager.getConnection(url, user, password);
                mystat = myconn.createStatement();
                myres = mystat.executeQuery("Select p_id,p_fname,p_dob,p_address,p_gender,status from PATIENT_INFO order by entry_date desc");


                while(myres.next()){
                    //All the data will be added
                    String patient_ID = myres.getString(1);
                    String patient_name = myres.getString(2);
                    String patient_DOB = String.valueOf(myres.getDate(3));
                    String patient_Add = myres.getString(4);
                    String patient_gender = myres.getString(5);
                    String patient_status= myres.getString(6);

                    //String array to store the data into the table
                    String tbData[] = {patient_ID, patient_name,patient_DOB,patient_Add,patient_gender,patient_status};


                    //add string array table into jTable1
                    tb1Model.addRow(tbData);
                }

                myconn.close();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
    }

    private void updateTable2(){
        DefaultTableModel tb1Model = (DefaultTableModel)History_Table.getModel();
        try{    
                myconn = DriverManager.getConnection(url, user, password);
                mystat = myconn.createStatement();
                myres = mystat.executeQuery("select i.P_ID,i.P_FNAME,i.P_DOB,h.DOLV,h.VISIT_INFO,h.PRESCRIBED_DRUGS, h.diagnosis,h.investigations,i.status from  \n" +
"                        history h, PATIENT_INFO i \n" +
"                        where i.P_ID=h.P_ID \n" +
"                        order by dolv asc");

                while(myres.next()){
                    //All the data will be added
                    String P_ID = myres.getString(1);
                    String P_name = myres.getString(2);
                    String DOB = myres.getString(3);
                    String DOLV = myres.getString(4);
                    String Visit_Info = myres.getString(5);
                    String Drugs = myres.getString(6);
                    String diagnosis=myres.getString(7);
                    String investigation=myres.getString(8);
                    String status=myres.getString(9);

                    //String array to store the data into the table
                    String tbData[] = {P_ID, P_name,DOB,DOLV,Visit_Info,Drugs,diagnosis,investigation,status};


                    //add string array table into jTable1
                    tb1Model.addRow(tbData);
                }

                myconn.close();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JTextField AddID;
    private javax.swing.JTextField Address;
    private javax.swing.JLabel AddressL;
    private javax.swing.JLabel DOBLabel;
    private javax.swing.JLabel DOLV;
    private javax.swing.JLabel DrugL;
    private javax.swing.JButton EnterVisit;
    private javax.swing.JButton Exit;
    private javax.swing.JRadioButton FemaleRadio;
    private javax.swing.JButton HideButton;
    private javax.swing.JButton History;
    private javax.swing.JTable History_Table;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel IDSearch;
    private javax.swing.JTextArea InvestT;
    private javax.swing.JRadioButton MaleRadio;
    private javax.swing.JTable NewPAdd;
    private javax.swing.JButton New_Patient;
    private javax.swing.JButton New_Visit;
    private javax.swing.JTextArea NotesT;
    private javax.swing.JButton RefreshT;
    private javax.swing.JTextField addName;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton contractRadio;
    private javax.swing.JLabel diagnosisL;
    private javax.swing.JTextArea diagnosisT;
    private javax.swing.JTextField history_search;
    private javax.swing.JLabel investL;
    private javax.swing.JLabel investigationL;
    private javax.swing.JTextArea investt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooserDOV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nameVist;
    private javax.swing.JLabel notesL;
    private javax.swing.JTextField patientSearch;
    private javax.swing.JLabel phoneL;
    private javax.swing.JTextField phoneT;
    private javax.swing.JRadioButton privateRadio;
    // End of variables declaration//GEN-END:variables
}
