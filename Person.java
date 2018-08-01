
public class Person {
    private int age;
    private int size;
    private int gender;
    /*
      0 -> He
      1 -> She
      2 -> Something else ( They?)
     */
    private String nationality;
    private String surName;
    private String lastName;
    private String middleName;

    public Person ( String surName, String middleName, String lastName,
                    String nationality, int age, int size, int gender ) {
        this.surName = surName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.nationality = nationality;
        this.age = age;
        this.size = size;
        this.gender = gender;
    }

    @Override
    public String toString ( ) {
      return ( "This is " + surname + " " + middleName + " " + lastname + "."
              + ( gender == 0 ? "He is": ( gender == 1 ? "She is" : "They are" ))
              + " " + age + " years old and " + size + " cm in size."
              + ( gender == 0 ? "His" : ( gender == 1 ? "Her" : "Their" ))
              + " nationality is " + nationality + "." );
    }
}
