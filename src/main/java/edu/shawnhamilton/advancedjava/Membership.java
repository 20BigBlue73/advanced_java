package edu.shawnhamilton.advancedjava;

import java.time.*;
/**
 * A simple class that models a gym membership
 *
 * @author Shawn Hamilton
 */

public class Membership {

    private String memberName;
    private LocalDate expirationDate;

    /**
     * Creates a new  Membership instance.
     *
     * @param memberName the full name of the member as a String
     * @param expirationDate the expiration date of the membership as a LocalDate
     */
    public Membership(String memberName, LocalDate expirationDate) {
        this.memberName = memberName;
        this.expirationDate = expirationDate;
    }

    /**
     * @return return the name of the member
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * Returns the expiration date of the membership
     */
    public LocalDate getExpirationDate() {
        return expirationDate;
    }

}
