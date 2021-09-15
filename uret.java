import java.util.ArrayList;
import java.util.List;
public class uret {
    public static List<Canli> canliUret(Turler tur, Cinsiyet cinsiyet,int count)
    {
        List<Canli> ureyenCanlilar = new ArrayList<Canli>();
        Canli yeniCanli = null;
        for(int i =0;i < count ;i++)
        {
            switch(tur)
            {
                case Kanatli:
                yeniCanli= new Kanatli(cinsiyet, tur);
                break;
                case Buyukbas:
                yeniCanli= new Buyukbas(cinsiyet, tur);
                break;
                case Kedi:
                yeniCanli= new Kedi(cinsiyet, tur);
                break;
                case Kucukbas:
                yeniCanli= new Kucukbas(cinsiyet, tur);
                break;
                case Kurt:
                yeniCanli= new Kurt(cinsiyet, tur);
                break;
                case Avci:
                yeniCanli= new Avci(cinsiyet, tur);
                break;
            }
            if (yeniCanli != null)
            {
                ureyenCanlilar.add(yeniCanli);
            }
        }
        return ureyenCanlilar;
    }
}