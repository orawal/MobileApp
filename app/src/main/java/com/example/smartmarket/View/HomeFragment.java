package com.example.smartmarket.View;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import com.example.smartmarket.Adpater.ProductAdapter;
import com.example.smartmarket.R;
import com.example.smartmarket.RowItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by oshinrawal on 7/27/16.
 */
public class HomeFragment extends Fragment {
    private ListView listView;
    List<RowItem> rowItems;
    public static final String[] titles = new String[] { "Strawberry",
            "Banana", "Orange", "Mixed" };

    public static final String[] descriptions = new String[] {
            "It is an aggregate accessory fruit",
            "It is the largest herbaceous flowering plant", "Citrus Fruit",
            "Mixed Fruits" };
    public static final Integer[] images = { R.drawable.card,
            R.drawable.card, R.drawable.card, R.drawable.card };
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        rowItems = new ArrayList<RowItem>();
        for (int i = 0; i < titles.length; i++) {
            RowItem item = new RowItem(images[i], titles[i], descriptions[i]);
            rowItems.add(item);
        }
        listView = (ListView) view.findViewById(R.id.productList);
        ProductAdapter adapter = new ProductAdapter(getActivity(),
                R.layout.product_list_item, rowItems);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), ProductDetailActivity.class);
                RowItem item = rowItems.get(position);
                intent.putExtra("Product", item);
                startActivity(intent);
            }
        });
        return view;
    }

}
