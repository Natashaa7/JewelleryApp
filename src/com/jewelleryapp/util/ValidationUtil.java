/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jewelleryapp.util;

/**
 * LMUID: 23048637
 * @author Natasha Babu
 */
import java.util.regex.Pattern;

public class ValidationUtil {
    private static final Pattern CODE_PATTERN = Pattern.compile("^35\\d{5}$");
    private static final Pattern NAME_PATTERN = Pattern.compile("^[a-zA-Z]+[ a-zA-Z]*$");
    private static final Pattern MATERIAL_PATTERN = Pattern.compile("^(yellow gold|beige gold|white gold|rose gold|platinum|silver)$", Pattern.CASE_INSENSITIVE);
    private static final Pattern DCARAT_PATTERN = Pattern.compile("^\\d+(\\.\\d{0,2})?$");
    private static final Pattern GCARAT_PATTERN = Pattern.compile("^(18|22|24)");
    private static final Pattern STOCK_PATTERN = Pattern.compile("^\\d{1,3}$");
    private static final Pattern COST_PATTERN = Pattern.compile("^\\d{1,8}$");
    private static final Pattern TYPE_PATTERN = Pattern.compile("^(necklace|bracelet|ring|earrings)$", Pattern.CASE_INSENSITIVE);
    
    /**
     * Validates if a string is null or empty.
     *
     * @param value the string to validate
     * @return true if the string is null or empty, otherwise false
     */
    public static boolean isNullOrEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }
    
    /**
     * Validates if the code is exactly 7 digits.
     *
     * @param code validate product code
     * @return true if valid, otherwise false
     */
    public static boolean validateCode(int code) {
        return CODE_PATTERN.matcher(String.valueOf(code)).matches();
    }
    
    /**
     * Validates if the name contains only alphabets.
     *
     * @param name validate product name
     * @return true if valid, otherwise false
     */
    public static boolean validateName(String name) {
        return !isNullOrEmpty(name) && NAME_PATTERN.matcher(name).matches();
    }

    /**
     * Validates if the material contains only alphabets.
     *
     * @param material validate product material
     * @return true if valid, otherwise false
     */
    public static boolean validateMaterial(String material) {
        return !isNullOrEmpty(material) && MATERIAL_PATTERN.matcher(material).matches();
    }
    
    /**
     * Validates if the dCarat has maximum 2 decimal places.
     *
     * @param dCarat validate diamond carats
     * @return true if valid, otherwise false
     */
    public static boolean validateDCarat(double dCarat) {
        return DCARAT_PATTERN.matcher(String.valueOf(dCarat)).matches();
    }
    
    /**
     * Validates if the gCarat has exactly 2 digits.
     *
     * @param gCarat validate gold carats
     * @return true if valid, otherwise false
     */
    public static boolean validateGCarat(int gCarat) {
        return GCARAT_PATTERN.matcher(String.valueOf(gCarat)).matches();
    }
    
    /**
     * Validates if the stock has exactly 3 digits.
     *
     * @param stock validate product stock
     * @return true if valid, otherwise false
     */
    public static boolean validateStock(int stock) {
        return STOCK_PATTERN.matcher(String.valueOf(stock)).matches();
    }
    
    /**
     * Validates if the cost has exactly 8 digits.
     *
     * @param stock validate product stock
     * @return true if valid, otherwise false
     */
    public static boolean validateCost(int cost) {
        return COST_PATTERN.matcher(String.valueOf(cost)).matches();
    }
    
    /**
     * Validates if the type is one of the allowed options.
     *
     * @param jType validate product type
     * @return true if valid, otherwise false
     */
    public static boolean validateType(String jType) {
        return !isNullOrEmpty(jType) && TYPE_PATTERN.matcher(jType).matches();
    }
    
    
}
