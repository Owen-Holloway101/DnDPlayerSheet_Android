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

    //Fragments
    public static Fragment basicDetailsFragment = new BasicDetailsViewFragment();
    public static Fragment raceFragment = new RaceFragment();

}
