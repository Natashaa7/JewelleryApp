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
 *
 * @author Natasha Babu
 */
public class BinarySearch {

    /**
     * Searches for a JewelleryModel object in a sorted list of necklaces by their name using binary search. 
     * The search is case-insensitive and returns the first matching necklace.
     *
     * @param searchValue the name of the necklace to be searched
     * @param necklaceList the list of JewelleryModel objects (necklaces) to be searched
     * @param low the starting index of the list segment to search
     * @param high the ending index of the list segment to search
     * @return the JewelleryModel object if found, or null if no matching name is found
     */
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

    /**
     * Searches for a JewelleryModel object in a sorted list of bracelets by their name using binary search. 
     * The search is case-insensitive and returns the first matching bracelet.
     *
     * @param searchValue the name of the bracelet to be searched
     * @param braceletList the list of JewelleryModel objects (bracelets) to be searched
     * @param low the starting index of the list segment to search
     * @param high the ending index of the list segment to search
     * @return the JewelleryModel object if found, or null if no matching name is found
     */
    public JewelleryModel searchByNameBracelet(
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

    /**
     * Searches for a JewelleryModel object in a sorted list of rings by their name using binary search. 
     * The search is case-insensitive and returns the first matching ring.
     *
     * @param searchValue the name of the ring to be searched
     * @param ringList the list of JewelleryModel objects (rings) to be searched
     * @param low the starting index of the list segment to search
     * @param high the ending index of the list segment to search
     * @return the JewelleryModel object if found, or null if no matching name is found
     */
    public JewelleryModel searchByNameRing(
            String searchValue,
            List<JewelleryModel> ringList,
            int low,
            int high
    ) {
        if (high < low) {
            return null;
        }
        //indexing
        int mid = (low + high) / 2;

        if (ringList.get(mid).getName().toLowerCase().equals(searchValue.toLowerCase())) {
            return ringList.get(mid);
        } else if (searchValue.compareToIgnoreCase(ringList.get(mid).getName()) < 0) {
            //search value is less than mid value
            return searchByNameRing(searchValue, ringList, low, mid - 1);
        } else {
            return searchByNameRing(searchValue, ringList, mid + 1, high);
        }
    }

    /**
     * Searches for a JewelleryModel object in a sorted list of earrings by their name using binary search. 
     * The search is case-insensitive and returns the first matching earring.
     *
     * @param searchValue the name of the earring to be searched
     * @param earringsList the list of JewelleryModel objects (earrings) to be searched
     * @param low the starting index of the list segment to search
     * @param high the ending index of the list segment to search
     * @return the JewelleryModel object if found, or null if no matching name is found
     */
    public JewelleryModel searchByNameEarrings(
            String searchValue,
            List<JewelleryModel> earringsList,
            int low,
            int high
    ) {
        if (high < low) {
            return null;
        }
        //indexing
        int mid = (low + high) / 2;

        if (earringsList.get(mid).getName().toLowerCase().equals(searchValue.toLowerCase())) {
            return earringsList.get(mid);
        } else if (searchValue.compareToIgnoreCase(earringsList.get(mid).getName()) < 0) {
            //search value is less than mid value
            return searchByNameEarrings(searchValue, earringsList, low, mid - 1);
        } else {
            return searchByNameEarrings(searchValue, earringsList, mid + 1, high);
        }
    }
}
