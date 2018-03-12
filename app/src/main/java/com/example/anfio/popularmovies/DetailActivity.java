package com.example.anfio.popularmovies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailActivity extends AppCompatActivity {

    @BindView(R.id.tv_title) TextView titleTv;
    @BindView(R.id.iv_movie_image) ImageView imageUrlIv;
    @BindView(R.id.tv_synopsis) TextView synopsisTv;
    @BindView(R.id.tv_rating) TextView ratingTv;
    @BindView(R.id.tv_release_date) TextView releaseDateTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ButterKnife.bind(this);
        // get Movie data from the intent (Parcelable is used)
        Movie myParcelable = getIntent().getParcelableExtra("myDataKey");
        String title = myParcelable.getTitle();
        String imageUrl = myParcelable.getImageUrl();
        String synopsis = myParcelable.getSynopsis();
        double rating = myParcelable.getRating();
        String releaseDate = myParcelable.getReleaseDate();

        titleTv.setText(title);
        // build complete image path
        String path = MovieAdapter.BASE_URL_IMAGE + imageUrl;
        Picasso.with(this)
                .load(path)
                .placeholder(R.drawable.loading)
                .error(R.drawable.ic_error_outline_black_24dp)
                .into(imageUrlIv);
        synopsisTv.setText(synopsis);
        ratingTv.setText(String.valueOf(rating));
        releaseDateTv.setText(releaseDate);
    }
}