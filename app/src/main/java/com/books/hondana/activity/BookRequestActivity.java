package com.books.hondana.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

import com.books.hondana.R;

public class BookRequestActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_request);

        findViewById(R.id.buttonClickPost).setOnClickListener(this);
        findViewById(R.id.buttonCancel).setOnClickListener(this);
        findViewById(R.id.buttonRequest).setOnClickListener(this);


        getSupportActionBar().setDisplayShowTitleEnabled(false);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public void onClick(View v) {
        if (v != null) {
            switch (v.getId()) {
                case R.id.buttonClickPost:
                    // クリック処理
                    Uri uri = Uri.parse("http://www.post.japanpost.jp/service/clickpost/index.html");
                    Intent i = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(i);
                    break;

                case R.id.buttonCancel:
                    // クリック処理
                    finish();
                    break;

                case R.id.buttonRequest:
                    // クリック処理
                    Intent intent = new Intent(this, PassedActivity.class);
                    startActivity(intent);
                    break;


                default:
                    break;
            }
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}