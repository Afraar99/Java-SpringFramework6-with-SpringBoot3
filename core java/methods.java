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
        Computer comp = new Computer();
        comp.playMusic();   
        String str = comp.getMePen(1);
        System.out.println(str);   
    }
}
