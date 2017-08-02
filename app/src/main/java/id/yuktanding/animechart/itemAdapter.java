package id.yuktanding.animechart;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ekkyh on 8/2/2017.
 */

/*  Step Ketujuh RecyclerView: Buat Class Adapter untuk RecyclerView*/
/*  1. Buat Class ItemAdapter*/

/*  2. extends RecyclerView.Adapter<NamaAdapter.NamaViewHolder>*/
public class itemAdapter extends RecyclerView.Adapter<itemAdapter.MyViewHolder>
{
    private static final String TAG = "Android Debug";
    public static final String JUDUL = "JUDUL";
    public static final String SINOPSIS = "SINOPSIS";
    public static final int RATING = 0 ;

    /*  3. Buat Variabel untuk menyimpan data dari activity utama*/
    private ArrayList<Item> items;
    private Context context;
    /*  3. Buat Variabel untuk menyimpan data dari activity utama*/


    /*  4. Buat Constructor Adapter*/
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // 6. Set data Nama ViewHolder, onBindViewHolder, getItemCount
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        // fungsi inflate => buat objek view baru ngambil data dari parent
        // 6. Set data Nama ViewHolder, onBindViewHolder, getItemCount


        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(itemAdapter.MyViewHolder holder,final int position) {
        // 6. Set data Nama ViewHolder, onBindViewHolder, getItemCount

        // 6. Set data Nama ViewHolder, onBindViewHolder, getItemCount

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public itemAdapter(ArrayList<Item> items, Context context) {
        this.items = items;
        this.context = context;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        public MyViewHolder(View view){
            super(view);
            JUDUL = (TextView) view.findViewById(R.id.);
            SINOPSIS = (TextView) view.findViewById(R.id.);
            RATING = (TextView) view.findViewById(R.id)
        }
    }
}
