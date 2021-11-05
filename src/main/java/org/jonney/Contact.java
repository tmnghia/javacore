package org.jonney;

import java.util.Scanner;

public class Contact {
    private String name;
    private String phone;

    Contact() {
    };

    Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return this.name;
    }

    public String getPhone() {
        return this.phone;
    }

    public String toString() {
        return phone + "|" + name;
    }

    public void input() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter name: ");
            name = scanner.nextLine();
            System.out.print("Enter phone: ");
            phone = scanner.nextLine();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    public void show() {
        System.out.println("Contact name: " + getName());
        System.out.println("Contact phone: " + getPhone());
    }
}
