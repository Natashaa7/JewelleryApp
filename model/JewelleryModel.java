/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jewelleryapp.model;

/**
 * LMUID: 23048637
 *
 * @author Natasha babu
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

    /**
     * Constructs a new JewelleryModel object with the specified attributes.
     *
     * @param code the unique code identifying the jewellery item
     * @param name the name of the jewellery item
     * @param material the material the jewellery is made from (e.g., gold,
     * silver)
     * @param dCarat the diamond carat weight of the jewellery
     * @param gCarat the gold carat weight of the jewellery
     * @param stock the available stock quantity of the jewellery item
     * @param cost the cost of the jewellery item
     * @param jType the type of the jewellery (e.g., necklace, bracelet, ring)
     */
    public JewelleryModel(int code, String name, String material, double dCarat, int gCarat, int stock, int cost, String jType) {
        this.code = code;
        this.name = name;
        this.material = material;
        this.dCarat = dCarat;
        this.gCarat = gCarat;
        this.stock = stock;
        this.cost = cost;
        this.jType = jType;

    }

    /**
     * Retrieves the unique code of the jewellery item.
     *
     * @return the unique code of the jewellery item
     */
    public int getCode() {
        return code;
    }

    /**
     * Sets the unique code for the jewellery item.
     *
     * @param code the unique code to be assigned to the jewellery item
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * Retrieves the name of the jewellery item.
     *
     * @return the name of the jewellery item
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the jewellery item.
     *
     * @param name the name to be assigned to the jewellery item
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the material of the jewellery item.
     *
     * @return the material of the jewellery item as a String
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Sets the material of the jewellery item.
     *
     * @param material the material to be assigned to the jewellery item
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * Retrieves the diamond carat weight of the jewellery item.
     *
     * @return the diamond carat weight of the jewellery item as a double
     */
    public double getdCarat() {
        return dCarat;
    }

    /**
     * Sets the diamond carat weight of the jewellery item.
     *
     * @param dCarat the diamond carat weight to be assigned to the jewellery item
     */
    public void setdCarat(double dCarat) {
        this.dCarat = dCarat;
    }

    /**
     * Retrieves the gold carat weight of the jewellery item.
     *
     * @return the gold carat weight of the jewellery item as an integer
     */
    public int getgCarat() {
        return gCarat;
    }

    /**
     * Sets the gold carat weight of the jewellery item.
     *
     * @param gCarat the gold carat weight to be assigned to the jewellery item
     */
    public void setgCarat(int gCarat) {
        this.gCarat = gCarat;
    }

    /**
     * Retrieves the stock quantity of the jewellery item.
     *
     * @return the stock quantity of the jewellery item as an integer
     */
    public int getStock() {
        return stock;
    }

    /**
     * Sets the stock quantity of the jewellery item.
     *
     * @param stock the stock quantity to be assigned to the jewellery item
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * Retrieves the cost of the jewellery item.
     *
     * @return the cost of the jewellery item as an integer
     */
    public int getCost() {
        return cost;
    }

    /**
     * Sets the cost of the jewellery item.
     *
     * @param cost the cost to be assigned to the jewellery item
     */
    public void setCost(int cost) {
        this.cost = cost;
    }

    /**
     * Retrieves the type of the jewellery item.
     *
     * @return the type of the jewellery item (e.g., necklace, bracelet, etc.) as a String
     */
    public String getjType() {
        return jType;
    }

    /**
     * Sets the type of the jewellery item.
     *
     * @param jType the type to be assigned to the jewellery item (e.g.necklace, bracelet, etc.)
     */
    public void setjType(String jType) {
        this.jType = jType;
    }
}
