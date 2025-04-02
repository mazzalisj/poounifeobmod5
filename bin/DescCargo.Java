// Classe DESCCARGO
// a classe utiliza conceitos de herança, polimorfismo, herdando atributos e modificando
// comportamentos da classe mãe descgenerica

class DescCargo extends DescGenerica {
    public DescCargo(int idDesc, String descricao) {
        super(idDesc, descricao);
    }

    // Método para criar um novo cargo
    public void cargocriar() {
        System.out.println("Cargo criado: ID = " + idDesc + ", Descrição = " + descricao);
    }

    // Método para modificar a especilidade já criada
    @Override
    public void cargomodificar(int novoIdCargo, String novacargoDesc) {
        this.idCargo = novoIdCargo;
        this.cargoDesc = novacargoDesc;
        System.out.println("Cargo modificado: ID = " + idDesc + ", Nova descrição = " + descricao;
    }

    // Método para apagar a especialidade criada
    @Override
    public void cargoapagar() {
        this.idDesc = 0;
        this.descricao = null;
        System.out.println("Cargo Apagado: ID = " + idCargo + ", Descrição Apagada = " + descricao);
    }

    // Método para exibir a especialidade
    @Override
    public void cargoexibir() {
        System.out.println("Cargo: ID = " + idCargo + ", Descrição = " + cargoDesc);
    }

}