import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SistemaDePedidos {
    public static void main(String[] args) {
        // Lista para armazenar produtos
        List<Produto> produtos = new ArrayList<>();

        // Criar instâncias de Mercado e Restaurante com dados reais
        Mercado mercado1 = new Mercado("Mercado 1", "CNPJ1", "Endereco1", "Supermercado");
        Mercado mercado2 = new Mercado("Mercado 2", "CNPJ2", "Endereco2", "Supermercado");
        Mercado mercado3 = new Mercado("Mercado 3", "CNPJ3", "Endereco3", "Supermercado");

        Restaurante restaurante1 = new Restaurante("Restaurante 1", "CNPJ4", "Endereco4");
        Restaurante restaurante2 = new Restaurante("Restaurante 2", "CNPJ5", "Endereco5");
        Restaurante restaurante3 = new Restaurante("Restaurante 3", "CNPJ6", "Endereco6");

        // Adicionar produtos à lista
        Produto spaguetti = new Produto(5.99f, "Spaguetti");
        Produto canelone = new Produto(6.99f, "Canelone");
        Produto talharim = new Produto(4.99f, "Talharim");
        produtos.add(spaguetti);
        produtos.add(canelone);
        produtos.add(talharim);

        // Caminho do arquivo CSV
        String csvFile = "C:\\Users\\Usuario\\Desktop\\Faculdade\\5°Periodo\\POO\\Trabalho1\\Trabalho 1\\Semana1.csv";

        BufferedReader reader = null;

        // Lista para armazenar pedidos
        List<Pedido> pedidos = new ArrayList<>();

        try {
            reader = new BufferedReader(new FileReader(csvFile));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");

                // Verifique se a linha possui os campos esperados antes de criar o pedido
                if (row.length == 4) {
                    int numeroPedido = Integer.parseInt(row[0]);
                    String CNPJCliente = row[1];
                    String formaMacarrao = row[2];
                    float quantidade = Float.parseFloat(row[3]);

                    // Encontre o cliente com base no CNPJ (supondo que CNPJ seja único)
                    Cliente cliente = encontrarClientePorCNPJ(CNPJCliente);

                    if (cliente != null) {
                        // Encontre o produto com base na forma do macarrão
                        Produto produto = encontrarProdutoPorNome(produtos, formaMacarrao);

                        if (produto != null) {
                            // Crie um pedido e adicione-o à lista de pedidos
                            Pedido pedido = new Pedido(numeroPedido, cliente, produto, quantidade);
                            pedidos.add(pedido);
                        } else {
                            System.out.println("Produto não encontrado para forma de macarrão: " + formaMacarrao);
                        }
                    } else {
                        System.out.println("Cliente não encontrado para CNPJ: " + CNPJCliente);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Agora você tem a lista de pedidos. Continue com a implementação das funcionalidades restantes.
    }

    // Métodos para encontrar cliente por CNPJ e produto por nome
    private static Cliente encontrarClientePorCNPJ(String CNPJ) {
        // Implemente a lógica de busca do cliente aqui (consulte uma lista de clientes, banco de dados, etc.)
        return null; // Retorne o cliente encontrado ou null se não encontrado
    }

    private static Produto encontrarProdutoPorNome(List<Produto> produtos, String nome) {
        for (Produto produto : produtos) {
            if (produto.getForma_produto().equals(nome)) {
                return produto;
            }
        }
        return null; // Retorne o produto encontrado ou null se não encontrado
    }
}






















//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//import java.io.*;
//
//public class SistemaDePedidos {
//    public static void main(String[] args) {
//        // Lista para armazenar produtos
//        List<Produto> produtos = new ArrayList<>();
//
//        Mercado mercado1 = new Mercado("","","","");
//        Mercado mercado2 = new Mercado("","","","");
//        Mercado mercado3 = new Mercado("","","","");
//
//        Restaurante restaurante1 = new Restaurante("","","");
//        Restaurante restaurante2 = new Restaurante("","","");
//        Restaurante restaurante3 = new Restaurante("","","");
//
//        Produto spaguetti = new Produto(5.99f, "Spaguetti");
//        Produto canelone = new Produto(6.99f,"Canelone" );
//        Produto talharim = new Produto(4.99f,"Talharim" );
//
//        String csvFile = "C:\\Users\\Usuario\\Desktop\\Faculdade\\5°Periodo\\POO\\Trabalho1\\Trabalho 1\\Semana1.csv";
//
//        BufferedReader CSVcontent = null;
//        // Lista para armazenar pedidos
//        List<Pedido> pedidos = new ArrayList<>();
//        String line = "";
//
//        try {
//            reader = new BufferedReader(new FileReader(csvFile));
//            while ((csvFile = reader.readLine()) != null) {
//                String[] row = line.split(",");
//
//                for(String index : row) {
//                    System.out.printf("%-10s",args);
//                }
//                System.out.println();
//            }
//        }
//        catch(Exception e) {
//            e.printStackTrace();
//        }
//        finally {
//            try {
//                reader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//






























//        // Leitura de pedidos de um arquivo CSV
//        try (BufferedReader br = new BufferedReader(new FileReader("pedidos.csv"))) {
//            String linha;
//            while ((linha = br.readLine()) != null) {
//                String[] partes = linha.split(",");
//                if (partes.length == 4) {
//                    int numeroUnico = Integer.parseInt(partes[0]);
//                    String CNPJCliente = partes[1];
//                    String formaMacarrao = partes[2];
//                    float quantidade = Float.parseFloat(partes[3]);
//
//                    // Encontre o cliente com base no CNPJ (supondo que CNPJ seja único)
//                    Cliente cliente = encontrarClientePorCNPJ(CNPJCliente);
//
//                    if (cliente != null) {
//                        // Encontre o produto com base na forma do macarrão
//                        Produto produto = encontrarProdutoPorNome(formaMacarrao);
//
//                        if (produto != null) {
//                            // Crie um pedido e adicione-o à lista de pedidos
//                            Pedido pedido = new Pedido(numeroUnico, cliente, produto, quantidade);
//                            pedidos.add(pedido);
//                        } else {
//                            System.out.println("Produto não encontrado para forma de macarrão: " + formaMacarrao);
//                        }
//                    } else {
//                        System.out.println("Cliente não encontrado para CNPJ: " + CNPJCliente);
//                    }
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        // Neste ponto, você tem uma lista de pedidos. Agora você pode implementar a validação,
//        // programação de fabricação e programação de entregas.
//    }
//
//    // Métodos para encontrar cliente por CNPJ e produto por nome
//    private static Cliente encontrarClientePorCNPJ(String CNPJ) {
//        // Implemente a lógica de busca do cliente aqui (consulte uma lista de clientes, banco de dados, etc.)
//        return null; // Retorne o cliente encontrado ou null se não encontrado
//    }
//
//    private static Produto encontrarProdutoPorNome(String nome) {
//        // Implemente a lógica de busca do produto aqui (consulte uma lista de produtos, banco de dados, etc.)
//        return null; // Retorne o produto encontrado ou null se não encontrado
//    }
//}













//import java.util.ArrayList;
//import java.util.List;
//
//public class SistemaDePedidos {
//    public static void main(String[] args) {
//        List<Produto> produtos = new ArrayList<>();
//
//        Produto Spaguetti = new Produto("1","Spaguetti");
//        Produto Canelone = new Produto("2", "Canelone");
//        Produto Talharim = new Produto("3", "Talharim");
//
//        produtos.add(Spaguetti);
//        produtos.add(Canelone);
//        produtos.add(Talharim);
//    }
//}
