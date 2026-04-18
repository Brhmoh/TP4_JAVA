package tp4; 

import javax.swing.*; 
import java.awt.*;    

public class InscriptionAtelier extends JFrame {
	
    private static final long serialVersionUID = 1L; 


    public InscriptionAtelier() {
        
    	
    	
        setTitle("Inscription à un atelier");
        setSize(450, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        setLayout(new BorderLayout(10, 10));

       
        JLabel lblTitre = new JLabel("Inscription à un atelier", SwingConstants.CENTER);
        lblTitre.setFont(new Font("Arial", Font.BOLD, 18));
        add(lblTitre, BorderLayout.NORTH);

        
        JPanel pnlForm = new JPanel(new GridLayout(5, 2, 10, 10));
        pnlForm.setBorder(BorderFactory.createTitledBorder("Informations Personnelles"));

        pnlForm.add(new JLabel(" Nom :"));
        pnlForm.add(new JTextField());
        pnlForm.add(new JLabel(" Prénom :"));
        pnlForm.add(new JTextField());
        pnlForm.add(new JLabel(" Email :"));
        pnlForm.add(new JTextField());
        pnlForm.add(new JLabel(" Niveau :"));
        String[] niveaux = {"L1", "L2", "L3", "M1", "M2"};
        pnlForm.add(new JComboBox<>(niveaux));
        pnlForm.add(new JLabel(" Spécialité :"));
        pnlForm.add(new JTextField());

        
        JPanel pnlBas = new JPanel();
        pnlBas.setLayout(new BoxLayout(pnlBas, BoxLayout.Y_AXIS));
        
      
        JPanel pnlModules = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pnlModules.setBorder(BorderFactory.createTitledBorder("Modules souhaités"));
        pnlModules.add(new JCheckBox("Java"));
        pnlModules.add(new JCheckBox("Web"));
        pnlModules.add(new JCheckBox("IA"));
        pnlBas.add(pnlModules);

      
        JPanel pnlCom = new JPanel(new BorderLayout());
        pnlCom.setBorder(BorderFactory.createTitledBorder("Commentaire"));
        JTextArea area = new JTextArea(4, 20);
        pnlCom.add(new JScrollPane(area), BorderLayout.CENTER);
        pnlBas.add(pnlCom);

        JPanel pnlCentral = new JPanel(new BorderLayout());
        pnlCentral.add(pnlForm, BorderLayout.NORTH);
        pnlCentral.add(pnlBas, BorderLayout.CENTER);
        add(pnlCentral, BorderLayout.CENTER);

        JPanel pnlBoutons = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        pnlBoutons.add(new JButton("Enregistrer"));
        pnlBoutons.add(new JButton("Annuler"));
        add(pnlBoutons, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new InscriptionAtelier().setVisible(true);
        });
    }
}
