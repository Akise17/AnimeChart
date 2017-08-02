package id.yuktanding.animechart;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ImageView;

/**
 * Created by Akise on 02/08/2017.
 */

public class Item implements Parcelable{
    private String judulAnime, ratingAnime, sinopsisAnime;
    private int imgAnime;

    public String getJudulAnime() {
        return judulAnime;
    }

    public void setJudulAnime(String judulAnime) {
        this.judulAnime = judulAnime;
    }

    public String getRatingAnime() {
        return ratingAnime;
    }

    public void setRatingAnime(String ratingAnime) {
        this.ratingAnime = ratingAnime;
    }

    public String getSinopsisAnime() {
        return sinopsisAnime;
    }

    public void setSinopsisAnime(String sinopsisAnime) {
        this.sinopsisAnime = sinopsisAnime;
    }

    public int getImgAnime() {
        return imgAnime;
    }

    public void setImgAnime(int imgAnime) {
        this.imgAnime = imgAnime;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public Item(String judulAnime, String ratingAnime, String sinopsisAnime, int imgAnime) {
        this.judulAnime = judulAnime;
        this.ratingAnime = ratingAnime;
        this.sinopsisAnime = sinopsisAnime;
        this.imgAnime = imgAnime;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.judulAnime);
        dest.writeString(this.ratingAnime);
        dest.writeString(this.sinopsisAnime);
        dest.writeInt(this.imgAnime);
    }

    public Item() {
    }

    protected Item(Parcel in) {
        this.judulAnime = in.readString();
        this.ratingAnime = in.readString();
        this.sinopsisAnime = in.readString();
        this.imgAnime = in.readInt();
    }

    public static final Creator<Item> CREATOR = new Creator<Item>() {
        @Override
        public Item createFromParcel(Parcel source) {
            return new Item(source);
        }

        @Override
        public Item[] newArray(int size) {
            return new Item[size];
        }
    };
}
