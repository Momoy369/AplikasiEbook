package com.lomboktech.aplikasiebookgratis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public DataAdapter dataAdapter;
    public RecyclerView recyclerView;
    public ArrayList<DataModel> dataModelArrayList=new ArrayList<DataModel>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //membuat data yang akan ditampilkan dalam list
        //file .html mengambil di folder assets
        inputData("Judul Ebook 1","artikel_1.html");
        inputData("Judul Ebook 2","artikel_2.html");
        inputData("Judul Ebook 3","artikel_3.html");
        inputData("Judul Ebook 4","artikel_4.html");
        inputData("Judul Ebook 5","artikel_5.html");
        inputData("Judul Ebook 6","artikel_6.html");
        inputData("Judul Ebook 7","artikel_7.html");
        inputData("Judul Ebook 8","artikel_8.html");
        inputData("Judul Ebook 9","artikel_9.html");
        inputData("Judul Ebook 10","artikel_10.html");
        inputData("Judul Ebook 11","artikel_11.html");
        inputData("Judul Ebook 12","artikel_12.html");
        inputData("Judul Ebook 13","artikel_13.html");
        inputData("Judul Ebook 14","artikel_14.html");
        inputData("Judul Ebook 15","artikel_15.html");
        //inputData("Artikel 16","artikel_16.html");

        //menampilkan data ke dalam recyclerView
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        dataAdapter = new DataAdapter(this,dataModelArrayList);
        recyclerView.setAdapter(dataAdapter);

        //menambahakan header
        DataModel headerModel = new DataModel();
        headerModel.setViewType(2);
        dataModelArrayList.add(0,headerModel);

        //menambahkan footer
        DataModel footerModel = new DataModel();
        footerModel.setViewType(3);
        dataModelArrayList.add(footerModel);
    }

    //fungsi input
    public void inputData(String judul,String konten){
        DataModel dataModel = new DataModel();
        dataModel.setJudul(judul);
        dataModel.setKonten(konten);
        dataModel.setViewType(1);
        dataModelArrayList.add(dataModel);
    }

}
