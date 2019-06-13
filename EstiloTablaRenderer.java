package principal;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;


public class EstiloTablaRenderer extends DefaultTableCellRenderer{
    private Component componenete;

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        componenete = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.       
        this.setHorizontalAlignment(0);
        this.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
                                                                     //0, 0, 1, 1
        if(row%2 == 0){
            componenete.setForeground(Color.BLACK);
            componenete.setBackground(new Color(255, 109, 0));
        }else{
            componenete.setForeground(Color.BLACK);
            componenete.setBackground(Color.WHITE);
        }
        if(isSelected){
            componenete.setForeground(Color.WHITE);
            componenete.setBackground(new Color(104, 177, 67));
        }
        return componenete;
        //(28, 134, 238));
    }
    
    
}
