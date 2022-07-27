/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini.payroll.system;
//updated
/**
 *
 * @author Reem
 */
public class Grade {
private String position;
private float taxRate;
private  int payRate;

    public Grade(String position, float taxRate, int payRate) {
        this.position = position;
        this.taxRate = taxRate;
        this.payRate = payRate;
    }

    public String getPosition() {
        return position;
    }

    public float getTaxRate() {
        return taxRate;
    }

    public int getPayRate() {
        return payRate;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setTaxRate(int taxRate) {
        this.taxRate = taxRate;
    }

    public void setPayRate(int payRate) {
        this.payRate = payRate;
    }
    
    
}
