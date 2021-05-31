package hu.szte.prf.beadando.services;
import java.util.List;

import org.springframework.stereotype.Service;

import hu.szte.prf.beadando.models.Sale;
import hu.szte.prf.beadando.repository.SaleRepository;

@Service
public class SaleServiceImpl implements SaleService {

    SaleRepository saleRepository;
    public SaleServiceImpl(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }
    @Override
    public void addSale(Sale sale) {
        this.saleRepository.save(sale);        
    }


    @Override
    public List<Sale> getAllSales() {
        return this.saleRepository.findAll();
    }

    @Override
    public Sale getSaleById(int id) {
        return this.saleRepository.findById(id).get();
    }

    @Override
    public void deleteSaleById(int id) {
        this.saleRepository.deleteById(id);        
    }
    
}
