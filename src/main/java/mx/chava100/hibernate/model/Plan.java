package mx.chava100.hibernate.model;

import mx.chava100.hibernate.model.plan.*;

public class Plan {

    private EquivalenteGral equivalenteGral;
    private Desayuno desayuno;
    private Colacion1 colacion1;
    private Comida comida;
    private Colacion2 colacion2;
    private Cena cena;

    public Plan() {
        this.equivalenteGral = new EquivalenteGral();
        this.desayuno = new Desayuno();
        this.colacion1 = new Colacion1();
        this.comida = new Comida();
        this.colacion2 = new Colacion2();
        this.cena = new Cena();
    }

    public Plan(EquivalenteGral equivalenteGral, Desayuno desayuno, Colacion1 colacion1, Comida comida, Colacion2 colacion2, Cena cena) {
        this.equivalenteGral = equivalenteGral;
        this.desayuno = desayuno;
        this.colacion1 = colacion1;
        this.comida = comida;
        this.colacion2 = colacion2;
        this.cena = cena;
    }

    public EquivalenteGral getEquivalenteGral() {
        return equivalenteGral;
    }

    public void setEquivalenteGral(EquivalenteGral equivalenteGral) {
        this.equivalenteGral = equivalenteGral;
    }

    public Desayuno getDesayuno() {
        return desayuno;
    }

    public void setDesayuno(Desayuno desayuno) {
        this.desayuno = desayuno;
    }

    public Colacion1 getColacion1() {
        return colacion1;
    }

    public void setColacion1(Colacion1 colacion1) {
        this.colacion1 = colacion1;
    }

    public Comida getComida() {
        return comida;
    }

    public void setComida(Comida comida) {
        this.comida = comida;
    }

    public Colacion2 getColacion2() {
        return colacion2;
    }

    public void setColacion2(Colacion2 colacion2) {
        this.colacion2 = colacion2;
    }

    public Cena getCena() {
        return cena;
    }

    public void setCena(Cena cena) {
        this.cena = cena;
    }


}
