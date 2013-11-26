package tk.zeryter.PlaySheetAndroid.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import tk.zeryter.PlaySheetAndroid.PlaySheetMain;
import tk.zeryter.PlaySheetAndroid.R;

/**
 * Owen Holloway
 * ZerytSoft
 * Date: 26/11/13
 */

public class StartMenuFragment extends Fragment implements View.OnClickListener{

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.startmenu, container, false);
    }

    //GUI elements
    Button newCharButton, testButton2, testButton3;

    @Override
    public void onStart() {
        super.onStart();

        newCharButton = (Button) getView().findViewById(R.id.newCharButton);
        testButton2 = (Button) getView().findViewById(R.id.testButton2);
        testButton3 = (Button) getView().findViewById(R.id.testButton3);
        newCharButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        mainActivity.getFragmentManager().beginTransaction().replace(R.id.viewSwitcher, PlaySheetMain.basicDetailsFragment).commit();

    }

    //MainActivity
    private Activity mainActivity = null;

    public void setMainActivity(Activity activity) {
        this.mainActivity = activity;
    }

}
