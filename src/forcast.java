
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
public class forcast {
         DefaultTableModel Table13 = new javax.swing.table.DefaultTableModel(
    new Object [][] {

    },
    new String [] {
         "ID", "NAME","TYPE", "FORECAST HARVEST ", "DATE" 
    }
) {
    boolean[] canEdit = new boolean [] {
        false, false, false, false
    };

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
    }
};
  
    
}
