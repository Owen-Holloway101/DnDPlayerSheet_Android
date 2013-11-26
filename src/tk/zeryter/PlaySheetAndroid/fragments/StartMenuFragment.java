package tk.zeryter.PlaySheetAndroid.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import tk.zeryter.PlaySheetAndroid.R;
import tk.zeryter.PlaySheetAndroid.activities.SetupActivity;

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
    Button newCharButton, openCharButton, openResourceButton;

    @Override
    public void onStart() {
        super.onStart();

        newCharButton = (Button) getView().findViewById(R.id.newCharButton);
        openCharButton = (Button) getView().findViewById(R.id.openCharButton);
        openResourceButton = (Button) getView().findViewById(R.id.openResourceButton);
        newCharButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(parentActivity, SetupActivity.class);
        parentActivity.startActivity(intent);

    }

    //MainActivity
    private Activity parentActivity = null;

    public void setParentActivity(Activity activity) {
        this.parentActivity = activity;
    }

}
