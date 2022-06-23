package com.t2010a.orderdemo.entity;

import com.t2010a.orderdemo.entity.enums.ProductStatus;
import org.junit.jupiter.api.Test;

class ProductTest {
    @Test
    public void checkProductStatus(){
        System.out.println(ProductStatus.of(-1));
    }
}