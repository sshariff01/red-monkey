package com.unbranded.aboutme;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void goToFacebook(View view){
    	goToUrl("http://www.facebook.com/shoabe.shariff/");
    }
    
    public void goToTwitter(View view){
    	goToUrl("http://www.twitter.com/sshariff01/");
    }
    
    public void goToLinkedIn(View view){
    	goToUrl("http://www.linkedin.com/pub/shoabe-shariff/31/129/756");
    }
    
    public void viewResume(View view){
    	Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dropbox.com/s/ek9ppl5j9p6qu4v/shoabe_shariff_resume.pdf?dl=1"));
    	startActivity(browserIntent);
    }
    
    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}
