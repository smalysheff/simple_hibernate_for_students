package ru.sapteh.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ru.sapteh.dao.Dao;
import ru.sapteh.model.Employee;

import java.util.List;

public class EmployeeDaoImpl implements Dao<Employee, Integer> {

    private final SessionFactory factory;

    public EmployeeDaoImpl(SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public Employee findById(Integer id) {
        try(Session session = factory.openSession()) {
            return session.get(Employee.class, id) ;
        }
    }

    @Override
    public List<Employee> findAll() {
        try(Session session = factory.openSession()) {
            return session.createQuery("from Employee ", Employee.class).list();
        }
    }

    @Override
    public void sava(Employee employee) {

    }

    @Override
    public void update(Employee employee) {

    }

    @Override
    public void deleteById(Integer integer) {

    }
}
