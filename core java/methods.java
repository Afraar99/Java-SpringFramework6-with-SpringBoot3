class Computer
{
    public void playMusic()
    {
        System.out.println("Music is playing...");
    }

    public String getMePen(int cost)
    {   
        if(cost >= 10)
            return "Pen";
        else
            return "Nothing";
    }
}


public class methods 
{
    public static void main(String[] args) 
    {
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMePen(40);
        System.out.println(str);
        
    }
}
