package unifeso.mobile.sym;

/**
 * Created by Usuario on 17/08/2017.
 */

public class Resumo {
    private double saldo;
    private double receita;
    private double despesa;
    private int mes;

    public Resumo() {
    }

    public Resumo(double saldo, double receita, double despesa, int mes) {
        this.saldo = saldo;
        this.receita = receita;
        this.despesa = despesa;
        this.mes = mes;
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

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
}
