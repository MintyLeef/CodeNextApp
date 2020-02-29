package com.example.realcodenextapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class CoachListAdapter extends ArrayAdapter<Coach> {
    private static final String TAG = "CoachListAdapter";
    private Context mContext;
    int mResource;
    private int lastPosition = -1;
    static class ViewHolder {
        TextView name;
        TextView email;
        TextView room;
    }

    public CoachListAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Coach> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String name = getItem(position).getName();
        String email = getItem(position).getEmail();
        String room = getItem(position).getRoom();

        Coach coach = new Coach(name,email,room);

        final View result;
        ViewHolder holder;

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);
        holder = new ViewHolder();
        holder.name = (TextView) convertView.findViewById(R.id.textView);
        holder.email = (TextView) convertView.findViewById(R.id.textView2);
        holder.room = (TextView) convertView.findViewById(R.id.textView3);

        result = convertView;
        convertView.setTag(holder);


        Animation animation = AnimationUtils.loadAnimation(mContext,
                (position > lastPosition) ? R.anim.load_down_anim : R.anim.load_up_anim);
        result.startAnimation(animation);
        lastPosition = position;

        holder.name.setText(name);
        holder.email.setText(email);
        holder.room.setText(room);


        return convertView;
    }
}






/*TextView tvName = (TextView) convertView.findViewById(R.id.textView);
        TextView tvEmail = (TextView) convertView.findViewById(R.id.textView2);
        TextView tvRoom = (TextView) convertView.findViewById(R.id.textView3);

        tvName.setText(name);
        tvEmail.setText(email);
        tvRoom.setText(room);

 */




