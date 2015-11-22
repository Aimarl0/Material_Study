package com.example.aimar.materialstudy;

import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;

import java.io.File;

/**
 * Created by aimar on 2015/11/21.
 */
public class MoviePage extends Fragment implements MovieIsOnView {

    private RecyclerView mRecyclerView;
    private MovieAdapter mAdapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.movie_page, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3, LinearLayoutManager.VERTICAL, false));
        mAdapter = new MovieAdapter();
        mRecyclerView.setAdapter(mAdapter);

        return view;
    }

    private class MovieAdapter extends RecyclerView.Adapter {

        private class QuickHolder extends RecyclerView.ViewHolder {

            private SimpleDraweeView mQuickImage;
            private TextView mTextView;

            public QuickHolder(View itemView) {
                super(itemView);
                ((CardView)itemView).setUseCompatPadding(true);
                mQuickImage = (SimpleDraweeView) itemView.findViewById(R.id.quick_view_image);
                mTextView = (TextView) itemView.findViewById(R.id.quick_title);
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = getActivity().getLayoutInflater().inflate(R.layout.item_movie, parent, false);
            return new QuickHolder(view);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            ((QuickHolder)holder).mTextView.setText("我的少女时代");
            ((QuickHolder)holder).mQuickImage.setImageURI(Uri.parse("https://img1.doubanio.com/view/movie_poster_cover/spst/public/p2285115802.jpg"));
        }

        @Override
        public int getItemCount() {
            if (mAdapter == null) {
                return 0;
            }
            return 3;
        }
    }


}
