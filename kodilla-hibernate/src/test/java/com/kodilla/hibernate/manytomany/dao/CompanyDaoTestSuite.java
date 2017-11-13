package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testNamedQueriesEmployee() {
        //Given//
        Employee maciejDudzin = new Employee("Maciej", "Dudzin");
        Employee agataMioduszewska = new Employee("Agata", "Mioduszewska");
        Employee filipLubos = new Employee("Filip", "Lubos");

        employeeDao.save(maciejDudzin);
        int maciejDudzinId = maciejDudzin.getId();
        employeeDao.save(agataMioduszewska);
        int agataMioduszewskaId = agataMioduszewska.getId();
        employeeDao.save(filipLubos);
        int filipLubosId = filipLubos.getId();

        //When//
        List<Employee> result1 = employeeDao.findByLastName("Dudzin");
        List<Employee> result2 = employeeDao.findByLastName("Mioduszewska");
        List<Employee> result3 = employeeDao.findByLastName("Lubos");

        //Then//
        Assert.assertEquals(1, result1.size());
        Assert.assertEquals(1, result2.size());
        Assert.assertEquals(1, result3.size());

        //CleanUp//
        try {
            employeeDao.delete(maciejDudzinId);
            employeeDao.delete(agataMioduszewskaId);
            employeeDao.delete(filipLubosId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testNamedQueriesCompany() {
        //Given//
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        List<Company> result1 = companyDao.findByFirstLetters("Sof");
        List<Company> result2 = companyDao.findByFirstLetters("Dat");
        List<Company> result3 = companyDao.findByFirstLetters("Gre");

        //Then//
        Assert.assertEquals(1, result1.size());
        Assert.assertEquals(1, result2.size());
        Assert.assertEquals(1, result3.size());

        //CleanUp//
        try {
            companyDao.delete(softwareMachineId);
            companyDao.delete(dataMaestersId);
            companyDao.delete(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.delete(softwareMachineId);
            companyDao.delete(dataMaestersId);
            companyDao.delete(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }
}