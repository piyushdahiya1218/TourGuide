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
public class HistoricFragment extends Fragment
{

    public HistoricFragment()
    {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word(getString(R.string.his11),getString(R.string.his12),28.5933,77.2507));
        words.add(new Word(getString(R.string.his21),getString(R.string.his22),28.6129,77.2295));
        words.add(new Word(getString(R.string.his31),getString(R.string.his32),28.656327, 77.243768));
        words.add(new Word(getString(R.string.his41),getString(R.string.his42),28.660886, 77.427154));
        words.add(new Word(getString(R.string.his51),getString(R.string.his52),28.6562,77.2410));

        WordAdapter adapter = new WordAdapter(getContext(),words);
        ListView listview = (ListView) rootView.findViewById(R.id.list);
        listview.setAdapter(adapter);
        listview.setBackgroundColor(Color.parseColor("#EFEBE9"));


        return rootView;
    }
}
