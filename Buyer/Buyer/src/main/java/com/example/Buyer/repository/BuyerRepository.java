package com.example.Buyer.repository;

import com.example.Buyer.entity.Buyer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuyerRepository extends JpaRepository<Buyer,Integer> {
}
