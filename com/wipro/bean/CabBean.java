package com.wipro.bean;

/**
 * Created by MU391764 on 17-Apr-18.
 */
public class CabBean {
    private String bookingID;
    private int userID;
    private String username;
    private String cabType;
    private String kmsUsed;
    private float totalAmount;
    private int receiptNo;

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCabType() {
        return cabType;
    }

    public void setCabType(String cabType) {
        this.cabType = cabType;
    }

    public String getKmsUsed() {
        return kmsUsed;
    }

    public void setKmsUsed(String kmsUsed) {
        this.kmsUsed = kmsUsed;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getReceiptNo() {
        return receiptNo;
    }

    public void setReceiptNo(int receiptNo) {
        this.receiptNo = receiptNo;
    }
}
