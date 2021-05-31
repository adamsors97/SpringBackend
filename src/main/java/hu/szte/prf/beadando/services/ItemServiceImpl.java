package hu.szte.prf.beadando.services;

import java.util.List;

import org.springframework.stereotype.Service;

import hu.szte.prf.beadando.models.Item;
import hu.szte.prf.beadando.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService{

    ItemRepository itemRepository;
    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }
    @Override
    public void addItem(Item item) {
        this.itemRepository.save(item);        
    }


    @Override
    public List<Item> getAllItems() {
        return this.itemRepository.findAll();
    }

    @Override
    public Item getItemById(int id) {
        return this.itemRepository.findById(id).get();
    }

    @Override
    public void deleteItemById(int id) {
        this.itemRepository.deleteById(id);        
    }
    
}
