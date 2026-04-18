package tp4;
import javax.swing.*;
import java.awt.*;

public class StockView extends JFrame {
    public JTextField txtQte = new JTextField(5);
    public JButton btnAjouter = new JButton("Ajouter");
    public JButton btnRetirer = new JButton("Retirer");
    public JButton btnReset = new JButton("Réinitialiser");
    public JLabel lblStock = new JLabel("20");
    public JLabel lblMessage = new JLabel("Prêt");

    public StockView() {
        setTitle("Gestion de Stock (MVC)");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 1, 10, 10));

        JPanel p1 = new JPanel(); p1.add(new JLabel("Stock actuel : ")); p1.add(lblStock);
        JPanel p2 = new JPanel(); p2.add(new JLabel("Quantité : ")); p2.add(txtQte);
        JPanel p3 = new JPanel(); p3.add(btnAjouter); p3.add(btnRetirer); p3.add(btnReset);
        
        add(new JLabel("Gestion de Stock", SwingConstants.CENTER));
        add(p1); add(p2); add(p3); add(lblMessage);
    }

    public void updateView(int stock, String msg, Color color) {
        lblStock.setText(String.valueOf(stock));
        lblMessage.setText(msg);
        lblMessage.setForeground(color);
    }
}
