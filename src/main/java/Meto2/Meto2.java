
package Meto2;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Meto2 {
    
        public void mostrarMensaje(String mensaje, String titulo, String tipo) {
        if (tipo.equals("Info")) {
            JOptionPane op = new JOptionPane(mensaje);
            op.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = op.createDialog(titulo);
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
        }
        if (tipo.equals("Falla")) {
            JOptionPane op = new JOptionPane(mensaje);
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            JDialog dialog = op.createDialog(titulo);
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);

        }
        if (tipo.equals("Nada")) {
            JOptionPane op = new JOptionPane(mensaje);
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            JDialog dialog = op.createDialog(titulo);
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);

        }
    }
    
}
