package com.wipro.service;

import com.wipro.bean.CabBean;
import com.wipro.validations.TripValidator;

/**
 * Created by MU391764 on 17-Apr-18.
 */
public class MainClass {
    public static void main(String[] args)
    {
        CabBean cabbean = new CabBean();
        cabbean.setBookingID("AD12345");
        cabbean.setCabType("BMW");
        cabbean.setKmsUsed("120");
        cabbean.setUserID(1003);
        cabbean.setUsername("Hariprasath");
        String result = TripValidator.printBillAmount(cabbean);
        System.out.println(result);
    }

}
