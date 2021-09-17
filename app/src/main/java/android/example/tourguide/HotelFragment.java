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
public class HotelFragment extends Fragment {

    public HotelFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.hot11),getString(R.string.hot12),28.570284, 77.266758));
        words.add(new Word(getString(R.string.hot21),getString(R.string.hot22),28.644871, 77.327924));
        words.add(new Word(getString(R.string.hot31),getString(R.string.hot32),28.568616, 77.233145));
        words.add(new Word(getString(R.string.hot41),getString(R.string.hot42),22.579865, 72.968472));
        words.add(new Word(getString(R.string.hot51),getString(R.string.hot52),21.159725, 72.768208));

        WordAdapter adapter = new WordAdapter(getContext(),words);
        ListView listview = (ListView) rootView.findViewById(R.id.list);
        listview.setAdapter(adapter);
        listview.setBackgroundColor(Color.parseColor("#E3F2FD"));

        return rootView;
    }
}
