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

    //Fragments + manager
    public FragmentManager fragmentManager = new FragmentManager(this);
    public static StartMenuFragment startMenuFragment = new StartMenuFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        //this is the start activity, these fragments need to know this
        startMenuFragment.setParentActivity(this);

        //the fragment manager needs to know what fragments it managing, as well as its container
        fragmentManager.setContainer(R.id.viewSwitcher);
        fragmentManager.addFragment("startMenu",startMenuFragment);

    }

    //ActionBar and Tabs
    private ActionBar actionBar;

    @Override
    protected void onStart() {
        super.onStart();

        actionBar = getActionBar();
        //actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);

        //the startmenu is started first ... obviously
        fragmentManager.firstFragment("startMenu");
    }

    @Override
    protected void onPause() {
        super.onPause();

        fragmentManager.pause();

    }

    @Override
    protected void onResume() {
        super.onResume();

        fragmentManager.resume();
    }
}
