package com.uiexperiments.rodrigobrauwers.uiexperiments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by rodrigobrauwers on 01/12/17.
 */

public class ImageFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.content_activity_image, container, false);
        getActivity().setTitle("Gallery");
        return rootView;
    }

}
