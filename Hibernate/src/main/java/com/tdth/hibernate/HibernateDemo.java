/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.tdth.hibernate;

import com.tdth.pojo.Category;
import com.tdth.pojo.Product;
import com.tdth.repositories.impl.CategoryRepositoryImpl;
import com.tdth.repositories.impl.ProductRepositoryImpl;
import com.tdth.repositories.impl.StatsRepositoryImpl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author admin
 */
public class HibernateDemo {

    public static void main(String[] args) {
        CategoryRepositoryImpl cateRepo = new CategoryRepositoryImpl();
//        List<Category> categories = cateRepo.getCates();
//        categories.forEach(c->System.out.println(c.getName()));

        ProductRepositoryImpl s = new ProductRepositoryImpl();
//        
//        Map<String, String> params= new HashMap<>();
//        params.put("page","2");
//        params.put("orderBy", "price");
//        s.getProducts(params).forEach(p->System.out.printf("%s - %f \n",p.getName(),p.getPrice()));
//           
//
//           Product p = new Product();
//           p.setName("ABC");
//           p.setPrice(123l);
//           p.setCategoryId(cateRepo.getCategoryById(1));
//           
//           s.addOrUpdate(p);
        StatsRepositoryImpl s3 = new StatsRepositoryImpl();
        s3.getRevenueByProduct().forEach(o->System.out.printf("%d - %s: %d\n",o[0],o[1],o[2]));
    }
}
