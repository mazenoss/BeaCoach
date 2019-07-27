package com.mazen.beacoach;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;
import com.github.barteksc.pdfviewer.listener.OnPageChangeListener;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;

public class ArabicMainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, OnPageChangeListener, OnLoadCompleteListener {
    PDFView pdfView;
    int pageNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arabic_main);
        pdfView = (PDFView) findViewById(R.id.pdfViewAr);
        pdfView.fromAsset("coachar.pdf")
                .defaultPage(pageNumber)
                .onLoad(this)
                .onPageChange(this)
                .scrollHandle(new DefaultScrollHandle(this))
                .load();
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.arabic_main, menu);
        return true;
    }*/

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.v) {
            // Handle the camera action
        } else if (id == R.id.a) {
            pdfView.fromAsset("coachar.pdf").pages(14,15,16,17,18,19,20).load();
        } else if (id == R.id.b) {
            pdfView.fromAsset("coachar.pdf").pages(21,22,23,24,25,26,27,28,29,30).load();
        } else if (id == R.id.c) {
            pdfView.fromAsset("coachar.pdf").pages(31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46).load();

        } else if (id == R.id.d) {
            pdfView.fromAsset("coachar.pdf").pages(47,48,49,50,51,52,53,54,55,56).load();

        } else if (id == R.id.e) {
            pdfView.fromAsset("coachar.pdf").pages(57,58,59,60,61,62,63,64).load();

        }else if (id == R.id.f) {
            pdfView.fromAsset("coachar.pdf").pages(65,66,67,68,69,70,71).load();

        } else if (id == R.id.g) {
            pdfView.fromAsset("coachar.pdf").pages(72,73,74,75,76,77,78).load();

        } else if (id == R.id.h) {
            pdfView.fromAsset("coachar.pdf").pages(79,80,81,82,83,84,85,86,87,87,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109).load();

        } else if (id == R.id.i) {
            pdfView.fromAsset("coachar.pdf").pages(110,111,112).load();
        } else if (id == R.id.j) {
            pdfView.fromAsset("coachar.pdf").pages(113,114,115,116,117,118,119,120,121,122).load();

        }else if (id == R.id.k) {
            pdfView.fromAsset("coachar.pdf").pages(123,124,125,126,127,128,129,130,131,132).load();

        } else if (id == R.id.l) {
            pdfView.fromAsset("coachar.pdf").pages(133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158).load();

        } else if (id == R.id.m) {
            pdfView.fromAsset("coachar.pdf").pages(159,160,61,162,163,164,165,166,167,168,169,170,171,172,173,174,175,176,177,178,179,180,181,182,183,184,185,186,187).load();

        } else if (id == R.id.n) {
            pdfView.fromAsset("coachar.pdf").pages(188,189,190,191,192,193,194,195,196,197,198,199,200,201).load();

        } else if (id == R.id.o) {
            pdfView.fromAsset("coachar.pdf").pages(202,203,204,205,206,207,208,209,210,211,212,213).load();
        }else if (id == R.id.p) {
            pdfView.fromAsset("coachar.pdf").pages(214,215,216,217,218,219,220,221,222,223).load();

        } else if (id == R.id.q) {
            pdfView.fromAsset("coachar.pdf").pages(224,225,226,227,228,229,230,231,232,233,234,235,236,237).load();

        } else if (id == R.id.r) {
            pdfView.fromAsset("coachar.pdf").pages(238,239,240,241,242,243,244,245,246,247,248,249,250,251,252).load();

        } else if (id == R.id.s) {
            pdfView.fromAsset("coachar.pdf").pages(253,254,255,256,257,258,259,260,261,262,263,264,265,266,267).load();

        } else if (id == R.id.t) {
            pdfView.fromAsset("coachar.pdf").pages(268,269,270,271,272,273,274,275,276,277).load();

        } else if (id == R.id.u) {
            pdfView.fromAsset("coachar.pdf").pages(278,279,280,281,282).load();

        }else if (id == R.id.aboutar){
            AlertDialog.Builder builderr = new AlertDialog.Builder(ArabicMainActivity.this);
            LayoutInflater inflater = LayoutInflater.from(ArabicMainActivity.this);
            View view1 = inflater.inflate(R.layout.about_dev, null);
            builderr.setView(view1);
            final AlertDialog dialog = builderr.create();
            dialog.show();
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void loadComplete(int nbPages) {

    }

    @Override
    public void onPageChanged(int page, int pageCount) {
        pageNumber= pdfView.getCurrentPage();
        setTitle(String.format("%s %s / %s", "كن مدربا", page + 1, pageCount));
    }
}
