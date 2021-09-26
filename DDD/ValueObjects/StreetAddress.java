import java.io.Serializable;

public class StreetAddress implements Serializable, Comparable<StreetAddress> {
    private final String streetAddress;
    private final PostalCode postalCode; // PostalCode is another value object
    private final String city;
    private final Country country; // Country is another value object

    public StreetAddress(String streetAddress, PostalCode postalCode, String city, Country country) {
        // Verify that required parameters are not null
        // Assign the parameter values to their corresponding fields
    }

    

    public boolean equals(Object o) {
        // Check that the fields are equal
    }

    public int hashCode() {
        // Calculate hash code based on all fields
    }

    public int compareTo(StreetAddress other) {
        // Compare however you want
    }

    
}