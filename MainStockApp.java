package tp4;

public class MainStockApp {
	
	
	
    public static void main(String[] args) {
    	
    	
        StockModel model = new StockModel();
        StockView view = new StockView();
        new StockController(model, view);
        view.setVisible(true);
    }
}
