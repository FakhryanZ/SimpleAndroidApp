package com.dicoding.indonesiatouristdestination.model;

import java.util.ArrayList;

public class DestinasiData {
    public static String[][] data = new String[][]{
            {"Raja Ampat", "Raja Ampat adalah sebuah kabupaten dan merupakan bagian dari Propinsi Papua Barat.", "https://upload.wikimedia.org/wikipedia/commons/8/88/Raja_Ampat%2C_Mutiara_Indah_di_Timur_Indonesia.jpg"},
            {"Bunaken", "Bunaken memang surganya para penyelam dimana ada kurang lebih 20 spot diving yang bisa digunakan untuk menyelam.", "https://indonesiakitesurfing.com/wp-content/uploads/Diving-Bunaken-Sulawesi.jpg"},
            {"Baluran", "Taman nasional adalah sebuah kawasan yang digunakan khusus untuk melindungi berbagai macam ekosistem flora dan fauna.", "https://blue.kumparan.com/image/upload/fl_progressive,fl_lossy,c_fill,q_auto:best,w_640/v1518275159/zklu7uf95zmy3kqy0nw8.jpg"},
            {"Gunung Bromo", "Gunung Bromo adalah sebuah gunung berapi aktif di Jawa Timur, Indonesia.", "https://pesona.travel/media/nikmati-sunrise-dan-sunset-di-gunung-bromo_161612.jpg"},
            {"Pulau Komodo","Pulau Komodo adalah sebuah pulau yang terletak di Kepulauan Nusa Tenggara.","https://awsimages.detik.net.id/community/media/visual/2019/06/14/d918d788-bf56-4fbf-9216-50e870a4368a_169.jpeg?w=780&q=90"},
            {"Monumen Nasional (Monas)", "Monumen Nasional atau yang populer disingkat dengan Monas atau Tugu Monas adalah monumen peringatan setinggi 132 meter (433 kaki) yang didirikan untuk mengenang perlawanan dan perjuangan rakyat Indonesia untuk merebut kemerdekaan dari pemerintahan kolonial Hindia Belanda.", "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b1/Merdeka_Square_Monas_02.jpg/726px-Merdeka_Square_Monas_02.jpg"},
            {"Pantai Kuta","Pantai Kuta adalah sebuah tempat pariwisata yang terletak kecamatan Kuta, sebelah selatan Kota Denpasar, Bali, Indonesia.", "https://www.piesusubliman.com/wp-content/uploads/2014/04/Kuta-Beach-Exotic-Wallpaper.jpg"},
            {"Danau Toba", "Danau alami berukuran besar di Indonesia yang berada di kaldera Gunung Berapi Super.", "https://upload.wikimedia.org/wikipedia/commons/thumb/a/ae/Indonesia_-_Lake_Toba_%2826224127503%29.jpg/1200px-Indonesia_-_Lake_Toba_%2826224127503%29.jpg"},
            {"Way Kambas", "Taman nasional perlindungan gajah yang terletak di daerah Lampung tepatnya di Kecamatan Labuhan Ratu, Lampung Timur, Indonesia. ", "https://kelanaku.com/wp-content/uploads/2018/08/Way-kambas-5.jpg"},
            {"Karimun Jawa", "Karimunjawa adalah kepulauan di Laut Jawa yang termasuk dalam Kabupaten Jepara, Jawa Tengah.", "https://www.blibli.com/friends/assets/Karimun-Jawa.jpg"}
    };


    public static ArrayList<Destinasi> getListData(){
        ArrayList<Destinasi> list = new ArrayList<>();
        for (String[] aData : data){
            Destinasi destinasi = new Destinasi();
            destinasi.setName(aData[0]);
            destinasi.setDescription(aData[1]);
            destinasi.setPhoto(aData[2]);

            list.add(destinasi);
        }
        return list;
    }
}
