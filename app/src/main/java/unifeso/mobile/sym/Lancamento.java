package unifeso.mobile.sym;

/**
 * Created by Usuario on 17/08/2017.
 */

public class Lancamento {
    private String data;
    private String descricao;
    private String classificacao;
    private double valor;

    public Lancamento(double valor, String classificacao, String descricao, String data) {
        this.valor = valor;
        this.classificacao = classificacao;
        this.descricao = descricao;
        this.data = data;
    }

    public Lancamento(){

    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
