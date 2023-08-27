package usingevent;

import java.util.Scanner;

public class ScoreUsingEvent
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
   
        Subscriber Sn = new Subscriber();
        Subscriber St = new Subscriber();
        Subscriber Sth = new Subscriber();

        ScoreSource scoresource = new ScoreSource();
        
        scoresource.addObserver(Sn);
        scoresource.addObserver(St);
        scoresource.addObserver(Sth);
        
        scoresource.removeObserver(Sn);

        String line;
        do
        {
            System.out.print("Enter Score ");
            line = sc.nextLine();
            if(line.length() > 0)
            {
                scoresource.setScoreLine(line);
            }
        } 
        while(line.length() > 0);
    }
}
