/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package bookshop;

import java.awt.Color;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Huyen
 */
public class Theloai extends javax.swing.JPanel {
    final String header[] ={"Mã Thể Loại","Tên Thể Loại"};
    final DefaultTableModel tb = new DefaultTableModel(header,0);
    /**
     * Creates new form Theloai
     */
    public Theloai() {
        initComponents();
        this.setBackground(Color.white);
        HienTHi();
        HienTHi1();
    }
    ConnectDataBase db = new ConnectDataBase();
    Connection conn;
    
    private  void loadLai(){
        txtmatheloai.setText("");
        txttentheloai.setText("");
    }

     public void HienTHi(){
        conn =  db.getConnection();

        try {
            java.sql.Statement st =  conn.createStatement();
            String query = "Select * from TheLoai";
            ResultSet rs =  st.executeQuery(query);
            DefaultTableModel model  = new DefaultTableModel();
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            for(int columnIndex = 1; columnIndex <= columnCount; columnIndex++) 
            {
                model.addColumn(metaData.getColumnLabel(columnIndex));
            }
            while(rs.next()) 
            {
                Object[] rowData = new Object[columnCount];
                for(int i=0; i<columnCount; i++) 
                {
                    rowData[i] = rs.getObject(i + 1); 
                }
                model.addRow(rowData);
            }
            dgvtheloai.setModel(model);

            st.close();
            rs.close();
            conn.close();
	} catch (SQLException e1) {
            // TODO Auto-generated catch block
            e1.toString();
	}
    }
     
     public void HienTHi1(){
        conn =  db.getConnection();

        try {
            java.sql.Statement st =  conn.createStatement();
            String query = "Select * from TheLoai";
            ResultSet rs =  st.executeQuery(query);
            DefaultTableModel model  = new DefaultTableModel();
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            for(int columnIndex = 1; columnIndex <= columnCount; columnIndex++) 
            {
                model.addColumn(metaData.getColumnLabel(columnIndex));
            }
            while(rs.next()) 
            {
                Object[] rowData = new Object[columnCount];
                for(int i=0; i<columnCount; i++) 
                {
                    rowData[i] = rs.getObject(i + 1); 
                }
                model.addRow(rowData);
            }
            dgvthemtheloai.setModel(model);

            st.close();
            rs.close();
            conn.close();
	} catch (SQLException e1) {
            // TODO Auto-generated catch block
            e1.toString();
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

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txttimkiem = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        dgvtheloai = new javax.swing.JTable();
        btntimkiem = new javax.swing.JButton();
        btnhienthitatca = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        dgvthemtheloai = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtmatheloai = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txttentheloai = new javax.swing.JTextField();
        btnthem = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnlammoi = new javax.swing.JButton();

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane2.setForeground(new java.awt.Color(0, 0, 0));
        jTabbedPane2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txttimkiem.setBackground(new java.awt.Color(255, 255, 255));
        txttimkiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txttimkiem.setForeground(new java.awt.Color(0, 0, 0));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        dgvtheloai.setBackground(new java.awt.Color(255, 255, 255));
        dgvtheloai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dgvtheloai.setForeground(new java.awt.Color(0, 0, 0));
        dgvtheloai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        dgvtheloai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dgvtheloaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dgvtheloai);

        btntimkiem.setBackground(new java.awt.Color(255, 255, 255));
        btntimkiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btntimkiem.setForeground(new java.awt.Color(0, 0, 0));
        btntimkiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/search.png"))); // NOI18N
        btntimkiem.setText("Tìm kiếm");
        btntimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntimkiemActionPerformed(evt);
            }
        });

        btnhienthitatca.setBackground(new java.awt.Color(255, 255, 255));
        btnhienthitatca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnhienthitatca.setForeground(new java.awt.Color(0, 0, 0));
        btnhienthitatca.setText("Hiện thị tất cả");
        btnhienthitatca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhienthitatcaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Nhập thông tin:");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/theloai2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnhienthitatca)
                            .addComponent(btntimkiem))
                        .addGap(103, 103, 103))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btntimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnhienthitatca, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jTabbedPane2.addTab("Tìm kiếm Thể Loại", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(824, 647));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        dgvthemtheloai.setBackground(new java.awt.Color(255, 255, 255));
        dgvthemtheloai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dgvthemtheloai.setForeground(new java.awt.Color(0, 0, 0));
        dgvthemtheloai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        dgvthemtheloai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dgvthemtheloaiMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(dgvthemtheloai);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Mã Thể Loại:");

        txtmatheloai.setBackground(new java.awt.Color(255, 255, 255));
        txtmatheloai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtmatheloai.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Tên Thể Loại:");

        txttentheloai.setBackground(new java.awt.Color(255, 255, 255));
        txttentheloai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txttentheloai.setForeground(new java.awt.Color(0, 0, 0));

        btnthem.setBackground(new java.awt.Color(255, 255, 255));
        btnthem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnthem.setForeground(new java.awt.Color(0, 0, 0));
        btnthem.setText("Thêm Thể Loại");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnsua.setBackground(new java.awt.Color(255, 255, 255));
        btnsua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnsua.setForeground(new java.awt.Color(0, 0, 0));
        btnsua.setText("Sửa");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnxoa.setBackground(new java.awt.Color(255, 255, 255));
        btnxoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnxoa.setForeground(new java.awt.Color(0, 0, 0));
        btnxoa.setText("Xóa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btnlammoi.setBackground(new java.awt.Color(255, 255, 255));
        btnlammoi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnlammoi.setForeground(new java.awt.Color(0, 0, 0));
        btnlammoi.setText("Reset");
        btnlammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlammoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttentheloai, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmatheloai, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnthem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnsua, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnlammoi, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtmatheloai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txttentheloai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnthem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnlammoi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsua, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Thêm Thể Loại", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dgvtheloaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgvtheloaiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_dgvtheloaiMouseClicked

    private void btntimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntimkiemActionPerformed
        // TODO add your handling code here:
        conn = db.getConnection();
        String timkiem = txttimkiem.getText();
        DefaultTableModel model = (DefaultTableModel) dgvtheloai.getModel();
        model.setRowCount(0);
        try {
            PreparedStatement ps = conn.prepareStatement("select * from TheLoai where TenTheLoai like ?");
            ps.setNString(1, "%" + timkiem + "%");
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                Object[] rowData = {rs.getString("MaTheLoai"), rs.getString("TenTheLoai")};
                model.addRow(rowData);
            }
            
            if (model.getRowCount() > 0) {
                JOptionPane.showMessageDialog(this, "Có " + model.getRowCount() + " sách mà bạn muốn tìm!");
            } else {
                JOptionPane.showMessageDialog(this, "Không có sách nào!");
            }

            conn.close();
        } catch (Exception e) {
            e.toString();
        }
    }//GEN-LAST:event_btntimkiemActionPerformed

    private void btnhienthitatcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhienthitatcaActionPerformed
        // TODO add your handling code here:
        HienTHi();
    }//GEN-LAST:event_btnhienthitatcaActionPerformed

    private void dgvthemtheloaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgvthemtheloaiMouseClicked
        // TODO add your handling code here:
        conn =  db.getConnection();
        
        dgvthemtheloai.setDefaultEditor(Object.class, null);

        try{
            int row = dgvthemtheloai.getSelectedRow();
            if (row >= 0) {
                String MaTheLoai = dgvthemtheloai.getValueAt(row, 0).toString();
                String TenTheLoai = dgvthemtheloai.getValueAt(row, 1).toString();
                txtmatheloai.setText(MaTheLoai);
                txttentheloai.setText(TenTheLoai);
                txtmatheloai.setEnabled(false);
                btnthem.setEnabled(false);
                btnsua.setEnabled(true);
                btnxoa.setEnabled(true);
                }
            
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi nhập liệu: " + e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_dgvthemtheloaiMouseClicked

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        // TODO add your handling code here:
         conn = db.getConnection();
        try {
            if(txtmatheloai.getText().equals("")||txttentheloai.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Bạn cần nhập đủ dữ liệu");
            }else{
                StringBuffer sb = new StringBuffer();
                String querry = "select MaTheLoai from TheLoai where MaTheloai = '"+txtmatheloai.getText()+"'";
                java.sql.Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(querry);
                if(rs.next()){
                    sb.append("Mã Thể Loại này đã tồn tại");
                }
                if(sb.length() > 0){//nếu if kia đúng thig nó sẽ thêm vào sb 1 đoạn string,ktra độ dài chuỗi này nếu lớn hơn 0 tức là có thông báo
                    JOptionPane.showMessageDialog(this, sb.toString());
                }else{ 
                    String sql = "insert into TheLoai values('"+txtmatheloai.getText()+"',N'"+txttentheloai.getText()+"')";
                    st = conn.createStatement();
                    int kq = st.executeUpdate(sql);
                    if(kq>0){
                        JOptionPane.showMessageDialog(this, "Thêm thành công");
                        loadLai();
                        HienTHi1();
                    }else{
                        JOptionPane.showMessageDialog(this, "Thêm thất bại");                        
                    }
                    st.close();
                }
                conn.close();
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi nhập liệu: " + e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        // TODO add your handling code here:
        conn = db.getConnection();
        try {
                java.sql.Statement st = conn.createStatement();
                String sql = "delete from TheLoai where MaTheLoai = '"+txtmatheloai.getText()+"'";
                st = conn.createStatement();
                int t = JOptionPane.showConfirmDialog(this,"Bạn có muốn xóa?","Thông báo!", JOptionPane.YES_NO_OPTION);
                if(t == JOptionPane.YES_OPTION){
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(this, "Xóa thành công");
                    loadLai();
                    HienTHi1();
                }else{
                    JOptionPane.showMessageDialog(this, "Xóa thất bại");                        
                }
                st.close();
                conn.close();
        } catch (Exception e) {
            e.toString();
        }
    }//GEN-LAST:event_btnsuaActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        // TODO add your handling code here:
        conn = db.getConnection();
        try {
                java.sql.Statement st = conn.createStatement();
                String sql = "delete from TheLoai where MaTheLoai = '"+txtmatheloai.getText()+"'";
                st = conn.createStatement();
                int t = JOptionPane.showConfirmDialog(this,"Bạn có muốn xóa?","Thông báo!", JOptionPane.YES_NO_OPTION);
                if(t == JOptionPane.YES_OPTION){
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(this, "Xóa thành công");
                    loadLai();
                    HienTHi1();
                }else{
                    JOptionPane.showMessageDialog(this, "Xóa thất bại");                        
                }
                st.close();
                conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Mã thể loại " + txtmatheloai.getText().toString() + " đang liên kết với Bảng Sách nên bạn không thể xóa được");
        }
    }//GEN-LAST:event_btnxoaActionPerformed

    private void btnlammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlammoiActionPerformed
        // TODO add your handling code here:
        loadLai();
        txtmatheloai.setEnabled(true);
        btnthem.setEnabled(true);
        btnsua.setEnabled(false);
        btnxoa.setEnabled(false);
    }//GEN-LAST:event_btnlammoiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnhienthitatca;
    private javax.swing.JButton btnlammoi;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btntimkiem;
    private javax.swing.JButton btnxoa;
    private javax.swing.JTable dgvtheloai;
    private javax.swing.JTable dgvthemtheloai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField txtmatheloai;
    private javax.swing.JTextField txttentheloai;
    private javax.swing.JTextField txttimkiem;
    // End of variables declaration//GEN-END:variables
}