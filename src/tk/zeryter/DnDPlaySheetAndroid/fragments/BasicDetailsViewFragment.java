package tk.zeryter.DnDPlaySheetAndroid.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import tk.zeryter.DnDPlaySheetAndroid.R;

public class BasicDetailsViewFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.basicdetailsfragment, container, false);
    }

    TextView setAgePrompt;

    SeekBar setAge;

    public void onStart() {

        super.onStart();

        setAgePrompt = (TextView) getView().findViewById(R.id.setCharAgePrompt);

        setAge = (SeekBar) getView().findViewById(R.id.setCharAge);


        setAge.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int currentProgress = seekBar.getProgress();
                setAgePrompt.setText("Age: " + (currentProgress + 10) );
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });


    }

}

