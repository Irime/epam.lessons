package com.epam.lesson7_Interfaces;

import java.util.Comparator;

public class ShapesCompareByArea implements Comparator {
    @Override
    public int compare(Object o1, Object o2){
        return (int)(((Shape)o1).calcArea() - ((Shape)o2).calcArea());
    }
}
