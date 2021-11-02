package ru.sapteh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.sapteh.dao.Dao;
import ru.sapteh.dao.impl.EmployeeDaoImpl;
import ru.sapteh.model.Employee;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Dao<Employee, Integer> employeeDao = new EmployeeDaoImpl(factory);

        //save test data
//        Employee employee = new Employee("John", "Konnor", 500);
//        Employee employee1 = new Employee("Sylvester", "Stallone", 500);
//        Employee employee2 = new Employee("Arnold", "Schwarzenegger", 500);
//        employeeDao.save(employee);
//        employeeDao.save(employee1);
//        employeeDao.save(employee2);

        //find by id
        System.out.println(employeeDao.findById(1));

        //find all
        System.out.println(employeeDao.findAll());

        //update
        Employee updated = employeeDao.findById(1);
        updated.setFirstName("Ivan");
        updated.setLastName("Ivanov");
        updated.setSalary(100);
        employeeDao.update(updated);

        //delete
        employeeDao.deleteById(employeeDao.findById(4));
    }
}
