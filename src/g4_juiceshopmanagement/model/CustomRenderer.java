/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4_juiceshopmanagement.model;

import g4_juiceshopmanagement.view.PurchaseFrm;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListCellRenderer;

/**
 *
 * @author ahuy96
 */
public class CustomRenderer extends DefaultListCellRenderer implements ListCellRenderer<Object> {

    @Override
    public Component getListCellRendererComponent(JList<?> list, Object object, int index, boolean isSelected, boolean hasFocus) {
//        MenuItem menuItem = (MenuItem) object;
        Product menuItem = (Product) object;
        setText(menuItem.getName() + " " + menuItem.getCategory().getName());
        setIcon(menuItem.getImg());
        setIconTextGap(10);
        if (isSelected) {
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
//            JOptionPane.showMessageDialog(pf, menuItem.getName());
        } else {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }

        setEnabled(true);
        setFont(list.getFont());
        return this;
    }

//    public String getString(JList<?> list, Object object, int index, boolean isSelected, boolean hasFocus) {
//        MenuItem menuItem = (MenuItem) object;
//        setText(menuItem.getName());
//        setIcon(menuItem.getImage());
//        setIconTextGap(10);
//        if (isSelected) {
//            return menuItem.getName();
//        }
//        return null;
//    }
}
