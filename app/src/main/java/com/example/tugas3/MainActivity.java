package com.example.tugas3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        adapter = new MahasiswaAdapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("AAAAAAA", "123150001", "1239567389"));
        mahasiswaArrayList.add(new Mahasiswa("BBBBBBB", "123150002", "1345623789"));
        mahasiswaArrayList.add(new Mahasiswa("CCCCCCC", "123150003", "1245126789"));
        mahasiswaArrayList.add(new Mahasiswa("DDDDDDD", "123150004", "1345672389"));
        mahasiswaArrayList.add(new Mahasiswa("EEEEEEE", "123150005", "1235631789"));
        mahasiswaArrayList.add(new Mahasiswa("FFFFFFF", "123150006", "1232145679"));
        mahasiswaArrayList.add(new Mahasiswa("GGGGGGG", "123150007", "1234215689"));
        mahasiswaArrayList.add(new Mahasiswa("HHHHHHH", "123150008", "9876534321"));
        mahasiswaArrayList.add(new Mahasiswa("IIIIIII", "123150009", "9876448765"));
        mahasiswaArrayList.add(new Mahasiswa("JJJJJJJ", "123150010", "0987158124"));
    }
}
