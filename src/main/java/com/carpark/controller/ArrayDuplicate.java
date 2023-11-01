package com.carpark.controller;

import java.sql.Array;

public class ArrayDuplicate {
    private String[] stringArray = null;
    
    public static String[] findDuplicates(String[] stringArray){
         boolean isDuplicate =false;
         String[] duplicateArray = null;
//         int size=stringArray.length();
         for(int i=stringArray.length;i>0;i--){
             if(!stringArray[i+1].equals(stringArray[i])){
             String str1=stringArray[i];
             }
         }

        if(isDuplicate){
            return duplicateArray;
        }else{
            return duplicateArray;
        }
    }
}
