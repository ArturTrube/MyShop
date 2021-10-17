/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myshop;

import entity.Producer;
import entity.Product;
import entity.History;
import entity.Buyer;
import java.util.Calendar;
import java.util.GregorianCalendar;


/**
 *
 * @author user
 */
public class App {
    public void run(){
        System.out.println("Hello!");
        Product product = new Product();
        product.setProductName("airforce");
        product.setReleaseYear(45);
        Producer[] producers = new Producer [1];
        Producer producer = new Producer ();
        producer.setFirstName("nike");
        producer.setLastName("");
        producer.setBirthYear(1842);
        producers[0] = producer;
        product.setProducer(producers);
        System.out.printf("Добавлен новый продукт: %s, Производитель: %s %s, Год выпуска: %d%n",
                product.getProductName(),
                product.getProducer()[0].getFirstName(),
                product.getProducer()[0].getLastName(),
                product.getReleaseYear()
        );
    Buyer buyer = new Buyer();
    buyer.setFirstName("alex");
    buyer.setLastName("messi");
    buyer.setPhone(4714717);
        System.out.printf("Добавлен новый покупатель: %s %s, с номером телефона: %d%n",
                buyer.getFirstName(),
                buyer.getLastName(),
                buyer.getPhone()
        );
        History history = new History();
        history.setProduct(product);
        history.setBuyer(buyer);
        Calendar c = new GregorianCalendar();
        history.setProductsold(c.getTime());
        System.out.printf("Покупатель: %s %s,Купил товар С названием: %s, %s%n",
                history.getBuyer().getFirstName(),
                history.getBuyer().getLastName(),
                history.getProduct().getProductName(),
                history.getProductsold()
        );
    }
}

