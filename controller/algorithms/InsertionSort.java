/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jewelleryapp.controller.algorithms;

import com.jewelleryapp.model.JewelleryModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * LMUID: 23048637
 *
 * @author Natasha Babu
 */
public class InsertionSort {

    /**
     * Sorts a list of JewelleryModel objects by their code in ascending or descending order. 
     * This method uses the Insertion Sort algorithm for sorting.
     *
     * @param unsortedData the list of JewelleryModel objects to be sorted
     * @param isAsc a boolean flag indicating the sort order: 
     * - true for ascending order 
     * - false for descending order
     * @return an ArrayList of JewelleryModel objects sorted by code in the specified order
     */
    public ArrayList<JewelleryModel> sortByCode(List<JewelleryModel> unsortedData, boolean isAsc) {
        ArrayList<JewelleryModel> dataToSort = new ArrayList(unsortedData);

        // Insertion sort algorithm
        for (int i = 1; i < dataToSort.size(); i++) {
            JewelleryModel keyItem = dataToSort.get(i);
            int j = i - 1;

            // Shift code to create position for current code
            while (j >= 0 && ((isAsc && keyItem.getCode() < dataToSort.get(j).getCode())
                    || (!isAsc && keyItem.getCode() > dataToSort.get(j).getCode()))) {
                dataToSort.set(j + 1, dataToSort.get(j));
                j--;
            }
            // Swap
            dataToSort.set(j + 1, keyItem);
        }
        return dataToSort;
    }
}
