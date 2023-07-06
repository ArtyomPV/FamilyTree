public class Human {
    private String fullName;
    private Human mother;
    private Human father;
    private Gender gender;

    private String birthday;
    public Human(String fullName, String birthday, Human mother, Human father, Gender gender) {
        this.fullName = fullName;
        this.birthday = birthday;
        this.mother = mother;
        this.father = father;
        this.gender = gender;
    }
    public String getFullName() {return fullName;}

    public Human getMother() {return mother;}

    public Human getFather() {return father;}

    public Gender getGender() {return gender;}

    public String getBirthday() {return birthday;}

    public String getInfo(){
        return String.format("%s date of birth: %s",getFullName(), getBirthday());
    }

    @Override
    public String toString() {
        return this.getInfo();
    }
}
