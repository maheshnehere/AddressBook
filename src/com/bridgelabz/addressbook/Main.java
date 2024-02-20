package com.bridgelabz.addressbook;

import com.bridgelabz.addressbook.AddressBook;

import java.util.*;

public class Main {
    static String name;
    static Main output = new Main(name);
    Scanner sc = new Scanner(System.in);
    static int option;
    static AddressBook contact;
    static ArrayList<AddressBook> contacts = new ArrayList<>();
    HashMap<String, ArrayList<AddressBook>> multipleAdd;
    String SearchName;

    public void createContacts() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details =");
        System.out.println("Enter first name =");
        String firstName = sc.next();
        System.out.println("Enter last name =");
        String lastName = sc.next();
        System.out.println("Enter address =");
        String address = sc.next();
        System.out.println("Enter city =");
        String city = sc.next();
        System.out.println("Enter state =");
        String state = sc.next();
        System.out.println("Enter Zip code =");
        String zip = sc.next();
        System.out.println("Enter phone number =");
        String ph_no = sc.next();
        System.out.println("Enter the email address");
        String email = sc.next();
        System.out.println("Contact created");
        contact = new AddressBook(firstName, lastName, address, city, state, zip, ph_no, email);

    }

    public Main(String name) {
        this.name = name;
        this.multipleAdd = new HashMap<String, ArrayList<AddressBook>>();
    }
    public void addContacts () {
        System.out.println("name of addressbook");
        String name = sc.next();
//        if (contacts.isEmpty()) {
        contacts.add(contact);
        this.multipleAdd.put(name, contacts);
//        } else {
    }
}