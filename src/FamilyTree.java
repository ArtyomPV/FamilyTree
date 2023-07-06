import java.util.ArrayList;

public class FamilyTree {
    private ArrayList<Human> family;

    public FamilyTree(ArrayList<Human> family) {
        this.family = family;
    }
    public ArrayList<Human> addHuman(Human human){
        this.family.add(human);
        return this.family;
    }



}

