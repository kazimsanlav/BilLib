package com.project.kazim.BilLib;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;


import java.util.ArrayList;



public class SearchActivity extends Activity
{
    private String bookname;
    private ListView listView;
    private ArrayList<Book> search_result = new ArrayList<Book>();
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        this.bookname = getIntent().getStringExtra("book_name");

        this.listView = (ListView) findViewById(R.id.listView);

        adapter = new ArrayAdapter<Book>(getApplicationContext(),R.layout.list_item_layout, search_result);

        this.listView.setAdapter(adapter);
        HtmlSender sender = new HtmlSender(bookname,this);

        sender.execute();

    }

    private class HtmlSender extends AsyncTask<String,String,String> {

        String htmlSend;

        ArrayList<Book> search_list_book = new ArrayList<>();
        Context ctx;

        public HtmlSender(String s, Context ctx) {
            htmlSend = s;
            this.ctx = ctx;
        }

        @Override
        protected String doInBackground(String... strings) {
            search_list_book = SearchHtml.getBook(htmlSend);
            return null;
        }

        protected void onPostExecute(String result) {
            if(search_list_book == null){
                AlertDialog.Builder builder;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    builder = new AlertDialog.Builder(ctx, android.R.style.Theme_Material_Dialog_Alert);
                } else {
                    builder = new AlertDialog.Builder(ctx);
                }
                builder.setTitle(htmlSend+" is not found")
                        .setMessage("Do you want to search again?")
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                                startActivity(intent);
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                intent.putExtra("Exit me", true);
                                startActivity(intent);
                            }
                        })
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .show();
            }else{
                if(search_list_book.isEmpty()){
                    AlertDialog.Builder builder;
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        builder = new AlertDialog.Builder(ctx, android.R.style.Theme_Material_Dialog_Alert);
                    } else {
                        builder = new AlertDialog.Builder(ctx);
                    }
                    builder.setTitle(htmlSend+" is not found")
                            .setMessage("Do you want to search again?")
                            .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                                    startActivity(intent);
                                }
                            })
                            .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                    intent.putExtra("Exit me", true);
                                    startActivity(intent);
                                    finish();

                                }
                            })
                            .setIcon(android.R.drawable.ic_dialog_alert)
                            .show();
                }else{
                    search_result = new ArrayList<Book>();

                    for (int i = 0; i < search_list_book.size(); i++) {
                        search_result.add(search_list_book.get(i));
                    }
                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        public void onItemClick(AdapterView<?> parent, View view,
                                                int position, long id) {

                            Object o = listView.getItemAtPosition(position);
                            Book selected_book =(Book)o;//As you are using Default String Adapter
                            BookChecker bookChecker = new BookChecker(selected_book,ctx);
                            bookChecker.execute();
                        }
                    });
                    //Toast.makeText(SearchActivity.this, search_result.get(1), Toast.LENGTH_SHORT).show();
                    adapter = new ArrayAdapter<Book>(getApplicationContext(), android.R.layout.simple_expandable_list_item_1, search_result);
                    listView.setAdapter(adapter);
                }
            }

        }
    }

    private class BookChecker extends  AsyncTask<String,String,String>{

        Book book;
        Context ctx ;
        Location location;
        boolean in = false;
        ImageView img_view;
        ImageView img_point;
        int translationX ;
        int translationY ;


        public BookChecker(Book book,Context ctx) {
            this.book = book;
            this.ctx = ctx;
        }

        @Override
        protected String doInBackground(String... locations) {
            DatabaseAccess dbAccess = new DatabaseAccess(ctx);
            Location loc = dbAccess.getLocationInformation(book.getCallNum());
            location = loc;
            if(location!=null)
                return loc.toString();
            location = new Location("Storage","Storage",250,250);
            return location.toString();
        }
        protected void onPostExecute(String loc){
            if(loc != null) {
                Dialog map = new Dialog(ctx);
                map.requestWindowFeature(Window.FEATURE_NO_TITLE);
                map.setContentView(R.layout.map);
                map.show();
                WindowManager.LayoutParams lp = new WindowManager.LayoutParams(LinearLayoutCompat.LayoutParams.WRAP_CONTENT,
                        LinearLayoutCompat.LayoutParams.WRAP_CONTENT);
                lp.copyFrom(map.getWindow().getAttributes());
                map.getWindow().setAttributes(lp);


                img_point = (ImageView) map.findViewById(R.id.point);
                img_view = (ImageView) map.findViewById(R.id.map_view);
                img_view.setImageResource(R.drawable.libplan);

                //get the devices resolution
                DisplayMetrics displayMetrics = new DisplayMetrics();
                getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                final int WIDTH = displayMetrics.widthPixels;
                final int HEIGHT = displayMetrics.heightPixels;

                if(location.getShelfLocation().equalsIgnoreCase("B3")){
                    translationX = (int)(0.352*WIDTH);
                    translationY = (int)(0.194*HEIGHT);
                }
                else if(location.getShelfLocation().equalsIgnoreCase("B2")){
                    translationX = (int)(0.455*WIDTH);
                    translationY = (int)(0.194*HEIGHT);
                }
                else if(location.getShelfLocation().equalsIgnoreCase("B1")){
                    translationX = (int)(0.559*WIDTH);
                    translationY = (int)(0.194*HEIGHT);
                }
                else if(location.getShelfLocation().equalsIgnoreCase("B0")){
                    translationX = (int)(0.662*WIDTH);
                    translationY = (int)(0.194*HEIGHT);
                }
                else if(location.getShelfLocation().equalsIgnoreCase("A3")){
                    translationX = (int)(0.352*WIDTH);
                    translationY = (int)(0.579*HEIGHT);
                }
                else if(location.getShelfLocation().equalsIgnoreCase("A0")){
                    translationX = (int)(0.559*WIDTH);
                    translationY = (int)(0.579*HEIGHT);
                }
                else{
                    translationX = (int)(0.66*WIDTH);
                    translationY = (int)(0.579*HEIGHT);
                }
                img_point.setVisibility(View.VISIBLE);
                img_point.setImageResource(R.drawable.point);
                img_point.setTranslationX(translationX);
                img_point.setTranslationY(translationY);

                img_view.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(in){
                            img_view.setImageResource(R.drawable.libplan);
                            img_point.setTranslationX(-(int)location.getXcor());
                            img_point.setTranslationY(-(int)location.getYcor());
                            img_point.setTranslationX(translationX);
                            img_point.setTranslationY(translationY);
                            in = false;
                        }
                        else {
                            img_point.setTranslationX(-translationX);
                            img_point.setTranslationY(-translationY);
                            if(location.getShelfLocation().trim().equalsIgnoreCase("A0")){
                                img_view.setImageResource(R.drawable.a0);
                            }
                            else if(location.getShelfLocation().trim().equalsIgnoreCase("A3")){
                                img_view.setImageResource(R.drawable.a3);
                            }
                            else if(location.getShelfLocation().trim().equalsIgnoreCase("Storage")){
                                img_view.setImageResource(R.drawable.refstore);
                            }
                            else if(location.getShelfLocation().trim().equalsIgnoreCase("B0")){
                                img_view.setImageResource(R.drawable.b0);
                            }
                            else if(location.getShelfLocation().trim().equalsIgnoreCase("B1")){
                                img_view.setImageResource(R.drawable.b1);
                            }
                            else if(location.getShelfLocation().trim().equalsIgnoreCase("B2")){
                                img_view.setImageResource(R.drawable.b2);
                            }
                            else if(location.getShelfLocation().trim().equalsIgnoreCase("B3")){
                                img_view.setImageResource(R.drawable.b3);
                            }
                            img_point.setVisibility(View.VISIBLE);
                            img_point.setImageResource(R.drawable.point);



                            img_point.setTranslationX((int)(location.getXcor()*WIDTH));
                            img_point.setTranslationY((int)(location.getYcor()*HEIGHT));

                            in = true;
                        }

                    }
                });

                Toast.makeText(getBaseContext(),loc,Toast.LENGTH_SHORT).show();
            }

        }
    }

}
