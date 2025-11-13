package com.eniso;

import com.eniso.hello_world.service.CalculatorService;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Houssem
 */
//hhhhhh
public class SubtractionTest {
//hhhhhh
    CalculatorService service = new CalculatorService();
//hhhhhh
    @Test
    public void Test() {
        assertEquals("0.0", service.subtraction(1, 1));
        assertEquals("199.0", service.subtraction(200, 1));
    }

}
