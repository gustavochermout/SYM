package unifeso.mobile.sym;

import java.util.List;

/**
 * Created by Usuario on 17/08/2017.
 */

public class Usuario {
    private String nome;
    private Resumo resumo;
    private List<Meta> metas;

    public Usuario() {
    }

    public Usuario(String nome, Resumo resumo, List<Meta> metas) {
        this.nome = nome;
        this.resumo = resumo;
        this.metas = metas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Resumo getResumo() {
        return resumo;
    }

    public void setResumo(Resumo resumo) {
        this.resumo = resumo;
    }

    public List<Meta> getMetas() {
        return metas;
    }

    public void setMetas(List<Meta> metas) {
        this.metas = metas;
    }
}
