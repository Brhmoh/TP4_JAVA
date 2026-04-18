package tp4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimulateurCommande extends JFrame {
    private JTextField txtArticle, txtPrix, txtQuantite;
    private JCheckBox chkFidele;
    private JComboBox<String> cbLivraison;
    private JLabel lblResultat;

    
    
    public SimulateurCommande() {
        setTitle("Mini simulateur de commande");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(8, 2, 5, 5));

        
        
        
        
        add(new JLabel(" Article :"));
        txtArticle = new JTextField(); add(txtArticle);

        add(new JLabel(" Prix unitaire (DA) :"));
        txtPrix = new JTextField(); add(txtPrix);

        add(new JLabel(" Quantité :"));
        txtQuantite = new JTextField(); add(txtQuantite);

        add(new JLabel(" Client fidèle (-10%) :"));
        chkFidele = new JCheckBox(); add(chkFidele);

        add(new JLabel(" Livraison :"));
        String[] options = {"Standard", "Express"};
        cbLivraison = new JComboBox<>(options); add(cbLivraison);

        JButton btnCalculer = new JButton("Calculer");
        JButton btnVider = new JButton("Vider");
        add(btnCalculer); add(btnVider);

        add(new JLabel(" TOTAL :"));
        lblResultat = new JLabel("0.00 DA");
        lblResultat.setForeground(Color.BLUE);
        lblResultat.setFont(new Font("Arial", Font.BOLD, 14));
        add(lblResultat);


        btnCalculer.addActionListener(e -> calculer());


        btnVider.addActionListener(e -> {
            txtArticle.setText("");
            txtPrix.setText("");
            txtQuantite.setText("");
            chkFidele.setSelected(false);
            cbLivraison.setSelectedIndex(0);
            lblResultat.setText("0.00 DA");
        });
    }

    private void calculer() {
        try {
            String article = txtArticle.getText().trim();
            if (article.isEmpty()) throw new Exception("Le nom de l'article est vide.");

            double prix = Double.parseDouble(txtPrix.getText());
            int qte = Integer.parseInt(txtQuantite.getText());

            if (prix < 0 || qte < 0) throw new Exception("Prix ou quantité négative.");

            double total = prix * qte;
            if (chkFidele.isSelected()) total *= 0.9;

            if (cbLivraison.getSelectedItem().equals("Express")) total += 300;

            lblResultat.setText(String.format("%.2f DA", total));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Veuillez saisir des nombres valides !", "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SimulateurCommande().setVisible(true));
    }
}
