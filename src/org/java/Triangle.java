/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.java;

import java.util.Properties;

/**
 *
 * @author Hardik
 */
public class Triangle {

    private Properties prop;

    public Properties getProp() {
        return prop;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
    }

    public void display() {

        for (Object key : getProp().keySet()) {

            System.out.print("Key :" + key);
            System.out.println("\tValue :" + getProp().getProperty(key.toString()));
        }

    }
}
