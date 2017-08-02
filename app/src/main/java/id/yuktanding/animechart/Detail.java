package id.yuktanding.animechart;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    private static final String TAG = "android debug =>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"activity detail onCreate");

        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        TextView txtJudul,txtSinopsis,txtRating;
        ImageView imgAnime;

        txtJudul = (TextView) findViewById(R.id.txt_judulAnime);
        txtSinopsis = (TextView) findViewById(R.id.txt_sinopsisAnime);
        txtRating = (TextView) findViewById(R.id.txt_ratingAnime);
        imgAnime = (ImageView) findViewById(R.id.img_anime);

        Item item = getIntent().getParcelableExtra("ITM");
        txtJudul.setText(item.getJudulAnime());
        txtRating.setText(""+item.getRatingAnime());
        txtSinopsis.setText(item.getSinopsisAnime());
//        imgAnime.setImageResource(item.getImgAnime());


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
