package com.emp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.util.Cloneable;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration().configure();
        SessionFactory sf=cfg.buildSessionFactory();
        Session sn=sf.openSession();
        Transaction tx=sn.beginTransaction();
        Employee emp=new Employee();
        emp.setId(1);
        emp.setName("vivek");
        emp.setSalary(45000.3);
        ArrayList<Employee> e=new ArrayList<Employee>();
        e.add(emp);
        
        HashSet<Employee> e1=new HashSet<Employee>();
        e1.add(emp);
        Department dep=new Department();
        dep.setId(401);
        dep.setName("Tech");
        dep.setEmp(e1);
        emp.setDep(dep);
        
        Project pro=new Project();
        pro.setPid(102);
        pro.setPro_name("E-commerce");
        
        ArrayList<Project> p1=new ArrayList<Project>();
        p1.add(pro);
        emp.setProjects(p1);
     
        pro.setEmp(e);
        
      
        
        sn.save(emp);
        sn.save(dep);
        sn.save(pro);
        tx.commit();
        sn.close();
        sf.close();
    }
}
