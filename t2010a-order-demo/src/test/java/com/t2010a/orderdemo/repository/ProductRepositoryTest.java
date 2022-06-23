package com.t2010a.orderdemo.repository;

import com.t2010a.orderdemo.T2010aOrderDemoApplication;
import com.t2010a.orderdemo.config.H2JpaConfig;
import com.t2010a.orderdemo.entity.Product;
import com.t2010a.orderdemo.entity.enums.ProductSimpleStatus;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {T2010aOrderDemoApplication.class, H2JpaConfig.class})
@ActiveProfiles("test")
public class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void save() {
        Product product = new Product();
        product.setName("Product 01");
        product.setDescription("Helo");
        product.setPrice(new BigDecimal(20));
        product.setSlug("hello-product");
        product.setStatus(ProductSimpleStatus.ACTIVE);
//        product.setProductStatus(ProductStatus.ACTIVE);
        productRepository.save(product);
        System.out.println(productRepository.findAll().size());
        Product product1 = productRepository.findAll().get(0);
        System.out.println(product1.toString());
    }
}