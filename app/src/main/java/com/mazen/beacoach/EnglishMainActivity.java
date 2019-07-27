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
import android.widget.PopupMenu;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;
import com.github.barteksc.pdfviewer.listener.OnPageChangeListener;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;

public class EnglishMainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, PopupMenu.OnMenuItemClickListener, OnPageChangeListener, OnLoadCompleteListener {
    PDFView pdfView;
    int pageNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_main);
        pdfView = (PDFView) findViewById(R.id.pdfViewEn);
        pdfView.fromAsset("coachen.pdf").onLoad(this)
                .onPageChange(this)
                .scrollHandle(new DefaultScrollHandle(this)).load();
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
        getMenuInflater().inflate(R.menu.english_main, menu);
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

        if (id == R.id.v){
            pdfView.fromAsset("coachen.pdf").onLoad(this)
                    .onPageChange(this)
                    .scrollHandle(new DefaultScrollHandle(this)).load();
        }else if (id == R.id.a) {
            pdfView.fromAsset("coachen.pdf").pages(14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24).load();
        } else if (id == R.id.b) {
            pdfView.fromAsset("coachen.pdf").pages(25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40).load();
        } else if (id == R.id.c) {
            pdfView.fromAsset("coachen.pdf").pages(41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58).load();
        } else if (id == R.id.d) {
            pdfView.fromAsset("coachen.pdf").pages(60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72).load();

        } else if (id == R.id.e) {
            pdfView.fromAsset("coachen.pdf").pages(74, 75, 76, 77, 78, 79, 80, 81, 82, 83).load();

        } else if (id == R.id.f) {
            pdfView.fromAsset("coachen.pdf").pages(84, 85, 86, 87, 87, 89, 90, 91, 92, 93).load();

        }else if (id == R.id.g) {
            pdfView.fromAsset("coachen.pdf").pages(94, 95, 96, 97, 98, 99, 100, 101, 102, 103).load();

        } else if (id == R.id.h) {
            pdfView.fromAsset("coachen.pdf").pages(104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149).load();

        } else if (id == R.id.i) {
            pdfView.fromAsset("coachen.pdf").pages(150, 151, 152, 153).load();

        } else if (id == R.id.j) {
            pdfView.fromAsset("coachen.pdf").pages(154, 155, 156, 157, 158, 159, 160, 61, 162, 163, 164, 165, 166, 167, 168).load();

        } else if (id == R.id.k) {
            pdfView.fromAsset("coachen.pdf").pages(169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 179, 180, 181).load();

        }else if (id == R.id.l) {
            pdfView.fromAsset("coachen.pdf").pages(182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218).load();

        } else if (id == R.id.m) {
            pdfView.fromAsset("coachen.pdf").pages(220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 250, 251, 252, 253, 254, 255, 256, 257, 258, 259, 260, 261).load();

        } else if (id == R.id.n) {
            pdfView.fromAsset("coachen.pdf").pages(263, 264, 265, 266, 267, 268, 269, 270, 271, 272, 273, 274, 275, 276, 277, 278, 279, 280, 281, 282, 283).load();

        } else if (id == R.id.o) {
            pdfView.fromAsset("coachen.pdf").pages(284, 285, 286, 287, 288, 289, 290, 291, 292, 293, 294, 295, 296, 297, 298).load();

        } else if (id == R.id.p) {
            pdfView.fromAsset("coachen.pdf").pages(299, 300, 301, 302, 303, 304, 305, 306, 307, 308, 309, 310, 311, 312).load();

        }else if (id == R.id.q) {
            pdfView.fromAsset("coachen.pdf").pages(314, 315, 316, 317, 318, 319, 320, 321, 322, 323, 324, 325, 326, 327, 328, 329, 330, 331, 332, 333).load();

        } else if (id == R.id.r) {
            pdfView.fromAsset("coachen.pdf").pages(335, 336, 337, 338, 339, 340, 341, 342, 343, 344, 345, 346, 347, 348, 349).load();

        } else if (id == R.id.s) {
            pdfView.fromAsset("coachen.pdf").pages(352, 353, 354, 355, 356, 357, 358, 359, 360, 361, 362, 363, 364, 365, 366, 367).load();

        } else if (id == R.id.t) {
            pdfView.fromAsset("coachen.pdf").pages(369, 370, 371, 372, 373, 374, 375, 376, 377, 378, 379).load();

        } else if (id == R.id.u) {
            pdfView.fromAsset("coachen.pdf").pages(381, 382, 383, 384, 385, 386).load();

        }else if (id == R.id.abouten){
            AlertDialog.Builder builderr = new AlertDialog.Builder(EnglishMainActivity.this);
            LayoutInflater inflater = LayoutInflater.from(EnglishMainActivity.this);
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
    public boolean onMenuItemClick(MenuItem menuItem) {
        return false;
    }

    @Override
    public void loadComplete(int nbPages) {

    }

    @Override
    public void onPageChanged(int page, int pageCount) {
        pageNumber= page;
        setTitle(String.format("%s %s / %s", "Be a coach", page + 1, pageCount));

    }
}
