package unifeso.mobile.sym.Controls;

/**
 * Created by Usuario on 17/08/2017.
 */

public class Meta {
    private String titulo;
    private String descricao;
    private double valorEstimado;
    private String dataFim;

    public Meta() {
    }

    public Meta(String titulo, String descricao, double valorEstimado, String dataFim) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.valorEstimado = valorEstimado;
        this.dataFim = dataFim;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorEstimado() {
        return valorEstimado;
    }

    public void setValorEstimado(double valorEstimado) {
        this.valorEstimado = valorEstimado;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }
}
