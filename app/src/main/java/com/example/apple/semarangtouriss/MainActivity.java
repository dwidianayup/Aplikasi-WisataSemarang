package com.example.apple.semarangtouriss;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.recycleV);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        String[] judul = {
                "Lawang Sewu",
                "Tugu Muda",
                "Gereja Blenduk",
                "Klenteng Sampookong",
                "Kota Lama"
        };

        int[] image = {
                R.drawable.lawangsewu,
                R.drawable.tugumuda,
                R.drawable.blenduk,
                R.drawable.sampokong,
                R.drawable.kotalama
        };

        String[] alamat = {
                "Komplek Tugu Muda, Jl. Pemuda, Sekayu, Semarang Tengah, Sekayu, Semarang Tengah, Kota Semarang, Jawa Tengah 50132",
                "Salamanmloyo, Semarang Barat, Barusari, Semarang Sel., Kota Semarang, Jawa Tengah 50149",
                "Jl. Letjend. Suprapto No.32, Tj. Mas, Semarang Utara, Kota Semarang, Jawa Tengah 10460",
                "Jalan Simongan No.129, Bongsari, Semarang Barat, Bongsari, Semarang Bar., Kota Semarang, Jawa Tengah 50148",
                "Jl. Letjen Suprapto No.22, Tj. Mas, Semarang Utara, Kota Semarang, Jawa Tengah 50174"
        };

        String[] deskripsi = {
                "Lawang Sewu (bahasa Indonesia: seribu pintu) adalah gedung gedung bersejarah di Indonesia yang berlokasi di Kota Semarang, Jawa Tengah. Gedung ini, dahulu yang merupakan kantor dari Nederlands-Indische Spoorweg Maatschappij atau NIS. Dibangun pada tahun 1904 dan selesai pada tahun 1907. Terletak di bundaran Tugu Muda yang dahulu disebut Wilhelminaplein.\n" +
                        "Masyarakat setempat menyebutnya Lawang Sewu karena bangunan tersebut memiliki pintu yang sangat banyak, meskipun kenyataannya, jumlah pintunya tidak mencapai seribu. Bangunan ini memiliki banyak jendela yang tinggi dan lebar, sehingga masyarakat sering menganggapnya sebagai pintu (lawang).\n"+
                        "Bangunan kuno dan megah berlantai dua ini setelah kemerdekaan dipakai sebagai kantor Djawatan Kereta Api Repoeblik Indonesia (DKARI) atau sekarang PT Kereta Api Indonesia. Selain itu pernah dipakai sebagai Kantor Badan Prasarana Komando Daerah Militer (Kodam IV/Diponegoro) dan Kantor Wilayah (Kanwil) Kementerian Perhubungan Jawa Tengah. Pada masa perjuangan gedung ini memiliki catatan sejarah tersendiri yaitu ketika berlangsung peristiwa Pertempuran lima hari di Semarang (14 Oktober - 19 Oktober 1945). Gedung tua ini menjadi lokasi pertempuran yang hebat antara pemuda AMKA atau Angkatan Muda Kereta Api melawan Kempetai dan Kidobutai, Jepang. Maka dari itu Pemerintah Kota Semarang dengan Surat Keputusan Wali Kota Nomor. 650/50/1992, memasukan Lawang Sewu sebagai salah satu dari 102 bangunan kuno atau bersejarah di Kota Semarang yang patut dilindungi.\n" +
                        "Saat ini bangunan tua tersebut telah mengalami tahap konservasi dan revitalisasi yang dilakukan oleh Unit Pelestarian benda dan bangunan bersejarah PT Kereta Api Persero\n\n" +
                        "SEJARAH\n" +
                        "Bangunan Lawang Sewu dibangun pada 27 Februari 1904 dengan nama lain Het hoofdkantor van de Nederlands-Indische Spoorweg Maatschappij (Kantor Pusat NIS). Awalnya kegiatan administrasi perkantoran dilakukan di Stasiun Semarang Gudang (Samarang NIS), namun dengan berkembangnya jalur jaringan kereta yang sangat pesat, mengakibatkan bertambahnya personil teknis dan tenaga administrasi yang tidak sedikit seiring berkembangnya administrasi perkantoran.\n" +
                        "Pada akibatnya kantor NIS di stasiun Samarang NIS tidak lagi memadai. Berbagai solusi dilakukan NIS antara lain menyewa beberapa bangunan milik perseorangan sebagai solusi sementara yang justru menambah tidak efisien. Apalagi letak stasiun Samarang NIS berada di dekat rawa sehingga urusan sanitasi dan kesehatan pun menjadi pertimbangan penting. Maka, diusulkanlah alternatif lain: membangun kantor administrasi di lokasi baru. Pilihan jatuh ke lahan yang pada masa itu berada di pinggir kota berdekatan dengan kediaman Residen. Letaknya di ujung Bodjongweg Semarang (sekarang Jalan Pemuda), di sudut pertemuan Bodjongweg dan Samarang naar Kendalweg (jalan raya menuju Kendal).\n" +
                        "NIS mempercayakan rancangan gedung kantor pusat NIS di Semarang kepada Prof. Jacob F. Klinkhamer (TH Delft) dan B.J. Quendag, arsitek yang berdomisili di Amsterdam. Seluruh proses perancangan dilakukan di Belanda, baru kemudian gambar-gambar dibawa ke Kota Semarang. Melihat dari cetak biru Lawang Sewu tertulis bahwa site plan dan denah bangunan ini telah digambar di Amsterdam pada tahun 1903. Begitu pula kelengkapan gambar kerjanya dibuat dan ditandatangani di Amsterdam tahun 1903.",
                "Tugu Muda adalah sebuah monumen yang dibuat untuk mengenang jasa-jasa para pahlawan yang telah gugur dalam Pertempuran Lima Hari di Semarang. Tugu Muda ini menggambarkan tentang semangat berjuang dan patriotisme warga semarang, khususnya para pemuda yang gigih, rela berkorban dengan semangat yang tinggi mempertahankan Kemerdekaan Indonesia.\n" +
                        "Tugu Muda berbentuk seperti lilin yang mengandung makna semangat juang para pejuang untuk mempertahankan kemerdekaan RI tidak akan pernah padam. Bentuk Tugu muda merupakan tugu yang berpenampang segi lima. Terdiri dari 3 (tiga) bagian yaitu landasan, badan dan kepala. Pasa sisi landasan tugu terdapat relief. Keseluruhan tugu dibuat dari batu. Untuk memperkuat kesan tugunya, dibuat kolam hias dan taman pada sekeliling tugu.\n" +
                        "Untuk mempercantik Tugu Muda, dibangunlah sebuah taman yang mengelilingi Tugu Muda. Di taman ini di beri beberapa ornamen supaya tugu muda dapat dijadikann sebagai taman kota, antara lain ada air mancur, lampu-lampu warna putih dan kuning yang akan menambah kesan anggun di malam hari. Pada taman terdapat pohon cemara, duplikasi senjata bambu runcing yang tegak berdiri berjajar sebanyak 5 (lima) buah yang menggambarkan Pertempuran lima hari di Semarang dengan bersenjatakan bambu runcing.\n\n" +
                        "SEJARAH\n" +
                        "Tugu ini didirikan untuk mengenang peristiwa Pertempuran Lima hari di Semarang[1]. Peletakan batu pertama dilakukan pada tanggal 28 Oktober 1945, oleh Mr. Wongsonegoro (Gubernur Jawa Tengah) pada lokasi yang direncanakan semula yaitu didekat Alun-alun. Namun karena pada bulan Nopember 1945 meletus perang melawan Sekutu dan Jepang, proyek ini menjadi terbengkalai. Kemudian tahun 1949, oleh Badan Koordinasi Pemuda Indonesia (BKPI), diprakarsai ide pembangunan tugu kembali, namun karena kesulitan dana, ide ini jugaa belum terlaksana. Tahun 1951, Walikota Semarang, Hadi Soebeno Sosro Wedoyo, membentuk Panitia Tugu Muda, dengan rencana pembangunan tidak lagi pada lokasi alun-alun, tetapi pada lokasi tempat terjadinya peristiwa pertempuran lima hari di semarang yakni di pertemuan Jl. Pemuda, Jl. Imam Bonjol, Jl. Dr. Sutomo, dan Jl. Pandanaran dengan Lawang Sewu seperti lokasi sekarang ini. Akhirnya pada tanggal 10 Nopember 1951, Gubernur Jawa Tengah Boediono meletakkan batu pertama di lokasi yang baru ini.\n" +
                        "Tugu muda diresmikan pada tanggal 20 Mei 1953, bertepatan dengan Hari Kebangkitan Nasional, oleh Ir. Soekarno, Presiden Republik Indonesia. Desain tugu dikerjakan oleh Salim, sedangkan relief pada tugu dikerjakan oleh seniman Hendro.[2] Batu yang digunakan antara lain didatangkan dari Kaliurang dan Paker.\n" +
                        "\n" +
                        "Bangunan yang berada disekitar tugumuda adalah Lawang Sewu, Gedung Pandanaran, Rumah Dinas Gubernur Jawa Tengah, Museum Mandala Bhakti dan Gereja Katedral Semarang.\n" +
                        "Tugu Muda berada di sebuah bundaran bertemunya jalan-jalan besar di Semarang, yaitu Jalan Pemuda, Jalan Pandanaran, Jalan Imam Bonjol, dan Jalan MGR. Soegijapranata (lebih sering disebut Jalan Siliwangi). Dan sebuah jalan kecil yang berada di sebelah Pasar Bulu, yaitu Jalan HOS. Cokroaminoto.\n",
                "Gereja Blenduk (kadang-kadang dieja Gereja Blendug dan seringkali dilafazkan sebagai mBlendhug) adalah Gereja Kristen tertua di Jawa Tengah yang dibangun oleh masyarakat Belanda yang tinggal di kota itu pada 1753, dengan bentuk heksagonal (persegi delapan). Gereja ini sesungguhnya bernama Gereja GPIB Immanuel, di Jl. Letjend. Suprapto 32. Kubahnya besar, dilapisi perunggu, dan di dalamnya terdapat sebuah orgel Barok. Arsitektur di dalamnya dibuat berdasarkan salib Yunani. Gereja ini direnovasi pada 1894 oleh W. Westmaas dan H.P.A. de Wilde, yang menambahkan kedua menara di depan gedung gereja ini. Nama Blenduk adalah julukan dari masyarakat setempat yang berarti kubah.\n" +
                        "Gereja ini hingga sekarang masih dipergunakan setiap hari Minggu. Di sekitar gereja ini juga terdapat sejumlah bangunan lain dari masa kolonial Belanda.",
                "Kelenteng Gedung Batu Sam Po Kong adalah sebuah petilasan, yaitu bekas tempat persinggahan dan pendaratan pertama seorang Laksamana Tiongkok beragama islam yang bernama Zheng He / Cheng Ho. Terletak di daerah Simongan, sebelah barat daya Kota Semarang. Tanda yang menunjukan sebagai bekas petilasan yang berciri keislamanan dengan ditemukannya tulisan berbunyi 'marilah kita mengheningkan cipta dengan mendengarkan bacaan Al Qur'an'.\n" +
                        "Disebut Gedung Batu karena bentuknya merupakan sebuah Gua Batu besar yang terletak pada sebuah bukit batu, orang Indonesia keturunan cina menganggap bangunan itu adalah sebuah kelenteng - mengingat bentuknya memiliki arsitektur bangunan cina sehingga mirip sebuah kelenteng. Sekarang tempat tersebut dijadikan tempat peringatan dan tempat pemujaan atau bersembahyang serta tempat untuk berziarah. Untuk keperluan tersebut, di dalam gua batu itu diletakan sebuah altar, serta patung-patung Sam Po Tay Djien. Padahal laksamana cheng ho adalah seorang muslim, tetapi oleh mereka di anggap dewa. Hal ini dapat dimaklumi mengingat agama Kong Hu Cu atau Tau menganggap orang yang sudah meninggal dapat memberikan pertolongan kepada mereka.\n" +
                        "Menurut cerita, Laksamana Zheng He sedang berlayar melewati laut jawa, namun saat melintasi laut jawa, banyak awak kapalnya yang jatuh sakit, kemudian ia memerintahkan untuk membuang sauh. Kemudian merapat ke pantai utara semarang untuk berlindung di sebuah Goa dan mendirikan sebuah masjid di tepi pantai yang sekarang telah berubah fungsi menjadi kelenteng. Bangunan itu sekarang telah berada di tengah kota Semarang di akibatkan pantai utara jawa selalu mengalami proses pendangkalan yang di akibatkan adanya proses sedimentasi sehingga lambat-laun daratan akan semakin bertambah luas kearah utara.\n" +
                        "Konon, setelah Zheng He meninggalkan tempat tersebut karena ia harus melanjutkan pelayarannya, banyak awak kapalnya yang tinggal di desa Simongan dan kawin dengan penduduk setempat. Mereka bersawah dan berladang di tempat itu. Zheng He memberikan pelajaran bercocok-tanam serta menyebarkan ajaran-ajaran Islam, di Klenteng ini juga terdapat Makam Seorang Juru Mudi dari Kapal Laksamana Cheng Ho.",
                "Kota Lama Semarang adalah suatu kawasan di Semarang yang menjadi pusat perdagangan pada abad 19-20 . Pada masa itu, untuk mengamankan warga dan wilayahnya, maka kawasan itu dibangun benteng, yang dinamai benteng Vijhoek. Untuk mempercepat jalur perhubungan antar ketiga pintu gerbang dibenteng itu maka dibuat jalan-jalan perhubungan, dengan jalan utamanya dinamai : Heeren Straat. Saat ini bernama Jl. Let Jen Soeprapto. Salah satu lokasi pintu benteng yang ada sampai saat ini adalah Jembatan Berok, yang disebut De Zuider Por.\n" +
                        "Kawasan Kota Lama Semarang disebut juga Outstadt. Luas kawasan ini sekitar 31 hektare. Dilihat dari kondisi geografi, tampak bahwa kawasan ini terpisah dengan daerah sekitarnya, sehingga tampak seperti kota tersendiri, sehingga mendapat julukan \"Little Netherland\". Kawasan Kota Lama Semarang ini merupakan saksi bisu sejarah Indonesia masa kolonial Belanda lebih dari 2 abad, dan lokasinya berdampingan dengan kawasan ekonomi. Di tempat ini ada sekitar 50 bangunan kuno yang masih berdiri dengan kukuh dan mempunyai sejarah Kolonialisme di Semarang.\n\n" +
                        "Bangunan di Kota Lama Semarang\n" +
                        "Secara umum karakter bangunan di wilayah ini mengikuti bangunan-bangunan di benua Eropa sekitar tahun 1700-an. Hal ini bisa dilihat dari detail bangunan yang khas dan ornamen-ornamen yang identik dengan gaya Eropa. Seperti ukuran pintu dan jendela yang luar biasa besar, penggunaan kaca-kaca berwarna, bentuk atap yang unik, sampai adanya ruang bawah tanah.\n" +
                        "Seperti kota-kota lainnya yang berada di bawah pemerintahan kolonial Belanda, dibangun pula benteng sebagai pusat militer. Benteng ini berbentuk segi lima dan pertama kali dibangun di sisi barat kota lama Semarang saat ini. Benteng ini hanya memiliki satu gerbang di sisi selatannya dan lima menara pengawas. Masing-masing menara diberinama: Zeeland, Amsterdam, Utrecht, Raamsdonk dan Bunschoten. Pemerintah Belanda memindahkan permukiman Cina pada tahun 1731 di dekat permukiman Belanda, untuk memudahkan penga- wasan terhadap segala aktivitas orang Cina. Oleh sebab itu, Benteng tidak hanya sebagai pusat militer, namun juga sebagai menara pengawas bagi segala aktivitas kegiatan orang Cina."
        };

        Double[] latitude = {
                -6.983924,
                -6.984285,
                -6.968107,
                -6.996212,
                -6.968114
        };

        Double[] longitude = {
                110.410383,
                110.409350,
                110.427478,
                110.398088,
                110.427811
        };

        ArrayList<ModelWisata> wisatalist = new ArrayList<>();

        for (int i=0; i<judul.length; i++){
            ModelWisata wisata = new ModelWisata(image[i],judul[i],alamat[i],deskripsi[i],latitude[i],longitude[i]);
            wisatalist.add(wisata);
        }

        WisataAdapter adapterWisata = new WisataAdapter(this, wisatalist);
        recyclerView.setAdapter(adapterWisata);
    }
}
