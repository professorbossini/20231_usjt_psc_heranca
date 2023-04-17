
package br.usjt.heranca3._usjt_poo_heranca3;

public class TesteLecionar {
    public static void main(String[] args) {
        ProfessorHorista profHorista = new ProfessorHorista();
        profHorista.setNome("Rodrigo");
        ProfessorPesquisador profPesquisador = new ProfessorPesquisador();
        profPesquisador.setNome("José");
        profHorista.lecionar();
        profPesquisador.lecionar();
    }
}
