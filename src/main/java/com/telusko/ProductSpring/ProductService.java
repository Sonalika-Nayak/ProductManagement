package com.telusko.ProductSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ProductService {
    @Autowired
    ProductDB db;
//    public void  show(){
//        System.out.println("in show");
//    }
//
//
////      List<Product> products = new ArrayList<>();
//      ProductDB db = new ProductDB();


//    public void addProduct(Product p){
// //       products.add(p);
//       db.save(p);
//    }
//    public List<Product>getAllProducts(){
//        return db.findAll();
//    }
//    ///Here we create a method for listing the products///
    public List<Product> getAllProducts(){
        return db.findAll();
    }
//    public Product getProduct(String place){
//        for(Product x :products){
//            if(x.getPlace().equals(place))
//                return x;
//        }
//        return null;
//    }
//    public List<Product> getProductWithText(String text) {
//        String str =text.toLowerCase();
//        List<Product> prods = new ArrayList<>();
//
//        for(Product p : products){
//            String name = p.getName().toLowerCase();
//            String type = p.getType().toLowerCase();
//            String place = p.getPlace().toLowerCase();
//
//            if(name.contains(text)||type.contains(text)||place.contains(text))
//                prods.add(p);
//        }
//        return prods;
    }
