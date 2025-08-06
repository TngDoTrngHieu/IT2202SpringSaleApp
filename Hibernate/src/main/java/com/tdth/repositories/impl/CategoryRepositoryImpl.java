/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tdth.repositories.impl;
import com.tdth.hibernate.HibernateUtils;
import com.tdth.pojo.Category;
import jakarta.persistence.Query;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.Session;
/**
 *
 * @author admin
 */
public class CategoryRepositoryImpl {
    public List<Category> getCates(){
        try (Session s = HibernateUtils.getFACTORY().openSession()){
            Query q=s.createQuery("From Category",Category.class);
            return q.getResultList();
        }
    }
    
    public Category getCategoryById(int id ){
        try (Session s = HibernateUtils.getFACTORY().openSession()){
            return s.find(Category.class, id);
        }
    }
}
