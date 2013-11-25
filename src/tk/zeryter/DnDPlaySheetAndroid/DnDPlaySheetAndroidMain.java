package tk.zeryter.DnDPlaySheetAndroid;

import android.app.*;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import tk.zeryter.DnDPlaySheetAndroid.fragments.BasicDetailsViewFragment;
import tk.zeryter.DnDPlaySheetAndroid.fragments.RaceFragment;

public class DnDPlaySheetAndroidMain extends Activity implements ActionBar.TabListener {

    //Set the activity for use calling other classes
    private Activity activity = this;
    private ActionBar actionBar;
    private ActionBar.Tab basicDetailsTab, raceTab, classTab;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        Log.d("DnDPlayerSheet","Hello World!");

        setContentView(R.layout.main);

        //FragmentSetUpAndStuff
        fragmentManager = getFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();

        //ActionBar tabs and stuff
        actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        basicDetailsTab = actionBar.newTab();
        raceTab = actionBar.newTab();
        classTab = actionBar.newTab();

        basicDetailsTab.setTabListener(this);
        raceTab.setTabListener(this);
        classTab.setTabListener(this);

        basicDetailsTab.setText("Details");
        raceTab.setText("Race");
        classTab.setText("Class");

        actionBar.addTab(basicDetailsTab);
        actionBar.addTab(raceTab);
        actionBar.addTab(classTab);

        fragmentTransaction.add(R.id.viewSwitcher, Variables.basicDetailsFragment);
        fragmentTransaction.add(R.id.viewSwitcher, Variables.raceFragment);
        fragmentTransaction.add(R.id.classPicker, Variables.classFragment);

        fragmentTransaction.show(Variables.basicDetailsFragment);

    }

    public void switchToFragment(Fragment fragment) {

        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.show(fragment);
        fragmentTransaction.commit();
        Log.d("DnDPlayerSheet","fragment show");
    }

    public void switchFromFragment(Fragment fragment) {

        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.hide(fragment);
        fragmentTransaction.commit();
        Log.d("DnDPlayerSheet","fragment hide");

    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {

        if (tab == basicDetailsTab) {
            Log.d("DnDPlayerSheet","basicDetailsTab selected");
            //fragmentTransaction.add(R.id.viewSwitcher,Variables.basicDetailsFragment);
            switchToFragment(Variables.basicDetailsFragment);
        }

        if (tab == raceTab) {
            Log.d("DnDPlayerSheet","raceTab selected");
            //fragmentTransaction.add(R.id.viewSwitcher,Variables.raceFragment);
            switchToFragment(Variables.raceFragment);
        }

        if (tab == classTab) {
            Log.d("DnDPlayerSheet","classTab selected");
            //fragmentTransaction.add(R.id.viewSwitcher,Variables.raceFragment);
            switchToFragment(Variables.classFragment);
        }
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

        if (tab == basicDetailsTab) {
            Log.d("DnDPlayerSheet","basicDetailsTab Unselected");
            //fragmentTransaction.hide(Variables.basicDetailsFragment);
            //fragmentTransaction.remove(Variables.basicDetailsFragment);
            switchFromFragment(Variables.basicDetailsFragment);
        }

        if (tab == raceTab) {
            Log.d("DnDPlayerSheet","raceTab Unselected");
            //fragmentTransaction.hide(Variables.raceFragment);
            //fragmentTransaction.remove(Variables.raceFragment);
            switchFromFragment(Variables.raceFragment);
        }

        if (tab == classTab) {
            Log.d("DnDPlayerSheet","classTab Unselected");
            //fragmentTransaction.hide(Variables.raceFragment);
            //fragmentTransaction.remove(Variables.raceFragment);
            switchFromFragment(Variables.classFragment);
        }
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }
}
