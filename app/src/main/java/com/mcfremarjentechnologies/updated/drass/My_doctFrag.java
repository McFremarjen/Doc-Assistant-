package com.mcfremarjentechnologies.updated.drass;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class My_doctFrag extends Fragment {


    public My_doctFrag() {
        // Required empty public constructor
    }

    private static final String TAG = "My_doctFrag";
    //vars
    //private ArrayList<String>mNames = new ArrayList<>();
  //  private ArrayList<String>mImageUrls =new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

       // Log.d(TAG, "onCreateView: started");

        //initImageBitmaps();

        return inflater.inflate(R.layout.fragment_my_doct, container, false);


    }
    /*
    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps");
        mImageUrls.add("http://mountain.org/wp-content/uploads/Miraflores-community-members-carry-posts-to-build-fences-that-protect-grasslands-renewed-by-restored-water-canal_TMI.jpeg");
        mNames.add("try out");

        mImageUrls.add("http://mountain.org/wp-content/uploads/Miraflores-community-members-carry-posts-to-build-fences-that-protect-grasslands-renewed-by-restored-water-canal_TMI.jpeg");
        mNames.add("try out");
        initRecyclerView();
    }
   private void initRecyclerView(){
       Log.d(TAG, "initRecyclerView: init recyclerView");
      // RecyclerView recyclerView = findViewByid(R.id.mark);
     //RecyclerViewAdapter  recycler = new RecyclerViewAdapter(this,mNames,mImageUrls);


   }
   */
}
