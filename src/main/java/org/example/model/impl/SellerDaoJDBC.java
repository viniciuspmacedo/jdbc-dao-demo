package org.example.model.impl;

import org.example.model.dao.SellerDao;
import org.example.model.entities.Seller;

import java.util.List;

public class SellerDaoJDBC implements SellerDao {
    @Override
    public void insert(Seller seller) {

    }

    @Override
    public void update(Seller seller) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Seller findById(Integer id) {
        return null;
    }

    @Override
    public List<Seller> findAll() {
        return List.of();
    }
}
