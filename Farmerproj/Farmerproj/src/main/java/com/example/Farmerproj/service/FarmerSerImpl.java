package com.example.Farmerproj.service;

import com.example.Farmerproj.entity.Farmer;
import com.example.Farmerproj.repository.FarmerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service

public class FarmerSerImpl implements FarmerService{
    @Autowired
    private FarmerRepo farmerRepo;

    @Override
    public Farmer postData(Farmer farmer) {
        return farmerRepo.save(farmer);
    }

    @Override
    public List<Farmer> getData(Farmer farmer) {
        return farmerRepo.findAll();
    }

    @Override
    public Farmer update(Farmer farmer) {
        return farmerRepo.save(farmer);
    }

    @Override
    public void delete(Integer id) {
        farmerRepo.deleteById(id);

    }
}
