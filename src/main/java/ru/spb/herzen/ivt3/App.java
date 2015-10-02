package ru.spb.herzen.ivt3;

import org.kohsuke.randname.RandomNameGenerator;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hi, I am Orlov Valentin.\n" );
        RandomNameGenerator rand = new RandomNameGenerator(0); // 0 is random seed

        String name = rand.next();
        System.out.println( "Hello, " + name + "\n" );

        System.out.println( "=== Exercise 1 ===" );
        for(int i=0; i<4; i++){
            name = rand.next();
            System.out.println( "Hello, " + name );
        }

        System.out.println( "\n=== Exercise 2 ===" );
        for(int i=0; i<15; i++){
            name = rand.next();
            System.out.println( "Hello, " + name );
        }
    }
}
