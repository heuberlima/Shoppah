import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private int id;
    private String nome;
    private String email;
    private List<Produto> favoritos;

    // Construtor
    public Usuario(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.favoritos = new ArrayList<>();
    }

    // Métodos para operação do sistema
    public void adicionarFavorito(Produto produto) {
        favoritos.add(produto);
    }

    public void removerFavorito(Produto produto) {
        favoritos.remove(produto);
    }

    public void listarFavoritos() {

        System.out.println("===============================================");
        System.out.println("Lista de Produtos Favoritos do Usuario: " + this.nome);
        System.out.println("==============================================");

        for (Produto produto : favoritos) {

            System.out.println(produto);

        }
    }

    @Override
    public String toString() {

        return "ID: " + this.id + "\n" +
                "Nome: " + this.nome + "\n" +
                "Email: " + this.email + "\n";
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Produto> getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(List<Produto> favoritos) {
        this.favoritos = favoritos;
    }

}
