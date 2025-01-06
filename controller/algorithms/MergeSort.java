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
 * @author Natasha Babu
 */
public class MergeSort {
    // MergeSort Algortihm
    public ArrayList<JewelleryModel> sortByTotalCost(List<JewelleryModel> unsortedData, boolean isAsc) {
        ArrayList<JewelleryModel> dataToSort = new ArrayList(unsortedData);
        mergeSort(dataToSort, 0, dataToSort.size() - 1, isAsc);
        return dataToSort;
    }
    
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

    // Method for merging data
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
