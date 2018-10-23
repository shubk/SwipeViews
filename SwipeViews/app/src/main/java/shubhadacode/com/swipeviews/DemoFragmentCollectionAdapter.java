package shubhadacode.com.swipeviews;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class DemoFragmentCollectionAdapter extends FragmentStatePagerAdapter {
    public DemoFragmentCollectionAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        DemoFragment demoFragment=new DemoFragment();
        //Pass on the string to demofragment so I need teh bundleobject
        Bundle bundle=new Bundle();
        position=position+1;
        // atatch some messaeg to the bundle
        bundle.putString("message","Hello from Page : "+position);
        demoFragment.setArguments(bundle);

        return demoFragment;
    }

    @Override
    public int getCount() {
        return 100; // pass here the # of pages
    }
}
