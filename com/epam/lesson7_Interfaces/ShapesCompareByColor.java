package com.epam.lesson7_Interfaces;

import java.util.Comparator;

public class ShapesCompareByColor implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String str1 = ((Shape)o1).getColor();
        String str2 = ((Shape)o2).getColor();

        return str1.compareTo(str2);
    }
}
