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
public class MergeSort {

    /**
     * Sorts a list of JewelleryModel objects by their total cost in ascending or descending order.
     * This method uses the Merge Sort algorithm for sorting.
     *
     * @param unsortedData the list of JewelleryModel objects to be sorted
     * @param isAsc a boolean flag indicating the sort order: - true for
     * ascending order - false for descending order
     * @return an ArrayList of JewelleryModel objects sorted by total cost in the specified order
     */
    public ArrayList<JewelleryModel> sortByTotalCost(List<JewelleryModel> unsortedData, boolean isAsc) {
        ArrayList<JewelleryModel> dataToSort = new ArrayList(unsortedData);
        mergeSort(dataToSort, 0, dataToSort.size() - 1, isAsc);
        return dataToSort;
    }

    /**
     * Recursively sorts a portion of the list using the Merge Sort algorithm.
     *
     * @param list the ArrayList of JewelleryModel objects to be sorted
     * @param first the starting index of the portion of the list to sort
     * @param second the ending index of the portion of the list to sort
     * @param isAsc a boolean flag indicating the sort order: - true for
     * ascending order - false for descending order
     */
    private void mergeSort(ArrayList<JewelleryModel> list, int first, int second, boolean isAsc) {
        if (first >= second) {
            return;
        }
        int mid = (first + second) / 2;

        // Merge the sorted halves
        mergeSort(list, first, mid, isAsc);
        mergeSort(list, mid + 1, second, isAsc);

        // Merge the sorted halves
        merge(list, first, mid, second, isAsc);
    }

    /**
     * Merges two sorted halves of the list into a single sorted list based on the total cost of the JewelleryModel objects. 
     * This method is used by the mergeSort algorithm to combine two sorted sublists into a fully sorted list.
     *
     * @param list the ArrayList of JewelleryModel objects to be sorted
     * @param left the starting index of the first half of the list
     * @param mid the middle index where the list is divided
     * @param right the ending index of the second half of the list
     * @param isAsc a boolean flag indicating the sort order: 
     * - true for ascending order 
     * - false for descending order
     */
    private void merge(ArrayList<JewelleryModel> list, int left, int mid, int right, boolean isAsc) {
        ArrayList<JewelleryModel> temp = new ArrayList();
        int firstCounter = left, secondCounter = mid + 1;

        // Compare elements from both halves and merge them into the main list
        while (firstCounter <= mid && secondCounter <= right) {
            if ((isAsc && list.get(firstCounter).getCost() <= list.get(secondCounter).getCost())
                    || (!isAsc && list.get(firstCounter).getCost() > list.get(secondCounter).getCost())) {
                temp.add(list.get(firstCounter));
                firstCounter++;
            } else {
                temp.add(list.get(secondCounter));
                secondCounter++;
            }
        }

        // Copy any remaining elements from the first list
        while (firstCounter <= mid) {
            temp.add(list.get(firstCounter));
            firstCounter++;
        }

        // Copy any remaining elements from the second list
        while (secondCounter <= right) {
            temp.add(list.get(secondCounter));
            secondCounter++;
        }

        // Swap
        for (int k = 0; k < temp.size(); k++) {
            list.set(left + k, temp.get(k));
        }
    }

}
