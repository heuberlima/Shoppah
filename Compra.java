import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Compra {

    private int id;
    private Usuario comprador;
    private List<Produto> produtosComprados;
    private Date dataCompra;

    public Compra(int id, Usuario comprador) {
        this.id = id;
        this.comprador = comprador;
        this.produtosComprados = new ArrayList<>();
        this.dataCompra = new Date();
    }

    // Métodos para operação do sistema
    public void adicionarProdutoCompra(Produto produto) {
        produtosComprados.add(produto);
    }

    public double calcularTotal() {
        double total = 0;

        for (Produto produto : produtosComprados) {
            total += (produto.getPreco() + produto.getQtde());
        }

        return total;
    }

    @Override
    public String toString() {

        String retorno = "ID Compra: " + this.id + "\n" +
                "Data: " + this.dataCompra + "\n" +
                "Comprador: " + this.comprador.getNome() + "\n";

        retorno += "===============================================";
        retorno += "Lista de Produtos Comprados pelo Usuario: " + this.comprador.getNome();
        retorno += "==============================================";

        for (Produto produto : produtosComprados) {

            retorno += produto.toString();

        }

        retorno += "Valor Total da Compra: R$" + this.calcularTotal();

        return retorno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getComprador() {
        return comprador;
    }

    public void setComprador(Usuario comprador) {
        this.comprador = comprador;
    }

    public List<Produto> getProdutosComprados() {
        return produtosComprados;
    }

    public void setProdutosComprados(List<Produto> produtosComprados) {
        this.produtosComprados = produtosComprados;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

}
