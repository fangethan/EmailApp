package com.company;

public class Email {
    private String alternateEmail;
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailBoxCapacity;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String generateEmail() {
        String email = getFirstName().toLowerCase() + "." + getLastName().toLowerCase() +
                "@" + getDepartment() + ".gmail.com";
        return email;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }

    public void setMailBoxCapacity(int mailBoxCapacity) {
        this.mailBoxCapacity = mailBoxCapacity;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        char[] password = new char[length];

        for (int i = 0; i < length; i++) {
           int random = (int) (Math.random() * passwordSet.length());
           password[i] = passwordSet.charAt(random);
        }

        return new String (password);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if (department.equals("sales") || department.equals("development") || department.equals("accounting")){
            this.department = department;
        } else {
            this.department = " ";
        }
    }
}
