package com.anton.fragmentsapp.fragments;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.anton.fragmentsapp.R;
import com.anton.fragmentsapp.activities.MainActivity;
import com.anton.fragmentsapp.architecture_components.MessageViewModel;


public class InputFragment extends Fragment {

    private MessageViewModel mViewModel;
    EditText mInputEditText;

    public InputFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mViewModel = ViewModelProviders.of((MainActivity) context).get(MessageViewModel.class);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_input, container, false);
        mInputEditText = view.findViewById(R.id.inputEditText);

        mInputEditText.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mViewModel.setFragmetnsData(s.toString().replaceAll("\\d", ""));
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        return view;
    }
}
