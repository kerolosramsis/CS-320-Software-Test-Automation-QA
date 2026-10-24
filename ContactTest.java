package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {

    @Test
    void testContactCreation() {
        Contact contact = new Contact(
                "12345",
                "John",
                "Smith",
                "5155551234",
                "123 Main Street"
        );

        assertEquals("12345", contact.getContactId());
        assertEquals("John", contact.getFirstName());
        assertEquals("Smith", contact.getLastName());
        assertEquals("5155551234", contact.getPhone());
        assertEquals("123 Main Street", contact.getAddress());
    }

    @Test
    void testContactIdTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "12345678901",
                    "John",
                    "Smith",
                    "5155551234",
                    "123 Main Street"
            );
        });
    }

    @Test
    void testContactIdNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    null,
                    "John",
                    "Smith",
                    "5155551234",
                    "123 Main Street"
            );
        });
    }

    @Test
    void testFirstNameTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "12345",
                    "Christopher",
                    "Smith",
                    "5155551234",
                    "123 Main Street"
            );
        });
    }

    @Test
    void testFirstNameNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "12345",
                    null,
                    "Smith",
                    "5155551234",
                    "123 Main Street"
            );
        });
    }

    @Test
    void testLastNameTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "12345",
                    "John",
                    "Williamsons",
                    "5155551234",
                    "123 Main Street"
            );
        });
    }

    @Test
    void testLastNameNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "12345",
                    "John",
                    null,
                    "5155551234",
                    "123 Main Street"
            );
        });
    }

    @Test
    void testPhoneTooShort() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "12345",
                    "John",
                    "Smith",
                    "515555123",
                    "123 Main Street"
            );
        });
    }

    @Test
    void testPhoneTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "12345",
                    "John",
                    "Smith",
                    "51555512345",
                    "123 Main Street"
            );
        });
    }

    @Test
    void testPhoneWithLetters() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "12345",
                    "John",
                    "Smith",
                    "51555abcde",
                    "123 Main Street"
            );
        });
    }

    @Test
    void testPhoneNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "12345",
                    "John",
                    "Smith",
                    null,
                    "123 Main Street"
            );
        });
    }

    @Test
    void testAddressTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "12345",
                    "John",
                    "Smith",
                    "5155551234",
                    "1234567890123456789012345678901"
            );
        });
    }

    @Test
    void testAddressNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "12345",
                    "John",
                    "Smith",
                    "5155551234",
                    null
            );
        });
    }

    @Test
    void testUpdateFirstNameTooLong() {
        Contact contact = new Contact(
                "12345",
                "John",
                "Smith",
                "5155551234",
                "123 Main Street"
        );

        assertThrows(IllegalArgumentException.class, () -> {
            contact.setFirstName("Christopher");
        });
    }

    @Test
    void testUpdateLastNameNull() {
        Contact contact = new Contact(
                "12345",
                "John",
                "Smith",
                "5155551234",
                "123 Main Street"
        );

        assertThrows(IllegalArgumentException.class, () -> {
            contact.setLastName(null);
        });
    }

    @Test
    void testUpdatePhoneInvalid() {
        Contact contact = new Contact(
                "12345",
                "John",
                "Smith",
                "5155551234",
                "123 Main Street"
        );

        assertThrows(IllegalArgumentException.class, () -> {
            contact.setPhone("12345");
        });
    }

    @Test
    void testUpdateAddressTooLong() {
        Contact contact = new Contact(
                "12345",
                "John",
                "Smith",
                "5155551234",
                "123 Main Street"
        );

        assertThrows(IllegalArgumentException.class, () -> {
            contact.setAddress("1234567890123456789012345678901");
        });
    }
}