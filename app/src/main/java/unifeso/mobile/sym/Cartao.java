package unifeso.mobile.sym;

/**
 * Created by Usuario on 04/09/2017.
 */

public class Cartao {
    private String titulo;
    private double limiteTotal;
    private double limiteMensal;

    public Cartao() {
    }

    public Cartao(String titulo, double limiteTotal, double limiteMensal) {
        this.titulo = titulo;
        this.limiteTotal = limiteTotal;
        this.limiteMensal = limiteMensal;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getLimiteTotal() {
        return limiteTotal;
    }

    public void setLimiteTotal(double limiteTotal) {
        this.limiteTotal = limiteTotal;
    }

    public double getLimiteMensal() {
        return limiteMensal;
    }

    public void setLimiteMensal(double limiteMensal) {
        this.limiteMensal = limiteMensal;
    }
}
