package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Email email = new Email("Ethan", "Fang");

        // Have get methods to display the name, email, and mailbox capacity
        System.out.println(email.getFirstName());
        System.out.println(email.getLastName());

        // Determine the department (sales, development, accounting), if none leave blank
        email.setDepartment("hello");
        System.out.println(email.getDepartment());
        email.setDepartment("sales");
        System.out.println(email.getDepartment());
        email.setDepartment("development");
        System.out.println(email.getDepartment());
        email.setDepartment("accounting");
        System.out.println(email.getDepartment());

        // Generate a random String for a password
        System.out.println("Password is: " + email.randomPassword(7));

        // Generate an email with the following syntax: firstname.lastname@department.company.com
        System.out.println(email.generateEmail());

        // Have set methods to change the password, set the mailbox capacity, and define an alternate email address
        email.setAlternateEmail("hello");
        email.setMailBoxCapacity(4);
    }
}
