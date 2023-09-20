package com.example.Farmerproj.service;

import com.example.Farmerproj.entity.Farmer;

import java.util.List;

public interface FarmerService {
    public Farmer postData(Farmer farmer);
    public List<Farmer> getData(Farmer farmer);
    public Farmer update(Farmer farmer);
    public void delete(Integer id);
}
