/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ofrick.myalert;

import com.ofrick.myalert.Greeter;
import static org.hamcrest.CoreMatchers.containsString;
import org.hamcrest.MatcherAssert;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 *
 * @author oliver
 */
public class GreeterTest {
    private Greeter greeter = new Greeter();
    
    @Test
    public void greeterSaysHello() {
        assertThat(greeter.sayHello(), containsString("Hello"));
    }
}
