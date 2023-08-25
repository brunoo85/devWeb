package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Pessoa p1 = new Pessoa("Bruno",22);
        Pessoa p2 = new Pessoa();           

        p2.setIdade(25);
        p2.setNome("Maria");

        System.out.println(p1.getNome());
        System.out.println(p1.getIdade());

        System.out.println(p2.getNome());
        System.out.println(p2.getIdade());
    }
}