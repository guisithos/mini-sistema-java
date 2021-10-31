/**
 * Classe para entrada de String, int e double
 * e exibição de saída como texto
 * 
 * @author (Alfamidia) 
 * @version (1.0)
 */
import javax.swing.*;

public class EntradaSaida
{
    public static String receberString(String msg) {
        String txt;
        txt = JOptionPane.showInputDialog(msg);
        return txt;
    }
    
    public static int receberInt(String msg) {
        String snro;
        int inro;
        snro = JOptionPane.showInputDialog(msg);
        inro = Integer.parseInt(snro);
        return inro;
    }
    
    public static double receberDouble(String msg) {
        String snro;
        double dnro;
        snro = JOptionPane.showInputDialog(msg);
        dnro = Double.parseDouble(snro);
        return dnro;
    }
    
    public static void mostrarTexto(String txt) {
        JOptionPane.showMessageDialog(null, txt);
    }
}