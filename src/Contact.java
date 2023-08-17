// Data collection  types
// 1.Array, stack, List , ArrayList

/**
 * Contact Manager
 * 1.Create a new contact
 * 2.Search ->any string in name , email , phone
 * 3.Views list all contacts
 * 4.Delete by name email or phone
 * 5.Search
 *
 * */
public class Contact {
    public String firstName;
    public String lastName;
    public String email;


    public Contact(String firstName) {
        this.firstName = firstName;
    }

    public Contact(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
}
