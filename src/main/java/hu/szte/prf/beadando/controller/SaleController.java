package hu.szte.prf.beadando.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hu.szte.prf.beadando.models.Sale;
import hu.szte.prf.beadando.services.SaleService;

@RestController
@RequestMapping
@CrossOrigin(origins = "*")
public class SaleController {
    SaleService saleService;
    
    @Autowired
    public SaleController(SaleService saleService) {
        this.saleService = saleService;
    }
    @PostMapping(path="/sale",consumes = "application/json")
    public String newSale(@RequestBody Sale sale){
        try{
            this.saleService.addSale(sale);
            return "Successfuly added sale";
        }
        catch(Exception e){
            System.out.println(e);
            return "Error while adding sale";
        }
    }
    
    @GetMapping("/sales")
    public List<Sale> getAllSale() {
        try {
            return this.saleService.getAllSales();
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    @GetMapping("/sale")
    public Sale getSaleById(@RequestParam int id) {
        try {
            return this.saleService.getSaleById(id);
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    @DeleteMapping("/sale")
    public String deleteSaleById(@RequestParam int id) {
        try {
            this.saleService.deleteSaleById(id);
            return "Delete Successful";
        } catch (Exception e) {
            System.out.println(e);
            return "Error during deletion";
        }
    }
}
