package com.klm.magazine.magazinehover;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;


import com.wikitude.architect.ArchitectStartupConfiguration;
import com.wikitude.architect.ArchitectView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    protected ArchitectView architectView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.architectView = (ArchitectView)this.findViewById( R.id.architectView );
        final ArchitectStartupConfiguration config = new ArchitectStartupConfiguration();
        config.setLicenseKey("Oy+KkJVVar+k5J2lK/qkO6UWvE90S9Ww7GLCzSYoY7UPjAC/b4B9CI8S2uyb08OA4NerOf/n8Mkd6UV+ncE5iuSQzlmVmON+t35yRJkzV8xFG/UUo2zuq8IfHlOlb+bW0GmwaVrHscCjPHi4a+bHwCk0nLA1yQ/3edzbasrr8/JTYWx0ZWRfX5kosSCLl6NBvXlqhcups2uANT6L+Tu1Oz40QkRvGBbHK2+5UAkkyNAaoocUe/rQIU1BU7Xn0yPzl+UqsaRCUEQWM2rdAmHto6sZ6aDkUKau4dzlWs1Fs55st+lAvJMzGx4SMwkGHv5Ph4tNaWM41lMyTB8+mTbWn/RdAO0kSi/4s5d0gwbw308mIRLguGOXufRJtVpzVsyRVCl9LCHIFr6zga/yB3yRtiGlszFzl+Mt0L8HWJ+aY0glteWhJ0nb84FGz758GuEli9KfrkW/4ZVNQqT5QBDauaqj9M+CzyrHDKBubJv2S9JBxdfIuZ+JLl+HRFXIgqCuQPaWoqSKIMX26uEaBroVazI/y99umwLKFrLsqwERwzkXNjf25Ijrb3Iq+3/9O0ajBCSybXVNPRZONyKfe+9SfYhulnTmYMjDMUFQrMRfaZ/pN+ti0QhVN4JZNjoByfwchtQ4HXA5U0Kgl4p9BVhrwIwyDEUItBzEKdVH0+2u0ok=");
        this.architectView.onCreate( config );
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        architectView.onPostCreate();
        try {
            architectView.load( "samples/test/index.html" );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    @Override
    public void onResume() {
        super.onResume();
        this.architectView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        this.architectView.onPause();
    }
}
