package com.example.smartmarket.Adpater;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.smartmarket.R;
import com.example.smartmarket.RowItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by oshinrawal on 7/28/16.
 */
public class ProductAdapter extends ArrayAdapter<RowItem> {

    Context context;

    public ProductAdapter(Context context, int resource, List<RowItem> objects) {
        super(context, resource, objects);
        this.context = context;
    }

    private class ViewHolder {
        ImageView imageView;
        TextView txtTitle;
        TextView txtDesc;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        RowItem rowItem = getItem(position);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.product_list_item, null);
            viewHolder = new ViewHolder();
            viewHolder.txtDesc = (TextView) convertView.findViewById(R.id.desc);
            viewHolder.txtTitle = (TextView) convertView.findViewById(R.id.title);
            viewHolder.imageView = (ImageView) convertView.findViewById(R.id.icon);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.txtDesc.setText(rowItem.getDesc());
        viewHolder.txtTitle.setText(rowItem.getTitle());
        viewHolder.imageView.setImageResource(rowItem.getImageId());
        return convertView;
    }
}

