package com.sheng.mvntest;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by shengxingyue on 2017/10/14.
 */
public class HelloWorldTest {

    @Test
    public void testSayHello() {
        assertEquals("hello world", new HelloWorld().sayHello());
    }
}
