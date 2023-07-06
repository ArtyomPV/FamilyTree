import java.util.ArrayList;

public class FamilyTree {
    private ArrayList<Human> family;

    public FamilyTree() {
        this.family = new ArrayList<>();
    }
    public void addHuman(Human human){
        this.family.add(human);
    }
    public void showFamilyMembers(){
        for (Human human : this.family) {
            System.out.println("---------------");
            System.out.println(human);
        }

    }
    public Human findByName(String name){
        Human someone = null;
        for (Human human : this.family) {
            if(human.getFullName().equals(name)){
                return human;
            }
        }
        return null;
    }
    //TODO не работает метод
     public void showHumanTree(String name){
         Human someone = findByName(name);
         Human mother = null;
         Human father = null;
         Human brother = null;
         Human sister = null;
         Human son = null;
         Human dauther = null;
        if(someone != null){
            for (Human human:this.family) {
                if(human.getMother().equals(someone.getFullName())){
                    if (human.getGender().equals(Gender.Male)){
                        son = human;
                    } else {
                        dauther = human;
                    }
                }
            }
            System.out.println(someone);
            System.out.println(
                    String.format(
                            "Родители:\n\tмать:\t%s\n\tотец:\t%s",someone.getMother(), someone.getFather()
                    ));
            System.out.println(
                    String.format(
                            "Дети:\n\tСын:\t%s\n\tДочь:\t%s",son, dauther
                    ));
        } else {
            System.out.println("Человека с таким именем нет");
        }
     }

}

