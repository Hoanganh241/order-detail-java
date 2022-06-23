package com.t2010a.orderdemo.util;

import org.junit.jupiter.api.Test;

class StringHelperTest {
    @Test
    public void testSlug(){
        System.out.println(StringHelper.toSlug("Welcome to Vietnam"));
    }
}