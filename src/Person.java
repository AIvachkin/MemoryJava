public class Person {

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    String name ;
    String surname ;


    public Person (String name, String surname) {
        this.name = name;
        this.surname = surname ;

    }

@Override
    public String toString () {
        return this.name + " " + this.surname ;
    }

}
