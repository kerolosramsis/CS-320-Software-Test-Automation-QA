package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContactServiceTest {

    private ContactService service;
    private Contact contact;

    @BeforeEach
    void setUp() {
        service = new ContactService();

        contact = new Contact(
                "12345",
                "John",
                "Smith",
                "5155551234",
                "123 Main Street"
        );
    }

    @Test
    void testAddContact() {
        service.addContact(contact);

        Contact savedContact = service.findContactById("12345");

        assertNotNull(savedContact);
        assertEquals("12345", savedContact.getContactId());
    }

    @Test
    void testAddDuplicateContactId() {
        service.addContact(contact);

        Contact duplicateContact = new Contact(
                "12345",
                "James",
                "Brown",
                "5155555678",
                "456 Oak Street"
        );

        assertThrows(IllegalArgumentException.class, () -> {
            service.addContact(duplicateContact);
        });
    }

    @Test
    void testDeleteContact() {
        service.addContact(contact);

        service.deleteContact("12345");

        assertNull(service.findContactById("12345"));
    }

    @Test
    void testDeleteContactNotFound() {
        assertThrows(IllegalArgumentException.class, () -> {
            service.deleteContact("99999");
        });
    }

    @Test
    void testUpdateFirstName() {
        service.addContact(contact);

        service.updateFirstName("12345", "James");

        assertEquals(
                "James",
                service.findContactById("12345").getFirstName()
        );
    }

    @Test
    void testUpdateLastName() {
        service.addContact(contact);

        service.updateLastName("12345", "Brown");

        assertEquals(
                "Brown",
                service.findContactById("12345").getLastName()
        );
    }

    @Test
    void testUpdatePhone() {
        service.addContact(contact);

        service.updatePhone("12345", "5155559999");

        assertEquals(
                "5155559999",
                service.findContactById("12345").getPhone()
        );
    }

    @Test
    void testUpdateAddress() {
        service.addContact(contact);

        service.updateAddress("12345", "456 Oak Street");

        assertEquals(
                "456 Oak Street",
                service.findContactById("12345").getAddress()
        );
    }

    @Test
    void testUpdateContactNotFound() {
        assertThrows(IllegalArgumentException.class, () -> {
            service.updateFirstName("99999", "James");
        });
    }
}