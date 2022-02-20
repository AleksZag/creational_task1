import java.util.OptionalInt;

public class Person {
    private String name;
    private String surname;
    protected int age;
    protected String address;


    public Person() {
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public boolean hasAge() {
        if (this.age == 0) {
            return false;
        } else return true;
    }

    public boolean hasAddress() {
        if (this.address == null) {
            return false;
        } else return true;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }
    public int getAge() {
        return this.age;
    }

    public String getAddress() {
        if (hasAddress()) {
            return "Адрес не известен";
        }
        return this.address;
    }

    public void setSurname(String surname){
        if (this.surname==null) {
            this.surname=surname;
        }
    }

    public void setName(String name){
        if (this.name==null) {
            this.name=name;
        }
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        if (hasAge()) {
            this.age = this.age + 1;
        }
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder newChild = new PersonBuilder();
        newChild.setSurname(this.surname).setAge(0).setAddress(this.address);
        return newChild;

    }

    @Override
    public String toString() {
        return "name: " + name + '\'' +
                ", surname: " + surname + '\'' +
                ", age: " + age +
                ", addres: " + address;
    }


    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }

}
