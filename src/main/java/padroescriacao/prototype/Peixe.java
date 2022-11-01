package padroescriacao.prototype;

public class Peixe implements Cloneable {
    private int id;
    private String nome;
    private Loja loja;
    private String habitat;

    public Peixe(int id, String nome, Loja loja, String habitat) {
        this.id = id;
        this.nome = nome;
        this.loja = loja;
        this.habitat = habitat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Loja getEndereco() {
        return loja;
    }

    public void setEndereco(Loja loja) {
        this.loja = loja;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public Peixe clone() throws CloneNotSupportedException {
        Peixe peixeClone = (Peixe) super.clone();
        peixeClone.loja = (Loja) peixeClone.loja.clone();
        return peixeClone;
    }

    @Override
    public String toString() {
        return "Peixe{id=" + id + ", nome='" + nome + "\', endereco=" + loja +  ", habitat='" + habitat + "\'}";
    }
}
