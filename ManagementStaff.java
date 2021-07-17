/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NhanSU;

import java.util.ArrayList;
import java.util.List;
import jdk.nashorn.internal.ir.BreakNode;

/**
 *
 * @author Admin
 */
public class ManagementStaff {
    ArrayList<Officers> of;

    public ManagementStaff() {
        of = new ArrayList<Officers>();
    }

    public void add(Officers officers){
        this.of.add(officers);
    }
    public void search(String a){
        boolean temp = false;
        for (int i = 0; i < of.size() ; i++) {
            if(a.compareToIgnoreCase(of.get(i).getName())==0){
                System.out.println("Officers "+ i + of.get(i));
                temp = true;
            }
        }
        if ( temp == false) {
            System.out.println("Error! Not Found Officers You Search");
        }
    }
    public void display(){
        for (int i = 0; i < of.size() ; i++) {
            System.out.println("Officers"+ i + of.get(i));
        }
    }
}
