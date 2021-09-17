package android.example.tourguide;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Historic extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#EFEBE9"));
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new HistoricFragment())
                .commit();
    }
}
