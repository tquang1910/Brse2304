package com.vti.lesson11;

import java.util.ArrayList;
import java.util.List;

public class CollectionMain {
    // Collection trong Java
    // Collection chỉ thao tác với kiểu dữ liệu đối tượng, không thao tác với kiểu dữ liệu nguyên thủy (int, long , float ...)
    // Interger, Long, Float, Double, Byte, Short
    // Primitive: int, long, double, byte, short
    // Khai báo arraylist:
    public static void main(String[] args) {
        List<Integer> listInt = new ArrayList<>();
        ArrayList<Integer> arrayListInt = new ArrayList<>();

        int[] mangInt = new int[] {1,3,4,45,54,675,23,234,22};

        int[] mangInt2 = new int[11];
        for(int i = 0; i < mangInt2.length; i++) {
            if (i <mangInt.length){
                mangInt2[i] = mangInt[i];
            } else
                mangInt2[i] = 60;
        }
        System.out.println("Danh sách mảng sau khi thêm là: ");
        for(int i = 0; i < mangInt2.length; i++) {
            System.out.print(mangInt2[i] + ", ");
        }

        // sử dụng array list
        System.out.println("\n====================");
        System.out.println("Sử dụng arrayList");
        System.out.println(listInt);
        listInt.add(90);
        listInt.add(212);
        listInt.add(23);
        listInt.add(43);
        listInt.add(421);
        System.out.println(listInt);

        listInt.remove(3);
        System.out.println("Mảng sau khi gỡ phần tử");
        System.out.println(listInt);
        for (int i = 0; i < listInt.size()/2; i++){
            System.out.println(listInt.get(i));
        }
        System.out.println("sử dụng for each");
        for (Integer item : listInt){
            System.out.println(item);
        }

    }



}
