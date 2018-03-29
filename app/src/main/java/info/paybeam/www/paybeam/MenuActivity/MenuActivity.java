package info.paybeam.www.paybeam.MenuActivity;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import info.paybeam.www.paybeam.R;

public class MenuActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, PaymentFragment.OnFragmentInteractionListener{

    String myString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

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

        if (id == R.id.nav_payment) {
            // Handle the camera action
            Toast.makeText(this,"This is payment",Toast.LENGTH_SHORT).show();
            PaymentFragment paymentFragment = new PaymentFragment().newInstance("pay1","pay2");
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.relativelayout_fragment, paymentFragment, paymentFragment.getTag()).commit();
            manager.beginTransaction()
                    .setCustomAnimations(android.R.animator.fade_in, android.R.animator.fade_out)
                    .show(paymentFragment)
                    .commit();

        } else if (id == R.id.nav_cards) {
            Toast.makeText(this,"This is cards",Toast.LENGTH_SHORT).show();
            CardFragment cardFragment = new CardFragment().newInstance("card1", "card2");
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.relativelayout_fragment, cardFragment, cardFragment.getTag()).commit();

        } else if (id == R.id.nav_transactions) {
            Toast.makeText(this,"This is transactions",Toast.LENGTH_SHORT).show();
            TransactionFragment transactionFragment = new TransactionFragment().newInstance("trans1", "trans2");
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.relativelayout_fragment, transactionFragment, transactionFragment.getTag()).commit();

        } else if (id == R.id.nav_profile) {
            Toast.makeText(this,"This is transactions",Toast.LENGTH_SHORT).show();
            ProfileFragment profileFragment = new ProfileFragment().newInstance("profile1", "profile2");
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.relativelayout_fragment, profileFragment, profileFragment.getTag()).commit();

        } else if (id == R.id.nav_settings) {
            Toast.makeText(this,"This is settings",Toast.LENGTH_SHORT).show();
            SettingsFragment settingsFragment = new SettingsFragment().newInstance("settings1", "settings2");
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.relativelayout_fragment, settingsFragment, settingsFragment.getTag()).commit();

        } else if (id == R.id.nav_faq) {
            Toast.makeText(this,"This is faq",Toast.LENGTH_SHORT).show();
            FaqFragment faqFragment = new FaqFragment().newInstance("faq1", "faq2");
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.relativelayout_fragment, faqFragment, faqFragment.getTag()).commit();

        } else if (id == R.id.nav_aboutUs) {
            Toast.makeText(this,"This is about us",Toast.LENGTH_SHORT).show();
            AboutFragment aboutFragment = new AboutFragment().newInstance("about1", "about2");
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.relativelayout_fragment, aboutFragment, aboutFragment.getTag()).commit();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onFragmentInteraction(String string) {
        this.myString = string;
        Toast.makeText(this,string,Toast.LENGTH_SHORT).show();
    }
}
