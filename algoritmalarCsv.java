import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class algoritmalarCsv {

     public static void main(String[] args) {
        String dosyaAdi = "algoritmalar.csv"; // Okunacak CSV dosyasının adı

        try {
            // "BufferedReader" isimli bir şey açıyoruz, bu şey dosyadan verileri okumamıza yardımcı olacak.
            // "FileReader" ise, belirlediğimiz dosyayı açmamıza yardımcı olur.
            BufferedReader br = new BufferedReader(new FileReader(dosyaAdi));
            String satir;

            // Bu satırı kullanarak, dosyadaki her satırı teker teker okuyup yazdıracağız.
            while ((satir = br.readLine()) != null) {
                System.out.println(satir); // Her satırı yazdır
            }


            // İşimiz bittiğinde, dosyayı kapatıyoruz.
            br.close();
        } catch (IOException e) {
           // Eğer bir hata olursa, yani dosyayı açamazsak veya okuyamazsak, bu hatayı burada görüntüleyeceğiz.
            e.printStackTrace();
        }
    }
}





    
