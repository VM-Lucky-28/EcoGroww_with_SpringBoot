package com.example.Buyer.container;

import com.example.Buyer.entity.Buyer;
import com.example.Buyer.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class BuyerController {
    @Autowired
    private BuyerService buyerService;
    @PostMapping("/postData")
    public Buyer postData(@RequestBody Buyer buyer){
        return buyerService.postData(buyer);
    }
    @GetMapping("/getData")
    public List<Buyer> getDetails(@RequestBody Buyer buyer){
        return buyerService.getDetails();
    }
    @PutMapping("/update")
    public Buyer update(@RequestBody Buyer buyer){
        return buyerService.update(buyer);

    }
    @DeleteMapping("/delete{id}")
    public void delete(@PathVariable("id")Integer id,@RequestBody Buyer buyer){
         buyerService.delete(id);
    }



}
