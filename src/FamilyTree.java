import java.util.ArrayList;

public class FamilyTree {
    private ArrayList<Human> family;

    public FamilyTree() {
        this.family = new ArrayList<>();
    }
    public ArrayList<Human> addHuman(Human human){
        this.family.add(human);
        return this.family;
    }
    public void showFamilyMembers(){
        for(Human human: this.family){
            System.out.println(human);
        }
    }



}

