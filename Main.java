/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NhanSU;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        ManagementStaff managementStaff = new ManagementStaff();
        Scanner sc = new Scanner(System.in);
        do {            
            System.out.println("1.  Add New Officers");
            System.out.println("2.  Search Officers By Name");
            System.out.println("3.  Display information about the list of officers.");
            System.out.println("0.  Exit");
            System.out.print("Enter TC (0,1,2,3): ");
            int sum;
            sum = sc.nextInt();
            switch(sum){
                case 1:{
                    System.out.println("a.  Add Staff");
                    System.out.println("b.  Add Worker");
                    System.out.println("c.  Add Engineer");
                    System.out.print("Enter TC (a ,b ,c):");
                    String check;
                    check = sc.next();
                    switch(check){
                        case "a":{
                            String name , sex , addres , work;
                            int age;
                            System.out.print("Enter name:");
                            name = sc.next();
                            System.out.print("Enter age:");
                            age = sc.nextInt();
                            System.out.print("Enter sex:");
                            sex = sc.next();
                            System.out.print("Enter address:");
                            addres = sc.next();
                            System.out.print("Enter work:");
                            work = sc.next();
                            Officers staff = new Staff(name, age, sex, addres, work);
                            managementStaff.add(staff);
                            System.out.println(staff);
                            break;
                        }
                        case "b":{
                            String name , sex , addres;
                            int age, level;
                            System.out.print("Enter name:");
                            name = sc.next();
                            System.out.print("Enter age:");
                            age = sc.nextInt();
                            System.out.print("Enter sex:");
                            sex = sc.next();
                            System.out.print("Enter address:");
                            addres = sc.next();
                            System.out.print("Enter level:");
                            level = sc.nextInt();
                            Officers worker = new Worker(name, age, sex, addres,level);
                            managementStaff.add(worker);
                            System.out.println(worker);
                            break;
                        }
                        case "c":{
                            String name , sex , addres , specialized;
                            int age;
                            System.out.print("Enter name:");
                            name = sc.next();
                            System.out.print("Enter age:");
                            age = sc.nextInt();
                            System.out.print("Enter sex:");
                            sex = sc.next();
                            System.out.print("Enter address:");
                            addres = sc.next();
                            System.out.print("Enter specialized:");
                            specialized = sc.nextLine();
                            Officers engineer = new Engineer(name, age, sex, addres, specialized);
                            managementStaff.add(engineer);
                            System.out.println(engineer);
                            break;
                        }
                        default:{
                            System.out.println("Error");
                            break;
                        }
                    }
                    break;
                }
                case 2:{
                    String a;
                    System.out.print("Enter name you search :");
                    a = sc.next();
                    managementStaff.search(a);
                    break;
                }
                case 3:{
                    managementStaff.display();
                    break;
                }
                case 0:{
                    System.exit(sum);
                    break;
                }
            }
        } while (true);
    }
}
