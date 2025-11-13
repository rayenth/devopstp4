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
public class DivisionTest {
//hhhhhh
    CalculatorService service = new CalculatorService();
//hhhhhh
    @Test
    public void Test() {
        assertEquals("50.0", service.division(150, 3));
        assertEquals("0.0", service.division(0, 1));
    }

}
