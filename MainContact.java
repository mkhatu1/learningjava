public class MainContact {
    

    public static void main(String[] args) {
        
        Contact contact1 = new Contact("Sally", new PhoneNumber("2637263737"));

        Contact contact2 = new Contact("Maggie Smith", new PhoneNumber(41, "9348713401"));

        Contact contact3 = new Contact("Roger Williams", new PhoneNumber("448474734929"));

        Contact contact4 = new Contact("David Jones", "david_jones@gmail.com");

        Contact contact5 = new Contact("Sarah Bush", new PhoneNumber("2029384982"), "sarah@caltech.com");

        System.out.println(contact1);
        System.out.println(contact2);
        System.out.println(contact3);
        System.out.println(contact4);
        System.out.println(contact5);

    }
}
