import java.util.ArrayList;
import java.util.List;

public class Garden {
    public int x;
    public int y;
    public List<Canli> bahcedekiCanlilar = new ArrayList<Canli>();
    public Garden(int x,int y){
        this.x=x;
        this.y=y;
    }
    
    public void bahceyeSal(List<Canli> salinacakCanlilar)
    {
            bahcedekiCanlilar.addAll(salinacakCanlilar);
            salinacakCanlilar.forEach(animal -> animal.SetGarden(this));
            
    }
    public double ikiNoktaninUzakligi(Location loc1,Location loc2)
    {
        double xLength = loc1.x-loc2.x;
        double yLength = loc1.y-loc2.y;
        double length = Math.sqrt(xLength*xLength + yLength*yLength);
        return length;

    }
    public List<Canli> alandakiCanlilar(int attackrange,Location loc)
    {
        List<Canli> geriDonenCanli = new ArrayList<Canli>();
         for(int i = 0;i<bahcedekiCanlilar.size();i++)
        {
            if(ikiNoktaninUzakligi(bahcedekiCanlilar.get(i).location, loc) < attackrange)
            {
                geriDonenCanli.add(bahcedekiCanlilar.get(i));
            }
        }
       return geriDonenCanli;
    }
    public void kalanCanli()
        {
            int count = 0;
            for(int i = 0;i<bahcedekiCanlilar.size();i++){
                if(bahcedekiCanlilar.get(i).isAlive==true)
                count++;
            }
            System.out.println(count);
        }

    

    
    
    
    
}
