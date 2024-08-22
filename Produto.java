public class Produto {

    private int id;
    private String nome;
    private String descricao;
    private double preco;
    private int qtde;

    // Construtores
    public Produto(int id, String nome, String descricao, double preco, int qtde) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.qtde = qtde;
    }

    // Métodos para operação do sistema
    public void atualizarEstoqueVenda(int qtde) {
        this.qtde -= qtde;
    }

    public void atualizarEstoqueCompra(int qtde) {
        this.qtde += qtde;
    }

    @Override
    public String toString() {

        return "ID: " + this.id + "\n" +
                "Nome: " + this.nome + "\n" +
                "Descricao: " + this.descricao + "\n" +
                "Preco: " + this.preco + "\n" +
                "Qtde: " + this.qtde + "\n";
    }

    // Gets e Sets
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

}