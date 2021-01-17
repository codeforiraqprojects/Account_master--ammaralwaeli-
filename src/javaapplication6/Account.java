/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import javax.swing.JOptionPane;

/**
 *
 * @author Volume_2inC
 */
public class Account {
    private int accountNo;
    private String name;
    private float accountAmount;
    
    
    public int getID(){
        return accountNo;
    }
    public void insert(int a,String n,float acc){
        this.accountNo=a;
        this.name=n;
        this.accountAmount=acc;
    }
    public void deposit(float am){
        JOptionPane.showMessageDialog(null, "You Deposited "+am, "Information", JOptionPane.INFORMATION_MESSAGE);
        this.accountAmount+=am;
    }
    public void withdraw(float am){
        if(this.accountAmount<am){
            JOptionPane.showMessageDialog(null, "Insufficient Balance", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, am+" Withdrawn", "Information", JOptionPane.INFORMATION_MESSAGE);
            this.accountAmount-=am;
        }
    }
    public void checkBalance(){
        JOptionPane.showMessageDialog(null, "Balance is : "+this.accountAmount, "Information", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void display(){
        JOptionPane.showMessageDialog(null, this.accountNo+"  "+this.name+"  "+this.accountAmount, "Information", JOptionPane.INFORMATION_MESSAGE);
    }
}
