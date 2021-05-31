package hu.szte.prf.beadando.services;

import java.util.List;

import hu.szte.prf.beadando.models.Item;

public interface ItemService {
    void addItem(Item item);
    List<Item> getAllItems();
    Item getItemById(int id);
    void deleteItemById(int id);
}
