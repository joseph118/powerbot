package Model;

/**
 * Created by Joseph18 on 12/8/2014.
 */
public class Ability {
    private int id;
    private String name;
    private int adrenaline;
    private AbilityType type;

    public Ability(int id, String name, int adrenaline, AbilityType abilityType){
        this.id = id;
        this.name = name;
        this.adrenaline = adrenaline;
        this.type = abilityType;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public int getAdrenaline(){
        return this.adrenaline;
    }

    public AbilityType getAbilityType(){ return this.type; }

    public enum AbilityType{
        Magic,
        Defence,
        Constitution,
        Strength,
        Ranged,
        Attack
    }
}

