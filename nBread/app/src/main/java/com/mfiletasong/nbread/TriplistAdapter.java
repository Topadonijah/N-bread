package com.mfiletasong.nbread;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.mfiletasong.nbread.databinding.ActivityMainBinding;
import com.mfiletasong.nbread.databinding.ChooseTripBinding;

import java.util.ArrayList;

public class TriplistAdapter extends RecyclerView.Adapter<TriplistAdapter.TriplistViewHolder> {

    private ArrayList<Triplist> myDataList = null;

    public class TriplistViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView title, duration, member;

        public TriplistViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView2);
            title = itemView.findViewById(R.id.title);
            duration = itemView.findViewById(R.id.duration);
            member = itemView.findViewById(R.id.member);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String msg = title.getText() + " 을(를) 클릭하였습니다.";
                    Toast.makeText(itemView.getContext(), msg.toString(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    TriplistAdapter(ArrayList<Triplist> dataList) {
        myDataList = dataList;
    }

    @Override
    public TriplistAdapter.TriplistViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.choose_trip, parent, false);
        TriplistViewHolder vh = new TriplistViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(TriplistViewHolder viewHolder, int position) {
        //ViewHolder가 관리하는 View에 position에 해당하는 데이터 바인딩
        viewHolder.imageView.setImageResource(myDataList.get(position).getImageResourceID());
        viewHolder.title.setText(myDataList.get(position).getTripTitle());
        viewHolder.duration.setText(myDataList.get(position).getDuration());
        viewHolder.member.setText(myDataList.get(position).getMember());
    }

    @Override
    public int getItemCount() {
        //Adapter가 관리하는 전체 데이터 개수 반환
        return myDataList.size();
    }


}
