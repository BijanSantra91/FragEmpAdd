package com.example.bijan.fragempadd;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Second extends Fragment {

    ArrayList<Employee> al;
    MyAdapter myAdapter;
    ListView listView;

    public void catchData(String eid,String ename,String esal){

        Employee employee = new Employee(eid, ename, esal);
        al.add(employee);
        myAdapter.notifyDataSetChanged();

    }

    private class MyAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return al.size();
        }

        @Override
        public Object getItem(int i) {
            return al.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            Employee employee = al.get(i);
            View v = getActivity().getLayoutInflater().inflate(R.layout.row, null);

            TextView tv1 = (TextView) v.findViewById(R.id.text1);
            TextView tv2 = (TextView) v.findViewById(R.id.text2);
            TextView tv3 = (TextView) v.findViewById(R.id.text3);
            CheckBox checkBox = (CheckBox) v.findViewById(R.id.checkbox);

            tv1.setText(employee.getEid());
            tv2.setText(employee.getEname());
            tv3.setText(employee.getEsal());

            return v;
        }
    }

    public Second() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_second, container, false);
        listView = (ListView) v.findViewById(R.id.listview);
        al = new ArrayList<Employee>();//not visible so new
        myAdapter = new MyAdapter();
        listView.setAdapter(myAdapter);

        return v;
    }

}
