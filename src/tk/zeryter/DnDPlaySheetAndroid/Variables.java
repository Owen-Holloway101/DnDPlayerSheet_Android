package tk.zeryter.DnDPlaySheetAndroid;

import android.app.Fragment;
import tk.zeryter.DnDPlaySheetAndroid.fragments.BasicDetailsViewFragment;
import tk.zeryter.DnDPlaySheetAndroid.fragments.RaceFragment;
import tk.zeryter.DnDPlaySheetAndroid.types.Race;

public class Variables {

    //Player info
    public static String playerName;
    public static String charName;
    public static int charAge;
    public static Race race;

    //Ability scores
    public static int STR;
    public static int CON;
    public static int DEX;
    public static int INT;
    public static int WIS;
    public static int CHA;

    //Fragments
    public static Fragment basicDetailsFragment = new BasicDetailsViewFragment();
    public static Fragment raceFragment = new RaceFragment();

}
