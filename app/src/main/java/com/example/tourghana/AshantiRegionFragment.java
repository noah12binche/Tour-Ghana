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
public class AshantiRegionFragment extends Fragment {

    public AshantiRegionFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        ArrayList<Detail> arrayList = new ArrayList<>();
        arrayList.add(new Detail(getResources().getString(R.string.region4_place_1), getResources().getString(R.string.region4_place1_detail)));
        arrayList.add(new Detail(getResources().getString(R.string.region4_place_2), getResources().getString(R.string.region4_place2_detail)));
        arrayList.add(new Detail(getResources().getString(R.string.region4_place_3), getResources().getString(R.string.region4_place3_detail)));
        arrayList.add(new Detail(getResources().getString(R.string.region4_place_4), getResources().getString(R.string.region4_place4_detail),R.drawable.ntonso_adinkra_village_hdpi));
        arrayList.add(new Detail(getResources().getString(R.string.region4_place_5), getResources().getString(R.string.region4_place5_detail)));
        arrayList.add(new Detail(getResources().getString(R.string.region4_place_6), getResources().getString(R.string.region4_place6_detail),R.drawable.bobiri_butterfly_sanctuary_hdpi));

        DetailAdapter detailAdapter = new DetailAdapter(getActivity(), arrayList);

        ListView listView = rootView.findViewById(R.id.listViewId);

        listView.setAdapter(detailAdapter);

        return rootView;
    }
}