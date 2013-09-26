package tk.zeryter.DnDPlaySheetAndroid;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DnDPlaySheetAndroidMain extends Activity {

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);
        /*
        setName = (Button) findViewById(R.id.setName);
        setName.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                name = String.valueOf(nameEditText.getText());

                nameEditText.setBackgroundColor(Color.GREEN);
                nameEditText.setFocusable(false);

            }
        });
        */
    }

    public void onStart() {
    }
}
