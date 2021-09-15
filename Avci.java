public class Avci extends Canli {
    public Avci(Cinsiyet cinsiyet,Turler tur )
    {
        this.cinsiyet = cinsiyet;
        this.tur=tur;
        this.move=1;
        yenilecekler.add(Turler.Kucukbas);
        yenilecekler.add(Turler.Kurt);
        yenilecekler.add(Turler.Buyukbas);
        yenilecekler.add(Turler.Kedi);
        this.attackrange=8;

    }
}
