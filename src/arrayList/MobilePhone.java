package arrayList;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) != -1) {
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            return false;
        }
        myContacts.set(foundPosition, newContact);
        return true;
    }

    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            return false;
        }
        myContacts.remove(foundPosition);
        return true;
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return myContacts.get(position);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            System.out.println((i + 1) + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }
    
    
    public static void main(String[] args) {
        MobilePhone myPhone = new MobilePhone("123-456-7890");

        // Create some contacts
        Contact bob = Contact.createContact("Bob", "31415926");
        Contact alice = Contact.createContact("Alice", "16180339");
        Contact tom = Contact.createContact("Tom", "11235813");
        Contact jane = Contact.createContact("Jane", "23571113");

        // Add contacts to the phone
        myPhone.addNewContact(bob);
        myPhone.addNewContact(alice);
        myPhone.addNewContact(tom);
        myPhone.addNewContact(jane);

        // Print contacts
        myPhone.printContacts();

        // Update a contact
        Contact newAlice = Contact.createContact("Alice", "98765432");
        myPhone.updateContact(alice, newAlice);

        // Print updated contacts
        System.out.println("\nAfter updating Alice's contact:");
        myPhone.printContacts();

        // Remove a contact
        myPhone.removeContact(tom);

        // Print contacts after removal
        System.out.println("\nAfter removing Tom's contact:");
        myPhone.printContacts();

    }
}

