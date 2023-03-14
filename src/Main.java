//David Semchishin
//3/13/2023

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Business ContactCollection = new Business("Garfield Arbuckle","garfield@gmail.com","614-999-9999");
        System.out.println(ContactCollection);
    }

}

class Contact{
    private String name;

    private String email;

    public Contact(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact" +
                "name ='" + name + '\'' +
                ", email = " + email + ", ";
    }

    public void display() {
    }
}

class Business extends Contact{
    private String phoneNumber;

    public Business(String name, String email, String phoneNumber) {
        super(name, email);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return super.toString() + "phone number = " + this.getPhoneNumber();

    }

}

class ContactCollection {
    private ArrayList<Contact> contactsList;

    public ContactCollection() {
        contactsList = new ArrayList<Contact>();
    }

    public void addContact(Contact contact) {
        contactsList.add(contact);
    }

    public void displayContacts() {
        for (Contact contact : contactsList) {
            contact.display();
        }
    }
}