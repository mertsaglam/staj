public class Kurt extends Canli {
    public Kurt(Cinsiyet cinsiyet,Turler tur )
    {
        this.cinsiyet = cinsiyet;
        this.tur=tur;
        this.move=3;
        this.attackrange=4;
        yenilecekler.add(Turler.Kucukbas);
        yenilecekler.add(Turler.Kanatli);

    }
}
