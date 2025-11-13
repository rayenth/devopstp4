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
public class MultiplicationTest {
//hhhhhh
    CalculatorService service = new CalculatorService();

    @Test//hhhhhh
    public void Test() {
        assertEquals("1.0", service.multiplication(1, 1));
        assertEquals("300.0", service.multiplication(150, 2));
    }

}
