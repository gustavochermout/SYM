package unifeso.mobile.sym;

/**
 * Created by Usuario on 17/08/2017.
 */

public class Resumo {
    public double saldo;
    public double receita;
    public double despesa;

    public Resumo() {
    }

    public Resumo(double saldo, double receita, double despesa) {
        this.saldo = saldo;
        this.receita = receita;
        this.despesa = despesa;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getReceita() {
        return receita;
    }

    public void setReceita(double receita) {
        this.receita = receita;
    }

    public double getDespesa() {
        return despesa;
    }

    public void setDespesa(double despesa) {
        this.despesa = despesa;
    }
}
