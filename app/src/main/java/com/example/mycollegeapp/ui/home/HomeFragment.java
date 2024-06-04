package com.example.mycollegeapp.ui.home;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.mycollegeapp.R;

import java.util.ArrayList;


public class HomeFragment extends Fragment {

    private ImageSlider imageSlider;
    private ImageView map;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        imageSlider = view.findViewById(R.id.slider);

        ArrayList<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/my-project-app-b184b.appspot.com/o/Home_Slider%2Fau.jpeg?alt=media&token=5186f0cb-6851-4f6c-bae7-7336e1fa7444", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/my-project-app-b184b.appspot.com/o/Home_Slider%2Fauu.jpeg?alt=media&token=d4c55181-1ee3-4386-8b14-56ecf1dce5b3", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/my-project-app-b184b.appspot.com/o/Home_Slider%2Fauuu.jpeg?alt=media&token=0d7c4238-7faa-4b49-a6b6-9e18bae19d61", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/my-project-app-b184b.appspot.com/o/Home_Slider%2Fic_gallery.png?alt=media&token=88ec73e0-03f4-4cfc-ba98-69f90a4caaff", ScaleTypes.FIT));
        
        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        map = view.findViewById(R.id.map);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMap();
            }
        });

        return view;
    }

    private void openMap() {
        Uri uri = Uri.parse("geo:0, 0?q=University OF Allahabad Science Faculty, Old Katra Prayagraj Uttar Pradesh 211002");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }

}

