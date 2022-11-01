package padroescriacao.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PeixeTeste {

    @Test
    void testeClone() throws CloneNotSupportedException {
        Peixe peixe = new Peixe(3, "Peixe Oliginal", new Loja("Rua1", 4), "Agua doce");

        Peixe peixeClone = peixe.clone();
        peixeClone.setId(696);
        peixeClone.setNome("Peixe Cromado");
        peixeClone.getEndereco().setendereco("Rua2");
        peixeClone.getEndereco().setNumero(2);
        peixeClone.setHabitat("Marinho");

        Peixe peixeClone3 = peixe.clone();
        peixeClone3.setId(199);
        peixeClone3.setNome("Tutubarão");
        peixeClone3.getEndereco().setendereco("Los Angeles");
        peixeClone3.getEndereco().setNumero(34);
        peixeClone3.setHabitat("Espacial");

        assertEquals("Peixe{id=3, nome='Peixe Oliginal', endereco=Loja{endereco='Rua1', numero=4}, habitat='Agua doce'}", peixe.toString());
        assertEquals("Peixe{id=696, nome='Peixe Cromado', endereco=Loja{endereco='Rua2', numero=2}, habitat='Marinho'}", peixeClone.toString());
        assertEquals("Peixe{id=199, nome='Tutubarão', endereco=Loja{endereco='Los Angeles', numero=34}, habitat='Espacial'}", peixeClone3.toString());
    }
}