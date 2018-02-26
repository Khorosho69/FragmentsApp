package com.anton.fragmentsapp.fragments;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.anton.fragmentsapp.R;
import com.anton.fragmentsapp.activities.MainActivity;
import com.anton.fragmentsapp.architecture_components.MessageViewModel;

public class OutputFragment extends Fragment {

    private TextView mOutputTextView;
    private MessageViewModel mViewModel;

    public OutputFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mViewModel = ViewModelProviders.of(getActivity()).get(MessageViewModel.class);
        mViewModel.getFragmetnsDataM().observe(this, s -> mOutputTextView.setText(s));
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_output, container, false);
        mOutputTextView = view.findViewById(R.id.outputTextView);
        return view;
    }
}
