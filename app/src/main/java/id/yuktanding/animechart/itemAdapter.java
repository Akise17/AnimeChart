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

import com.squareup.picasso.Picasso;

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
    public static final String IMGURL = "";

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
        Item item2 = items.get(position);
//        holder.txtJudul.setText(item2.getJudulAnime());
//        holder.txtSinopsis.setText(item2.getSinopsisAnime());
//        holder.txtRating.setText(item2.getRatingAnime());
       // Picasso.with(context).load("http://i.imgur.com/DvpvklR.png").into(IMG);
        // 6. Set data Nama ViewHolder, onBindViewHolder, getItemCount

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public itemAdapter(ArrayList<Item> items, Context context) {
        this.items = items;
        this.context = context;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView txtJudul,txtSinopsis,txtRating;
        ImageView IMG;
        public MyViewHolder(View view){
            super(view);
//            txtJudul = (TextView) view.findViewById(R.id.txt_judulAnime);
//            txtSinopsis = (TextView) view.findViewById(R.id.txt_sinopsisAnime);
//            txtRating = (TextView) view.findViewById(R.id.txt_ratingAnime);
            IMG = (ImageView) view.findViewById(R.id.Anime_Name);

        }
    }
}
