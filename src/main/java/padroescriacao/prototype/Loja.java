package padroescriacao.prototype;

public class Loja implements Cloneable {
    private String endereco;
    private Integer numero;

    public Loja(String endereco, Integer numero) {
        super();
        this.endereco = endereco;
        this.numero = numero;
    }

    public String getendereco() {
        return endereco;
    }

    public void setendereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Loja{endereco='" + getendereco() + "\', numero=" + getNumero() + '}';
    }
}
