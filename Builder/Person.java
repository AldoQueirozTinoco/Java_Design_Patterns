package Main.Builder;

public class Person {
    private int age;
    private String name;
    private String forname;
    private String gender;

    public Person(int age, String name, String forname, String gender) {
        this.age = age;
        this.name = name;
        this.forname = forname;
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setForname(String forname) {
        this.forname = forname;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString(){
        return "Name: " + name + " Age: " + age + " Gender: " + gender;
    }
    public static class PersonBuilder {
        private int age;
        private String name;
        private String forname;
        private String gender;

        public PersonBuilder Age(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder Name(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder Forname(String forname) {
            this.forname = forname;
            return this;
        }

        public PersonBuilder Gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Person build()  {
            return new Person(age, name, forname, gender);
        }
    }
}
