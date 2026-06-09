package entities.exercise3;

import java.util.HashMap;
import java.util.Set;

public class Contacts {
    private HashMap<String, String> contacts;

    public Contacts() {
        contacts = new HashMap<>();
    }

    static void main() {
        Contacts contacts = new Contacts();
        contacts.addContact("John", "123456789");
        contacts.addContact("Mark", "987654321");
        contacts.addContact("Bob", "454545354");

        System.out.println("Contacts list:");
        contacts.printContacts();

        System.out.println("\nJohn's number: " + contacts.getNumberUsingName("John"));
        System.out.println("\nOwner of number 454545354: " + contacts.getNameUsingNumber("454545354"));

        contacts.removeContact("John");
        System.out.println("\nContacts list after removal:");
        contacts.printContacts();
    }

    public void addContact(String name, String number) {
        contacts.put(name, number);
    }

    public void removeContact(String name) {
        contacts.remove(name);
    }

    public String getNameUsingNumber(String number) {
        Set<String> keys = contacts.keySet();

        for (String key : keys) {
            if (contacts.get(key).equals(number)) {
                return key;
            }
        }
        return "Contact not found.";
    }

    public String getNumberUsingName(String name) {
        String number = contacts.get(name);
        if (number != null) {
            return number;
        } else {
            return "Contact not found.";
        }
    }

    public void printContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
            return;
        }

        Set<String> keys = contacts.keySet();

        for (String key : keys) {
            System.out.println("Name: " + key + " - Number: " + contacts.get(key));
        }
    }

}
