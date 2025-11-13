/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.eniso.AdditionTest;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 *
 * @author Houssem
 */
//hhhhhh
public class TestRunner {


//hhhhhh
    public static void main(String[] args) {
        getTestResult(AdditionTest.class);
        
    }
    
    //hhhhhh
    public static void getTestResult(Class clazz){
        Result result = JUnitCore.runClasses(clazz);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
            
        }
        System.out.println(" Test result "+clazz.getName()+" "+result.wasSuccessful());
        
    }
}
