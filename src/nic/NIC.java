/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nic;

import javax.swing.JOptionPane;

/**
 *
 * @author MERC-LAB-01
 */
public class NIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nicNo = JOptionPane.showInputDialog("NIC No");
        int nicNolength = nicNo.length();
        if (nicNolength == 10) {
            String vOrX = nicNo.substring(9, 10);
            if (vOrX.equals("x") || vOrX.equals("v")) {
                JOptionPane.showMessageDialog(null, "Correct");
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect");
        }

// TODO code application logic here
    }

}
