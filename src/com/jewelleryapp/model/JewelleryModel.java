/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jewelleryapp.model;

/**
 * LMUID: 23048637
 * @author Natasha Babu
 */
public class JewelleryModel {
    private int code;
    private String name;
    private String material;
    private double dCarat;
    private int gCarat;
    private int stock;
    private int cost;
    private String jType;
    
    public JewelleryModel (int code, String name, String material, double dCarat, int gCarat, int stock, int cost, String jType) {
        this.code = code;
        this.name = name;
        this.material = material;
        this.dCarat = dCarat;
        this.gCarat= gCarat;
        this.stock = stock;
        this.cost = cost;
        this.jType = jType;
        
        
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getdCarat() {
        return dCarat;
    }

    public void setdCarat(double dCarat) {
        this.dCarat = dCarat;
    }

    public int getgCarat() {
        return gCarat;
    }

    public void setgCarat(int gCarat) {
        this.gCarat = gCarat;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getjType() {
        return jType;
    }

    public void setjType(String jType) {
        this.jType = jType;
    }

    public Object stream() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
