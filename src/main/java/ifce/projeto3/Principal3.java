/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ifce.projeto3;

import javax.swing.JOptionPane;
import modelo.Conversor;

/**
 *
 * @author kelvin
 */
public class Principal3 {

    public static void main(String[] args) {
        Conversor c1 = new Conversor();
        String real = JOptionPane.showInputDialog("Entre com a quant de Real:");
        String moeda = JOptionPane.showInputDialog("Entre com a moeda:");
        double r1 = Double.parseDouble(real);
       
        double res = c1.converter(r1, moeda);
        JOptionPane.showMessageDialog(null, res);
    }
}
