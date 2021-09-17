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
public class ParkFragment extends Fragment {

    public ParkFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.park11),getString(R.string.park12),19.043209, 73.019973));
        words.add(new Word(getString(R.string.park21),getString(R.string.park22),28.624148, 77.335644));
        words.add(new Word(getString(R.string.park31),getString(R.string.park32),28.670627, 77.325760));
        words.add(new Word(getString(R.string.park41),getString(R.string.park42),28.668488, 77.327313));

        WordAdapter adapter = new WordAdapter(getContext(),words);
        ListView listview = (ListView) rootView.findViewById(R.id.list);
        listview.setAdapter(adapter);
        listview.setBackgroundColor(Color.parseColor("#E8F5E9"));

        return rootView;
    }
}
