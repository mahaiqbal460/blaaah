package com.example.apnapharmetro;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyOrdersFragment extends Fragment {


    public MyOrdersFragment() {
        // Required empty public constructor
    }


    private RecyclerView myOrdersRecyclerView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_orders, container, false);

        myOrdersRecyclerView = view.findViewById(R.id.my_orders_recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        myOrdersRecyclerView.setLayoutManager(layoutManager);

        List<MyorderItemModel> myorderItemModelList = new ArrayList<>();
        myorderItemModelList.add(new MyorderItemModel(R.drawable.download, 2 ,"Samsung Notebook8 (2)","Delivered on Monday,15th JAN"));
        myorderItemModelList.add(new MyorderItemModel(R.drawable.images, 4 ,"Samsung Notebook8 (2)","Delivered on Monday,15th JAN"));
        myorderItemModelList.add(new MyorderItemModel(R.drawable.download, 2 ,"Samsung Notebook8 (2)","Cancelled"));
        myorderItemModelList.add(new MyorderItemModel(R.drawable.images, 1 ,"Samsung Notebook8 (2)","Delivered on Monday,15th JAN"));

        MyOrderAdapter myOrderAdapter = new MyOrderAdapter(myorderItemModelList);
        myOrdersRecyclerView.setAdapter(myOrderAdapter);
        myOrderAdapter.notifyDataSetChanged();

        return view;
    }

}
