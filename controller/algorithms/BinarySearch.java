/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jewelleryapp.controller.algorithms;

import com.jewelleryapp.model.JewelleryModel;
import java.util.List;

/**
 *
 * LMUID: 23048637
 * @author Natasha Babu
 */
public class BinarySearch {
    // Binary Search algorithm for Necklace List
    public JewelleryModel searchByNameNecklace(
        String searchValue,
        List<JewelleryModel> necklaceList,
        int low,
        int high
    ) {
        if (high < low) {
            return null;
        }
        //indexing
        int mid = (low + high) / 2;

        if (necklaceList.get(mid).getName().toLowerCase().equals(searchValue.toLowerCase())) {
            return necklaceList.get(mid);
        } else if (searchValue.compareToIgnoreCase(necklaceList.get(mid).getName()) < 0) {
            //search value is less than mid value
            return searchByNameNecklace(searchValue, necklaceList, low, mid - 1);
        } else {
            return searchByNameNecklace(searchValue, necklaceList, mid + 1, high);
        }
        
    }
    
    // Binary Search algorithm for Bracelet List
    public JewelleryModel searchByNameBracelet (
        String searchValue,
        List<JewelleryModel> braceletList,
        int low,
        int high
    ) {
        if (high < low) {
            return null;
        }
        //indexing
        int mid = (low + high) / 2;

        if (braceletList.get(mid).getName().toLowerCase().equals(searchValue.toLowerCase())) {
            return braceletList.get(mid);
        } else if (searchValue.compareToIgnoreCase(braceletList.get(mid).getName()) < 0) {
            //search value is less than mid value
            return searchByNameBracelet(searchValue, braceletList, low, mid - 1);
        } else {
            return searchByNameBracelet(searchValue, braceletList, mid + 1, high);
        }
    }
    
    // Binary Search algorithm for Ring List
    public JewelleryModel searchByNameRing (
        String searchValue,
        List<JewelleryModel> ringList,
        int low,
        int high
    ) {
        if (high < low) {
            return null;
        }
        //indexing
        int mid = (low+high)/2;
        
        if (ringList.get(mid).getName().toLowerCase().equals(searchValue.toLowerCase())) {
            return ringList.get(mid);
        } else if (searchValue.compareToIgnoreCase(ringList.get(mid).getName()) < 0) {
            //search value is less than mid value
            return searchByNameRing(searchValue, ringList, low, mid-1);
        } else {
            return searchByNameRing(searchValue, ringList, mid+1, high);
        } 
    }
    
    // Binary Search algorithm for Earrings List
    public JewelleryModel searchByNameEarrings (
        String searchValue,
        List<JewelleryModel> earringsList,
        int low,
        int high
    ) {
        if (high < low) {
            return null;
        }
        //indexing
        int mid = (low+high)/2;
        
        if (earringsList.get(mid).getName().toLowerCase().equals(searchValue.toLowerCase())) {
            return earringsList.get(mid);
        } else if (searchValue.compareToIgnoreCase(earringsList.get(mid).getName()) < 0) {
            //search value is less than mid value
            return searchByNameEarrings(searchValue, earringsList, low, mid-1);
        } else {
            return searchByNameEarrings(searchValue, earringsList, mid+1, high);
        }    
    } 
}
