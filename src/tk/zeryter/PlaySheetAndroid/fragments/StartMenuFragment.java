package tk.zeryter.PlaySheetAndroid.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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
    Button testButton1, testButton2, testButton3;

    @Override
    public void onStart() {
        super.onStart();

        testButton1 = (Button) getView().findViewById(R.id.testButton1);
        testButton2 = (Button) getView().findViewById(R.id.testButton2);
        testButton3 = (Button) getView().findViewById(R.id.testButton3);

    }

    @Override
    public void onClick(View v) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
