package hu.szte.prf.beadando.services;
import java.util.List;

import hu.szte.prf.beadando.models.Sale;

public interface SaleService {

    void addSale(Sale sale);
    List<Sale> getAllSales();
    Sale getSaleById(int id);
    void deleteSaleById(int id);
}
