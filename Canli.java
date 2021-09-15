import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Canli{
    public Location location;
    public int attackrange;
    public int move;
    public boolean predator;
    public Cinsiyet cinsiyet;
    public Turler tur;
    public List<Turler> yenilecekler = new ArrayList<Turler>();
    public Garden auxGarden;
    public List<String>  possibleMoves =new ArrayList<String>();
    public boolean isAlive = true;
    public boolean canRepro;


    public void SetGarden(Garden garden)
    {   
        Random rand = new Random();
        auxGarden=garden;
        int randomX = rand.nextInt(auxGarden.x);
        int randomY = rand.nextInt(auxGarden.y);
        this.location = new Location(randomX, randomY);

    }
    public void SetLocation(Location location)
    {
        this.location=location;
    }
    public boolean konumKontrol()
    {
        if(this.auxGarden.x >= this.location.x && this.auxGarden.y>= this.location.y)
        {
            return true;
        }
        return false;
    }
    public void possibleMoveFinder()
    {
        this.possibleMoves.clear();
        {
            if(this.location.x > 0 )
            {
                possibleMoves.add("bati");
            }
            if(this.location.y > 0)
            {
                possibleMoves.add("guney");
            }   
            if(this.location.x<this.auxGarden.x)
            {
                possibleMoves.add("dogu");
            }
            if(this.location.y<this.auxGarden.y)
            {
                possibleMoves.add("kuzey");
            }
        }
    }
    public void hareketEt()
    {
        Location startLoc = new Location(this.location.x, this.location.y);
        for(int i =0;i<this.move;i++)
        {
            this.possibleMoveFinder();
            Random rand = new Random();

            switch(rand.nextInt(possibleMoves.size()))
            {
                case 0 : startLoc.x--;
                //bati
                break;
                case 1 : startLoc.y--;
                break;
                case 2 :startLoc.x++;
                break;
                case 3 : startLoc.y++;
                break;

            }
            this.location.x = startLoc.x;
            this.location.y = startLoc.y;
        }
        
    }
    public double ikiNoktaninUzakligi(Location loc1,Location loc2)
    {
        double xLength = loc1.x-loc2.x;
        double yLength = loc1.y-loc2.y;
        double length = Math.sqrt(xLength*xLength + yLength*yLength);
        return length;

    }
    public void oldur(Turler tur)
        {
            isAlive = false;
            System.out.println(tur + " oldu");
            
        }
    public void avlan(){
        
        List<Canli> animalsOnRange = this.auxGarden.alandakiCanlilar(attackrange, location);
        animalsOnRange.removeIf(s->!yenilecekler.contains(s.tur) || s.isAlive == false);
        for (Canli canli : animalsOnRange) {
            canli.oldur(canli.tur);
            
        }
        

            
           
               

            
            
        
    }

         


}