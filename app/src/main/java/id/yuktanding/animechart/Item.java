package id.yuktanding.animechart;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ImageView;

/**
 * Created by Akise on 02/08/2017.
 */

public class Item implements Parcelable{
    private String judulAnime,  sinopsisAnime, imgAnime;
    private int ratingAnime;

    public String getJudulAnime() {
        return judulAnime;
    }

    public void setJudulAnime(String judulAnime) {
        this.judulAnime = judulAnime;
    }

    public int getRatingAnime() {
        return ratingAnime;
    }

    public void setRatingAnime(int ratingAnime) {
        this.ratingAnime = ratingAnime;
    }

    public String getSinopsisAnime() {
        return sinopsisAnime;
    }

    public void setSinopsisAnime(String sinopsisAnime) {
        this.sinopsisAnime = sinopsisAnime;
    }

    public String getImgAnime() {
        return imgAnime;
    }

    public void setImgAnime(String imgAnime) {
        this.imgAnime = imgAnime;
    }

    public Item(String judulAnime, int ratingAnime, String sinopsisAnime, String imgAnime) {
        this.judulAnime = judulAnime;
        this.ratingAnime = ratingAnime;
        this.sinopsisAnime = sinopsisAnime;
        this.imgAnime = imgAnime;
    }

    public static Creator<Item> getCREATOR() {
        return CREATOR;
    }

    public Item() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.judulAnime);
        dest.writeString(this.sinopsisAnime);
        dest.writeString(this.imgAnime);
        dest.writeInt(this.ratingAnime);
    }

    protected Item(Parcel in) {
        this.judulAnime = in.readString();
        this.sinopsisAnime = in.readString();
        this.imgAnime = in.readString();
        this.ratingAnime = in.readInt();
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
