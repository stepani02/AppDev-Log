

// public class SelectRoomDate extends javax.swing.JFrame 
// {

//     /**
//      * Creates new form SelectRoomDate
//      */
//     public SelectRoomDate() {
//         initComponents();
//     }
//     @SuppressWarnings("unchecked")
//     // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
//     private void initComponents() {

//         BtnDetails = new javax.swing.JButton();
//         ComboRoom = new javax.swing.JComboBox<>();
//         BtnSubmit = new javax.swing.JButton();
//         ComboDate = new javax.swing.JComboBox<>();

//         BtnDetails.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
//         BtnDetails.setText("View room details");

//         setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

//         ComboRoom.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
//         ComboRoom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a room...", " " }));

//         BtnSubmit.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
//         BtnSubmit.setText("Submit");
//         BtnSubmit.addActionListener(new java.awt.event.ActionListener() {
//             public void actionPerformed(java.awt.event.ActionEvent evt) {
//                 BtnSubmitActionPerformed(evt);
//             }
//         });

//         ComboDate.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
//         ComboDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a date...", " " }));

//         javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//         getContentPane().setLayout(layout);
//         layout.setHorizontalGroup(
//             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addGroup(layout.createSequentialGroup()
//                 .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
//                     .addComponent(ComboRoom, 0, 380, Short.MAX_VALUE)
//                     .addComponent(ComboDate, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//                 .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//             .addGroup(layout.createSequentialGroup()
//                 .addGap(163, 163, 163)
//                 .addComponent(BtnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
//                 .addContainerGap(183, Short.MAX_VALUE))
//         );
//         layout.setVerticalGroup(
//             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addGroup(layout.createSequentialGroup()
//                 .addContainerGap(132, Short.MAX_VALUE)
//                 .addComponent(ComboRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                 .addGap(37, 37, 37)
//                 .addComponent(ComboDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                 .addGap(74, 74, 74)
//                 .addComponent(BtnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
//                 .addGap(46, 46, 46))
//         );

//         pack();
//     }// </editor-fold>                        

//     private void BtnSubmitActionPerformed(java.awt.event.ActionEvent evt) {                                          
//         // TODO add your handling code here:
//     }                                         


//     public static void main(String args[]) {

//         try {
//             for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                 if ("Nimbus".equals(info.getName())) {
//                     javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                     break;
//                 }
//             }
//         } catch (ClassNotFoundException ex) {
//             java.util.logging.Logger.getLogger(SelectRoomDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//         } catch (InstantiationException ex) {
//             java.util.logging.Logger.getLogger(SelectRoomDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//         } catch (IllegalAccessException ex) {
//             java.util.logging.Logger.getLogger(SelectRoomDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//         } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//             java.util.logging.Logger.getLogger(SelectRoomDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//         }
//         //</editor-fold>

//         // Create and display the form */
//          java.awt.EventQueue.invokeLater(new Runnable() {
//              public void run() {
//                new SelectRoomDate().setVisible(true);
//            }
//          });
//     }

//     // Variables declaration - do not modify                     
//     private javax.swing.JButton BtnDetails;
//     private javax.swing.JButton BtnSubmit;
//     private javax.swing.JComboBox<String> ComboDate;
//     private javax.swing.JComboBox<String> ComboRoom;
//     // End of variables declaration                   
// }