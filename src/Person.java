public class Person {
    public String personInfo(String name, String surname, String city, long phone) {
       return String.format("Зателефонувати  громадянину %s %s із міста %s можна за номером %d.", name, surname, city, phone);
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println(person1.personInfo("Will", "Smith", "New York", 2936729462846L));
        Person person2 = new Person();
        System.out.println(person2.personInfo("Jackie", "Chan", "Shanghai",  12312412412L));
        Person person3 = new Person();
        System.out.println(person3.personInfo("Sherlock", "Holmes", "London", 37742123513L));
    }
}
