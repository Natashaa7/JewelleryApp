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
public class SelectionSort {

    /**
     * Sorts a list of JewelleryModel objects by their name in ascending or
     * descending order. 
     * This method uses the Selection Sort algorithm for sorting.
     *
     * @param unsortedData the list of JewelleryModel objects to be sorted
     * @param isAsc a boolean flag indicating the sort order: 
     * - true for ascending order 
     * - false for descending order
     * @return an ArrayList of JewelleryModel objects sorted by name in the specified order
     */
    public ArrayList<JewelleryModel> sortByName(List<JewelleryModel> unsortedData, boolean isAsc) {
        ArrayList<JewelleryModel> dataToSort = new ArrayList();
        dataToSort.addAll(unsortedData);

        // Selection sort Algorithm
        for (int i = 0; i < dataToSort.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < dataToSort.size(); j++) {
                //
                if (isAsc) {
                    if (dataToSort.get(j).getName().compareToIgnoreCase(dataToSort.get(minIndex).getName()) < 0) {
                        minIndex = j;

                    }
                } else if (dataToSort.get(j).getName().compareToIgnoreCase(dataToSort.get(minIndex).getName()) > 0) {
                    minIndex = j;
                }
            }
            //swap
            JewelleryModel tempJewellery = dataToSort.get(i);
            dataToSort.set(i, dataToSort.get(minIndex));
            dataToSort.set(minIndex, tempJewellery);
        }
        return dataToSort;
    }
}
