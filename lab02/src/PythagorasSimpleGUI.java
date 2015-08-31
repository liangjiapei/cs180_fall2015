/**
 * Created by liangjiapei on 8/31/15.
 */

import javax.swing.JOptionPane;

public class PythagorasSimpleGUI {
    public static void main(String[] args) {
        Pythagoras p = new Pythagoras();
        String side1 = JOptionPane.showInputDialog("Enter the length of side 'a'");
        String side2 = JOptionPane.showInputDialog("Enter the length of side 'b'");
        int side1_value = Integer.parseInt(side1);
        int side2_value = Integer.parseInt(side2);
        double hypotenuse = p.getHypotenuse(side1_value, side2_value);
        JOptionPane.showMessageDialog(null, "The hypotenuse is: " + hypotenuse);
    }
}
