/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.test;

import com.mx.hibernate.model.Employes;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author karlo
 */
public class testEmployes {
    private static EntityManager manager;
    
    private static EntityManagerFactory emf;
    
    public static void main(String[] args) {
        emf = Persistence.createEntityManagerFactory("persistencia");
        
        manager = emf.createEntityManager();
        
        List<Employes> empleados = (List<Employes>) manager.createQuery("FROM Employes").getResultList();
//        
        System.err.println("Hay "+ empleados.size() + " Empleados");
        
    }
}
