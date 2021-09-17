package android.example.tourguide;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word>
{

    public WordAdapter(Context context, ArrayList<Word> words)
    {
        super(context, 0, words);
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent)
    {
        View listItemView = convertView;
        if (listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.single_list, parent, false);
        }
         final Word currentword = getItem(position);
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        nameTextView.setText(currentword.getlocationname());
        TextView desTextView = (TextView) listItemView.findViewById(R.id.des);
        desTextView.setText(currentword.getlocationdes());
        ImageView imageview = (ImageView) listItemView.findViewById(R.id.image);
        if (currentword.hasImage())
        {
            imageview.setImageResource(currentword.getimage());
            imageview.setVisibility(View.VISIBLE);
        }
        else
        {
            imageview.setVisibility(View.GONE);
        }
        Location lat = new Location("");
        lat.setLatitude(currentword.getlat());
        Location lon = new Location("");
        lon.setLongitude(currentword.getlon());

        TextView coor = (TextView) listItemView.findViewById(R.id.coordinates);
        coor.setText("Take me there");
        coor.setGravity(Gravity.CENTER_HORIZONTAL);
        coor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = "geo:0,0?q="+String.valueOf(currentword.getlat())+","+String.valueOf(currentword.getlon())+ " (" + "Label which you want" + ")";
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(str));
                intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                getContext().startActivity(intent);
            }
        });

        TextView nametextView = (TextView) listItemView.findViewById(R.id.name);
        nametextView.setGravity(Gravity.CENTER_HORIZONTAL);
        TextView destextview = (TextView) listItemView.findViewById(R.id.des);
        destextview.setGravity(Gravity.CENTER_HORIZONTAL);

        return listItemView;
    }
}
