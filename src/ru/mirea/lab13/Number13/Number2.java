package ru.mirea.lab13.Number13;
public class Number2 {
    private String lastName;
    private String firstName;
    private String patr;

    public Number2(String lastName, String firstName, String patronymic) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patr = patronymic;
    }

    public String getFullName() {
        StringBuilder fullName = new StringBuilder();
        if (lastName != null) {
            fullName.append(lastName);
        }
        if (firstName != null) {
            if (fullName.length() > 0) {
                fullName.append(" ");
            }
            fullName.append(firstName.charAt(0)).append(".");
        }
        if (patr != null) {
            if (fullName.length() > 0) {
                fullName.append(" ");
            }
            fullName.append(patr.charAt(0)).append(".");
        }
        return fullName.toString();
    }
}