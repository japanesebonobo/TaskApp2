package jp.techacademy.yuuta.yoshitomi.taskapp2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * Created by yoshitomi on 2017/03/31.
 */

public class TaskAdapter extends BaseAdapter {
    private LayoutInflater mLayoutInflater;
    private List<Task> mTaskArrayList;

    public TaskAdapter(Context context) {
        mLayoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    public void setTaskList(List<Task> taskArrayList) {
        mTaskArrayList = taskArrayList;
    }

    @Override
    public int getCount() {
        return mTaskArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return mTaskArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return mTaskArrayList.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = mLayoutInflater.inflate(android.R.layout.simple_list_item_2, null);
        }
        TextView textView1 = (TextView) convertView.findViewById(android.R.id.text1);
        TextView textView2 = (TextView) convertView.findViewById(android.R.id.text2);

        textView1.setText(mTaskArrayList.get(position).getTitle());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.JAPANESE);
        Date date = mTaskArrayList.get(position).getDate();
        textView2.setText(simpleDateFormat.format(date));

        return  convertView;
    }
}
