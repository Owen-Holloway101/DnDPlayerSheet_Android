package tk.zeryter.PlaySheetAndroid;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import tk.zeryter.PlaySheetAndroid.fragments.BasicDetailsFragment;
import tk.zeryter.PlaySheetAndroid.fragments.StartMenuFragment;

/**
 * Owen Holloway
 * ZerytSoft
 * Date: 25/11/13
 */

public class PlaySheetMain extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        basicDetailsFragment.setMainActivity(this);
        startMenuFragment.setMainActivity(this);

    }

    //ActionBar and Tabs
    private ActionBar actionBar;

    //Fragments + manager
    private FragmentManager fragmentManager = new FragmentManager(this);
    public static BasicDetailsFragment basicDetailsFragment = new BasicDetailsFragment();
    public static StartMenuFragment startMenuFragment = new StartMenuFragment();


    @Override
    protected void onStart() {
        super.onStart();

        actionBar = getActionBar();
        //actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);

        getFragmentManager().beginTransaction().add(R.id.viewSwitcher, startMenuFragment).commit();
    }

    @Override
    protected void onPause() {
        super.onPause();

        getFragmentManager().beginTransaction().remove(startMenuFragment).commit();

    }
}
