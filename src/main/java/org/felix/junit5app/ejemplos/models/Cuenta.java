package org.felix.junit5app.ejemplos.models;

import java.math.BigDecimal;
import java.util.Objects;

public class Cuenta {
    private String persona;
    private BigDecimal saldo;

    public Cuenta(String persona, BigDecimal saldo) {
        this.persona = persona;
        this.saldo = saldo;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public void debito(BigDecimal monto) {
        this.saldo = this.saldo.subtract(monto);
    }

    public void credito(BigDecimal monto) {
        this.saldo = this.saldo.add(monto);
    }


    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Cuenta)) return false;

        Cuenta c = (Cuenta) o;
        if(this.persona == null || this.saldo == null) return false;

        return this.persona.equals(c.getPersona()) && this.saldo.equals(c.getSaldo());
    }
}
