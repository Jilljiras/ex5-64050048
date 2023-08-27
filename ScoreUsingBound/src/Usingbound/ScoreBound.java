package Usingbound;

import java.util.Scanner;

public class ScoreBound {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Subscriber S1 = new Subscriber();
        Subscriber S2 = new Subscriber();
        ScoreEvent S3 = new ScoreEvent();
        
        S3.addPropertyChangeListener(S1);
        S3.addPropertyChangeListener(S2);

        String line;
        do
        {
            System.out.print("Enter Score ");
            line = sc.nextLine();
            if(line.length() > 0)
            {
                S3.setScoreLine(line);
            }
        } 
        while(line.length() > 0);
    }
    
}
