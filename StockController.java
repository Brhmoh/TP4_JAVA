package tp4;
import java.awt.Color;

public class StockController {
    private StockModel model;
    private StockView view;

    public StockController(StockModel model, StockView view) {
        this.model = model;
        this.view = view;

        this.view.btnAjouter.addActionListener(e -> gererAction("ajouter"));
        this.view.btnRetirer.addActionListener(e -> gererAction("retirer"));
        this.view.btnReset.addActionListener(e -> {
            model.reinitialiser();
            view.updateView(model.getStockCourant(), "Stock réinitialisé", Color.BLUE);
        });
    }

    private void gererAction(String type) {
        try {
            int qte = Integer.parseInt(view.txtQte.getText());
            if (type.equals("ajouter")) model.ajouter(qte);
            else model.retirer(qte);
            view.updateView(model.getStockCourant(), "Opération réussie", Color.GREEN);
        } catch (NumberFormatException ex) {
            view.updateView(model.getStockCourant(), "Erreur: Saisissez un nombre", Color.RED);
        } catch (Exception ex) {
            view.updateView(model.getStockCourant(), "Erreur: " + ex.getMessage(), Color.RED);
        }
    }
}
