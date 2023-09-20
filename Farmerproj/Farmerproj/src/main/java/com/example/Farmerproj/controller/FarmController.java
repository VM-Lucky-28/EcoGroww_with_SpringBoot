package com.example.Farmerproj.controller;

import com.example.Farmerproj.entity.Farmer;
import com.example.Farmerproj.repository.FarmerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class FarmController {
    @Autowired
    private FarmerRepo farmerRepo;
    @PostMapping("/postData")
    public Farmer postData(@RequestBody Farmer farmer){
        return farmerRepo.save(farmer);
    }
    @GetMapping("/getData")
    public List<Farmer> getData(@RequestBody Farmer farmer){
        return farmerRepo.findAll();
    }
    @PutMapping("/update")
    public Farmer update(@RequestBody Farmer farmer){
        return farmerRepo.save(farmer);
    }
    @DeleteMapping("/delete")
    public void delete(@PathVariable("id") Integer id,@RequestBody Farmer farmer){
        farmerRepo.deleteById(id);
    }
}
