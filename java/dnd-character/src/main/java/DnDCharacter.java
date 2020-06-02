import java.util.Random;

class DnDCharacter {

    int ability;
    int hitpoints;
    int modifier;
    int strength;
    int dexterity;
    int constitution;
    int intelligence;
    int wisdom;
    int charisma;

    int rollDices(){
        return new Random().ints(4, 1, 7).sorted().skip(1).sum();
    }

    public DnDCharacter (){
        strength  = ability();
        dexterity  = ability();
        constitution  = ability();
        intelligence  = ability();
        wisdom  = ability();
        charisma  = ability();
        hitpoints = 10 + modifier(constitution);
    }

    int ability() { return rollDices(); }

    int modifier(int input) {
        return Math.floorDiv(input - 10, 2);
    }

    int getStrength() { return strength; }

    int getDexterity() { return dexterity; }

    int getConstitution() { return constitution; }

    int getIntelligence() { return intelligence; }

    int getWisdom() { return wisdom; }

    int getCharisma() { return charisma; }

    int getHitpoints() { return hitpoints; }

}
