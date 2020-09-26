package com.example.newsapiusinghttphandler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.ProgressBar;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

    String newsUrl;
    ListView listNews;
    ProgressBar loader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listNews = findViewById(R.id.listNews);
        loader = findViewById(R.id.loader);
        listNews.setEmptyView(loader);

        newsUrl="https://newsapi.org/v2/top-headlines?sources="+"cnn"+"&apiKey=7c64e1b4cb01427e837f67cf94b921c3";

        AsyncHttpTask asyncHttpTask=new AsyncHttpTask();
        asyncHttpTask.execute();


    }

    public class AsyncHttpTask extends AsyncTask<String,Void,String>{

        @Override
        protected void onPreExecute() { super.onPreExecute(); }

        @Override
        protected String doInBackground(String... urls) {

            HttpHandler sh = new HttpHandler();
            // Making a request to url and getting response
            String url = "https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=7c64e1b4cb01427e837f67cf94b921c3";
            String jsonStr = sh.makeServiceCall(url);


            return null;
        }
    }

}





