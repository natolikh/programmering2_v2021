package no.hiof.larseknu.hellojavalin.model;

import java.time.LocalDate;

public class Dyr {
    private final int ID;
    private String navn;
    private LocalDate fodselsDato;
    private static int dyreTeller;

    public Dyr(String navn, LocalDate fodselsDato) {
        this.ID = 1000 + dyreTeller++;
        this.navn = navn;
        this.fodselsDato = fodselsDato;
    }

    public final int getID() {
        return ID;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public LocalDate getFodselsDato() {
        return fodselsDato;
    }

    public void setFodselsDato(LocalDate fodselsDato) {
        this.fodselsDato = fodselsDato;
    }

    @Override
    public String toString() {
        return  getID() + " - " + navn;
    }
}
