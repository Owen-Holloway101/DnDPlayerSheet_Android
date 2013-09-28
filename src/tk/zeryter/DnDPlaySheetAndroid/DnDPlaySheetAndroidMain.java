package tk.zeryter.DnDPlaySheetAndroid;

import android.app.*;
import android.os.Bundle;
import tk.zeryter.DnDPlaySheetAndroid.fragments.BasicDetailsViewFragment;

public class DnDPlaySheetAndroidMain extends Activity {

    //Set the activity for use calling other classes
    private Activity activity = this;

    private ActionBar actionBar;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);

        actionBar = getActionBar();

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        BasicDetailsViewFragment fragment = new BasicDetailsViewFragment();
        fragmentTransaction.add(R.id.viewSwitcher,fragment);
        fragmentTransaction.commit();

    }

}
