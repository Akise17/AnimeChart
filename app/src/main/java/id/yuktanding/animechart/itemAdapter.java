package id.yuktanding.animechart;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by ekkyh on 8/2/2017.
 */

public class itemAdapter extends RecyclerView.Adapter<itemAdapter.MyviewHolder>
{
    private static final String TAG = "Android Debug";
    public static final String JUDUL = "JUDUL";
    public static final String SINOPSIS = "SINOPSIS";
    public static final int RATING = 0 ;

    private ArrayList<Item> items;
    private Context context;


    @Override
    public itemAdapter.MyviewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(itemAdapter.MyviewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public itemAdapter(ArrayList<Item> items, Context context) {
        this.items = items;
        this.context = context;
    }
}
