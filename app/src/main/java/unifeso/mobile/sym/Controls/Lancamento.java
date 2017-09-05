package unifeso.mobile.sym.Controls;

/**
 * Created by Usuario on 17/08/2017.
 */

public class Lancamento {
    private String data;
    private String descricao;
    private double valor;
    private int idmeta;
    private int idCartao;
    private int idCategoria;

    public Lancamento() {
    }

    public Lancamento(String data, String descricao, double valor, int idmeta, int idCartao, int idCategoria) {
        this.data = data;
        this.descricao = descricao;
        this.valor = valor;
        this.idmeta = idmeta;
        this.idCartao = idCartao;
        this.idCategoria = idCategoria;
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getIdmeta() {
        return idmeta;
    }

    public void setIdmeta(int idmeta) {
        this.idmeta = idmeta;
    }

    public int getIdCartao() {
        return idCartao;
    }

    public void setIdCartao(int idCartao) {
        this.idCartao = idCartao;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
}
