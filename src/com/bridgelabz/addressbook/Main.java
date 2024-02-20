package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static String name;
    static Main output = new Main(name);
    Scanner sc = new Scanner(System.in);
    static int option;
    static AddressBook contact;
    static ArrayList<AddressBook> contacts = new ArrayList<>();
    HashMap<String, ArrayList<AddressBook>> multipleAdd;
    String searchname;
}
