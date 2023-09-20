package com.example.Buyer.service;

import com.example.Buyer.entity.Buyer;

import java.util.List;

public interface BuyerService {
    public Buyer postData(Buyer buyer);
    public List<Buyer> getDetails();
    public Buyer update(Buyer buyer);
    public void delete(Integer id);
}
