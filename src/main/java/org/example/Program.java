package org.example;


import org.example.model.dao.DaoFactory;
import org.example.model.dao.SellerDao;
import org.example.model.entities.Department;
import org.example.model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Department obj= new Department(1, "Books");

        Seller seller = new Seller(21, "Bob", "bob@email.com", new Date(), 3000.0, obj);
        System.out.println(seller);
        SellerDao sellerDao = DaoFactory.createSellerDao();
    }
}
