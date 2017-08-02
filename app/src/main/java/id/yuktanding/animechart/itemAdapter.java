package id.yuktanding.animechart;

import android.content.Context;
import android.content.Intent;
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

        final Item item2 = items.get(position);
        Picasso.with(context).load(item2.getImgAnime()).into(holder.IMG);
        // 6. Set data Nama ViewHolder, onBindViewHolder, getItemCount

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Detail.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("ITM", item2); //ngirim data ke tetangga
                context.startActivity(intent);
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
        ImageView IMG;
        public MyViewHolder(View view){
            super(view);

            IMG = (ImageView) view.findViewById(R.id.Anime_Name);

        }
    }
}
