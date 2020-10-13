
package SamplePrograms;


public class Search2 extends javax.swing.JFrame {

    
    static String product[] = new String [50];
    static double price[] = new double [50];
    static String category[] = new String [50];
    
    public Search2() {
        initComponents();
        loadData();
    }
       
    
    public static String[] search(String cat){
        String result=""; //list of results
        //use for loop to look for product
        for (int i = 0; i < category.length; i++) {
            if(cat.equals(category[i])){
                result += product[i] + ",";
            }
        }
        //splits result into an array using, to seperate each item
        if(result.equals("")) {
            return new String[0];
    }
        return result.split(",");
    }
    
    
    public static void loadData() {
        product[0] = "Chai";
        product[1] = "Chang";
        product[2] = "Aniseed Syrup";
        product[3] = "Chef Anton's Cajun Seasoning";
        product[4] = "Chef Anton's Gumbo Mix";
        product[5] = "Grandma's Boysenberry Spread";
        product[6] = "Uncle Bob's Organic Dried Pears";
        product[7] = "Northwoods Cranberry Sauce";
        product[8] = "Mishi Kobe Niku";
        product[9] = "Ikura";
        product[10] = "Queso Cabrales";
        product[11] = "Queso Manchego La Pastora";
        product[12] = "Konbu";
        product[13] = "Tofu";
        product[14] = "Genen Shouyu";
        product[15] = "Pavlova";
        product[16] = "Alice Mutton";
        product[17] = "Carnarvon Tigers";
        product[18] = "Teatime Chocolate Biscuits";
        product[19] = "Sir Rodney's Marmalade";
        product[20] = "Sir Rodney's Scones";
        product[21] = "Nord-Ost Matjeshering";
        product[22] = "Gorgonzola Telino";
        product[23] = "Mascarpone Fabioli";
        product[24] = "Geitost";
        product[25] = "Sasquatch Ale";
        product[26] = "Steeleye Stout";
        product[27] = "Boston Crab Meat";
        product[28] = "Jack's New England Clam Chowder";
        product[29] = "Ipoh Coffee";
        product[30] = "Gula Malacca";
        product[31] = "Spegesild";
        product[32] = "Zaanse koeken";
        product[33] = "Chocolade";
        product[34] = "Maxilaku";
        product[35] = "Valkoinen suklaa";
        product[36] = "Manjimup Dried Apples";
        product[37] = "Filo Mix";
        product[38] = "Perth Pasties";
        product[39] = "Tourtisre";
        product[40] = "Gnocchi di nonna Alice";
        product[41] = "Ravioli Angelo";
        product[42] = "Escargots de Bourgogne";
        product[43] = "Vegie-spread";
        product[44] = "Louisiana Fiery Hot Pepper Sauce";
        product[45] = "Louisiana Hot Spiced Okra";
        product[46] = "Laughing Lumberjack Lager";
        product[47] = "Scottish Longbreads";
        product[48] = "Gudbrandsdalsost";
        product[49] = "Outback Lager";

        price[0] = 18.00;
        price[1] = 19.00;
        price[2] = 10.00;
        price[3] = 22.00;
        price[4] = 21.35;
        price[5] = 25.00;
        price[6] = 30.00;
        price[7] = 40.00;
        price[8] = 97.00;
        price[9] = 31.00;
        price[10] = 21.00;
        price[11] = 38.00;
        price[12] = 6.00;
        price[13] = 23.25;
        price[14] = 15.50;
        price[15] = 17.45;
        price[16] = 39.00;
        price[17] = 62.50;
        price[18] = 9.20;
        price[19] = 81.00;
        price[20] = 10.00;
        price[21] = 25.89;
        price[22] = 12.50;
        price[23] = 32.00;
        price[24] = 2.50;
        price[25] = 14.00;
        price[26] = 18.00;
        price[27] = 18.40;
        price[28] = 9.65;
        price[29] = 46.00;
        price[30] = 19.45;
        price[31] = 12.00;
        price[32] = 9.50;
        price[33] = 12.75;
        price[34] = 20.00;
        price[35] = 16.25;
        price[36] = 53.00;
        price[37] = 7.00;
        price[38] = 32.80;
        price[39] = 7.45;
        price[40] = 38.00;
        price[41] = 19.50;
        price[42] = 13.25;
        price[43] = 43.90;
        price[44] = 21.05;
        price[45] = 17.00;
        price[46] = 14.00;
        price[47] = 12.50;
        price[48] = 36.00;
        price[49] = 15.00;

        category[0] = "Beverages";
        category[1] = "Beverages";
        category[2] = "Condiments";
        category[3] = "Condiments";
        category[4] = "Condiments";
        category[5] = "Condiments";
        category[6] = "Produce";
        category[7] = "Condiments";
        category[8] = "Meat/Poultry";
        category[9] = "Seafood";
        category[10] = "Dairy Products";
        category[11] = "Dairy Products";
        category[12] = "Seafood";
        category[13] = "Produce";
        category[14] = "Condiments";
        category[15] = "Confections";
        category[16] = "Meat/Poultry";
        category[17] = "Seafood";
        category[18] = "Confections";
        category[19] = "Confections";
        category[20] = "Confections";
        category[21] = "Seafood";
        category[22] = "Dairy Products";
        category[23] = "Dairy Products";
        category[24] = "Dairy Products";
        category[25] = "Beverages";
        category[26] = "Beverages";
        category[27] = "Seafood";
        category[28] = "Seafood";
        category[29] = "Beverages";
        category[30] = "Condiments";
        category[31] = "Seafood";
        category[32] = "Confections";
        category[33] = "Confections";
        category[34] = "Confections";
        category[35] = "Confections";
        category[36] = "Produce";
        category[37] = "Grains/Cereals";
        category[38] = "Meat/Poultry";
        category[39] = "Meat/Poultry";
        category[40] = "Grains/Cereals";
        category[41] = "Grains/Cereals";
        category[42] = "Seafood";
        category[43] = "Condiments";
        category[44] = "Condiments";
        category[45] = "Condiments";
        category[46] = "Beverages";
        category[47] = "Confections";
        category[48] = "Dairy Products";
        category[49] = "Beverages";
    } //end load data


  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        searchbox = new javax.swing.JTextField();
        gobtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultList = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Enter Search Category:");

        searchbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchboxActionPerformed(evt);
            }
        });

        gobtn.setText("Go");
        gobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gobtnActionPerformed(evt);
            }
        });

        resultList.setColumns(20);
        resultList.setRows(5);
        jScrollPane1.setViewportView(resultList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addComponent(searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(gobtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gobtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gobtnActionPerformed
        // TODO add your handling code here:
                //clear ot results 
        resultList.setText("");
        String catSearch = searchbox.getText();
        
        String result[]=search(catSearch);
        //print resuts
        if(result.length==0)
            resultList.setText("No products found to match that category");
        else{
            for (int i = 0 ; i < result.length; i++){
                resultList.append(result[i]+ "\n"); // .append addts to a textarea
            }
        }
    }//GEN-LAST:event_gobtnActionPerformed

    private void searchboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchboxActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_searchboxActionPerformed

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
            java.util.logging.Logger.getLogger(Search2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton gobtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea resultList;
    private javax.swing.JTextField searchbox;
    // End of variables declaration//GEN-END:variables
}
