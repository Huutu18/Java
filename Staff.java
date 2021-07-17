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
public class Staff extends Officers{
    private String work;

    public Staff() {
    }

    public Staff(String name, int age, String sex, String address,String work) {
        super(name, age, sex, address);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }
    
}
