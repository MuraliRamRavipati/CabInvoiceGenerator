package com.wipro.validations;

import com.wipro.bean.CabBean;
import com.wipro.userexceptions.NegativeKilometerException;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by MU391764 on 17-Apr-18.
 */
public class TripValidator {
    public static String printBillAmount(CabBean cabbean){
        ArrayList<String> cabs=new ArrayList<>();
        cabs.add("Tata Indica");
        cabs.add("Tata Indigo");
        cabs.add("BMW");
        cabs.add("Logan");

        if(cabbean.getBookingID().startsWith("AD")&&cabbean.getBookingID().substring(2).length()==5){
            try{
                Integer.parseInt(cabbean.getBookingID().substring(2));
            } catch (NumberFormatException e){
                return "Invalid Booking ID";
            }
        } else {
           return "Invalid Booking ID";
        }
        if(!(cabbean.getUserID()>1000&&cabbean.getUserID()<1501)){
            return "Invalid User ID";
        } else if(!cabs.contains(cabbean.getCabType())){
            return "Invalid Cab Type";
        } else if(Integer.parseInt(cabbean.getKmsUsed())<0){
            return new NegativeKilometerException().toString();
        } else {
            int bill[]=amountGenerator(Integer.parseInt(cabbean.getKmsUsed()), cabbean.getCabType());
           return "Total Amount : "+bill[1]+" , Receipt ID : "+bill[0];
        }
    }
    public static int[] amountGenerator(int kmsUsed, String cabType){
        int bill[]=new int[2];
        Random random = new Random();
        bill[0]=random.nextInt((99999 - 10000) + 1) + 10000;
        switch (cabType){
            case "Tata Indica":
                bill[1]=12*kmsUsed;
                break;
            case "Tata Indigo":
                bill[1] = 10*kmsUsed;
                break;
            case "BMW":
                bill[1] = 45*kmsUsed;
                break;
            case "Logan":
                bill[1] = 31*kmsUsed;
                break;
        }
        return bill;
    }
}
