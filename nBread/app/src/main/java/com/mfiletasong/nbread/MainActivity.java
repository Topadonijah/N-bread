package com.mfiletasong.nbread;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import com.mfiletasong.nbread.databinding.ActivityMainBinding;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    private ArrayList<Triplist> dataList;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<Triplist> recordItems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        recyclerView = findViewById(R.id.recyclerView);

        // 리사이클러뷰 사이즈를 고정
        binding.recyclerView.setHasFixedSize(true);


        // linear layout 사용
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        recordItems.add(new Triplist(R.drawable.river, "빠지", "1박2일", "8명"));
        recordItems.add(new Triplist(R.drawable.party, "가평", "1박2일", "8명"));

        // Adapter와 연동
        mAdapter = new TriplistAdapter(recordItems);

        recyclerView.setAdapter(mAdapter);
    }
}