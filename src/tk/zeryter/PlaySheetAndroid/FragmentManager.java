package tk.zeryter.PlaySheetAndroid;

import android.app.Activity;
import android.app.Fragment;

import java.util.HashMap;
import java.util.Map;

/**
 * Owen Holloway
 * ZerytSoft
 * Date: 26/11/13
 */

public class FragmentManager {

    private Activity parentActivity = null;

    public FragmentManager(Activity parentActivity) {

        this.parentActivity = parentActivity;

    }

    //Container (R.id.containerId), set as zero to avoid null values on compile
    private int container = 0;

    public void setContainer(int container) {

        this.container = container;

    }

    //Map for fragments input to the manager
    private Map<String, Fragment> fragmentMap = new HashMap<String, Fragment>();
    private Fragment currentFragment = null;

    public void addFragment(String fragmentID, Fragment fragment) {
        //Used to add fragments to the fragment map
        fragmentMap.put(fragmentID, fragment);
    }

    public void firstFragment(String fragmentID) {
        //set the fragment with fragmentID to the current fragment
        if (!isPaused) {
            //onStart is run when onResume is mean to be called so this is required
            currentFragment = fragmentMap.get(fragmentID);
            parentActivity.getFragmentManager().beginTransaction().add(container, currentFragment).commit();
        }
    }

    public void switchTo(String fragmentID) {
        //set the fragment with fragmentID to the current fragment
        currentFragment = fragmentMap.get(fragmentID);
        parentActivity.getFragmentManager().beginTransaction().replace(container, currentFragment).commit();
    }

    private boolean isPaused = false;

    public void pause() {
        isPaused = true;
        parentActivity.getFragmentManager().beginTransaction().remove(currentFragment).commit();
    }

    public void resume() {
        if (isPaused) {
            parentActivity.getFragmentManager().beginTransaction().add(container, currentFragment).commit();
            isPaused = false;
        }
    }

}
