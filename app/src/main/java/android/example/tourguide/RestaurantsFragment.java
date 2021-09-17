package android.example.tourguide;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.res11),getString(R.string.res12),R.drawable.maini,28.669957, 77.325467));
        words.add(new Word(getString(R.string.res21),getString(R.string.res22),R.drawable.cafewink,28.657344, 77.317226));
        words.add(new Word(getString(R.string.res31),getString(R.string.res32),R.drawable.pizzahut,28.675882, 77.320939));
        words.add(new Word(getString(R.string.res41),getString(R.string.res42),R.drawable.bikanerwala,28.653280, 77.342785));
        words.add(new Word(getString(R.string.res51),getString(R.string.res52),R.drawable.shubham,28.677892, 77.315304));
        words.add(new Word(getString(R.string.res61),getString(R.string.res62),R.drawable.yellow,28.540473, 77.367993));
        words.add(new Word(getString(R.string.res71),getString(R.string.res72),R.drawable.dosa,28.667360, 77.328991));
        words.add(new Word(getString(R.string.res81),getString(R.string.res82),R.drawable.sachdeva,28.671148, 77.318289));

        WordAdapter adapter = new WordAdapter(getContext(),words);
        ListView listview = (ListView) rootView.findViewById(R.id.list);
        listview.setAdapter(adapter);
        listview.setBackgroundColor(Color.parseColor("#F9FBE7"));

        return rootView;
    }
}
