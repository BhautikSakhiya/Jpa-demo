package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("org.example.Master");
        EntityManager manager = emf.createEntityManager();
//        manager.getTransaction().begin();
//        Master master = new Master();
//        master.setId(1);
//        master.setName("Earth");
//        master.setTech("Java");
//        Master master1 = new Master();
//        master1.setId(2);
//        master1.setName("Marsh");
//        master1.setTech("Go");
//
//        manager.persist(master);
//        manager.persist(master1);
//        System.out.println(master);
//        System.out.println(master1);
//        manager.getTransaction().commit();
        Master m = manager.find(Master.class,1);
        System.out.println(m);
    }
}