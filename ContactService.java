package contact;

import java.util.ArrayList;
import java.util.List;

public class ContactService {

    private final List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        if (contact == null) {
            throw new IllegalArgumentException("Contact cannot be null");
        }

        for (Contact existingContact : contacts) {
            if (existingContact.getContactId().equals(contact.getContactId())) {
                throw new IllegalArgumentException("Contact ID must be unique");
            }
        }

        contacts.add(contact);
    }

    public void deleteContact(String contactId) {
        Contact contact = findContactById(contactId);

        if (contact == null) {
            throw new IllegalArgumentException("Contact ID not found");
        }

        contacts.remove(contact);
    }

    public void updateFirstName(String contactId, String firstName) {
        Contact contact = findContactById(contactId);

        if (contact == null) {
            throw new IllegalArgumentException("Contact ID not found");
        }

        contact.setFirstName(firstName);
    }

    public void updateLastName(String contactId, String lastName) {
        Contact contact = findContactById(contactId);

        if (contact == null) {
            throw new IllegalArgumentException("Contact ID not found");
        }

        contact.setLastName(lastName);
    }

    public void updatePhone(String contactId, String phone) {
        Contact contact = findContactById(contactId);

        if (contact == null) {
            throw new IllegalArgumentException("Contact ID not found");
        }

        contact.setPhone(phone);
    }

    public void updateAddress(String contactId, String address) {
        Contact contact = findContactById(contactId);

        if (contact == null) {
            throw new IllegalArgumentException("Contact ID not found");
        }

        contact.setAddress(address);
    }

    public Contact findContactById(String contactId) {
        for (Contact contact : contacts) {
            if (contact.getContactId().equals(contactId)) {
                return contact;
            }
        }

        return null;
    }
}