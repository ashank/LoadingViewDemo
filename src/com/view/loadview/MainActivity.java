package com.view.loadview;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity
{
    
    private LoadingView main_imageview1;
    
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        main_imageview1 = (LoadingView)findViewById(R.id.main_imageview);
        initLoadingImages();
        
        new Thread()
        {
            @Override
            public void run()
            {
                main_imageview1.startAnim();
            }
        }.start();
        
    }
    
    private void initLoadingImages()
    {
        int[] imageIds = new int[6];
        imageIds[0] = R.drawable.loader_frame_1;
        imageIds[1] = R.drawable.loader_frame_2;
        imageIds[2] = R.drawable.loader_frame_3;
        imageIds[3] = R.drawable.loader_frame_4;
        imageIds[4] = R.drawable.loader_frame_5;
        imageIds[5] = R.drawable.loader_frame_6;
        
        main_imageview1.setImageIds(imageIds);
    }
}