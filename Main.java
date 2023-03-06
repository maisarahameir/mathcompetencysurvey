public class Main {
    // Application code
    public static void main(String args[]) {
        School school1 = new School();
        School school2 = new School();
        School school3 = new School();

        Address addr1 = new Address();
        Address addr2 = new Address();
        Address addr3 = new Address();

        // Direct access to attributes is not a good practices
        school1.setName("SMK Raja Fatimah");
        school2.setName("SMK Ampuan Rizal");
        school3.setName("SMK Johor Bahru");

        //calling methods to set Address
        addr1.setStreet("Jalan 2");
        addr1.setDistrict("Kuala Krai");
        addr1.setPostcode("18000");
        addr1.setState("Kelantan");
        school1.setAddress(addr1);

        addr2.setStreet("Simpang 3");
        addr2.setDistrict("Kemaman");
        addr2.setPostcode("24000");
        addr2.setState("Terengganu");
        school2.setAddress(addr2);

        addr3.setStreet("Jalan 4");
        addr3.setDistrict("Kuantan");
        addr3.setPostcode("25250");
        addr3.setState("Pahang");
        school3.setAddress(addr3);

        school1.setPrincipal("Pn. Sharifah Aznab");
        school2.setPrincipal("Lee Tieu Wong");
        school3.setPrincipal("En. Fariz Shah Ahmad");

        //sk1
        System.out.println("Name of school is: "+school1.getName());
        System.out.println("Address of school is: "+school1.getAddress().getStreet());
        System.out.println("Principal of school is: "+school1.getPrincipal());

        Marks m1 = new Marks();
        m1.createData(100);

        m1.setMark(20, 0);
        m1.setMark(85, 1);
        m1.setMark(82, 2);
        float mark = m1.getMark(0);
        for (int i=0; i<3; i++) {
            System.out.println("Marks for students "+ i +" are " + mark);
            mark = m1.getMark(i + 1);
        }
        System.out.println(" ");

        //sk2
        System.out.println("Name of school is: "+school2.getName());
        System.out.println("Address of school is: "+school2.getAddress().getStreet());
        System.out.println("Principal of school is: "+school2.getPrincipal());

        Marks m2 = new Marks();
        m2.createData(100);

        m2.setMark(50, 0);
        m2.setMark(50, 1);
        m2.setMark(50, 2);
        float mark2 = m2.getMark(0);
        for (int j=0; j<3; j++) {
            System.out.println("Marks for student "+ j +" is " + mark2);
            mark2 = m2.getMark(j + 1);
        }
        System.out.println(" ");

        //sk3
        System.out.println("Name of school is: " + school3.getName());
        System.out.println("Address of school is: " + school3.getAddress().getStreet());
        System.out.println("Principal of school is: " + school3.getPrincipal());

        Marks m3 = new Marks();
        m3.createData(100);

        m3.setMark(50, 0);
        m3.setMark(55, 1);
        m3.setMark(80, 2);
        float mark3 = m3.getMark(0);
        for (int a=0; a<3; a++) {
            System.out.println("Marks for student "+ a +" is " + mark3);
            mark3 = m3.getMark(a + 1);
        }
        System.out.println(" ");
    }
}
