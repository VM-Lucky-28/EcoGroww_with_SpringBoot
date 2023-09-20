package com.example.Buyer.service;

import com.example.Buyer.entity.Buyer;
import com.example.Buyer.repository.BuyerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class BuyerServiceImpl implements BuyerService{
    @Autowired
    private BuyerRepository buyerRepository;

    @Override
    public Buyer postData(Buyer buyer) {
        return buyerRepository.save(buyer);
    }

    @Override
    public List<Buyer> getDetails() {
        return buyerRepository.findAll();
    }

    @Override
    public Buyer update(Buyer buyer) {
        return buyerRepository.save(buyer);
    }

    @Override
    public void delete(Integer id) {
        buyerRepository.deleteById(id);
    }
}
