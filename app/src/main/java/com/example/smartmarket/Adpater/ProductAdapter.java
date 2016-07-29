package com.example.smartmarket.Adpater;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.smartmarket.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by oshinrawal on 7/28/16.
 */
public class ProductAdapter extends BaseAdapter {

    private List<Item> items = new ArrayList<Item>();
    private LayoutInflater inflater;

    public ProductAdapter(Context context) {
        inflater = LayoutInflater.from(context);
        items.add(new Item("Image 1", R.drawable.card));
        items.add(new Item("Image 2", R.drawable.card));
        items.add(new Item("Image 3", R.drawable.card));
        items.add(new Item("Image 4", R.drawable.card));
    }
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
    private class Item
    {
        final String name;
        final int drawableId;

        Item(String name, int drawableId)
        {
            this.name = name;
            this.drawableId = drawableId;
        }
    }
}

