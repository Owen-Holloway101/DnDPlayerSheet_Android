package tk.zeryter.DnDPlaySheetAndroid;

import android.app.Activity;
import android.os.Bundle;

public class DnDPlaySheetAndroidMain extends Activity {

    //Set the activity for use calling other classes
    private Activity activity = this;



    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        Variables.basicDetailsView.init(activity);



    }
}
