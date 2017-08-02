package id.yuktanding.animechart;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Created by ekkyh on 8/2/2017.
 */

public class Item_Adapter extends RecyclerView<Item_Adapter.MyviewHolder>
{
    private static final String TAG = "Android Debug";
    public static final String JUDUL = "JUDUL";
    public static final String SINOPSIS = "SINOPSIS";
    public static final int RATING = 0 ;

    private ArrayList<item> items;
    private Context context;

}
