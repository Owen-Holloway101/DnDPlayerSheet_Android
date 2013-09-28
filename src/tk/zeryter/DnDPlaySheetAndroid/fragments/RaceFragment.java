package tk.zeryter.DnDPlaySheetAndroid.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import tk.zeryter.DnDPlaySheetAndroid.R;

public class RaceFragment extends Fragment implements AdapterView.OnItemSelectedListener {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.racefragment, container, false);
    }

    Spinner racePicker;

    ArrayAdapter<CharSequence> adapter;

    public void onStart() {

        super.onStart();

        racePicker = (Spinner) getView().findViewById(R.id.racePicker);


        adapter = ArrayAdapter.createFromResource(getActivity().getBaseContext(), R.array.races, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        racePicker.setAdapter(adapter);
        racePicker.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
    }
}


