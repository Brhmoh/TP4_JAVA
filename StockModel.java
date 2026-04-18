package tp4;

public class StockModel {
    private int stockCourant;
    private final int stockInitial = 20;
    private final int capaciteMax = 100;

    public StockModel() { this.stockCourant = stockInitial; }

    public void ajouter(int qte) throws Exception {
        if (qte <= 0) throw new Exception("Quantité doit être > 0");
        if (stockCourant + qte > capaciteMax) throw new Exception("Capacité max dépassée !");
        stockCourant += qte;
    }

    public void retirer(int qte) throws Exception {
        if (qte <= 0) throw new Exception("Quantité doit être > 0");
        if (stockCourant - qte < 0) throw new Exception("Stock insuffisant !");
        stockCourant -= qte;
    }

    public void reinitialiser() { this.stockCourant = stockInitial; }

    public int getStockCourant() { return stockCourant; }
}
