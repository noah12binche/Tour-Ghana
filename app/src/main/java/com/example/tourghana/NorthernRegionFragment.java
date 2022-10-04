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
public class NorthernRegionFragment extends Fragment {


    public NorthernRegionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        ArrayList<Detail> arrayList = new ArrayList<>();
        arrayList.add(new Detail(getResources().getString(R.string.region_place_1), getResources().getString(R.string.place_1_detail),R.drawable.mole_national_park_hdpi));
        arrayList.add(new Detail(getResources().getString(R.string.region_place_2), getResources().getString(R.string.place_2_detail)));
        arrayList.add(new Detail(getResources().getString(R.string.region_place_3), getResources().getString(R.string.place_3_detail)));
        arrayList.add(new Detail(getResources().getString(R.string.region_place_4), getResources().getString(R.string.place_4_detail),R.drawable.zayaa_mud_mosque_at_wulugu_hdpi));
        arrayList.add(new Detail(getResources().getString(R.string.region_place_5), getResources().getString(R.string.place_5_detail)));
        arrayList.add(new Detail(getResources().getString(R.string.region_place_6), getResources().getString(R.string.place_6_detail)));



        DetailAdapter detailAdapter = new DetailAdapter(getActivity(), arrayList);

        ListView listView = rootView.findViewById(R.id.listViewId);

        listView.setAdapter(detailAdapter);

        return rootView;
    }
}