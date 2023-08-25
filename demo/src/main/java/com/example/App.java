package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();           
        
        p1.setNome("Bruno");
        p1.setIdade(22);

        p2.setNome("Maria");
        p2.setIdade(25);

        System.out.println(p1.getNome());
    }
}