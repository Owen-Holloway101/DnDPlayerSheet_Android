package tk.zeryter.DnDPlaySheetAndroid.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import tk.zeryter.DnDPlaySheetAndroid.R;

public class BasicDetailsViewFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.basicdetailsfragment, container, false);
    }

    public void onCreate(Bundle savedInstanceState) {

    }

}

