package tk.zeryter.DnDPlaySheetAndroid;

import android.app.Fragment;
import tk.zeryter.DnDPlaySheetAndroid.fragments.BasicDetailsViewFragment;
import tk.zeryter.DnDPlaySheetAndroid.fragments.ClassFragment;
import tk.zeryter.DnDPlaySheetAndroid.fragments.RaceFragment;

public class Variables {

    //Player info
    public static String playerName;
    public static String charName;
    public static int charAge;

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
    public static Fragment classFragment = new ClassFragment();

}
