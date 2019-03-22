
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
public class report {
     DefaultTableModel report1 = new javax.swing.table.DefaultTableModel(
    new Object [][] {

    },
    new String [] {
         "ID", "Name", "Problem", "Solution", "Quantity", "Type", "Date" 
    }
) {
    boolean[] canEdit = new boolean [] {
        false, false, false, false, false, false, false
    };

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
    }
};
    
}
