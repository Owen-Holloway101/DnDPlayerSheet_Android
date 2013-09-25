package tk.zeryter.DnDPlaySheetAndroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DnDPlaySheetAndroidMain extends Activity {

    private Button setName;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);

        setName = (Button) findViewById(R.id.setName);


        setName.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                setName.setText("You clicked me!");

            }


        });


    }
}
