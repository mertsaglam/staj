import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

public class App{
    public static void main(String[] args) {
        List<Canli> canlilar = new ArrayList<Canli>();
        


        
       
        canlilar.addAll(uret.canliUret(Turler.Kedi, Cinsiyet.Erkek, 15));
        canlilar.addAll(uret.canliUret(Turler.Kedi, Cinsiyet.Disi, 10));

        canlilar.addAll(uret.canliUret(Turler.Kanatli, Cinsiyet.Erkek, 15));
        canlilar.addAll(uret.canliUret(Turler.Kanatli, Cinsiyet.Disi, 15));

        canlilar.addAll(uret.canliUret(Turler.Kucukbas, Cinsiyet.Erkek, 15));
        canlilar.addAll(uret.canliUret(Turler.Kucukbas, Cinsiyet.Disi, 15));

        canlilar.addAll(uret.canliUret(Turler.Buyukbas, Cinsiyet.Erkek, 15));
        canlilar.addAll(uret.canliUret(Turler.Buyukbas, Cinsiyet.Disi, 15));


        canlilar.addAll(uret.canliUret(Turler.Kurt, Cinsiyet.Erkek, 15));
        canlilar.addAll(uret.canliUret(Turler.Kurt, Cinsiyet.Disi, 15));
        Garden mertBahce = new Garden(500,500);
        mertBahce.bahceyeSal(canlilar);
        System.out.println(mertBahce.bahcedekiCanlilar.size());
        for(int i = 0;i<1000;i++){
        mertBahce.bahcedekiCanlilar.forEach(x-> x.hareketEt());
        mertBahce.bahcedekiCanlilar.forEach(x->x.avlan());
        }
                
                mertBahce.kalanCanli();

    }
}