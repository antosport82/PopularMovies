package com.example.anfio.popularmovies;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by anfio on 28/02/2018 - Popular Movies App - Udacity Project
 */

public class Movie implements Parcelable {

    private int mId;
    private String mTitle;
    private String mImageUrl;
    private String mSynopsis;
    private double mRating;
    private String mReleaseDate;

    public Movie(int id, String title, String imageUrl, String synopsis, double rating, String releaseDate) {
        this.mId = id;
        this.mTitle = title;
        this.mImageUrl = imageUrl;
        this.mSynopsis = synopsis;
        this.mRating = rating;
        this.mReleaseDate = releaseDate;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        this.mId = id;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.mImageUrl = imageUrl;
    }

    public String getSynopsis() {
        return mSynopsis;
    }

    public void setSynopsis(String synopsis) {
        this.mSynopsis = synopsis;
    }

    public double getRating() {
        return mRating;
    }

    public void setRating(double rating) {
        this.mRating = rating;
    }

    public String getReleaseDate() {
        return mReleaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.mReleaseDate = releaseDate;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mId);
        dest.writeString(mTitle);
        dest.writeString(mImageUrl);
        dest.writeString(mSynopsis);
        dest.writeDouble(mRating);
        dest.writeString(mReleaseDate);
    }

    // Parcelable CREATOR
    public static final Parcelable.Creator<Movie> CREATOR =
            new Parcelable.Creator<Movie>() {

                @Override
                public Movie createFromParcel(Parcel in) {
                    return new Movie(in);
                }

                @Override
                public Movie[] newArray(int size) {
                    return new Movie[size];
                }
            };

    // read parcel
    private Movie(Parcel in) {
        mId = in.readInt();
        mTitle = in.readString();
        mImageUrl = in.readString();
        mSynopsis = in.readString();
        mRating = in.readDouble();
        mReleaseDate = in.readString();
    }
}