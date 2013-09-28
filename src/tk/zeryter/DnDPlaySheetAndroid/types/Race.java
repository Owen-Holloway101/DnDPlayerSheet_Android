package tk.zeryter.DnDPlaySheetAndroid.types;

public class Race {

    public int speed;
    public String vision;
    public String language[];

    public String description;

    public void init() {

    }

}

class Dwarf extends Race {

    public void init() {

        speed = 6;
        vision = "Low-light";
        language = new String[]{"Common", "Dwarven"};

        description =
                "Carved from the bedrock of the universe, dwarves\n" +
                        "endured an age of servitude to giants before winning\n" +
                        "their freedom. Their mighty mountain fortress-cities\n" +
                        "testify to the power of their ancient empires. Even\n" +
                        "those who live in human cities are counted among the\n" +
                        "staunchest defenders against the darkness that threat-\n" +
                        "ens to engulf the world.\n" +
                        "Play a dwarf if you want . . .\n" +
                        "✦ to be tough, gruff, and strong as bedrock.\n" +
                        "✦ to bring glory to your ancestors or serve as your\n" +
                        "god’s right hand.\n" +
                        "✦ to be able to take as much punishment as you\n" +
                        "dish out.";
    }

}

class Dragonborn extends Race {

    //Filled with real values

    public void init() {

        speed = 6;
        vision = "normal";
        language = new String[]{"Common", "Draconic"};

        description =
                "Born to fight, dragonborn are a race of wandering\n" +
                        "mercenaries, soldiers, and adventurers. Long ago, their\n" +
                        "empire contended for worldwide dominion, but now\n" +
                        "only a few rootless clans of these honorable warriors\n" +
                        "remain to pass on their legends of ancient glory.\n" +
                        "Play a dragonborn if you want . . .\n" +
                        "✦ to look like a dragon.\n" +
                        "✦ to breathe acid, cold, fire, lightning, or poison.\n" +
                        "✦ to be a member of a race that favors the warlord,\n" +
                        "✦ to be the proud heir of an ancient, fallen empire.";

    }

}