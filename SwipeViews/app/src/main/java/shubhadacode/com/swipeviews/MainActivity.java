package shubhadacode.com.swipeviews;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewpager;
    private DemoFragmentCollectionAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewpager=findViewById(R.id.pager);
        // initialize teh adpater
        adapter=new DemoFragmentCollectionAdapter(getSupportFragmentManager());
        viewpager.setAdapter(adapter);
    }
}
