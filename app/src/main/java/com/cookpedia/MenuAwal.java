package com.cookpedia;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.cookpedia.AccountActivity.MainActivity;
import com.cookpedia.menu.menuBook;
import com.cookpedia.menu.menuCemilan;
import com.cookpedia.menu.menuMakanan;
import com.cookpedia.menu.menuMinuman;
import com.cookpedia.rating.ratingbar;

public class MenuAwal extends Activity {
    Button Minuman, Makanan, Cemilan, Feedback, Home, Book, Akun;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_awal);

        /*---------------------- Intent Minuman------------------------*/
        Minuman = (Button) findViewById(R.id.btnMinuman);
        Minuman.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-gen,erated method stub
                menuMinuman(Minuman);
            }
        });


        /*------------------ Intent Makanan -------------------------*/
        Makanan = (Button) findViewById(R.id.btnMakanan);
        Makanan.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                menuMakanan(Makanan);
            }
        });

        /*---------------------- Intent mie ------------------------*/
        Cemilan = (Button) findViewById(R.id.btnCemilan);
        Cemilan.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                menuCemilan(Cemilan);
            }
        });

        /*---------------------- Intent feedback ------------------------*/
        Feedback = (Button) findViewById(R.id.btnFeedback);
        Feedback.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                ratingbar(Feedback);
            }
        });

        /*---------------------- Intent Home------------------------*/
        Home = (Button) findViewById(R.id.btnHome);
        Home.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-gen,erated method stub
                MenuAwal(Home);
            }
        });


        /*------------------ Intent Book -------------------------*/
        Book = (Button) findViewById(R.id.btnBook);
        Book.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                menuBook(Book);
            }
        });

        /*---------------------- Intent Akun ------------------------*/
        Akun = (Button) findViewById(R.id.btnAkun);
        Akun.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                MainActivity(Akun);
            }
        });

    }


    /*===============================================*/
    public void menuMinuman(View view){
        Intent Minuman = new Intent(this, menuMinuman.class);
        startActivity(Minuman);
    }

    public void menuMakanan(View view){
        Intent Makanan = new Intent(this,menuMakanan.class);
        startActivity(Makanan);

    }

    public void menuCemilan(View view){
        Intent Cemilan = new Intent(this, menuCemilan.class);
        startActivity(Cemilan);
    }

    public void ratingbar(View view){
        Intent Feedback = new Intent(this, ratingbar.class);
        startActivity(Feedback);
    }

    public void MenuAwal(View view){
        Intent Home = new Intent(this, MenuAwal.class);
        startActivity(Home);
    }

    public void menuBook(View view){
        Intent Book = new Intent(this, menuBook.class);
        startActivity(Book);
    }

    public void MainActivity(View view){
        Intent Akun = new Intent(this, MainActivity.class);
        startActivity(Akun);
    }


}