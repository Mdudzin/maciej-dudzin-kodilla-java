package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product mleko = new Product("Mleko");
        Product chleb = new Product("Chleb");

        Item pozycja1 = new Item(mleko, new BigDecimal(10), 1, new BigDecimal(10));
        Item pozycja2 = new Item(chleb, new BigDecimal(15), 2, new BigDecimal(30));

        Invoice faktura = new Invoice("IV/176/2017");

        faktura.getItems().add(pozycja1);
        faktura.getItems().add(pozycja2);

        pozycja1.setInvoice(faktura);
        pozycja2.setInvoice(faktura);

        //When
        invoiceDao.save(faktura);
        int id = faktura.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        invoiceDao.delete(faktura);
    }
}