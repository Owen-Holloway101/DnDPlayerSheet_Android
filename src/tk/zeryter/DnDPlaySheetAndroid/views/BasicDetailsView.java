package tk.zeryter.DnDPlaySheetAndroid.views;

import android.app.Activity;
import android.widget.SeekBar;
import android.widget.TextView;
import tk.zeryter.DnDPlaySheetAndroid.R;

public class BasicDetailsView {

    //Activity that calls class (to be set in init)
    private Activity activity;

    TextView setAgePrompt;

    SeekBar setAge;

    public void init(Activity callingActivity) {

        this.activity = callingActivity;

        activity.setContentView(R.layout.basicdetails);

        setAgePrompt = (TextView) activity.findViewById(R.id.setCharAgePrompt);

        setAge = (SeekBar) activity.findViewById(R.id.setCharAge);

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
