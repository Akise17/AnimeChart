package id.yuktanding.animechart;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import static id.yuktanding.animechart.R.layout.item;

public class ListAnime extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Item> itemArrayList;

    private static final String TAG = "android debug =>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_anime);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Log.d(TAG,"activity detail onCreate");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        itemArrayList = new ArrayList<>();

        itemArrayList.add(new Item("One Piece",5,"Perjalanan Bajak Laut", "http://static.bandainamcogames.eu/sites_products/onepiece/uploads/2015/12/OPBB_Share_Visual.jpg"));

        recyclerView = (RecyclerView) findViewById(R.id.grid_layout);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3,GridLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);


        /*  Step Kedelapan RecyclerView: buat objek dari adapter yang telah dibuat*/
        itemAdapter itemAdapter = new itemAdapter(itemArrayList, this);
        /*  Step Kedelapan RecyclerView: buat objek dari adapter yang telah dibuat*/

        /*  Step Kesembilan RecyclerView: Set objek adapter yang sudah dibuat*/
        recyclerView.setAdapter(itemAdapter);
        /*  Step Kesembilan RecyclerView: Set objek adapter yang sudah dibuat*/

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_list_anime, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
