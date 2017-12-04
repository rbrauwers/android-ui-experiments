package com.uiexperiments.rodrigobrauwers.uiexperiments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


/**
 * Created by rodrigobrauwers on 01/12/17.
 */

public class BottomTabsFragment extends Fragment implements BottomNavigationView.OnNavigationItemSelectedListener {

    private TextView textView;
    private ConstraintLayout mainContainer;

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tabs, container, false);
        getActivity().setTitle("Bottom tabs");

        BottomNavigationView bottomNavigationView = rootView.findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);

        mainContainer = rootView.findViewById(R.id.container);
        textView = rootView.findViewById(R.id.textView);

        rootView.findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(mainContainer);
                textView.setVisibility(textView.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);
            }
        });

        return rootView;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Toast.makeText(getActivity(), "Item selected", Toast.LENGTH_SHORT).show();
        Snackbar snackbar = Snackbar.make(getView(), "Item Selected. This is a multiline snackbar with a really really long text", Snackbar.LENGTH_SHORT);
        View snackbarView = snackbar.getView();
        TextView textView = (TextView) snackbarView.findViewById(android.support.design.R.id.snackbar_text);
        textView.setMaxLines(5);
        snackbar.show();
        return true;
    }

}
