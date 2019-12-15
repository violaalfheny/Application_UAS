package com.example.application;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Locale;

public class Menu_Daftar_Makanan extends AppCompatActivity {

    ListView lvItem;
    EditText Edtcari;
    ListViewAdapterCall adapter;
    ArrayList<ListViewAdapterMenu> arraylist = new ArrayList<ListViewAdapterMenu>();

    int[] Gambar;
    String[] NamaItem;
    String[] HargaItem;
    String[] Deskripsi;
    String[] NomorHP;
    String[] Lat;
    String[] Long;

    @Override
    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_daftar);

        lvItem		= (ListView)findViewById(R.id.listView1);
        Edtcari     = (EditText)findViewById(R.id.editText1);


        Gambar		= new int[]{
                R.drawable.basket,
                R.drawable.volley,
                R.drawable.iceskate,
                R.drawable.bikes,
                R.drawable.boxer,
                R.drawable.badminton,
                R.drawable.football};

        NamaItem 	= new String[]{
                "BasketBall",
                "VolleyBall",
                "Ice Skating",
                "Bikes",
                "Boxer",
                "Badminton",
                "FootBall"};

        HargaItem 	= new String[]{
                "  ",
                "  ",
                "  ",
                "  ",
                "  ",
                "  ",
                "  "};

        Deskripsi 	= new String[]{
                "olahraga bola berkelompok yang terdiri atas dua tim beranggotakan masing-masing lima " +
                        "orang yang saling bertanding mencetak poin dengan memasukkan bola ke dalam keranjang lawan." +
                " Ada 3 posisi utama dalam bermain basket, yaitu: 1) Forward, pemain yang tugas utamanya adalah mencetak poin" +
                        "dengan memasukkan bola ke keranjang lawan, 2) Defense, pemain yang tugas utamanya adalah menjaga pemain lawan" +
                        "agar pemain lawan kesulitan memasukkan bola, dan 3) Playmaker, pemain yang menjadi tokoh kunci permainan dengan mengatur alur bola dan strategi yang dimainkan oleh rekan-rekan setimnya.",

                "permainan olahraga yang dimainkan oleh dua grup berlawanan. Masing-masing grup memiliki enam orang pemain. Terdapat pula variasi" +
                        " permainan bola voli pantai yang masing-masing grup hanya memiliki dua orang pemain. " +
                        "Olahraga Bola Voli dinaungi FIVB (Federation Internationale de Volleyball) sebagai induk organisasi internasional, " +
                        "sedangkan di Indonesia, olahraga bola Voli dinaungi oleh PBVSI (Persatuan Bola Voli Seluruh Indonesia).",

                "kegiatan berseluncur di atas es. Kegiatan ini dilakukan dengan pemakaian sepatu seluncur, dimana sebilah pisau baja" +
                        " yang tajam dipasang pada bagian dasar sepatu agar sepatu bisa meluncur di permukaan es. " +
                        "Seluncur es dapat dilakui karena gesekan antara pisau seluncur dan permukaan es menghangatkan es, " +
                        "dengan akibat mencairkan esnya sehingga tercipta lapisan licin." +
                        " Seluncur es dilakukan orang sebagai rekreasi atau olahraga musim dingin.",

                "Bersepeda adalah sebuah kegiatan rekreasi atau olahraga, serta merupakan salah satu moda transportasi darat yang " +
                        "menggunakan sepeda.\n" +
                        "\n" +
                        "Banyak penggemar bersepeda yang melakukan kegiatan tersebut di berbagai macam medan, misalnya perbukitan, " +
                        "medan yang terjal maupun hanya sekadar dipedesaan dan perkotaan saja.\n" +
                        "\n" +
                        "Orang yang mempergunakan sepeda sebagai moda transportasi rutin juga dapat disebut komuter. " +
                        "Penggunaan sepeda sebagai moda transportasi rutin tidak hanya dilakukan oleh pekerja yang bekerja di sektor " +
                        "non-formal, tetapi juga dilakukan oleh pekerja yang bekerja di sektor formal.",

                " olahraga dan seni bela diri yang menampilkan dua orang partisipan dengan berat yang serupa bertanding satu sama lain " +
                        "dengan menggunakan tinju mereka dalam rangkaian pertandingan berinterval satu atau tiga menit yang disebut ronde." +
                        " Baik dalam Olimpiade ataupun olahraga profesional, kedua petinju menghindari pukulan lawan mereka sambil berupaya" +
                        " mendaratkan pukulan mereka sendiri ke lawannya.",
                "suatu olahraga raket yang dimainkan oleh dua orang (untuk tunggal) atau dua pasangan (untuk ganda) yang saling berlawanan.\n" +
                        "\n" +
                        "Mirip dengan tenis, bulu tangkis bertujuan memukul bola permainan (\"kok\" atau \"shuttlecock\") " +
                        "melewati jaring agar jatuh di bidang permainan lawan yang sudah ditentukan dan " +
                        "berusaha mencegah lawan melakukan hal yang sama.",

                "cabang olahraga yang menggunakan bola yang umumnya terbuat dari bahan kulit dan dimainkan oleh dua tim yang masing-masing beranggotakan" +
                        " 11 (sebelas) orang pemain inti dan beberapa pemain cadangan. Memasuki abad ke-21, olahraga ini telah dimainkan oleh lebih dari" +
                        " 250 juta orang di 200 negara, yang menjadikannya olahraga paling populer di dunia. Sepak bola bertujuan untuk mencetak gol " +
                        "sebanyak-banyaknya dengan memasukan bola ke gawang lawan. Sepak bola dimainkan dalam lapangan terbuka yang berbentuk persegi " +
                        "panjang, di atas rumput atau rumput sintetis.\n" +
                        "\n" +
                        "Secara umum, hanya penjaga gawang saja yang berhak menyentuh bola dengan tangan atau lengan di dalam daerah gawangnya, " +
                        "sedangkan 10 (sepuluh) pemain lainnya diizinkan menggunakan seluruh tubuhnya selain tangan, " +
                        "biasanya dengan kaki untuk menendang, dada untuk mengontrol, dan kepala untuk menyundul bola.",};


        //Nomor HP harus dimulai dengan kode negara yaitu : +62
        NomorHP  = new String[]{
                "+6281278977788",
                "+6281324607225",
                "+6281615444433",
                "+6281324607225",
                "+6281324607225",
                "+6281535224733",
                "+6281324607225"
        };

        Lat  = new String[]{
                "-2.9771237",
                "-2.969675",
                "-3.0000124",
                "-2.9913172",
                "-2.9801306",
                "-2.9913172",
                "-2.9670725"
        };

        Long  = new String[]{
                "104.7573521",
                "104.7318573",
                "104.7593849",
                "104.7516047",
                "104.7693137",
                "104.7450386",
                "104.741623"
        };




        for (int i = 0; i < NamaItem.length; i++)
        {
            ListViewAdapterMenu wp = new ListViewAdapterMenu(NamaItem[i], HargaItem[i], Deskripsi[i], Gambar[i], NomorHP[i], Lat[i], Long[i]);
            arraylist.add(wp);
        }

        adapter = new ListViewAdapterCall(this, arraylist);
        lvItem.setAdapter(adapter);

        Edtcari.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable arg0) {
                String text = Edtcari.getText().toString().toLowerCase(Locale.getDefault());
                adapter.filter(text);
                showToastMessage("Mencari");
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
                // TODO Auto-generated method stub
            }
            @Override
            public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
                // TODO Auto-generated method stub
            }
        });

    }

    void showToastMessage(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

}
