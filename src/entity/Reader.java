/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author user
 */
public class Reader {
    private String name;
    private String number;
    
    public Reader() {
        
    }
    
    public Reader (String name, String number) {
       this.name = name;
       this.number = number;
    }


    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Reader{" 
                + "name=" + name 
                + ", number=" + number 
                + '}';
    }

    
    
    
}

