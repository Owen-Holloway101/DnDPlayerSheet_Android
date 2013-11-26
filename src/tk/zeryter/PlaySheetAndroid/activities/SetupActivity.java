package tk.zeryter.PlaySheetAndroid.activities;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import tk.zeryter.PlaySheetAndroid.FragmentManager;
import tk.zeryter.PlaySheetAndroid.R;
import tk.zeryter.PlaySheetAndroid.fragments.BasicDetailsFragment;

/**
 * Owen Holloway
 * ZerytSoft
 * Date: 26/11/13
 */

public class SetupActivity extends Activity {

    //Fragments + manager
    public FragmentManager fragmentManager = new FragmentManager(this);
    public static BasicDetailsFragment basicDetailsFragment = new BasicDetailsFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);    //To change body of overridden methods use File | Settings | File Templates.

        setContentView(R.layout.main); //TODO make a layout for this fragment or rename main

        //This is a parent activity, this fragments need to know this
        basicDetailsFragment.setParentActivity(this);

        //setup the fragments in the fragment manager
        fragmentManager.setContainer(R.id.viewSwitcher);
        fragmentManager.addFragment("basicDetails",basicDetailsFragment);
    }

    //ActionBar and Tabs
    private ActionBar actionBar;

    @Override
    protected void onStart() {
        super.onStart();

        actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        //basic details is the first fragment for this activity
        fragmentManager.firstFragment("basicDetails");
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
