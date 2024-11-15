public class Person {
    private String name;
    private int age;
    private String passportNumber;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        if (passportNumber == ""){
            System.out.println("Error");
        } else if (passportNumber.length() != 10) {
            System.out.println("Error");
        } else {
            this.passportNumber = passportNumber;
        }
    }
}
