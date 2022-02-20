public class PersonBuilder {

    private Person newPerson;

    public PersonBuilder() {
        newPerson = new Person();
    }

    public PersonBuilder setName(String name) {
        newPerson.setName(name);
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        newPerson.setSurname(surname);
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("возраст не может быть отрицательным");
        } else newPerson.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        newPerson.address = address;
        return this;
    }

    public Person build() {
        if (newPerson.getName() == null || newPerson.getSurname() == null) {
            throw new IllegalStateException("не указано имя и/или фамилия");
        }
        return newPerson;
    }
}
