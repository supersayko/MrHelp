package com.example.ngoapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class DonatorList extends AppCompatActivity {
    RecyclerView recyclerView;
    DatabaseReference reference;
    MyAdapter adapter;
    ArrayList<GetData>list;

    Button hme;

    TextView feed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_donator_list);

        recyclerView = findViewById(R.id.userlist);
        reference = FirebaseDatabase.getInstance().getReference("foodData");
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        list = new ArrayList<>();
        adapter = new MyAdapter(this, list);
        recyclerView.setAdapter(adapter);

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot : snapshot.getChildren()){
                    GetData data = dataSnapshot.getValue(GetData.class);
                    list.add(data);
                }
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        hme = findViewById(R.id.hmeButton);
        hme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DonatorList.this, Dashboard.class);
                startActivity(intent);
            }
        });

        feed = findViewById(R.id.textView13);

        feed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DonatorList.this, FeedbackActivity.class);
                startActivity(intent);
            }
        });

    }
}