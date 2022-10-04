package com.example.tourghana;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class EasternRegionFragment extends Fragment {


    public EasternRegionFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        ArrayList<Detail> arrayList = new ArrayList<>();
        arrayList.add(new Detail(getResources().getString(R.string.region2_place_1), getResources().getString(R.string.region2_place1_detail),R.drawable.aburi_botanical_gardens_hdpi));
        arrayList.add(new Detail(getResources().getString(R.string.region2_place_2), getResources().getString(R.string.region2_place2_detail)));
        arrayList.add(new Detail(getResources().getString(R.string.region2_place_3), getResources().getString(R.string.region2_place3_detail)));
        arrayList.add(new Detail(getResources().getString(R.string.region2_place_4), getResources().getString(R.string.region2_place4_detail)));
        arrayList.add(new Detail(getResources().getString(R.string.region2_place_5), getResources().getString(R.string.region2_place5_detail),R.drawable.tetteh_quarshie_cocoa_farm_hdpi));
        arrayList.add(new Detail(getResources().getString(R.string.region2_place_6), getResources().getString(R.string.region2_place6_detail)));
        arrayList.add(new Detail(getResources().getString(R.string.region2_place_7), getResources().getString(R.string.region2_place7_detail)));


        DetailAdapter detailAdapter = new DetailAdapter(getActivity(), arrayList);

        ListView listView = rootView.findViewById(R.id.listViewId);

        listView.setAdapter(detailAdapter);

        return rootView;
    }
}