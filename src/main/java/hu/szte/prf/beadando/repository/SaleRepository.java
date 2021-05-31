package hu.szte.prf.beadando.repository;

import java.util.Date;
import java.util.List;

import hu.szte.prf.beadando.models.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Integer> {

    List<Sale> findAllByPurchasedate(Date date);
}
