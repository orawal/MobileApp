package com.example.smartmarket.View;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import com.example.smartmarket.R;
import com.example.smartmarket.RowItem;

/**
 * Created by oshinrawal on 8/1/16.
 */
public class ProductDetailActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);
        RowItem item = (RowItem) getIntent().getSerializableExtra("Product");
        Log.e("Item", item.getTitle());
    }


}
