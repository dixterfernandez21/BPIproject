
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dixter
 */
public class harvest {

    static void setModel(JPanel addharvest) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     DefaultTableModel table2 = new javax.swing.table.DefaultTableModel(
    new Object [][] {

    },
    new String [] {
         "ID", "Name", "Quantity", "Type", "Price", "Date" 
    }
) {
    boolean[] canEdit = new boolean [] {
        false, false, false, false, false
    };

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
    }
};
    DefaultTableModel addharvest;
    
}
