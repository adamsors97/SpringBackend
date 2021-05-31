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

import hu.szte.prf.beadando.models.Item;
import hu.szte.prf.beadando.services.ItemService;

@RestController
@RequestMapping
@CrossOrigin(origins = "*")
public class ItemController {
    
    ItemService itemService;
    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }
    @PostMapping(path="/item",consumes = "application/json")
    public String newItem(@RequestBody Item item){
        try{
            this.itemService.addItem(item);
            return "Successfuly added item";
        }
        catch(Exception e){
            System.out.println(e);
            return "Error while adding item";
        }
    }
    
    @GetMapping("/items")
    public List<Item> getAllItem() {
        try {
            return this.itemService.getAllItems();
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    @GetMapping("/item")
    public Item getItemById(@RequestParam int id) {
        try {
            return this.itemService.getItemById(id);
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    @DeleteMapping("/item")
    public String deleteItemById(@RequestParam int id) {
        try {
            this.itemService.deleteItemById(id);
            return "Delete Successful";
        } catch (Exception e) {
            System.out.println(e);
            return "Error during deletion";
        }
    }
}
