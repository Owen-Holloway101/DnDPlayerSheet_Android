package tk.zeryter.DnDPlaySheetAndroid;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.ActionBar;
import tk.zeryter.DnDPlaySheetAndroid.fragments.BasicDetailsViewFragment;

public class DnDPlaySheetAndroidMain extends Activity {

    //Set the activity for use calling other classes
    private Activity activity = this;

    private ActionBar actionBar;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);

        actionBar = getActionBar();

    }

}
