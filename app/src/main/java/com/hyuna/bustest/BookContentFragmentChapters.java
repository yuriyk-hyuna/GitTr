package com.hyuna.bustest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Iurii on 3/17/2015.
 */
public class BookContentFragmentChapters extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.list_book, null);
        final ListView list = (ListView) view.findViewById(R.id.listViewBook);
        list.setAdapter(new BookContentAdapter(getActivity(),getData()));
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i(BookContentFragmentChapters.class.getSimpleName(), "this is page number " + position);
            }
        });

        return view;
    }

    private List<BookContentAdapter.BookmarksContainer> getData() {
        ArrayList<BookContentAdapter.BookmarksContainer> bookmarksContainers = new ArrayList<>();

        bookmarksContainers.add(new BookContentAdapter.BookmarksContainer("Chapter 1","1"));
        bookmarksContainers.add(new BookContentAdapter.BookmarksContainer("Chapter 2", "4"));
        bookmarksContainers.add(new BookContentAdapter.BookmarksContainer("Chapter 3","7"));
        bookmarksContainers.add(new BookContentAdapter.BookmarksContainer("Chapter 4","8"));
        bookmarksContainers.add(new BookContentAdapter.BookmarksContainer("Chapter 5","10"));
        bookmarksContainers.add(new BookContentAdapter.BookmarksContainer("Chapter 6","14"));
        bookmarksContainers.add(new BookContentAdapter.BookmarksContainer("Chapter 7","16"));
        bookmarksContainers.add(new BookContentAdapter.BookmarksContainer("Chapter 8","20"));
        bookmarksContainers.add(new BookContentAdapter.BookmarksContainer("Chapter 9","24"));
        return  bookmarksContainers;
    }

}
