package com.uiexperiments.rodrigobrauwers.uiexperiments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.Locale;

/**
 * Created by rodrigobrauwers on 01/12/17.
 */

public class CameraFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.content_camera, container, false);
        getActivity().setTitle("Camera");
        return rootView;
    }

}
