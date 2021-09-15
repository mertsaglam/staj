public class Kedi extends Canli {
    public Kedi(Cinsiyet cinsiyet,Turler tur )
    {
        this.cinsiyet = cinsiyet;
        this.tur=tur;
        this.move=9;
        this.attackrange=5;
        yenilecekler.add(Turler.Kucukbas);
        yenilecekler.add(Turler.Buyukbas);

    }
}
