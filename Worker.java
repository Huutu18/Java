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
public class Worker extends Officers{
    private int level;

    public Worker() {
    }

    public Worker(String name, int age, String sex, String address,int level) {
        super(name, age, sex, address);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return super.toString()+ "," + level;
    }
    
}
