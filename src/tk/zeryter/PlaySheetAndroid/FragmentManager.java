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
    int container = 0;

    public void setContainer(int container) {

        this.container = container;

    }

    //Map for fragments input to the manager
    Map<String,Fragment> fragmentMap = new HashMap<String, Fragment>();
    Fragment currentFragment = null;

    public void addFragment(String fragmentID, Fragment fragment) {
        //Used to add fragments to the fragment map
        fragmentMap.put(fragmentID,fragment);
    }

    public void switchTo(String fragmentID) {
        //set the fragment with fragmentID to the current fragment
        currentFragment = fragmentMap.get(fragmentID);
        parentActivity.getFragmentManager().beginTransaction().replace(container,currentFragment).commit();
    }

    public void pause() {
        parentActivity.getFragmentManager().beginTransaction().remove(currentFragment).commit();
    }

    public void resume() {
        parentActivity.getFragmentManager().beginTransaction().replace(container,currentFragment).commit();
    }

}
