package java.concepts.oops.encapsulation_inheritance_composition;

public class School2 {
    public static void main(String[] args) {

        Address address = new Address("Bangarga", "Aland", "Karnataka", "585314");

        Address address1 = new Address("Mathagalli", "Aland", "Karnataka", "560056");

        Teacher teacher1 = new Teacher("EMP1",  122000, address);

        Teacher teacher2 = new Teacher("EMP2",  122000, new Address("Vijay nagar", "Bangalore", "Karnataka", "540064"));

        System.out.println(address);
        System.out.println(teacher2);
    }
}
