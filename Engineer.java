/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NhanSU;

/**
 *
 * @author Admin
 */
public class Engineer extends Officers{
    private String specialized;

    public Engineer() {
    }

    public Engineer(String name, int age, String sex, String address,String specialized) {
        super(name, age, sex, address);
        this.specialized = specialized;
    }

    public String getSpecialized() {
        return specialized;
    }

    public void setSpecialized(String specialized) {
        this.specialized = specialized;
    }

    @Override
    public String toString() {
        return super.toString()+ "," + specialized;
    }
    
}
