package com.hyuna.bustest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Iurii on 3/17/2015.
 */
public class BookContentAdapter extends BaseAdapter {

    private List<BookmarksContainer> containers;
    private Context context;

    static class Holder {
        TextView title;
        TextView page;
    }

    @Override
    public int getCount() {

        return containers == null ? 0 : containers.size();
    }

    public BookContentAdapter(Context context, List<BookmarksContainer> containers) {
        this.context = context;
        this.containers = containers;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Holder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_book_container, null);
            holder = new Holder();
            holder.title = (TextView) convertView.findViewById(R.id.listBookTitle);
            holder.page = (TextView) convertView.findViewById(R.id.listBookPage);
            convertView.setTag(holder);
        } else {
            holder = (Holder) convertView.getTag();
        }
        final BookmarksContainer container = getItem(position);
        holder.title.setText(container.getTitle());
        holder.page.setText(container.getPage());

        return convertView;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public BookmarksContainer getItem(int position) {
        return containers.get(position);
    }

    public static class BookmarksContainer {
        private final  String title;
        private final String page;

        public BookmarksContainer(String title, String page) {
            this.title = title;
            this.page = page;
        }

        public String getTitle() {
            return title;
        }

        public String getPage() {
            return page;
        }
    }
}
