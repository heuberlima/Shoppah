public class ShoppahApp {

    public static void main(String[] args) {

        Produto produto1 = new Produto(1, "Produto 1", "Descrição do produto 1", 123.45, 123);
        Produto produto2 = new Produto(2, "Produto 2", "Descrição do produto 2", 456.78, 456);
        Produto produto3 = new Produto(3, "Produto 3", "Descrição do produto 3", 890.12, 890);

        Usuario user1 = new Usuario(1, "User 1", "user1@email.com");
        // Usuario user2 = new Usuario(2, "User 2", "user2@email.com");
        // Usuario user3 = new Usuario(3, "User 3", "user3@email.com");

        Compra compra1 = new Compra(1, user1);
        compra1.adicionarProdutoCompra(produto1);
        compra1.adicionarProdutoCompra(produto2);
        compra1.adicionarProdutoCompra(produto3);

        System.out.println(compra1.toString());

    }

}
