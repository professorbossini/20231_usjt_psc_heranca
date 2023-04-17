package br.usjt.heranca3._usjt_poo_heranca3;

public class Professor extends Pessoa{
    int matricula;
    public void lecionar(){
        System.out.printf("%s lecionando%n", getNome());
    }
}
