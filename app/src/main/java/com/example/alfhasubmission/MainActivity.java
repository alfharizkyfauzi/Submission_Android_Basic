package com.example.alfhasubmission;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String[] sportNames = {
            "Sepak Bola",
            "Beladiri Judo",
            "VolleyBall",
            "Dayung",
            "Basket",
            "Berkuda",
            "Bulu Tangkis",
            "Taekwondo",
            "Tinju",
            "Hoki",
            "Penembak",
            "Tennis",
            "Panahan",
            "Billiard",
            "Anggar"};
    String[] sportDetails = {
            "Sepak bola adalah salah satu olahraga permainan yang menggunakan bola dan dimainkan oleh dua tim yang masing-masing beranggotakan 11 orang. Satu orang bertugas sebagai penjaga gawang dan lainnya menjadi pemain, di mana ada yang menempati posisi bertahan dan menyerang. Memasuki abad ke-21, olahraga ini telah dimainkan oleh lebih dari 250 juta orang di 200 negara. Sepak bola adalah olahraga yang paling populer di dunia.",
            "Terdapat juga olahraga bela diri yang pertama kali dilakukan oleh masyarakat Jepang. Olahraga ini disebut dengan nama Judo. Olahraga judo seperti diketahui adalah olahraga yang dapat anda gunakan untuk membela dan mempertahankan diri dari lawan yang mungkin mencelakai anda. Anda dapat memegang atau menjatuhkan lawan, jika anda telah melakukan teknik pertahanan diri yang baik. Itulah sebabnya, olahraga ini diketahui sebagai olahraga yang membutuhkan kemampuan dan stamina tubuh yang baik.",
            "Bola voli merupakan olahraga permainan yang dimainkan oleh dua tim yang masing-masing tim terdiri dari 6  orang.  Ada juga variasi permainan bola voli ini. Variasi tersebut adalah voli pantai. Bedanya, voli pantai tidak dimainkan oleh 6 orang, tetapi hanya 2 orang saja.",
            "Ketangkasan dan kekompakan sangat dibutuhkan dalam salah satu cabang olahraga ini. Olahraga dayung adalah olahraga yang menggerakkan perahu dengan cara dikayuh atau didayung di atas air. Tempat dari olahraga dayung ini dapat dilakukan di sungai, di danau maupun di laut, tergantung pada jenis perlombaan yang diselenggarakan. Lomba ini membutuhkan stamina dan tenaga yang kuat, keahlian berperahu dengan baik, keahlian individu sendiri dan keahlian berkelompok.",
            "Bola basket adalah salah satu cabang olahraga bola yang berkelompok. Setiap tim bola basket terdiri dari 5 orang. Kelima orang ini akan bekerja sama untuk memasukkan bola sebanyak-banyaknya ke ring dari tim lawan. Tim yang dapat mencetak poin lebih banyak pada ring lawan akan keluar sebagai pemenangnya. Bola basket ini biasanya dimainkan di ruang olahraga tertutup dan hanya memerlukan lapangan yang relatif kecil jika dibandingkan dengan sepak  bola, oleh karena itu sangat cocok untuk ditonton secara langsung dengan lebih santai. Selain itu, bola basket juga mudah untuk dipelajari karena bentuk bolanya yang besar, sehingga bagi Anda yang baru pertama kali belajar bola basket tidak akan sulit karena ukuran bolanya yang besar.",
            "Berkuda adalah suatu olahraga yang menuntut suatu skill atau keahlian tertentu antara lain keterampilan, kebugaran fisik, stamina yang kuat, konsentrasi yang lebih dan penerapan teknik-teknik berkuda yang baik dan benar walaupun barangkali hal ini tidak terlalu di tekankan kepada atlit. Beberapa jenis olahraga berkuda yang umum diperlombakan di Indonesia antara lain : Polo Berkuda, Gymkhana Berkuda, Equestrian (ketangkasan berkuda). Equestrian sendiri terdiri dari tunggang serasi, lompat rintangan, trilomba, dan endurance.",
            "Bulu tangkis atau disebut juga badminton adalah salah satu cabang olahraga raket yang dimainkan oleh dua orang pada sektor tunggal atau dua pasangan pada sektor ganda. Permainan bulu tangkis bertujuan untuk memukul bola yang disebut juga dengan kok atau shuttlecock. Bola ini harus dapat melewati net dan jatuh di bidang permainan lawan yang sudah ditentukan dan berusaha mencegah lawan melakukan hal yang sama. Pemain atau pasangan pemain dinyatakan memenangkan pertandingan jika telah memenangkan 2 set permainan. Jika Anda memenangkan set pertama dan lawan memenangkan set kedua maka aka nada tambahan set ketiga yang menentukan siapa pemenangnya. Hal ini disebut dengan istilah rubber game.",
            "Taekwondo adalah olahraga bela diri yang juga cukup populer di kalangan masyarakat Indonesia. Jenis olahraga taekwondo ini sebenarnya adalah olahraga yang dimiliki oleh negeri ginseng Korea. Taekwondo pun memiliki sejarah perkembangannya sendiri masuk ke Indonesia. Sebagai salah satu olahraga bela diir, taekwondo pun mulai diajarkan sejak kecil kepada anak-anak. Berbeda dengan bela diri asal Indonesia seperti pencak silat, taekwondo memiliki beberapa jurus yang merupakan  jurus yang dipelajari dalam olahraga ini. Menggunakan jurus jurus ini anda dapat melawan orang-orang yang berniat jahat pada anda.",
            "Tinju adalah salah satu perpaduan antara olahraga dan seni bela diri yang mempertandingkan dua peserta dengan berat dan kelas yang sama untuk bertanding satu sama lain dengan menggunakan tinju mereka dalam rangkaian ronde. Pengertian ronde di sini adalah pertandingan berinterval satu atau tiga menit. Dalam pertandingan tinju, atlet menghindari pukulan lawan mereka sambil berupaya agar dapat  mendaratkan pukulan mereka sendiri ke arah lawannya.",
            "Hoki merupakan olahraga permainan yang dilakukan oleh dengan menggunakan alat pemukul (stick) dan bola. Bentuk permainannya hampir sama dengan sepak bola.Jenis permainan hoki sendiri dibagi dalam beberapa jenis, yaitu : \n 1. Hoki lapangan (field hockey) \n 2. Hoki ruangan (indoor hockey) \n 3. Hoki es (ice hockey) \n\n Dalam pertandingan hoki, pemain hoki biasanya menggunakan peralatan skates, shin pads, sarung tangan, celana hoki, sticks, dan Helmets. Tongkat hoki yang cenderung  yang paling penting, selain perlindungan dari badan Anda. ",
            "Satu lagi jenis olahraga yang sering dipertandingkan di Indonesia adalah menembak. Olahraga menembak ini merupakan olahraga yang dilakukan dengan kemampuan akurasi dan ketepatan membidik menggunakan senjata. Senjata yang digunakan juga tidak main-main. Setidaknya ada jenis senjata berbeda yang digunakan sebagai nomor pertandingan yang berbeda juga. Anda dapat memilih sekiat 3 nomor berbeda dari cabang olahraga yang dipertandingkan. Beberapa nomor pertandingan tersebut adalah menembak sasaran, menembak reaksi, dan menembak berburu. Benar-benar pertandingan yang menarik untuk dilakukan tentunya. Anda pun harus mulai membiasakan melatih menembak, jika anda benar benar ingin mahir dalam menembak.",
            "Tenis, sama halnya sepeti bulu tangkis, adalah olahraga yang dimainkan antara dua pemain untuk sektor tunggal atau antara dua pasangan untuk sektor ganda yang tentu saja saling berlawanan. Setiap pemain menggunakan raket untuk memukul bola yang terbuat dari karet. Tenis, seperti halnya dengan bulu tangkis, adalah salah satu cabang olahraga yang dipertandingkan dalam Olimpiade. Tenis juga dapat dimainkan pada semua tingkat masyarakat di segala usia.",
            "Panahan atau archery merupakan jenis olahraga yang menggunakan tali busur dan anak panah untuk membidik sasaran. Jenis olahraga panahan ini diketahui sangat dikuasai oleh para atlet dari usia khususnya. Memang pada informasi mengenai sejarah dan teknik olahraga panahan yang menarik diketahui bahwa panahan merupakan olahraga yang diadaptasi dari kebiasaan masyarakat Asia dalam berburu. Setelah diadaptasi menjadi suatu cabang olahraga, panahan kemudian dilakukan untuk membidik papan sasaran yang poinnya berbeda-beda. Semakin mendekati pusat papan panahan, maka semakin besar juga poin yang akan didapatkan. Demikianlah informasi mengenai jenis olahraga yang satu ini.",
            "Jenis olahraga selanjutnya yang juga membutuhkan konsentrasi yang tinggi adalah olahraga billiard. Olahraga billiard seringkali dianggap permainan saja, padahal juga membutuhkan teknik teknik olahraga untuk dapat melaksanakannya. Tidak cukup hanya mampu menggunakan stik billiard, pemain pun diketahui perlu untuk memiliki tubuh yang fit dan kuat. Ketahanan tubuh yang kuat dan mental yang baik merupakan modal utama seseorang dapat menjalani pertandian billiard ini. Anda perlu mengetahui berbagai fungsi dari peralatan permainan seperti stick, cue ball, meja, dan juga chalk. Semoga informasi ini membuat anda lebih sadar bahwa olahraga dapat dilakukan dalam bentuk apapun juga permainan seperti billiard.",
            "Pertandingan anggar adalah satu jenis cabang olahraga yang dipertandingkan di Sea Games. Anggar merupakan olahraga diri yang menggunakan pedang (blade) sebagai alat penyerangan dan pertahanannya. Bagi anda yang tidak membawa apa-apa maka akan didenda oleh pertandingan anggar yang tidak memeriksa identitasnya. Tidak seperti jenis olahraga tanpa alat lainnya, olahraga ini termasuk olahraga yang lama untuk disiapkan. Misalnya pemain harus menyiapkan dulu dari mulai anti tusuknya, lalu ada juga pedang alat perang, ada tutup kepala, dan seterusnya. Oleh sebab itu, pertandingan anggar malah semakin luas. "};
    int[] sportImages = {
            R.drawable.bola,
            R.drawable.judo,
            R.drawable.voli,
            R.drawable.dayung,
            R.drawable.basket,
            R.drawable.berkuda,
            R.drawable.bultang,
            R.drawable.takwon,
            R.drawable.tinju,
            R.drawable.hoki,
            R.drawable.tembak,
            R.drawable.tenis,
            R.drawable.panah,
            R.drawable.billiard,
            R.drawable.anggar};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);


        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(),ListdataActivity.class);
                intent.putExtra("name", sportNames[i]);
                intent.putExtra("image", sportImages[i]);
                intent.putExtra("detail", sportDetails[i]);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mMenuInflater = getMenuInflater();
        mMenuInflater.inflate(R.menu.menu_aboutme,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_about){
            Intent myIntent = new Intent(MainActivity.this, aboutme.class);
            startActivity(myIntent);
            return false;
        }
        return super.onOptionsItemSelected(item);
    }

    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return sportImages.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view1 = getLayoutInflater().inflate(R.layout.row_data,null);

            TextView name = view1.findViewById(R.id.sports);
            ImageView image = view1.findViewById(R.id.images);
            TextView detail = view1.findViewById(R.id.detail);

            name.setText(sportNames[i]);
            detail.setText(sportDetails[i]);
            image.setImageResource(sportImages[i]);

            return view1;
        }
    }
}
