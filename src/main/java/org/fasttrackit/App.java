package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Operations value = new Operations();

        System.out.println("The gathering is equal with  " + value.gat(9,7));
        System.out.println("The decreasing is equal with  " + value.dec(9,7));
        System.out.println("The multiplication is equal with  " + value.mul(9,7));
        System.out.println("The division is equal with  " + value.div(9,7));
    }
}
