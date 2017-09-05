package unifeso.mobile.sym.Dados;

/**
 * Created by Usuario on 17/08/2017.
 */

public class Lancamento {
    private String dataCadastro;
    private String dataVencimento;
    private String dataPagamento;
    private String descricao;
    private double valorEstimado;
    private double valorPago;
    private int peridiocidade;
    private int idmeta;
    private int idCartao;
    private int idCategoria;

    public Lancamento() {
    }

    public Lancamento(String dataCadastro, String dataVencimento, String dataPagamento, String descricao, double valorEstimado, double valorPago, int peridiocidade, int idmeta, int idCartao, int idCategoria) {
        this.dataCadastro = dataCadastro;
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
        this.descricao = descricao;
        this.valorEstimado = valorEstimado;
        this.valorPago = valorPago;
        this.peridiocidade = peridiocidade;
        this.idmeta = idmeta;
        this.idCartao = idCartao;
        this.idCategoria = idCategoria;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
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

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public int getPeridiocidade() {
        return peridiocidade;
    }

    public void setPeridiocidade(int peridiocidade) {
        this.peridiocidade = peridiocidade;
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
