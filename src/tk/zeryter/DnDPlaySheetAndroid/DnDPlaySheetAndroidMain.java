package tk.zeryter.DnDPlaySheetAndroid;

import android.app.Activity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class DnDPlaySheetAndroidMain extends Activity {

    private SeekBar setAge;

    private TextView setAgePrompt;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);

        setAgePrompt = (TextView) findViewById(R.id.setCharAgePrompt);

        setAge = (SeekBar) findViewById(R.id.setCharAge);

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
