package tk.zeryter.DnDPlaySheetAndroid.types;

public class Race {

        public int abilityScore[];
        public int speed;
        public String vision;
        public String language[];

        public void init() {

        }

}

class Elf extends Race {

    public void init() {

        abilityScore = new int[]{14, 12, 13, 14, 14, 16}; //TODO change to real scores
        speed = 6; //TODO change to real speed!!
        vision = "dark";
        language = new String[]{"Common","Elven","[PLAYER-CHOICE]"}; //TODO change to real languages

    }

}