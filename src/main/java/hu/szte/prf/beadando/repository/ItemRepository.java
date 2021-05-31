package hu.szte.prf.beadando.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import hu.szte.prf.beadando.models.Item;

public interface ItemRepository extends JpaRepository<Item,Integer>{
    
}
