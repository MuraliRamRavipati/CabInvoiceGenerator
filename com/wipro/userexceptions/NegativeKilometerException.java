package com.wipro.userexceptions;

/**
 * Created by MU391764 on 17-Apr-18.
 */
public class NegativeKilometerException extends Exception {
    @Override
    public String toString() {
        return "Invalid KM";
    }
}
